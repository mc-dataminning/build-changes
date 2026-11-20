package net.minecraft.server;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.ParseBox;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.ValidationWrapper;
import net.minecraft.commands.functions.CommandFunction;
import net.minecraft.commands.functions.CommandParser;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.permissions.PermissionSet;
import net.minecraft.tags.TagLoader;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.flag.FeatureFlagSet;
import org.slf4j.Logger;

public class ServerFunctionLibrary implements PreparableReloadListener {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final ResourceKey<Registry<CommandFunction<CommandSourceStack>>> TYPE_KEY = ResourceKey.createRegistryKey(
      Identifier.withDefaultNamespace("function")
   );
   private static final FileToIdConverter LISTER = new FileToIdConverter(Registries.elementsDirPath(TYPE_KEY), ".mcfunction");
   private volatile Map<Identifier, CommandFunction<CommandSourceStack>> functions = ImmutableMap.of();
   private final TagLoader<CommandFunction<CommandSourceStack>> tagsLoader = new TagLoader<>(
      (id, var2) -> this.getFunction(id), Registries.tagsDirPath(TYPE_KEY)
   );
   private volatile Map<Identifier, List<CommandFunction<CommandSourceStack>>> tags = Map.of();
   private final CommandParser.Provider<CommandSourceStack> parserProvider;

   public Optional<CommandFunction<CommandSourceStack>> getFunction(final Identifier id) {
      return Optional.ofNullable(this.functions.get(id));
   }

   public Map<Identifier, CommandFunction<CommandSourceStack>> getFunctions() {
      return this.functions;
   }

   public List<CommandFunction<CommandSourceStack>> getTag(final Identifier tag) {
      return this.tags.getOrDefault(tag, List.of());
   }

   public Iterable<Identifier> getAvailableTags() {
      return this.tags.keySet();
   }

   public ServerFunctionLibrary(
      final PermissionSet functionCompilationPermissions,
      final HolderLookup.Provider registries,
      final FeatureFlagSet enabledFeatures,
      final ParseBox commandParseBox
   ) {
      HolderLookup.Provider filteredRegistries = registries.filterFeatures(enabledFeatures);
      this.parserProvider = id -> {
         final ValidationWrapper.Provider.Collecting collectingProvider = new ValidationWrapper.Provider.Collecting();
         final ParseContext compilationContext = new ParseContext.Simple(
            functionCompilationPermissions, filteredRegistries, enabledFeatures, collectingProvider
         );
         return new CommandParser<CommandSourceStack>() {
            @Override
            public ContextChain<CommandSourceStack> parse(final StringReader input) throws CommandSyntaxException {
               return commandParseBox.parse(input, compilationContext).unpack();
            }

            @Override
            public void close() {
               ProblemReporter.Collector problems = new ProblemReporter.Collector();
               collectingProvider.validateAll(problems);
               if (problems.hasAnyProblems()) {
                  ServerFunctionLibrary.LOGGER.warn("Found validation issues in '{}': {}", id, problems.getTreeReport());
                  if (problems.hasErrors()) {
                     throw new IllegalStateException("Failed to validate function '" + id + "': " + problems.getReport());
                  }
               }
            }
         };
      };
   }

   @Override
   public CompletableFuture<Void> reload(
      final PreparableReloadListener.SharedState currentReload,
      final Executor taskExecutor,
      final PreparableReloadListener.PreparationBarrier preparationBarrier,
      final Executor reloadExecutor
   ) {
      ResourceManager manager = currentReload.resourceManager();
      CompletableFuture<Map<Identifier, List<TagLoader.EntryWithSource>>> tags = CompletableFuture.supplyAsync(
         () -> this.tagsLoader.load(manager), taskExecutor
      );
      CompletableFuture<Map<Identifier, CompletableFuture<CommandFunction<CommandSourceStack>>>> functions = CompletableFuture.<Map<Identifier, Resource>>supplyAsync(
            () -> LISTER.listMatchingResources(manager), taskExecutor
         )
         .thenCompose(functionsToLoad -> {
            Map<Identifier, CompletableFuture<CommandFunction<CommandSourceStack>>> result = new HashMap<>(functionsToLoad.size());

            for (Entry<Identifier, Resource> entry : functionsToLoad.entrySet()) {
               Identifier resourceId = entry.getKey();
               Identifier id = LISTER.fileToId(resourceId);
               result.put(id, CompletableFuture.supplyAsync(() -> {
                  List<String> lines = readLines(entry.getValue());
                  return CommandFunction.fromLines(id, this.parserProvider, lines);
               }, taskExecutor));
            }

            CompletableFuture<?>[] futuresToCollect = result.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf(futuresToCollect).handle((ignore, var2x) -> result);
         });
      return tags.thenCombine(functions, Pair::of)
         .thenCompose(preparationBarrier::wait)
         .thenAcceptAsync(
            data -> {
               Map<Identifier, CompletableFuture<CommandFunction<CommandSourceStack>>> functionFutures = (Map<Identifier, CompletableFuture<CommandFunction<CommandSourceStack>>>)data.getSecond();
               Builder<Identifier, CommandFunction<CommandSourceStack>> newFunctions = ImmutableMap.builder();
               functionFutures.forEach((id, functionFuture) -> functionFuture.handle((function, throwable) -> {
                  if (throwable != null) {
                     LOGGER.error("Failed to load function {}", id, throwable);
                  } else {
                     newFunctions.put(id, function);
                  }

                  return null;
               }).join());
               this.functions = newFunctions.build();
               this.tags = this.tagsLoader.build((Map<Identifier, List<TagLoader.EntryWithSource>>)data.getFirst());
            },
            reloadExecutor
         );
   }

   private static List<String> readLines(final Resource resource) {
      try (BufferedReader reader = resource.openAsReader()) {
         return reader.lines().toList();
      } catch (IOException ex) {
         throw new CompletionException(ex);
      }
   }
}
