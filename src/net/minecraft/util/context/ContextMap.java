package net.minecraft.util.context;

import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public final class ContextMap {
   public static final ContextMap EMPTY = new ContextMap(Map.of());
   private final Map<ContextKey<?>, Object> params;

   private ContextMap(final Map<ContextKey<?>, Object> params) {
      this.params = params;
   }

   public static ContextMap.Builder builder() {
      return new ContextMap.Builder();
   }

   public boolean has(final ContextKey<?> key) {
      return this.params.containsKey(key);
   }

   public <T> T getOrThrow(final ContextKey<T> key) {
      T value = this.get(key);
      if (value == null) {
         throw new NoSuchElementException(key.name().toString());
      } else {
         return value;
      }
   }

   @Nullable
   public <T> T get(final ContextKey<T> key) {
      return (T)this.params.get(key);
   }

   @Contract("_,!null->!null; _,_->_")
   @Nullable
   public <T> T getOrDefault(final ContextKey<T> param, @Nullable final T _default) {
      return (T)this.params.getOrDefault(param, _default);
   }

   public static class Builder {
      private final Map<ContextKey<?>, Object> params = new Reference2ObjectOpenHashMap();

      private Builder() {
      }

      public <T> ContextMap.Builder set(final ContextKey<T> param, @Nullable final T value) {
         if (value == null) {
            this.params.remove(param);
         } else {
            this.params.put(param, value);
         }

         return this;
      }

      @Nullable
      public <T> T get(final ContextKey<T> param) {
         return (T)this.params.get(param);
      }

      public ContextMap build() {
         return this.params.isEmpty() ? ContextMap.EMPTY : new ContextMap(new Reference2ObjectOpenHashMap(this.params));
      }

      public ContextMap buildAndValidate(final ContextKeySet paramSet) {
         Set<ContextKey<?>> notAllowed = Sets.difference(this.params.keySet(), paramSet.allowed());
         if (!notAllowed.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + notAllowed);
         } else {
            Set<ContextKey<?>> missingRequired = Sets.difference(paramSet.required(), this.params.keySet());
            if (!missingRequired.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + missingRequired);
            } else {
               return this.build();
            }
         }
      }
   }
}
