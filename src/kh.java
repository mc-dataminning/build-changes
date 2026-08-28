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

public class kh {
   private final List<kh.k<?>> a = new ArrayList<>();

   static <T> js<T> a(final jt.b<T> $$0) {
      return new kh.c<T>($$0) {
         @Override
         public Optional<jr.c<T>> a(akt<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jt.b<T> a(final akt<? extends ke<? extends T>> $$0, final Lifecycle $$1, ju<T> $$2, final Map<akt<T>, jr.c<T>> $$3) {
      return new kh.e<T>($$2) {
         @Override
         public akt<? extends ke<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jr.c<T>> a(akt<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jr.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kh a(akt<? extends ke<T>> $$0, Lifecycle $$1, kh.i<T> $$2) {
      this.a.add(new kh.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kh a(akt<? extends ke<T>> $$0, kh.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kh.b b(kf $$0) {
      kh.b $$1 = kh.b.a($$0, this.a.stream().map(kh.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jt.a a(kh.m $$0, kf $$1, Stream<jt.b<?>> $$2) {
      record a<T>(jt.b<T> a, aks.b<T> b) {
         public static <T> a<T> a(jt.b<T> $$0) {
            return new a<>(new kh.d<>($$0, $$0), aks.b.a($$0));
         }

         public static <T> a<T> a(kh.m $$0, jt.b<T> $$1) {
            return new a<>(new kh.d<>($$0.a(), $$1), new aks.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<akt<? extends ke<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), kh$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), kh$a.a($$0, $$2x)));
      return new jt.a() {
         @Override
         public Stream<akt<? extends ke<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> e(akt<? extends ke<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jt.b<T>> a(akt<? extends ke<? extends T>> $$0) {
            return this.e($$0).map(a::a);
         }

         @Override
         public <V> aks<V> a(DynamicOps<V> $$0) {
            return aks.a($$0, new aks.c() {
               @Override
               public <T> Optional<aks.b<T>> a(akt<? extends ke<? extends T>> $$0) {
                  return e($$0).map(a::b);
               }
            });
         }
      };
   }

   public jt.a a(kf $$0) {
      kh.b $$1 = this.b($$0);
      Stream<jt.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jt.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jt.a a(kf $$0, jt.a $$1, jj.a $$2, Map<akt<? extends ke<?>>, kh.j<?>> $$3, jt.a $$4) {
      kh.m $$5 = new kh.m();
      MutableObject<jt.a> $$6 = new MutableObject();
      List<jt.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jt.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jt.b<T> a(ju<T> $$0, jj.a $$1, akt<? extends ke<? extends T>> $$2, jt.a $$3, jt.a $$4, MutableObject<jt.a> $$5) {
      jj<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<akt<T>, jr.c<T>> $$7 = new HashMap<>();
         jt.b<T> $$8 = $$3.d($$2);
         $$8.c().forEach($$5x -> {
            akt<T> $$6x = $$5x.h();
            kh.f<T> $$7x = new kh.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jt.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jt.b<T> $$9 = $$4.d($$2);
         $$9.c().forEach($$5x -> {
            akt<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kh.f<T> $$7x = new kh.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jt.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kh.g a(kf $$0, jt.a $$1, jj.a $$2) {
      kh.b $$3 = this.b($$0);
      Map<akt<? extends ke<?>>, kh.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<akt<? extends ke<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kh.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jt.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jt.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jt.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kh.g($$8, $$7);
   }

   static record b(kh.m a, kh.l b, Map<aku, js<?>> c, Map<akt<?>, kh.h<?>> d, List<RuntimeException> e) {

      public static kh.b a(kf $$0, Stream<akt<? extends ke<?>>> $$1) {
         kh.m $$2 = new kh.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kh.l $$4 = new kh.l($$2);
         Builder<aku, js<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), kh.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kh.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qe<T> a() {
         return new qe<T>() {
            @Override
            public jr.c<T> a(akt<T> $$0, T $$1, Lifecycle $$2) {
               kh.h<?> $$3 = b.this.d.put($$0, new kh.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> js<S> a(akt<? extends ke<? extends S>> $$0) {
               return (js<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (akt<Object> $$0 : this.b.a.keySet()) {
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

      public kh.m e() {
         return this.a;
      }

      public kh.l f() {
         return this.b;
      }

      public Map<aku, js<?>> g() {
         return this.c;
      }

      public Map<akt<?>, kh.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements js<T> {
      protected final ju<T> d;

      protected c(ju<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jv.c<T>> a(axe<T> $$0) {
         return Optional.of(jv.a(this.d, $$0));
      }
   }

   static class d<T> extends kh.e<T> implements jt.b.a<T> {
      private final jt.b<T> a;

      d(ju<T> $$0, jt.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jt.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kh.c<T> implements jt.b<T> {
      protected e(ju<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jv.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jr.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(ju<T> $$0, @Nullable akt<T> $$1) {
         super(jr.c.a.a, $$0, $$1, null);
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

   public static record g(jt.a a, jt.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qe<T> var1);
   }

   static record j<T>(akt<? extends ke<? extends T>> a, Lifecycle b, Map<akt<T>, kh.n<T>> c) {

      public jt.b<T> a(kh.m $$0) {
         Map<akt<T>, jr.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kh.n<T> $$2 = (kh.n<T>)$$1x.getValue();
            jr.c<T> $$3 = $$2.b().orElseGet(() -> jr.c.a($$0.a(), (akt<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kh.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(akt<? extends ke<T>> a, Lifecycle b, kh.i<T> c) {
      void b(kh.b $$0) {
         this.c.run($$0.a());
      }

      public kh.j<T> a(kh.b $$0) {
         Map<akt<T>, kh.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<akt<?>, kh.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<akt<?>, kh.h<?>> $$3 = $$2.next();
            akt<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kh.h<T> $$6 = (kh.h<T>)$$3.getValue();
               jr.c<T> $$7 = (jr.c<T>)$$0.b.a.remove($$4);
               $$1.put((akt<T>)$$4, new kh.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kh.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kh.c<Object> {
      final Map<akt<Object>, jr.c<Object>> a = new HashMap<>();

      public l(ju<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jr.c<Object>> a(akt<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jr.c<T> c(akt<T> $$0) {
         return (jr.c<T>)this.a.computeIfAbsent($$0, $$0x -> jr.c.a(this.d, $$0x));
      }
   }

   static class m implements ju<Object> {
      public <T> ju<T> a() {
         return this;
      }
   }

   static record n<T>(kh.h<T> a, Optional<jr.c<T>> b) {
   }
}
