package net.minecraft.commands;

import com.google.common.collect.MapMaker;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderOwner;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;

public class PlaceholderRegistries implements HolderGetter.Provider {
   private final Map<ResourceKey<? extends Registry<?>>, HolderGetter<?>> registries;

   private PlaceholderRegistries(final Map<ResourceKey<? extends Registry<?>>, HolderGetter<?>> registries) {
      this.registries = registries;
   }

   public static HolderGetter.Provider create(final Stream<ResourceKey<? extends Registry<?>>> keys, final PlaceholderRegistries.PlaceholderBehavior behavior) {
      return new PlaceholderRegistries(keys.collect(Collectors.toUnmodifiableMap(k -> k, var1 -> createPlaceholder(behavior))));
   }

   private static <T> HolderGetter<T> createPlaceholder(final PlaceholderRegistries.PlaceholderBehavior behavior) {
      return switch (behavior) {
         case REJECT_ALL -> new PlaceholderRegistries.EmptyRegistry();
         case ACCEPT_ALL -> new PlaceholderRegistries.PlaceholderRegistry();
      };
   }

   @Override
   public <T> Optional<? extends HolderGetter<T>> lookup(final ResourceKey<? extends Registry<? extends T>> key) {
      return Optional.ofNullable((HolderGetter<T>)this.registries.get(key));
   }

   private static class EmptyRegistry<T> implements HolderGetter<T> {
      @Override
      public Optional<Holder.Reference<T>> get(final ResourceKey<T> id) {
         return Optional.empty();
      }

      @Override
      public Optional<HolderSet.Named<T>> get(final TagKey<T> id) {
         return Optional.empty();
      }
   }

   public enum PlaceholderBehavior {
      REJECT_ALL,
      ACCEPT_ALL;
   }

   private static class PlaceholderElement<T> extends Holder.Reference<T> {
      protected PlaceholderElement(final HolderOwner<T> owner, final ResourceKey<T> key) {
         super(Holder.Reference.Type.STAND_ALONE, owner, key, null);
      }

      @Override
      public T value() {
         throw new UnsupportedOperationException("Trying to deference placeholder element " + this.key());
      }
   }

   private static class PlaceholderRegistry<T> implements HolderGetter<T> {
      private final Map<ResourceKey<T>, Holder.Reference<T>> holders = new MapMaker().weakValues().makeMap();
      private final Map<TagKey<T>, HolderSet.Named<T>> holderSets = new MapMaker().weakValues().makeMap();

      @Override
      public Holder.Reference<T> getOrThrow(final ResourceKey<T> id) {
         return this.holders.computeIfAbsent(id, k -> new PlaceholderRegistries.PlaceholderElement<>(this, (ResourceKey<T>)k));
      }

      @Override
      public Optional<Holder.Reference<T>> get(final ResourceKey<T> id) {
         return Optional.of(this.getOrThrow(id));
      }

      @Override
      public HolderSet.Named<T> getOrThrow(final TagKey<T> id) {
         return this.holderSets.computeIfAbsent(id, k -> new PlaceholderRegistries.PlaceholderTag<>(this, (TagKey<T>)k));
      }

      @Override
      public Optional<HolderSet.Named<T>> get(final TagKey<T> id) {
         return Optional.of(this.getOrThrow(id));
      }
   }

   private static class PlaceholderTag<T> extends HolderSet.Named<T> {
      public PlaceholderTag(final HolderOwner<T> owner, final TagKey<T> key) {
         super(owner, key);
      }

      @Override
      protected List<Holder<T>> contents() {
         throw new UnsupportedOperationException("Trying to deference placeholder tag " + this.key());
      }
   }
}
