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

public interface jn extends Iterable<jt<?>> {
   jn a = new jn() {
      @Nullable
      @Override
      public <T> T a(jq<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<jq<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<jt<?>> iterator() {
         return Collections.emptyIterator();
      }
   };

   static jn.a a() {
      return new jn.a();
   }

   @Nullable
   <T> T a(jq<? extends T> var1);

   Set<jq<?>> b();

   default boolean b(jq<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(jq<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> jt<T> c(jq<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new jt<>($$0, $$1) : null;
   }

   @Override
   default Iterator<jt<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<jt<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default jn a(final Predicate<jq<?>> $$0) {
      return new jn() {
         @Nullable
         @Override
         public <T> T a(jq<? extends T> $$0x) {
            return $$0.test($$0) ? jn.this.a($$0) : null;
         }

         @Override
         public Set<jq<?>> b() {
            return Sets.filter(jn.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<jq<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> jn.a a(jq<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }

         return this;
      }

      public jn.a a(jn $$0) {
         for (jt<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public jn a() {
         if (this.a.isEmpty()) {
            return jn.a;
         } else {
            return this.a.size() < 8 ? new jn.a.a(new Reference2ObjectArrayMap(this.a)) : new jn.a.a(new Reference2ObjectOpenHashMap(this.a));
         }
      }

      static record a(Reference2ObjectMap<jq<?>, Object> b) implements jn {
         @Nullable
         @Override
         public <T> T a(jq<? extends T> $$0) {
            return (T)this.b.get($$0);
         }

         @Override
         public boolean b(jq<?> $$0) {
            return this.b.containsKey($$0);
         }

         @Override
         public Set<jq<?>> b() {
            return this.b.keySet();
         }

         @Override
         public Iterator<jt<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.b), jt::a);
         }

         @Override
         public int d() {
            return this.b.size();
         }

         @Override
         public String toString() {
            return this.b.toString();
         }

         public Reference2ObjectMap<jq<?>, Object> f() {
            return this.b;
         }
      }
   }
}
