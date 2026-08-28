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

public interface kh extends Iterable<km<?>>, kf {
   kh a = new kh() {
      @Nullable
      @Override
      public <T> T a(kj<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kj<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<km<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<kh> b = b(kj.d);

   static Codec<kh> a(Codec<kj<?>> $$0) {
      return b(Codec.dispatchedMap($$0, kj::c));
   }

   static Codec<kh> b(Codec<Map<kj<?>, Object>> $$0) {
      return $$0.flatComapMap(kh.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<kj<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (km<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static kh a(final kh $$0, final kh $$1) {
      return new kh() {
         @Nullable
         @Override
         public <T> T a(kj<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kj<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static kh.a a() {
      return new kh.a();
   }

   Set<kj<?>> b();

   default boolean c(kj<?> $$0) {
      return this.a($$0) != null;
   }

   @Override
   default Iterator<km<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.b($$0)));
   }

   default Stream<km<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default kh a(final Predicate<kj<?>> $$0) {
      return new kh() {
         @Nullable
         @Override
         public <T> T a(kj<? extends T> $$0x) {
            return $$0.test($$0) ? kh.this.a($$0) : null;
         }

         @Override
         public Set<kj<?>> b() {
            return Sets.filter(kh.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kj<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kh.a a(kj<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kj<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public kh.a a(kh $$0) {
         for (km<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public kh a() {
         return a(this.a);
      }

      private static kh a(Map<kj<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return kh.a;
         } else {
            return $$0.size() < 8 ? new kh.a.a(new Reference2ObjectArrayMap($$0)) : new kh.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kj<?>, Object> c) implements kh {
         @Nullable
         @Override
         public <T> T a(kj<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean c(kj<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kj<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<km<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), km::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kj<?>, Object> f() {
            return this.c;
         }
      }
   }
}
