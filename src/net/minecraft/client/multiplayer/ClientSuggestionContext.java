package net.minecraft.client.multiplayer;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.PlaceholderRegistries;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket;
import net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryDataLoader;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.permissions.PermissionSet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class ClientSuggestionContext implements SuggestionContext {
   private final ClientPacketListener connection;
   private final Minecraft minecraft;
   private int pendingSuggestionsId = -1;
   private @Nullable CompletableFuture<Suggestions> pendingSuggestionsFuture;
   private final Set<String> customCompletionSuggestions = new HashSet<>();
   private final PermissionSet permissions;
   private final HolderLookup.Provider filteredLookups;
   private final HolderGetter.Provider gettersWithPlaceholders;

   public ClientSuggestionContext(final ClientPacketListener connection, final Minecraft minecraft, final PermissionSet permissions) {
      this.connection = connection;
      this.minecraft = minecraft;
      this.permissions = permissions;
      this.filteredLookups = connection.registryAccess().filterFeatures(connection.enabledFeatures());
      this.gettersWithPlaceholders = this.filteredLookups
         .withFallback(PlaceholderRegistries.create(RegistryDataLoader.allLoadableRegistries(), PlaceholderRegistries.PlaceholderBehavior.ACCEPT_ALL));
   }

   @Override
   public Collection<String> onlinePlayerNames() {
      List<String> result = new ArrayList<>();

      for (PlayerInfo info : this.connection.getOnlinePlayers()) {
         result.add(info.getProfile().name());
      }

      return result;
   }

   @Override
   public Collection<String> customTabSuggestions() {
      if (this.customCompletionSuggestions.isEmpty()) {
         return this.onlinePlayerNames();
      }

      Set<String> result = new HashSet<>(this.onlinePlayerNames());
      result.addAll(this.customCompletionSuggestions);
      return result;
   }

   @Override
   public Collection<String> selectedEntities() {
      return this.minecraft.hitResult != null && this.minecraft.hitResult.getType() == HitResult.Type.ENTITY
         ? Collections.singleton(((EntityHitResult)this.minecraft.hitResult).getEntity().getStringUUID())
         : Collections.emptyList();
   }

   @Override
   public Collection<String> allTeams() {
      return this.connection.scoreboard().getTeamNames();
   }

   @Override
   public Stream<Identifier> availableSounds() {
      return this.minecraft.getSoundManager().getAvailableSounds().stream();
   }

   @Override
   public Stream<Identifier> availablePostEffects() {
      return this.minecraft.getShaderManager().getAvailablePostEffects();
   }

   @Override
   public PermissionSet permissions() {
      return this.permissions;
   }

   @Override
   public <E> CompletableFuture<Suggestions> suggestRegistryElements(
      final CommandContext<?> context,
      final ResourceKey<? extends Registry<? extends E>> key,
      final SuggestionContext.ElementSuggestionType elements,
      final SuggestionsBuilder builder,
      final Predicate<E> filter
   ) {
      return this.holderLookups().lookup(key).map(registry -> {
         this.suggestRegistryElements(registry, elements, builder, filter);
         return builder.buildFuture();
      }).orElseGet(() -> this.customSuggestion(context));
   }

   @Override
   public CompletableFuture<Suggestions> suggestObjectiveNames(final CommandContext<?> context, final SuggestionsBuilder builder) {
      return this.customSuggestion(context);
   }

   @Override
   public CompletableFuture<Suggestions> customSuggestion(final CommandContext<?> context) {
      if (this.pendingSuggestionsFuture != null) {
         this.pendingSuggestionsFuture.cancel(false);
      }

      this.pendingSuggestionsFuture = new CompletableFuture<>();
      int id = ++this.pendingSuggestionsId;
      this.connection.send(new ServerboundCommandSuggestionPacket(id, context.getInput()));
      return this.pendingSuggestionsFuture;
   }

   private static String prettyPrint(final double value) {
      return String.format(Locale.ROOT, "%.2f", value);
   }

   private static String prettyPrint(final int value) {
      return Integer.toString(value);
   }

   @Override
   public Collection<SuggestionContext.TextCoordinates> relevantCoordinates() {
      HitResult hitResult = this.minecraft.hitResult;
      if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
         BlockPos pos = ((BlockHitResult)hitResult).getBlockPos();
         return Collections.singleton(new SuggestionContext.TextCoordinates(prettyPrint(pos.getX()), prettyPrint(pos.getY()), prettyPrint(pos.getZ())));
      } else {
         return SuggestionContext.super.relevantCoordinates();
      }
   }

   @Override
   public Collection<SuggestionContext.TextCoordinates> absoluteCoordinates() {
      HitResult hitResult = this.minecraft.hitResult;
      if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
         Vec3 pos = hitResult.getLocation();
         return Collections.singleton(new SuggestionContext.TextCoordinates(prettyPrint(pos.x), prettyPrint(pos.y), prettyPrint(pos.z)));
      } else {
         return SuggestionContext.super.absoluteCoordinates();
      }
   }

   @Override
   public @Nullable MinecraftServer server() {
      return null;
   }

   @Override
   public @Nullable Level level() {
      return this.minecraft.level;
   }

   @Override
   public Set<ResourceKey<Level>> levels() {
      return this.connection.levels();
   }

   @Override
   public @Nullable Entity entity() {
      return this.minecraft.player;
   }

   @Override
   public Vec3 position() {
      Entity entity = this.entity();
      return entity != null ? entity.position() : Vec3.ZERO;
   }

   @Override
   public HolderLookup.Provider holderLookups() {
      return this.filteredLookups;
   }

   @Override
   public HolderGetter.Provider holderGetters() {
      return this.gettersWithPlaceholders;
   }

   @Override
   public FeatureFlagSet enabledFeatures() {
      return this.connection.enabledFeatures();
   }

   public void completeCustomSuggestions(final int id, final Suggestions result) {
      if (id == this.pendingSuggestionsId) {
         this.pendingSuggestionsFuture.complete(result);
         this.pendingSuggestionsFuture = null;
         this.pendingSuggestionsId = -1;
      }
   }

   public void modifyCustomCompletions(final ClientboundCustomChatCompletionsPacket.Action action, final List<String> entries) {
      switch (action) {
         case ADD:
            this.customCompletionSuggestions.addAll(entries);
            break;
         case REMOVE:
            entries.forEach(this.customCompletionSuggestions::remove);
            break;
         case SET:
            this.customCompletionSuggestions.clear();
            this.customCompletionSuggestions.addAll(entries);
      }
   }
}
