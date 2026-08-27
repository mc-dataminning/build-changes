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

public interface jx extends Iterable<kd<?>> {
   jx a = new jx() {
      @Nullable
      @Override
      public <T> T a(ka<? extends T> $$0) {
         return null;
      }

      @Override
      public Set<ka<?>> b() {
         return Set.of();
      }

      @Override
      public Iterator<kd<?>> iterator() {
         return Collections.emptyIterator();
      }
   };
   Codec<jx> b = ka.d.flatComapMap(jx.a::a, $$0 -> {
      int $$1 = $$0.d();
      if ($$1 == 0) {
         return DataResult.success(Reference2ObjectMaps.emptyMap());
      } else {
         Reference2ObjectMap<ka<?>, Object> $$2 = new Reference2ObjectArrayMap($$1);

         for (kd<?> $$3 : $$0) {
            if (!$$3.a().d()) {
               $$2.put($$3.a(), $$3.b());
            }
         }

         return DataResult.success($$2);
      }
   });

   static jx.a a() {
      return new jx.a();
   }

   @Nullable
   <T> T a(ka<? extends T> var1);

   Set<ka<?>> b();

   default boolean b(ka<?> $$0) {
      return this.a($$0) != null;
   }

   default <T> T a(ka<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kd<T> c(ka<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kd<>($$0, $$1) : null;
   }

   @Override
   default Iterator<kd<?>> iterator() {
      return Iterators.transform(this.b().iterator(), $$0 -> Objects.requireNonNull(this.c($$0)));
   }

   default Stream<kd<?>> c() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.d(), 1345), false);
   }

   default int d() {
      return this.b().size();
   }

   default boolean e() {
      return this.d() == 0;
   }

   default jx a(final Predicate<ka<?>> $$0) {
      return new jx() {
         @Nullable
         @Override
         public <T> T a(ka<? extends T> $$0x) {
            return $$0.test($$0) ? jx.this.a($$0) : null;
         }

         @Override
         public Set<ka<?>> b() {
            return Sets.filter(jx.this.b(), $$0::test);
         }
      };
   }

   public static class a {
      private final Reference2ObjectMap<ka<?>, Object> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> jx.a a(ka<T> $$0, @Nullable T $$1) {
         this.b($$0, $$1);
         return this;
      }

      <T> void b(ka<T> $$0, @Nullable Object $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         } else {
            this.a.remove($$0);
         }
      }

      public jx.a a(jx $$0) {
         for (kd<?> $$1 : $$0) {
            this.a.put($$1.a(), $$1.b());
         }

         return this;
      }

      public jx a() {
         return a(this.a);
      }

      private static jx a(Map<ka<?>, Object> $$0) {
         if ($$0.isEmpty()) {
            return jx.a;
         } else {
            return $$0.size() < 8 ? new jx.a.a(new Reference2ObjectArrayMap($$0)) : new jx.a.a(new Reference2ObjectOpenHashMap($$0));
         }
      }

      static record a(Reference2ObjectMap<ka<?>, Object> c) implements jx {
         @Nullable
         @Override
         public <T> T a(ka<? extends T> $$0) {
            return (T)this.c.get($$0);
         }

         @Override
         public boolean b(ka<?> $$0) {
            return this.c.containsKey($$0);
         }

         @Override
         public Set<ka<?>> b() {
            return this.c.keySet();
         }

         @Override
         public Iterator<kd<?>> iterator() {
            return Iterators.transform(Reference2ObjectMaps.fastIterator(this.c), kd::a);
         }

         @Override
         public int d() {
            return this.c.size();
         }

         @Override
         public String toString() {
            return this.c.toString();
         }

         public Reference2ObjectMap<ka<?>, Object> f() {
            return this.c;
         }
      }
   }
}
