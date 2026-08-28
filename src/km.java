import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface km extends Iterable<ks<?>> {
   km a = new km() {
      @Nullable
      @Override
      public <T> T a(kp<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kp<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<ks<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<km> b = b(kp.d);

   static Codec<km> a(Codec<kp<?>> $$0) {
      return b(Codec.dispatchedMap($$0, kp::c));
   }

   static Codec<km> b(Codec<Map<kp<?>, Object>> $$0) {
      return $$0.flatComapMap(km.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<kp<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (ks<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static km a(final km $$0, final km $$1) {
      return new km() {
         @Nullable
         @Override
         public <T> T a(kp<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kp<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static km.a a() {
      return new km.a();
   }

   @Nullable
   <T> T a(kp<? extends T> var1);

   Set<kp<?>> b();

   default boolean b(kp<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(kp<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> ks<T> c(kp<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new ks<>($$0, $$1) : null;
   }

   @Override
   default Iterator<ks<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<ks<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default km a(final Predicate<kp<?>> $$0) {
      return new km() {
         @Nullable
         @Override
         public <T> T a(kp<? extends T> $$0x) {
            return $$0.test($$0) ? km.this.a($$0) : null;
         }

         @Override
         public Set<kp<?>> b() {
            return Sets.filter(km.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kp<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> km.a a(kp<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kp<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public km.a a(km $$0) {
         for (ks<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public km a() {
         return a(this.a);
      }

      private static km a(Map<kp<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return km.a;
         } else {
            return $$0.size() < 8 ? new km.a.a(new Reference2ObjectArrayMap($$0)) : new km.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kp<?>, Object> c) implements km {
         @Nullable
         @Override
         public <T> T a(kp<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(kp<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kp<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<ks<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), ks::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kp<?>, Object> f() {
            return this.c;
         }
      }
   }
}
