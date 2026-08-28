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

public class kc {
   private final List<kc.k<?>> a = new ArrayList<>();

   static <T> jn<T> a(final jo.b<T> $$0) {
      return new kc.c<T>($$0) {
         @Override
         public Optional<jm.c<T>> a(akp<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jo.b<T> a(final akp<? extends jz<? extends T>> $$0, final Lifecycle $$1, jp<T> $$2, final Map<akp<T>, jm.c<T>> $$3) {
      return new kc.e<T>($$2) {
         @Override
         public akp<? extends jz<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<jm.c<T>> a(akp<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jm.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kc a(akp<? extends jz<T>> $$0, Lifecycle $$1, kc.i<T> $$2) {
      this.a.add(new kc.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kc a(akp<? extends jz<T>> $$0, kc.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kc.b b(ka $$0) {
      kc.b $$1 = kc.b.a($$0, this.a.stream().map(kc.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jo.a a(kc.m $$0, ka $$1, Stream<jo.b<?>> $$2) {
      record a<T>(jo.b<T> a, ako.b<T> b) {
         public static <T> a<T> a(jo.b<T> $$0) {
            return new a<>(new kc.d<>($$0, $$0), ako.b.a($$0));
         }

         public static <T> a<T> a(kc.m $$0, jo.b<T> $$1) {
            return new a<>(new kc.d<>($$0.a(), $$1), new ako.b<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<akp<? extends jz<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), kc$a.a($$1x.b().q())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), kc$a.a($$0, $$2x)));
      return new jo.a() {
         @Override
         public Stream<akp<? extends jz<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(akp<? extends jz<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> ako<V> a(DynamicOps<V> $$0) {
            return ako.a($$0, new ako.c() {
               @Override
               public <T> Optional<ako.b<T>> a(akp<? extends jz<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public jo.a a(ka $$0) {
      kc.b $$1 = this.b($$0);
      Stream<jo.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jo.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jo.a a(ka $$0, jo.a $$1, je.a $$2, Map<akp<? extends jz<?>>, kc.j<?>> $$3, jo.a $$4) {
      kc.m $$5 = new kc.m();
      MutableObject<jo.a> $$6 = new MutableObject();
      List<jo.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jo.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jo.b<T> a(jp<T> $$0, je.a $$1, akp<? extends jz<? extends T>> $$2, jo.a $$3, jo.a $$4, MutableObject<jo.a> $$5) {
      je<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<akp<T>, jm.c<T>> $$7 = new HashMap<>();
         jo.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            akp<T> $$6x = $$5x.h();
            kc.f<T> $$7x = new kc.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jo.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jo.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            akp<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kc.f<T> $$7x = new kc.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jo.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kc.g a(ka $$0, jo.a $$1, je.a $$2) {
      kc.b $$3 = this.b($$0);
      Map<akp<? extends jz<?>>, kc.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<akp<? extends jz<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kc.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jo.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jo.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jo.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kc.g($$8, $$7);
   }

   static record b(kc.m a, kc.l b, Map<akq, jn<?>> c, Map<akp<?>, kc.h<?>> d, List<RuntimeException> e) {

      public static kc.b a(ka $$0, Stream<akp<? extends jz<?>>> $$1) {
         kc.m $$2 = new kc.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kc.l $$4 = new kc.l($$2);
         Builder<akq, jn<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), kc.a($$1x.b().q())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kc.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qp<T> a() {
         return new qp<T>() {
            @Override
            public jm.c<T> a(akp<T> $$0, T $$1, Lifecycle $$2) {
               kc.h<?> $$3 = b.this.d.put($$0, new kc.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jn<S> a(akp<? extends jz<? extends S>> $$0) {
               return (jn<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (akp<Object> $$0 : this.b.a.keySet()) {
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

      public kc.m e() {
         return this.a;
      }

      public kc.l f() {
         return this.b;
      }

      public Map<akq, jn<?>> g() {
         return this.c;
      }

      public Map<akp<?>, kc.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jn<T> {
      protected final jp<T> d;

      protected c(jp<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jq.c<T>> a(awt<T> $$0) {
         return Optional.of(jq.a(this.d, $$0));
      }
   }

   static class d<T> extends kc.e<T> implements jo.b.a<T> {
      private final jo.b<T> a;

      d(jp<T> $$0, jo.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jo.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kc.c<T> implements jo.b<T> {
      protected e(jp<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jq.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jm.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jp<T> $$0, @Nullable akp<T> $$1) {
         super(jm.c.a.a, $$0, $$1, null);
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

   public static record g(jo.a a, jo.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qp<T> var1);
   }

   static record j<T>(akp<? extends jz<? extends T>> a, Lifecycle b, Map<akp<T>, kc.n<T>> c) {

      public jo.b<T> a(kc.m $$0) {
         Map<akp<T>, jm.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kc.n<T> $$2 = (kc.n<T>)$$1x.getValue();
            jm.c<T> $$3 = $$2.b().orElseGet(() -> jm.c.a($$0.a(), (akp<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kc.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(akp<? extends jz<T>> a, Lifecycle b, kc.i<T> c) {
      void b(kc.b $$0) {
         this.c.run($$0.a());
      }

      public kc.j<T> a(kc.b $$0) {
         Map<akp<T>, kc.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<akp<?>, kc.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<akp<?>, kc.h<?>> $$3 = $$2.next();
            akp<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kc.h<T> $$6 = (kc.h<T>)$$3.getValue();
               jm.c<T> $$7 = (jm.c<T>)$$0.b.a.remove($$4);
               $$1.put((akp<T>)$$4, new kc.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kc.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kc.c<Object> {
      final Map<akp<Object>, jm.c<Object>> a = new HashMap<>();

      public l(jp<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jm.c<Object>> a(akp<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jm.c<T> c(akp<T> $$0) {
         return (jm.c<T>)this.a.computeIfAbsent($$0, $$0x -> jm.c.a(this.d, $$0x));
      }
   }

   static class m implements jp<Object> {
      public <T> jp<T> a() {
         return this;
      }
   }

   static record n<T>(kc.h<T> a, Optional<jm.c<T>> b) {
   }
}
