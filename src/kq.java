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

public interface kq extends Iterable<kw<?>> {
   kq a = new kq() {
      @Nullable
      @Override
      public <T> T a(kt<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kt<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kw<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<kq> b = b(kt.d);

   static Codec<kq> a(Codec<kt<?>> $$0) {
      return b(Codec.dispatchedMap($$0, kt::c));
   }

   static Codec<kq> b(Codec<Map<kt<?>, Object>> $$0) {
      return $$0.flatComapMap(kq.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<kt<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (kw<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static kq a(final kq $$0, final kq $$1) {
      return new kq() {
         @Nullable
         @Override
         public <T> T a(kt<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kt<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static kq.a a() {
      return new kq.a();
   }

   @Nullable
   <T> T a(kt<? extends T> var1);

   Set<kt<?>> b();

   default boolean b(kt<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(kt<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kw<T> c(kt<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kw<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kw<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kw<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default kq a(final Predicate<kt<?>> $$0) {
      return new kq() {
         @Nullable
         @Override
         public <T> T a(kt<? extends T> $$0x) {
            return $$0.test($$0) ? kq.this.a($$0) : null;
         }

         @Override
         public Set<kt<?>> b() {
            return Sets.filter(kq.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kt<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kq.a a(kt<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kt<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public kq.a a(kq $$0) {
         for (kw<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public kq a() {
         return a(this.a);
      }

      private static kq a(Map<kt<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return kq.a;
         } else {
            return $$0.size() < 8 ? new kq.a.a(new Reference2ObjectArrayMap($$0)) : new kq.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kt<?>, Object> c) implements kq {
         @Nullable
         @Override
         public <T> T a(kt<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(kt<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kt<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kw<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kw::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kt<?>, Object> f() {
            return this.c;
         }
      }
   }
}
