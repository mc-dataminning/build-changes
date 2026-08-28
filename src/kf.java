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

public class kf {
   private final List<kf.k<?>> a = new ArrayList<>();

   static <T> jq<T> a(final jr.b<T> $$0) {
      return new kf.c<T>($$0) {
         @Override
         public Optional<jp.c<T>> a(alg<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jr.b<T> a(final alg<? extends kc<? extends T>> $$0, final Lifecycle $$1, js<T> $$2, final Map<alg<T>, jp.c<T>> $$3) {
      return new kf.e<T>($$2) {
         @Override
         public alg<? extends kc<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jp.c<T>> a(alg<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jp.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kf a(alg<? extends kc<T>> $$0, Lifecycle $$1, kf.i<T> $$2) {
      this.a.add(new kf.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kf a(alg<? extends kc<T>> $$0, kf.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kf.b b(kd $$0) {
      kf.b $$1 = kf.b.a($$0, this.a.stream().map(kf.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jr.a a(kf.m $$0, kd $$1, Stream<jr.b<?>> $$2) {
      record a<T>(jr.b<T> a, alf.b<T> b) {
         public static <T> a<T> a(jr.b<T> $$0) {
            return new a<>(new kf.d<>($$0, $$0), alf.b.a($$0));
         }

         public static <T> a<T> a(kf.m $$0, jr.b<T> $$1) {
            return new a<>(new kf.d<>($$0.a(), $$1), new alf.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alg<? extends kc<?>>, a<?>> $$3 = new HashMap<>();
      $$1.d().forEach($$1x -> $$3.put($$1x.a(), kf$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), kf$a.a($$0, $$2x)));
      return new jr.a() {
         @Override
         public Stream<alg<? extends kc<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> e(alg<? extends kc<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jr.b<T>> a(alg<? extends kc<? extends T>> $$0) {
            return this.e($$0).map(a::a);
         }

         @Override
         public <V> alf<V> a(DynamicOps<V> $$0) {
            return alf.a($$0, new alf.c() {
               @Override
               public <T> Optional<alf.b<T>> a(alg<? extends kc<? extends T>> $$0) {
                  return e($$0).map(a::b);
               }
            });
         }
      };
   }

   public jr.a a(kd $$0) {
      kf.b $$1 = this.b($$0);
      Stream<jr.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jr.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jr.a a(kd $$0, jr.a $$1, jh.a $$2, Map<alg<? extends kc<?>>, kf.j<?>> $$3, jr.a $$4) {
      kf.m $$5 = new kf.m();
      MutableObject<jr.a> $$6 = new MutableObject();
      List<jr.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jr.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jr.b<T> a(js<T> $$0, jh.a $$1, alg<? extends kc<? extends T>> $$2, jr.a $$3, jr.a $$4, MutableObject<jr.a> $$5) {
      jh<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alg<T>, jp.c<T>> $$7 = new HashMap<>();
         jr.b<T> $$8 = $$3.d($$2);
         $$8.c().forEach($$5x -> {
            alg<T> $$6x = $$5x.h();
            kf.f<T> $$7x = new kf.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jr.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jr.b<T> $$9 = $$4.d($$2);
         $$9.c().forEach($$5x -> {
            alg<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kf.f<T> $$7x = new kf.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jr.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kf.g a(kd $$0, jr.a $$1, jh.a $$2) {
      kf.b $$3 = this.b($$0);
      Map<alg<? extends kc<?>>, kf.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alg<? extends kc<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kf.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jr.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jr.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jr.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kf.g($$8, $$7);
   }

   static record b(kf.m a, kf.l b, Map<alh, jq<?>> c, Map<alg<?>, kf.h<?>> d, List<RuntimeException> e) {

      public static kf.b a(kd $$0, Stream<alg<? extends kc<?>>> $$1) {
         kf.m $$2 = new kf.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kf.l $$4 = new kf.l($$2);
         Builder<alh, jq<?>> $$5 = ImmutableMap.builder();
         $$0.d().forEach($$1x -> $$5.put($$1x.a().a(), kf.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kf.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qx<T> a() {
         return new qx<T>() {
            @Override
            public jp.c<T> a(alg<T> $$0, T $$1, Lifecycle $$2) {
               kf.h<?> $$3 = b.this.d.put($$0, new kf.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jq<S> a(alg<? extends kc<? extends S>> $$0) {
               return (jq<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (alg<Object> $$0 : this.b.a.keySet()) {
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

      public kf.m e() {
         return this.a;
      }

      public kf.l f() {
         return this.b;
      }

      public Map<alh, jq<?>> g() {
         return this.c;
      }

      public Map<alg<?>, kf.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jq<T> {
      protected final js<T> d;

      protected c(js<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jt.c<T>> a(axp<T> $$0) {
         return Optional.of(jt.a(this.d, $$0));
      }
   }

   static class d<T> extends kf.e<T> implements jr.b.a<T> {
      private final jr.b<T> a;

      d(js<T> $$0, jr.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jr.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kf.c<T> implements jr.b<T> {
      protected e(js<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jt.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jp.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(js<T> $$0, @Nullable alg<T> $$1) {
         super(jp.c.a.a, $$0, $$1, null);
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

   public static record g(jr.a a, jr.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qx<T> var1);
   }

   static record j<T>(alg<? extends kc<? extends T>> a, Lifecycle b, Map<alg<T>, kf.n<T>> c) {

      public jr.b<T> a(kf.m $$0) {
         Map<alg<T>, jp.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kf.n<T> $$2 = (kf.n<T>)$$1x.getValue();
            jp.c<T> $$3 = $$2.b().orElseGet(() -> jp.c.a($$0.a(), (alg<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kf.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alg<? extends kc<T>> a, Lifecycle b, kf.i<T> c) {
      void b(kf.b $$0) {
         this.c.run($$0.a());
      }

      public kf.j<T> a(kf.b $$0) {
         Map<alg<T>, kf.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alg<?>, kf.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alg<?>, kf.h<?>> $$3 = $$2.next();
            alg<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kf.h<T> $$6 = (kf.h<T>)$$3.getValue();
               jp.c<T> $$7 = (jp.c<T>)$$0.b.a.remove($$4);
               $$1.put((alg<T>)$$4, new kf.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kf.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kf.c<Object> {
      final Map<alg<Object>, jp.c<Object>> a = new HashMap<>();

      public l(js<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jp.c<Object>> a(alg<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jp.c<T> c(alg<T> $$0) {
         return (jp.c<T>)this.a.computeIfAbsent($$0, $$0x -> jp.c.a(this.d, $$0x));
      }
   }

   static class m implements js<Object> {
      public <T> js<T> a() {
         return this;
      }
   }

   static record n<T>(kf.h<T> a, Optional<jp.c<T>> b) {
   }
}
