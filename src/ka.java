import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface ka extends Iterable<kg<?>> {
   ka a = new ka() {
      @Nullable
      @Override
      public <T> T a(kd<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<kd<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kg<?>> iterator() {
         return Collections.emptyIterator();
      }
   };

   static ka.a a() {
      return new ka.a();
   }

   @Nullable
   <T> T a(kd<? extends T> var1);

   Set<kd<?>> b();

   default boolean b(kd<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(kd<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kg<T> c(kd<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kg<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kg<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kg<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default ka a(final Predicate<kd<?>> $$0) {
      return new ka() {
         @Nullable
         @Override
         public <T> T a(kd<? extends T> $$0x) {
            return $$0.test($$0) ? ka.this.a($$0) : null;
         }

         @Override
         public Set<kd<?>> b() {
            return Sets.filter(ka.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<kd<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ka.a a(kd<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }

         return this;
      }

      public ka.a a(ka $$0) {
         for (kg<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public ka a() {
         if (this.a.isEmpty()) {
            return ka.a;
         } else {
            return this.a.size() < 8 ? new ka.a.a(new Reference2ObjectArrayMap(this.a)) : new ka.a.a(new Reference2ObjectOpenHashMap(this.a));
         }
      }

      static record a(Reference2ObjectMap<kd<?>, Object> b) implements ka {
         @Nullable
         @Override
         public <T> T a(kd<? extends T> $$0) {
            return (T)this.b.get($$0);
         }

         @Override
         public boolean b(kd<?> $$0) {
            return this.b.containsKey($$0);
         }

         @Override
         public Set<kd<?>> b() {
            return this.b.keySet();
         }

         @Override
         public Iterator<kg<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.b), kg::a);
         }

         @Override
         public int d() {
            return this.b.size();
         }

         @Override
         public String toString() {
            return this.b.toString();
         }

         public Reference2ObjectMap<kd<?>, Object> f() {
            return this.b;
         }
      }
   }
}
