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

public interface kp extends Iterable<kv<?>> {
   kp a = new kp() {
      @Nullable
      @Override
      public <T> T a(ks<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<ks<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kv<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<kp> b = b(ks.d);

   static Codec<kp> a(Codec<ks<?>> $$0) {
      return b(Codec.dispatchedMap($$0, ks::c));
   }

   static Codec<kp> b(Codec<Map<ks<?>, Object>> $$0) {
      return $$0.flatComapMap(kp.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<ks<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (kv<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static kp a(final kp $$0, final kp $$1) {
      return new kp() {
         @Nullable
         @Override
         public <T> T a(ks<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<ks<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static kp.a a() {
      return new kp.a();
   }

   @Nullable
   <T> T a(ks<? extends T> var1);

   Set<ks<?>> b();

   default boolean b(ks<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(ks<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kv<T> c(ks<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kv<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kv<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kv<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default kp a(final Predicate<ks<?>> $$0) {
      return new kp() {
         @Nullable
         @Override
         public <T> T a(ks<? extends T> $$0x) {
            return $$0.test($$0) ? kp.this.a($$0) : null;
         }

         @Override
         public Set<ks<?>> b() {
            return Sets.filter(kp.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<ks<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kp.a a(ks<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(ks<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public kp.a a(kp $$0) {
         for (kv<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public kp a() {
         return a(this.a);
      }

      private static kp a(Map<ks<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return kp.a;
         } else {
            return $$0.size() < 8 ? new kp.a.a(new Reference2ObjectArrayMap($$0)) : new kp.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<ks<?>, Object> c) implements kp {
         @Nullable
         @Override
         public <T> T a(ks<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(ks<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<ks<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kv<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kv::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<ks<?>, Object> f() {
            return this.c;
         }
      }
   }
}
