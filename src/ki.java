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

public interface ki extends Iterable<ko<?>> {
   ki a = new ki() {
      @Nullable
      @Override
      public <T> T a(kl<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kl<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<ko<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<ki> b = kl.d.flatComapMap(ki.a::a, $$0 -> {
      int $$1 = $$0.d();
      if ($$1 == 0) {
         return DataResult.success(Reference2ObjectMaps.emptyMap());
      } else {
         Reference2ObjectMap<kl<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

         for (ko<?> $$3 : $$0) {
            if (!$$3.a().d()) {
               $$2.put($$3.a(), $$3.b());
            }
         }

         return DataResult.success($$2);
      }
   });

   static ki a(final ki $$0, final ki $$1) {
      return new ki() {
         @Nullable
         @Override
         public <T> T a(kl<? extends T> $$0x) {
            T $$1 = $$1.a($$0);
            return $$1 != null ? $$1 : $$0.a($$0);
         }

         @Override
         public Set<kl<?>> b() {
            return Sets.union($$0.b(), $$1.b());
         }
      };
   }

   static ki.a a() {
      return new ki.a();
   }

   @Nullable
   <T> T a(kl<? extends T> var1);

   Set<kl<?>> b();

   default boolean b(kl<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(kl<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> ko<T> c(kl<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new ko<>($$0, $$1) : null;
   }

   @Override
   default Iterator<ko<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<ko<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default ki a(final Predicate<kl<?>> $$0) {
      return new ki() {
         @Nullable
         @Override
         public <T> T a(kl<? extends T> $$0x) {
            return $$0.test($$0) ? ki.this.a($$0) : null;
         }

         @Override
         public Set<kl<?>> b() {
            return Sets.filter(ki.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kl<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ki.a a(kl<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(kl<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public ki.a a(ki $$0) {
         for (ko<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public ki a() {
         return a(this.a);
      }

      private static ki a(Map<kl<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return ki.a;
         } else {
            return $$0.size() < 8 ? new ki.a.a(new Reference2ObjectArrayMap($$0)) : new ki.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<kl<?>, Object> c) implements ki {
         @Nullable
         @Override
         public <T> T a(kl<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(kl<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<kl<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<ko<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), ko::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<kl<?>, Object> f() {
            return this.c;
         }
      }
   }
}
