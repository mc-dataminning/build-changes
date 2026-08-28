package net.minecraft.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.PipelineCache;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.renderpearl.api.device.GpuDevice;
import com.mojang.renderpearl.api.pipeline.CompiledRenderPipeline;
import com.mojang.renderpearl.api.pipeline.RenderPipeline;
import com.mojang.renderpearl.api.pipeline.ShaderSource;
import com.mojang.renderpearl.api.pipeline.ShaderType;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.StrictJsonParser;
import net.minecraft.util.Util;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ShaderManager implements PreparableReloadListener, AutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final int MAX_LOG_LENGTH = 32768;
   public static final String SHADER_PATH = "shaders";
   public static final String SHADER_INCLUDE_PATH = "shaders/include/";
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
      GpuDevice device = RenderSystem.getDevice();
      return CompletableFuture.<ShaderManager.Configs>supplyAsync(() -> this.loadConfigs(manager), taskExecutor)
         .thenComposeAsync(
            configs -> {
               List<RenderPipeline> requiredPipelines = RenderPipelines.requiredPipelines();
               List<RenderPipeline> optionalPipelines = RenderPipelines.optionalPipelines();
               return compilePipelines(device, configs, requiredPipelines, taskExecutor, reloadExecutor)
                  .thenCombine(
                     compilePipelines(device, configs, optionalPipelines, taskExecutor, reloadExecutor),
                     (compiledRequiredPipelines, compiledOptionalPipelines) -> new ShaderManager.PendingResults(
                           configs,
                           requiredPipelines,
                           optionalPipelines,
                           (List<CompiledRenderPipeline>)compiledRequiredPipelines,
                           (List<CompiledRenderPipeline>)compiledOptionalPipelines
                        )
                  );
            },
            reloadExecutor
         )
         .thenCompose(preparationBarrier::wait)
         .thenAcceptAsync(compilations -> this.apply(device, compilations), reloadExecutor);
   }

   private static CompletableFuture<List<CompiledRenderPipeline>> compilePipelines(
      final GpuDevice device, final ShaderSource shaderSource, final List<RenderPipeline> pipelines, final Executor taskExecutor, final Executor reloadExecutor
   ) {
      return Util.sequence(
         pipelines.stream()
            .map(
               pipeline -> device.compilePipeline(pipeline, shaderSource, taskExecutor)
                     .thenApplyAsync(CompiledRenderPipeline.Pending::finishCompile, reloadExecutor)
            )
            .toList()
      );
   }

   private ShaderManager.Configs loadConfigs(final ResourceManager manager) {
      Builder<ShaderManager.ShaderSourceKey, String> shaderSources = ImmutableMap.builder();
      Map<Identifier, Resource> files = manager.listResources("shaders", ShaderManager::isShader);

      for (Entry<Identifier, Resource> entry : files.entrySet()) {
         Identifier location = entry.getKey();
         ShaderType shaderType = ShaderType.byLocation(location);
         loadShader(location, entry.getValue(), shaderType, files, shaderSources);
      }

      Builder<Identifier, PostChainConfig> postChains = ImmutableMap.builder();

      for (Entry<Identifier, Resource> entry : POST_CHAIN_ID_CONVERTER.listMatchingResources(manager).entrySet()) {
         loadPostChain(entry.getKey(), entry.getValue(), postChains);
      }

      return new ShaderManager.Configs(shaderSources.build(), postChains.build());
   }

   private static void loadShader(
      final Identifier location,
      final Resource resource,
      @Nullable final ShaderType type,
      final Map<Identifier, Resource> files,
      final Builder<ShaderManager.ShaderSourceKey, String> output
   ) {
      Identifier id = type == null ? location : type.idConverter().fileToId(location);

      try (Reader reader = resource.openAsReader()) {
         String source = IOUtils.toString(reader);
         output.put(new ShaderManager.ShaderSourceKey(id, type), source);
      } catch (IOException var11) {
         LOGGER.error("Failed to load shader source at {}", location, var11);
      }
   }

   private static void loadPostChain(final Identifier location, final Resource resource, final Builder<Identifier, PostChainConfig> output) {
      Identifier id = POST_CHAIN_ID_CONVERTER.fileToId(location);

      try (Reader reader = resource.openAsReader()) {
         JsonElement json = StrictJsonParser.parse(reader);
         output.put(id, (PostChainConfig)PostChainConfig.CODEC.parse(JsonOps.INSTANCE, json).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         LOGGER.error("Failed to parse post chain at {}", location, var9);
      }
   }

   private static boolean isShader(final Identifier location) {
      return ShaderType.byLocation(location) != null || location.getPath().endsWith(".glsl");
   }

   private void apply(final GpuDevice device, final ShaderManager.PendingResults compilations) {
      ShaderManager.PostChainCache newPostChains = new ShaderManager.PostChainCache(compilations.configs);
      List<Identifier> failedLoads = new ArrayList<>();
      PipelineCache pipelineCache = new PipelineCache(device, compilations.configs);
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
         for (CompiledRenderPipeline builtPipeline : compilations.compiledOptionalPipelines) {
            if (builtPipeline != null) {
               builtPipeline.close();
            }
         }

         pipelineCache.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n" + failedLoads.stream().map(entry -> " - " + entry).collect(Collectors.joining("\n"))
         );
      } else {
         for (int ix = 0; ix < compilations.optionalPipelines.size(); ix++) {
            RenderPipeline pipeline = compilations.optionalPipelines.get(ix);
            CompiledRenderPipeline compiled = compilations.compiledOptionalPipelines.get(ix);
            if (compiled != null) {
               pipelineCache.insert(pipeline, compiled);
            } else {
               failedLoads.add(pipeline.getLocation());
            }
         }

         if (!failedLoads.isEmpty()) {
            LOGGER.warn("Failed to load optional shader programs:\n{}", failedLoads.stream().map(entry -> " - " + entry).collect(Collectors.joining("\n")));
         }

         this.postChains.close();
         this.postChains = newPostChains;
         PipelineCache oldPipelineCache = RenderSystem.setCurrentPipelineCache(pipelineCache);
         if (oldPipelineCache != null) {
            oldPipelineCache.close();
         }
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

   @Nullable
   public PostChain getPostChain(final Identifier id, final Set<Identifier> allowedTargets) {
      try {
         return this.postChains.getOrLoadPostChain(id, allowedTargets);
      } catch (ShaderManager.CompilationException var4) {
         LOGGER.error("Failed to load post chain: {}", id, var4);
         this.postChains.postChains.put(id, Optional.empty());
         this.tryTriggerRecovery(var4);
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

   public static record Configs(Map<ShaderManager.ShaderSourceKey, String> shaderSources, Map<Identifier, PostChainConfig> postChains) implements ShaderSource {
      public static final ShaderManager.Configs EMPTY = new ShaderManager.Configs(Map.of(), Map.of());

      @Nullable
      @Override
      public String get(final Identifier id, @Nullable final ShaderType type) {
         return this.shaderSources.get(new ShaderManager.ShaderSourceKey(id, type));
      }
   }

   private static record PendingResults(
      ShaderManager.Configs configs,
      List<RenderPipeline> requiredPipelines,
      List<RenderPipeline> optionalPipelines,
      List<CompiledRenderPipeline> compiledRequiredPipelines,
      List<CompiledRenderPipeline> compiledOptionalPipelines
   ) {
   }

   private class PostChainCache implements AutoCloseable {
      private final ShaderManager.Configs configs;
      private final Map<Identifier, Optional<PostChain>> postChains;
      private boolean triggeredRecovery;

      private PostChainCache(final ShaderManager.Configs configs) {
         Objects.requireNonNull(ShaderManager.this);
         super();
         this.postChains = new HashMap<>();
         this.configs = configs;
      }

      @Nullable
      public PostChain getOrLoadPostChain(final Identifier id, final Set<Identifier> allowedTargets) throws ShaderManager.CompilationException {
         Optional<PostChain> cached = this.postChains.get(id);
         if (cached != null) {
            return cached.orElse(null);
         } else {
            PostChain postChain = this.loadPostChain(id, allowedTargets);
            this.postChains.put(id, Optional.ofNullable(postChain));
            return postChain;
         }
      }

      @Nullable
      private PostChain loadPostChain(final Identifier id, final Set<Identifier> allowedTargets) throws ShaderManager.CompilationException {
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

   private static record ShaderSourceKey(Identifier id, @Nullable ShaderType type) {
      @Override
      public String toString() {
         return this.id + " (" + this.type + ")";
      }
   }
}
