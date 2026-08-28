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

public interface kg extends Iterable<kl<?>>, ke {
   kg a = new kg() {
      @Nullable
      @Override
      public <T> T a(ki<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<ki<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kl<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<kg> b = b(ki.d);

   static Codec<kg> a(Codec<ki<?>> $$0) {
      return b(Codec.dispatchedMap($$0, ki::c));
   }

   static Codec<kg> b(Codec<Map<ki<?>, Object>> $$0) {
      return $$0.flatComapMap(kg.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<ki<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (kl<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static kg a(final kg $$0, final kg $$1) {
      return new kg() {
         @Nullable
         @Override
         public <T> T a(ki<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<ki<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static kg.a a() {
      return new kg.a();
   }

   Set<ki<?>> b();

   default boolean c(ki<?> $$0) {
      return this.a($$0) != null;
   }

   @Override
   default Iterator<kl<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.b($$0)));
   }

   default Stream<kl<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default kg a(final Predicate<ki<?>> $$0) {
      return new kg() {
         @Nullable
         @Override
         public <T> T a(ki<? extends T> $$0x) {
            return $$0.test($$0) ? kg.this.a($$0) : null;
         }

         @Override
         public Set<ki<?>> b() {
            return Sets.filter(kg.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<ki<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kg.a a(ki<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(ki<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public kg.a a(kg $$0) {
         for (kl<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public kg a() {
         return a(this.a);
      }

      private static kg a(Map<ki<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return kg.a;
         } else {
            return $$0.size() < 8 ? new kg.a.a(new Reference2ObjectArrayMap($$0)) : new kg.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<ki<?>, Object> c) implements kg {
         @Nullable
         @Override
         public <T> T a(ki<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean c(ki<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<ki<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kl<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kl::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<ki<?>, Object> f() {
            return this.c;
         }
      }
   }
}
