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

public interface ki extends Iterable<kn<?>>, kg {
   ki a = new ki() {
      @Nullable
      @Override
      public <T> T a(kk<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kk<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kn<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<ki> b = b(kk.d);

   static Codec<ki> a(Codec<kk<?>> $$0) {
      return b(Codec.dispatchedMap($$0, kk::c));
   }

   static Codec<ki> b(Codec<Map<kk<?>, Object>> $$0) {
      return $$0.flatComapMap(ki.a::a, $$0x -> {
         int $$1 = $$0x.d();
         if ($$1 == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectMap<kk<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

            for (kn<?> $$3 : $$0x) {
               if (!$$3.a().d()) {
                  $$2.put($$3.a(), $$3.b());
               }
            }

            return DataResult.success($$2);
         }
      });
   }

   static ki a(final ki $$0, final ki $$1) {
      return new ki() {
         @Nullable
         @Override
         public <T> T a(kk<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kk<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static ki.a a() {
      return new ki.a();
   }

   Set<kk<?>> b();

   default boolean c(kk<?> $$0) {
      return this.a($$0) != null;
   }

   @Override
   default Iterator<kn<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.b($$0)));
   }

   default Stream<kn<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default ki a(final Predicate<kk<?>> $$0) {
      return new ki() {
         @Nullable
         @Override
         public <T> T a(kk<? extends T> $$0x) {
            return $$0.test($$0) ? ki.this.a($$0) : null;
         }

         @Override
         public Set<kk<?>> b() {
            return Sets.filter(ki.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kk<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ki.a a(kk<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kk<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public ki.a a(ki $$0) {
         for (kn<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public ki a() {
         return a(this.a);
      }

      private static ki a(Map<kk<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return ki.a;
         } else {
            return $$0.size() < 8 ? new ki.a.a(new Reference2ObjectArrayMap($$0)) : new ki.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kk<?>, Object> c) implements ki {
         @Nullable
         @Override
         public <T> T a(kk<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean c(kk<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kk<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kn<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kn::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kk<?>, Object> f() {
            return this.c;
         }
      }
   }
}
