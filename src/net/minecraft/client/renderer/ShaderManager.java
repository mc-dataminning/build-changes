package net.minecraft.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.Streams;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.PipelineBuilder;
import com.mojang.blaze3d.pipeline.PipelineCache;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.ShaderSource;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.renderpearl.api.pipeline.CompiledRenderPipeline;
import com.mojang.renderpearl.api.pipeline.ShaderType;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.pipeline.RenderPipelines;
import net.minecraft.client.renderer.state.OptionsRenderState;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.StrictJsonParser;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ShaderManager implements PreparableReloadListener, AutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final String SHADER_PATH = "shaders";
   private static final ShaderType[] SHADER_TYPES = ShaderType.values();
   public static final String SHADER_INCLUDE_PATH = "shaders/include/";
   public static final String SHADER_INCLUDE_EXTENSION = ".glsl";
   public static final FileToIdConverter SHADER_INCLUDE_CONVERTER = new FileToIdConverter("shaders/include", ".glsl");
   private static final FileToIdConverter POST_CHAIN_ID_CONVERTER = FileToIdConverter.json("post_effect");
   private final TextureManager textureManager;
   private final Consumer<Exception> recoveryHandler;
   private ShaderManager.PostChainCache postChains = new ShaderManager.PostChainCache(ShaderManager.Configs.EMPTY);
   private final Projection postChainProjection = new Projection();
   private final ProjectionMatrixBuffer postChainProjectionMatrixBuffer = new ProjectionMatrixBuffer("post");

   public ShaderManager(final TextureManager textureManager, final Consumer<Exception> recoveryHandler) {
      this.textureManager = textureManager;
      this.recoveryHandler = recoveryHandler;
      this.postChainProjection.setupOrtho(0.1F, 1000.0F, 1.0F, 1.0F, false);
   }

   @Override
   public final CompletableFuture<Void> reload(
      final PreparableReloadListener.SharedState currentReload,
      final Executor taskExecutor,
      final PreparableReloadListener.PreparationBarrier preparationBarrier,
      final Executor reloadExecutor
   ) {
      ResourceManager manager = currentReload.resourceManager();
      ShaderManager.PipelineCompilationContext context = preparePipelineCompilationContext();
      PipelineBuilder pipelineBuilder = RenderSystem.getPipelineBuilder();
      return CompletableFuture.<ShaderManager.Configs>supplyAsync(() -> loadConfigs(manager), taskExecutor)
         .thenComposeAsync(
            configs -> {
               List<RenderPipeline> staticPipelines = RenderPipelines.staticPipelinesToPrecompile();
               List<RenderPipeline> dynamicPipelines = RenderPipelines.dynamicPipelinesToPrecompile(context);
               List<RenderPipeline> requiredPipelines = Streams.concat(new Stream[]{staticPipelines.stream(), dynamicPipelines.stream()}).toList();
               return compilePipelines(pipelineBuilder, configs, requiredPipelines, taskExecutor, reloadExecutor)
                  .thenApply(
                     compiledRequiredPipelines -> new ShaderManager.PendingResults(
                        configs, requiredPipelines, (List<CompiledRenderPipeline>)compiledRequiredPipelines
                     )
                  );
            },
            reloadExecutor
         )
         .thenCompose(preparationBarrier::wait)
         .thenAcceptAsync(compilations -> this.apply(pipelineBuilder, compilations), reloadExecutor);
   }

   private static ShaderManager.PipelineCompilationContext preparePipelineCompilationContext() {
      OptionsRenderState optionsRenderState = new OptionsRenderState();
      Minecraft.getInstance().options.extractRenderState(optionsRenderState);
      return new ShaderManager.PipelineCompilationContext(optionsRenderState, RenderSystem.isMultidrawIndirectAvailable());
   }

   private static CompletableFuture<List<@Nullable CompiledRenderPipeline>> compilePipelines(
      final PipelineBuilder pipelineBuilder,
      final ShaderSource shaderSource,
      final List<RenderPipeline> pipelines,
      final Executor taskExecutor,
      final Executor reloadExecutor
   ) {
      return Util.sequence(
         pipelines.stream()
            .map(
               pipeline -> pipelineBuilder.compilePipeline(pipeline, shaderSource, taskExecutor)
                  .thenApplyAsync(CompiledRenderPipeline.Pending::finishCompile, reloadExecutor)
            )
            .toList()
      );
   }

   private static ShaderManager.Configs loadConfigs(final ResourceManager manager) {
      Builder<ShaderManager.ShaderSourceKey, String> shaderSources = ImmutableMap.builder();
      Builder<Identifier, ShaderSource.CachedIncludeSource> includeSources = ImmutableMap.builder();
      Map<Identifier, Resource> files = manager.listResources("shaders", var0 -> true);

      for (Entry<Identifier, Resource> entry : files.entrySet()) {
         Identifier location = entry.getKey();
         ShaderType shaderType = shaderTypeByLocation(location);
         if (shaderType != null) {
            loadShader(location, entry.getValue(), shaderType, shaderSources);
         } else if (SHADER_INCLUDE_CONVERTER.matches(location)) {
            loadInclude(location, entry.getValue(), includeSources);
         }
      }

      Builder<Identifier, PostChainConfig> postChains = ImmutableMap.builder();

      for (Entry<Identifier, Resource> entry : POST_CHAIN_ID_CONVERTER.listMatchingResources(manager).entrySet()) {
         loadPostChain(entry.getKey(), entry.getValue(), postChains);
      }

      return new ShaderManager.Configs(shaderSources.build(), includeSources.build(), postChains.build());
   }

   private static void loadShader(
      final Identifier location, final Resource resource, final ShaderType type, final Builder<ShaderManager.ShaderSourceKey, String> output
   ) {
      try {
         String contents = resource.readAllAsString();
         Identifier id = new FileToIdConverter("shaders", type.getExtension()).fileToId(location);
         output.put(new ShaderManager.ShaderSourceKey(id, type), contents);
      } catch (IOException e) {
         LOGGER.error("Failed to load shader source at {}", location, e);
      }
   }

   private static void loadInclude(final Identifier location, final Resource resource, final Builder<Identifier, ShaderSource.CachedIncludeSource> output) {
      try {
         String contents = resource.readAllAsString();
         Identifier id = includeShaderLocationToId(location);
         output.put(id, ShaderSource.CachedIncludeSource.create(id, contents));
      } catch (IOException e) {
         LOGGER.error("Failed to load shader source at {}", location, e);
      }
   }

   private static void loadPostChain(final Identifier location, final Resource resource, final Builder<Identifier, PostChainConfig> output) {
      Identifier id = POST_CHAIN_ID_CONVERTER.fileToId(location);

      try (Reader reader = resource.openAsReader()) {
         JsonElement json = StrictJsonParser.parse(reader);
         output.put(id, (PostChainConfig)PostChainConfig.CODEC.parse(JsonOps.INSTANCE, json).getOrThrow(JsonSyntaxException::new));
      } catch (IOException | JsonParseException e) {
         LOGGER.error("Failed to parse post chain at {}", location, e);
      }
   }

   public static Map<Identifier, ShaderSource.CachedIncludeSource> listAllIncludes(final ResourceManager resourceManager) {
      Map<Identifier, ShaderSource.CachedIncludeSource> includes = new HashMap<>();
      SHADER_INCLUDE_CONVERTER.listMatchingResources(resourceManager).forEach((location, resource) -> {
         try {
            String contents = resource.readAllAsString();
            Identifier includeId = includeShaderLocationToId(location);
            includes.put(includeId, ShaderSource.CachedIncludeSource.create(includeId, contents));
         } catch (Exception exception) {
            LOGGER.error("Couldn't read shader file {}", location, exception);
         }
      });
      return includes;
   }

   private static Identifier includeShaderLocationToId(final Identifier location) {
      return SHADER_INCLUDE_CONVERTER.fileToId(location).withSuffix(".glsl");
   }

   private static @Nullable ShaderType shaderTypeByLocation(final Identifier location) {
      for (ShaderType type : SHADER_TYPES) {
         if (location.getPath().endsWith(type.getExtension())) {
            return type;
         }
      }

      return null;
   }

   private void apply(final PipelineBuilder pipelineBuilder, final ShaderManager.PendingResults compilations) {
      ShaderManager.PostChainCache newPostChains = new ShaderManager.PostChainCache(compilations.configs);
      List<Identifier> failedLoads = new ArrayList<>();
      PipelineCache pipelineCache = new PipelineCache(pipelineBuilder, compilations.configs);
      pipelineCache.clear();

      for (int i = 0; i < compilations.requiredPipelines.size(); i++) {
         RenderPipeline pipeline = compilations.requiredPipelines.get(i);
         CompiledRenderPipeline compiled = compilations.compiledRequiredPipelines.get(i);
         if (compiled != null) {
            pipelineCache.insert(pipeline, compiled);
         } else {
            failedLoads.add(pipeline.getLocation());
         }
      }

      if (!failedLoads.isEmpty()) {
         pipelineCache.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n" + failedLoads.stream().map(entry -> " - " + entry).collect(Collectors.joining("\n"))
         );
      }

      this.postChains.close();
      this.postChains = newPostChains;
      PipelineCache oldPipelineCache = RenderSystem.setCurrentPipelineCache(pipelineCache);
      if (oldPipelineCache != null) {
         oldPipelineCache.close();
      }
   }

   @Override
   public String getName() {
      return "Shader Loader";
   }

   private void tryTriggerRecovery(final Exception exception) {
      if (!this.postChains.triggeredRecovery) {
         this.recoveryHandler.accept(exception);
         this.postChains.triggeredRecovery = true;
      }
   }

   public boolean isPostEffectValid(final Identifier id, final Set<Identifier> allowedTargets) {
      PostChainConfig postChainConfig = this.postChains.configs.postChains.get(id);
      if (postChainConfig == null) {
         LOGGER.warn("Requested post effect does not exist: {}", id);
         return false;
      } else {
         Set<Identifier> invalidExternalTargets = Sets.difference(PostChain.getReferencedExternalTargets(postChainConfig), allowedTargets);
         if (!invalidExternalTargets.isEmpty()) {
            LOGGER.warn(
               "Requested post chain {} can not be used as a post effect because it uses targets inaccessible to post effects: {}", id, invalidExternalTargets
            );
            return false;
         } else {
            return true;
         }
      }
   }

   public @Nullable PostChain getPostChain(final Identifier id, final Set<Identifier> allowedTargets) {
      try {
         return this.postChains.getOrLoadPostChain(id, allowedTargets);
      } catch (ShaderManager.CompilationException e) {
         LOGGER.error("Failed to load post chain: {}", id, e);
         this.postChains.postChains.put(id, Optional.empty());
         this.tryTriggerRecovery(e);
         return null;
      }
   }

   @Override
   public void close() {
      this.postChains.close();
      this.postChainProjectionMatrixBuffer.close();
   }

   public Stream<Identifier> getAvailablePostEffects() {
      return this.postChains.getKnownPostEffects();
   }

   public static class CompilationException extends Exception {
      public CompilationException(final String message) {
         super(message);
      }
   }

   public record Configs(
      Map<ShaderManager.ShaderSourceKey, String> shaderSources,
      Map<Identifier, ShaderSource.CachedIncludeSource> includeSources,
      Map<Identifier, PostChainConfig> postChains
   ) implements ShaderSource {
      public static final ShaderManager.Configs EMPTY = new ShaderManager.Configs(Map.of(), Map.of(), Map.of());

      @Override
      public String getShader(final Identifier id, final ShaderType type) {
         return this.shaderSources.get(new ShaderManager.ShaderSourceKey(id, type));
      }

      @Override
      public ShaderSource.CachedIncludeSource getInclude(final Identifier id) {
         return this.includeSources.get(id);
      }

      @Override
      public void close() {
         this.includeSources.values().forEach(ShaderSource.CachedIncludeSource::close);
      }
   }

   private record PendingResults(
      ShaderManager.Configs configs, List<RenderPipeline> requiredPipelines, List<@Nullable CompiledRenderPipeline> compiledRequiredPipelines
   ) {
   }

   public record PipelineCompilationContext(OptionsRenderState options, boolean multidraw) {
   }

   private class PostChainCache implements AutoCloseable {
      private final ShaderManager.Configs configs;
      private final Map<Identifier, Optional<PostChain>> postChains = new HashMap<>();
      private boolean triggeredRecovery;

      private PostChainCache(final ShaderManager.Configs configs) {
         this.configs = configs;
      }

      public @Nullable PostChain getOrLoadPostChain(final Identifier id, final Set<Identifier> allowedTargets) throws ShaderManager.CompilationException {
         Optional<PostChain> cached = this.postChains.get(id);
         if (cached != null) {
            return cached.orElse(null);
         }

         PostChain postChain = this.loadPostChain(id, allowedTargets);
         this.postChains.put(id, Optional.ofNullable(postChain));
         return postChain;
      }

      private @Nullable PostChain loadPostChain(final Identifier id, final Set<Identifier> allowedTargets) throws ShaderManager.CompilationException {
         PostChainConfig config = this.configs.postChains.get(id);
         if (config == null) {
            if (!id.equals(GameRenderer.END_OF_FRAME_POST_EFFECT)) {
               ShaderManager.LOGGER.warn("Attempted to load a non-existent post effect {}", id);
            }

            return null;
         } else {
            return PostChain.load(
               config,
               ShaderManager.this.textureManager,
               allowedTargets,
               id,
               ShaderManager.this.postChainProjection,
               ShaderManager.this.postChainProjectionMatrixBuffer
            );
         }
      }

      @Override
      public void close() {
         this.postChains.values().forEach(chain -> chain.ifPresent(PostChain::close));
         this.postChains.clear();
      }

      public Stream<Identifier> getKnownPostEffects() {
         return this.configs.postChains.keySet().stream();
      }
   }

   private record ShaderSourceKey(Identifier id, ShaderType type) {
      @Override
      public String toString() {
         return this.id + " (" + this.type + ")";
      }
   }
}
