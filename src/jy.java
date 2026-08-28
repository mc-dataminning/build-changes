import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class jy {
   private final List<jy.k<?>> a = new ArrayList<>();

   static <T> jj<T> a(final jk.b<T> $$0) {
      return new jy.c<T>($$0) {
         @Override
         public Optional<ji.c<T>> a(ale<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jk.b<T> a(final ale<? extends jv<? extends T>> $$0, final Lifecycle $$1, jl<T> $$2, final Map<ale<T>, ji.c<T>> $$3) {
      return new jy.e<T>($$2) {
         @Override
         public ale<? extends jv<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ji.c<T>> a(ale<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<ji.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jy a(ale<? extends jv<T>> $$0, Lifecycle $$1, jy.i<T> $$2) {
      this.a.add(new jy.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jy a(ale<? extends jv<T>> $$0, jy.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jy.b b(jw $$0) {
      jy.b $$1 = jy.b.a($$0, this.a.stream().map(jy.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jk.a a(jy.m $$0, jw $$1, Stream<jk.b<?>> $$2) {
      record a<T>(jk.b<T> a, ald.b<T> b) {
         public static <T> a<T> a(jk.b<T> $$0) {
            return new a<>(new jy.d<>($$0, $$0), ald.b.a($$0));
         }

         public static <T> a<T> a(jy.m $$0, jk.b<T> $$1) {
            return new a<>(new jy.d<>($$0.a(), $$1), new ald.b<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<ale<? extends jv<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jy$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jy$a.a($$0, $$2x)));
      return new jk.a() {
         @Override
         public Stream<ale<? extends jv<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(ale<? extends jv<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> ald<V> a(DynamicOps<V> $$0) {
            return ald.a($$0, new ald.c() {
               @Override
               public <T> Optional<ald.b<T>> a(ale<? extends jv<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public jk.a a(jw $$0) {
      jy.b $$1 = this.b($$0);
      Stream<jk.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jk.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jk.a a(jw $$0, jk.a $$1, ja.a $$2, Map<ale<? extends jv<?>>, jy.j<?>> $$3, jk.a $$4) {
      jy.m $$5 = new jy.m();
      MutableObject<jk.a> $$6 = new MutableObject();
      List<jk.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jk.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jk.b<T> a(jl<T> $$0, ja.a $$1, ale<? extends jv<? extends T>> $$2, jk.a $$3, jk.a $$4, MutableObject<jk.a> $$5) {
      ja<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ale<T>, ji.c<T>> $$7 = new HashMap<>();
         jk.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ale<T> $$6x = $$5x.h();
            jy.f<T> $$7x = new jy.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jk.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jk.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ale<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jy.f<T> $$7x = new jy.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jk.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jy.g a(jw $$0, jk.a $$1, ja.a $$2) {
      jy.b $$3 = this.b($$0);
      Map<ale<? extends jv<?>>, jy.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ale<? extends jv<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jy.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jk.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jk.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jk.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jy.g($$8, $$7);
   }

   static record b(jy.m a, jy.l b, Map<alf, jj<?>> c, Map<ale<?>, jy.h<?>> d, List<RuntimeException> e) {

      public static jy.b a(jw $$0, Stream<ale<? extends jv<?>>> $$1) {
         jy.m $$2 = new jy.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jy.l $$4 = new jy.l($$2);
         Builder<alf, jj<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jy.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jy.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> rc<T> a() {
         return new rc<T>() {
            @Override
            public ji.c<T> a(ale<T> $$0, T $$1, Lifecycle $$2) {
               jy.h<?> $$3 = b.this.d.put($$0, new jy.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jj<S> a(ale<? extends jv<? extends S>> $$0) {
               return (jj<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ale<Object> $$0 : this.b.a.keySet()) {
            this.e.add(new IllegalStateException("Unreferenced key: " + $$0));
         }
      }

      public void d() {
         if (!this.e.isEmpty()) {
            IllegalStateException $$0 = new IllegalStateException("Errors during registry creation");

            for (RuntimeException $$1 : this.e) {
               $$0.addSuppressed($$1);
            }

            throw $$0;
         }
      }

      public jy.m e() {
         return this.a;
      }

      public jy.l f() {
         return this.b;
      }

      public Map<alf, jj<?>> g() {
         return this.c;
      }

      public Map<ale<?>, jy.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jj<T> {
      protected final jl<T> d;

      protected c(jl<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jm.c<T>> a(axf<T> $$0) {
         return Optional.of(jm.a(this.d, $$0));
      }
   }

   static class d<T> extends jy.e<T> implements jk.b.a<T> {
      private final jk.b<T> a;

      d(jl<T> $$0, jk.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jk.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jy.c<T> implements jk.b<T> {
      protected e(jl<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jm.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends ji.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jl<T> $$0, @Nullable ale<T> $$1) {
         super(ji.c.a.a, $$0, $$1, null);
      }

      @Override
      protected void b(T $$0) {
         super.b($$0);
         this.a = null;
      }

      @Override
      public T a() {
         if (this.a != null) {
            this.b(this.a.get());
         }

         return super.a();
      }
   }

   public static record g(jk.a a, jk.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(rc<T> var1);
   }

   static record j<T>(ale<? extends jv<? extends T>> a, Lifecycle b, Map<ale<T>, jy.n<T>> c) {

      public jk.b<T> a(jy.m $$0) {
         Map<ale<T>, ji.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jy.n<T> $$2 = (jy.n<T>)$$1x.getValue();
            ji.c<T> $$3 = $$2.b().orElseGet(() -> ji.c.a($$0.a(), (ale<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jy.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(ale<? extends jv<T>> a, Lifecycle b, jy.i<T> c) {
      void b(jy.b $$0) {
         this.c.run($$0.a());
      }

      public jy.j<T> a(jy.b $$0) {
         Map<ale<T>, jy.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<ale<?>, jy.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ale<?>, jy.h<?>> $$3 = $$2.next();
            ale<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jy.h<T> $$6 = (jy.h<T>)$$3.getValue();
               ji.c<T> $$7 = (ji.c<T>)$$0.b.a.remove($$4);
               $$1.put((ale<T>)$$4, new jy.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jy.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jy.c<Object> {
      final Map<ale<Object>, ji.c<Object>> a = new HashMap<>();

      public l(jl<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ji.c<Object>> a(ale<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ji.c<T> c(ale<T> $$0) {
         return (ji.c<T>)this.a.computeIfAbsent($$0, $$0x -> ji.c.a(this.d, $$0x));
      }
   }

   static class m implements jl<Object> {
      public <T> jl<T> a() {
         return this;
      }
   }

   static record n<T>(jy.h<T> a, Optional<ji.c<T>> b) {
   }
}
