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

public interface jv extends Iterable<kb<?>> {
   jv a = new jv() {
      @Nullable
      @Override
      public <T> T a(jy<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<jy<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kb<?>> iterator() {
         return Collections.emptyIterator();
      }
   };

   static jv.a a() {
      return new jv.a();
   }

   @Nullable
   <T> T a(jy<? extends T> var1);

   Set<jy<?>> b();

   default boolean b(jy<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(jy<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kb<T> c(jy<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kb<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kb<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kb<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default jv a(final Predicate<jy<?>> $$0) {
      return new jv() {
         @Nullable
         @Override
         public <T> T a(jy<? extends T> $$0x) {
            return $$0.test($$0) ? jv.this.a($$0) : null;
         }

         @Override
         public Set<jy<?>> b() {
            return Sets.filter(jv.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<jy<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> jv.a a(jy<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }

         return this;
      }

      public jv.a a(jv $$0) {
         for (kb<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public jv a() {
         if (this.a.isEmpty()) {
            return jv.a;
         } else {
            return this.a.size() < 8 ? new jv.a.a(new Reference2ObjectArrayMap(this.a)) : new jv.a.a(new Reference2ObjectOpenHashMap(this.a));
         }
      }

      static record a(Reference2ObjectMap<jy<?>, Object> b) implements jv {
         @Nullable
         @Override
         public <T> T a(jy<? extends T> $$0) {
            return (T)this.b.get($$0);
         }

         @Override
         public boolean b(jy<?> $$0) {
            return this.b.containsKey($$0);
         }

         @Override
         public Set<jy<?>> b() {
            return this.b.keySet();
         }

         @Override
         public Iterator<kb<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.b), kb::a);
         }

         @Override
         public int d() {
            return this.b.size();
         }

         @Override
         public String toString() {
            return this.b.toString();
         }

         public Reference2ObjectMap<jy<?>, Object> f() {
            return this.b;
         }
      }
   }
}
