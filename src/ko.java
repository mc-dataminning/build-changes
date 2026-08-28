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

public interface ko extends Iterable<ku<?>> {
   ko a = new ko() {
      @Nullable
      @Override
      public <T> T a(kr<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kr<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<ku<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<ko> b = b(kr.d);

   static Codec<ko> a(Codec<kr<?>> $$0) {
      return b(Codec.dispatchedMap($$0, kr::c));
   }

   static Codec<ko> b(Codec<Map<kr<?>, Object>> $$0) {
      return $$0.flatComapMap(ko.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<kr<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (ku<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static ko a(final ko $$0, final ko $$1) {
      return new ko() {
         @Nullable
         @Override
         public <T> T a(kr<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kr<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static ko.a a() {
      return new ko.a();
   }

   @Nullable
   <T> T a(kr<? extends T> var1);

   Set<kr<?>> b();

   default boolean b(kr<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(kr<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> ku<T> c(kr<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new ku<>($$0, $$1) : null;
   }

   @Override
   default Iterator<ku<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<ku<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default ko a(final Predicate<kr<?>> $$0) {
      return new ko() {
         @Nullable
         @Override
         public <T> T a(kr<? extends T> $$0x) {
            return $$0.test($$0) ? ko.this.a($$0) : null;
         }

         @Override
         public Set<kr<?>> b() {
            return Sets.filter(ko.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kr<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ko.a a(kr<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kr<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public ko.a a(ko $$0) {
         for (ku<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public ko a() {
         return a(this.a);
      }

      private static ko a(Map<kr<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return ko.a;
         } else {
            return $$0.size() < 8 ? new ko.a.a(new Reference2ObjectArrayMap($$0)) : new ko.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kr<?>, Object> c) implements ko {
         @Nullable
         @Override
         public <T> T a(kr<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(kr<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kr<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<ku<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), ku::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kr<?>, Object> f() {
            return this.c;
         }
      }
   }
}
