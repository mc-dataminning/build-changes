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

public class ki {
   private final List<ki.k<?>> a = new ArrayList<>();

   static <T> jt<T> a(final ju.b<T> $$0) {
      return new ki.c<T>($$0) {
         @Override
         public Optional<js.c<T>> a(alc<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ju.b<T> a(final alc<? extends kf<? extends T>> $$0, final Lifecycle $$1, jv<T> $$2, final Map<alc<T>, js.c<T>> $$3) {
      return new ki.e<T>($$2) {
         @Override
         public alc<? extends kf<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<js.c<T>> a(alc<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<js.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> ki a(alc<? extends kf<T>> $$0, Lifecycle $$1, ki.i<T> $$2) {
      this.a.add(new ki.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> ki a(alc<? extends kf<T>> $$0, ki.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private ki.b b(kg $$0) {
      ki.b $$1 = ki.b.a($$0, this.a.stream().map(ki.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ju.a a(ki.m $$0, kg $$1, Stream<ju.b<?>> $$2) {
      record a<T>(ju.b<T> a, alb.b<T> b) {
         public static <T> a<T> a(ju.b<T> $$0) {
            return new a<>(new ki.d<>($$0, $$0), alb.b.a($$0));
         }

         public static <T> a<T> a(ki.m $$0, ju.b<T> $$1) {
            return new a<>(new ki.d<>($$0.a(), $$1), new alb.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alc<? extends kf<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), ki$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), ki$a.a($$0, $$2x)));
      return new ju.a() {
         @Override
         public Stream<alc<? extends kf<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> f(alc<? extends kf<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<ju.b<T>> a(alc<? extends kf<? extends T>> $$0) {
            return this.f($$0).map(a::a);
         }

         @Override
         public <V> alb<V> a(DynamicOps<V> $$0) {
            return alb.a($$0, new alb.c() {
               @Override
               public <T> Optional<alb.b<T>> a(alc<? extends kf<? extends T>> $$0) {
                  return f($$0).map(a::b);
               }
            });
         }
      };
   }

   public ju.a a(kg $$0) {
      ki.b $$1 = this.b($$0);
      Stream<ju.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ju.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ju.a a(kg $$0, ju.a $$1, jk.a $$2, Map<alc<? extends kf<?>>, ki.j<?>> $$3, ju.a $$4) {
      ki.m $$5 = new ki.m();
      MutableObject<ju.a> $$6 = new MutableObject();
      List<ju.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      ju.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ju.b<T> a(jv<T> $$0, jk.a $$1, alc<? extends kf<? extends T>> $$2, ju.a $$3, ju.a $$4, MutableObject<ju.a> $$5) {
      jk<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alc<T>, js.c<T>> $$7 = new HashMap<>();
         ju.b<T> $$8 = $$3.e($$2);
         $$8.c().forEach($$5x -> {
            alc<T> $$6x = $$5x.h();
            ki.f<T> $$7x = new ki.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ju.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ju.b<T> $$9 = $$4.e($$2);
         $$9.c().forEach($$5x -> {
            alc<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               ki.f<T> $$7x = new ki.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ju.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public ki.g a(kg $$0, ju.a $$1, jk.a $$2) {
      ki.b $$3 = this.b($$0);
      Map<alc<? extends kf<?>>, ki.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alc<? extends kf<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new ki.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<ju.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ju.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      ju.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new ki.g($$8, $$7);
   }

   static record b(ki.m a, ki.l b, Map<ald, jt<?>> c, Map<alc<?>, ki.h<?>> d, List<RuntimeException> e) {

      public static ki.b a(kg $$0, Stream<alc<? extends kf<?>>> $$1) {
         ki.m $$2 = new ki.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         ki.l $$4 = new ki.l($$2);
         Builder<ald, jt<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), ki.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new ki.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qg<T> a() {
         return new qg<T>() {
            @Override
            public js.c<T> a(alc<T> $$0, T $$1, Lifecycle $$2) {
               ki.h<?> $$3 = b.this.d.put($$0, new ki.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jt<S> a(alc<? extends kf<? extends S>> $$0) {
               return (jt<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (alc<Object> $$0 : this.b.a.keySet()) {
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

      public ki.m e() {
         return this.a;
      }

      public ki.l f() {
         return this.b;
      }

      public Map<ald, jt<?>> g() {
         return this.c;
      }

      public Map<alc<?>, ki.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jt<T> {
      protected final jv<T> d;

      protected c(jv<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jw.c<T>> a(axp<T> $$0) {
         return Optional.of(jw.a(this.d, $$0));
      }
   }

   static class d<T> extends ki.e<T> implements ju.b.a<T> {
      private final ju.b<T> a;

      d(jv<T> $$0, ju.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public ju.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends ki.c<T> implements ju.b<T> {
      protected e(jv<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jw.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends js.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jv<T> $$0, @Nullable alc<T> $$1) {
         super(js.c.a.a, $$0, $$1, null);
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

   public static record g(ju.a a, ju.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qg<T> var1);
   }

   static record j<T>(alc<? extends kf<? extends T>> a, Lifecycle b, Map<alc<T>, ki.n<T>> c) {

      public ju.b<T> a(ki.m $$0) {
         Map<alc<T>, js.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            ki.n<T> $$2 = (ki.n<T>)$$1x.getValue();
            js.c<T> $$3 = $$2.b().orElseGet(() -> js.c.a($$0.a(), (alc<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return ki.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alc<? extends kf<T>> a, Lifecycle b, ki.i<T> c) {
      void b(ki.b $$0) {
         this.c.run($$0.a());
      }

      public ki.j<T> a(ki.b $$0) {
         Map<alc<T>, ki.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alc<?>, ki.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alc<?>, ki.h<?>> $$3 = $$2.next();
            alc<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               ki.h<T> $$6 = (ki.h<T>)$$3.getValue();
               js.c<T> $$7 = (js.c<T>)$$0.b.a.remove($$4);
               $$1.put((alc<T>)$$4, new ki.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new ki.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends ki.c<Object> {
      final Map<alc<Object>, js.c<Object>> a = new HashMap<>();

      public l(jv<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<js.c<Object>> a(alc<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> js.c<T> c(alc<T> $$0) {
         return (js.c<T>)this.a.computeIfAbsent($$0, $$0x -> js.c.a(this.d, $$0x));
      }
   }

   static class m implements jv<Object> {
      public <T> jv<T> a() {
         return this;
      }
   }

   static record n<T>(ki.h<T> a, Optional<js.c<T>> b) {
   }
}
