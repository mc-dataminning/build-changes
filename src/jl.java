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

public class jl {
   private final List<jl.k<?>> a = new ArrayList<>();

   static <T> iw<T> a(final ix.b<T> $$0) {
      return new jl.c<T>($$0) {
         @Override
         public Optional<iv.c<T>> a(ake<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ix.b<T> a(final ake<? extends ji<? extends T>> $$0, final Lifecycle $$1, iy<T> $$2, final Map<ake<T>, iv.c<T>> $$3) {
      return new jl.e<T>($$2) {
         @Override
         public ake<? extends ji<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<iv.c<T>> a(ake<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<iv.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jl a(ake<? extends ji<T>> $$0, Lifecycle $$1, jl.i<T> $$2) {
      this.a.add(new jl.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jl a(ake<? extends ji<T>> $$0, jl.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jl.b b(jj $$0) {
      jl.b $$1 = jl.b.a($$0, this.a.stream().map(jl.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ix.a a(jl.m $$0, jj $$1, Stream<ix.b<?>> $$2) {
      record a<T>(ix.b<T> a, akd.a<T> b) {
         public static <T> a<T> a(ix.b<T> $$0) {
            return new a<>(new jl.d<>($$0, $$0), akd.a.a($$0));
         }

         public static <T> a<T> a(jl.m $$0, ix.b<T> $$1) {
            return new a<>(new jl.d<>($$0.a(), $$1), new akd.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<ake<? extends ji<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jl$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jl$a.a($$0, $$2x)));
      return new ix.a() {
         @Override
         public Stream<ake<? extends ji<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(ake<? extends ji<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> akd<V> a(DynamicOps<V> $$0) {
            return akd.a($$0, new akd.b() {
               @Override
               public <T> Optional<akd.a<T>> a(ake<? extends ji<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public ix.a a(jj $$0) {
      jl.b $$1 = this.b($$0);
      Stream<ix.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ix.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ix.a a(jj $$0, ix.a $$1, in.a $$2, Map<ake<? extends ji<?>>, jl.j<?>> $$3, ix.a $$4) {
      jl.m $$5 = new jl.m();
      MutableObject<ix.a> $$6 = new MutableObject();
      List<ix.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      ix.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ix.b<T> a(iy<T> $$0, in.a $$1, ake<? extends ji<? extends T>> $$2, ix.a $$3, ix.a $$4, MutableObject<ix.a> $$5) {
      in<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ake<T>, iv.c<T>> $$7 = new HashMap<>();
         ix.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ake<T> $$6x = $$5x.h();
            jl.f<T> $$7x = new jl.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ix.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ix.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ake<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jl.f<T> $$7x = new jl.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ix.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jl.g a(jj $$0, ix.a $$1, in.a $$2) {
      jl.b $$3 = this.b($$0);
      Map<ake<? extends ji<?>>, jl.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ake<? extends ji<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jl.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<ix.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ix.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      ix.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jl.g($$8, $$7);
   }

   static record b(jl.m a, jl.l b, Map<akf, iw<?>> c, Map<ake<?>, jl.h<?>> d, List<RuntimeException> e) {

      public static jl.b a(jj $$0, Stream<ake<? extends ji<?>>> $$1) {
         jl.m $$2 = new jl.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jl.l $$4 = new jl.l($$2);
         Builder<akf, iw<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jl.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jl.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qj<T> a() {
         return new qj<T>() {
            @Override
            public iv.c<T> a(ake<T> $$0, T $$1, Lifecycle $$2) {
               jl.h<?> $$3 = b.this.d.put($$0, new jl.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> iw<S> a(ake<? extends ji<? extends S>> $$0) {
               return (iw<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ake<Object> $$0 : this.b.a.keySet()) {
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

      public jl.m e() {
         return this.a;
      }

      public jl.l f() {
         return this.b;
      }

      public Map<akf, iw<?>> g() {
         return this.c;
      }

      public Map<ake<?>, jl.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements iw<T> {
      protected final iy<T> d;

      protected c(iy<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<iz.c<T>> a(awd<T> $$0) {
         return Optional.of(iz.a(this.d, $$0));
      }
   }

   static class d<T> extends jl.e<T> implements ix.b.a<T> {
      private final ix.b<T> a;

      d(iy<T> $$0, ix.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public ix.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jl.c<T> implements ix.b<T> {
      protected e(iy<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<iz.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends iv.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(iy<T> $$0, @Nullable ake<T> $$1) {
         super(iv.c.a.a, $$0, $$1, null);
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

   public static record g(ix.a a, ix.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qj<T> var1);
   }

   static record j<T>(ake<? extends ji<? extends T>> a, Lifecycle b, Map<ake<T>, jl.n<T>> c) {

      public ix.b<T> a(jl.m $$0) {
         Map<ake<T>, iv.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jl.n<T> $$2 = (jl.n<T>)$$1x.getValue();
            iv.c<T> $$3 = $$2.b().orElseGet(() -> iv.c.a($$0.a(), (ake<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jl.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(ake<? extends ji<T>> a, Lifecycle b, jl.i<T> c) {
      void b(jl.b $$0) {
         this.c.run($$0.a());
      }

      public jl.j<T> a(jl.b $$0) {
         Map<ake<T>, jl.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<ake<?>, jl.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ake<?>, jl.h<?>> $$3 = $$2.next();
            ake<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jl.h<T> $$6 = (jl.h<T>)$$3.getValue();
               iv.c<T> $$7 = (iv.c<T>)$$0.b.a.remove($$4);
               $$1.put((ake<T>)$$4, new jl.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jl.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jl.c<Object> {
      final Map<ake<Object>, iv.c<Object>> a = new HashMap<>();

      public l(iy<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<iv.c<Object>> a(ake<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> iv.c<T> c(ake<T> $$0) {
         return (iv.c<T>)this.a.computeIfAbsent($$0, $$0x -> iv.c.a(this.d, $$0x));
      }
   }

   static class m implements iy<Object> {
      public <T> iy<T> a() {
         return this;
      }
   }

   static record n<T>(jl.h<T> a, Optional<iv.c<T>> b) {
   }
}
