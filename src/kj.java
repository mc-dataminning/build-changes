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

public interface kj extends Iterable<kp<?>> {
   kj a = new kj() {
      @Nullable
      @Override
      public <T> T a(km<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<km<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kp<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<kj> b = b(km.d);

   static Codec<kj> a(Codec<km<?>> $$0) {
      return b(Codec.dispatchedMap($$0, km::c));
   }

   static Codec<kj> b(Codec<Map<km<?>, Object>> $$0) {
      return $$0.flatComapMap(kj.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<km<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (kp<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static kj a(final kj $$0, final kj $$1) {
      return new kj() {
         @Nullable
         @Override
         public <T> T a(km<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<km<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static kj.a a() {
      return new kj.a();
   }

   @Nullable
   <T> T a(km<? extends T> var1);

   Set<km<?>> b();

   default boolean b(km<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(km<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kp<T> c(km<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kp<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kp<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kp<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default kj a(final Predicate<km<?>> $$0) {
      return new kj() {
         @Nullable
         @Override
         public <T> T a(km<? extends T> $$0x) {
            return $$0.test($$0) ? kj.this.a($$0) : null;
         }

         @Override
         public Set<km<?>> b() {
            return Sets.filter(kj.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<km<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kj.a a(km<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(km<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public kj.a a(kj $$0) {
         for (kp<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public kj a() {
         return a(this.a);
      }

      private static kj a(Map<km<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return kj.a;
         } else {
            return $$0.size() < 8 ? new kj.a.a(new Reference2ObjectArrayMap($$0)) : new kj.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<km<?>, Object> c) implements kj {
         @Nullable
         @Override
         public <T> T a(km<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(km<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<km<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kp<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kp::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<km<?>, Object> f() {
            return this.c;
         }
      }
   }
}
