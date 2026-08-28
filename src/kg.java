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

public class kg {
   private final List<kg.k<?>> a = new ArrayList<>();

   static <T> jr<T> a(final js.b<T> $$0) {
      return new kg.c<T>($$0) {
         @Override
         public Optional<jq.c<T>> a(alk<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> js.b<T> a(final alk<? extends kd<? extends T>> $$0, final Lifecycle $$1, jt<T> $$2, final Map<alk<T>, jq.c<T>> $$3) {
      return new kg.e<T>($$2) {
         @Override
         public alk<? extends kd<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jq.c<T>> a(alk<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jq.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kg a(alk<? extends kd<T>> $$0, Lifecycle $$1, kg.i<T> $$2) {
      this.a.add(new kg.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kg a(alk<? extends kd<T>> $$0, kg.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kg.b b(ke $$0) {
      kg.b $$1 = kg.b.a($$0, this.a.stream().map(kg.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static js.a a(kg.m $$0, ke $$1, Stream<js.b<?>> $$2) {
      record a<T>(js.b<T> a, alj.b<T> b) {
         public static <T> a<T> a(js.b<T> $$0) {
            return new a<>(new kg.d<>($$0, $$0), alj.b.a($$0));
         }

         public static <T> a<T> a(kg.m $$0, js.b<T> $$1) {
            return new a<>(new kg.d<>($$0.a(), $$1), new alj.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alk<? extends kd<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), kg$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), kg$a.a($$0, $$2x)));
      return new js.a() {
         @Override
         public Stream<alk<? extends kd<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> e(alk<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<js.b<T>> a(alk<? extends kd<? extends T>> $$0) {
            return this.e($$0).map(a::a);
         }

         @Override
         public <V> alj<V> a(DynamicOps<V> $$0) {
            return alj.a($$0, new alj.c() {
               @Override
               public <T> Optional<alj.b<T>> a(alk<? extends kd<? extends T>> $$0) {
                  return e($$0).map(a::b);
               }
            });
         }
      };
   }

   public js.a a(ke $$0) {
      kg.b $$1 = this.b($$0);
      Stream<js.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      js.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private js.a a(ke $$0, js.a $$1, ji.a $$2, Map<alk<? extends kd<?>>, kg.j<?>> $$3, js.a $$4) {
      kg.m $$5 = new kg.m();
      MutableObject<js.a> $$6 = new MutableObject();
      List<js.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      js.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> js.b<T> a(jt<T> $$0, ji.a $$1, alk<? extends kd<? extends T>> $$2, js.a $$3, js.a $$4, MutableObject<js.a> $$5) {
      ji<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alk<T>, jq.c<T>> $$7 = new HashMap<>();
         js.b<T> $$8 = $$3.d($$2);
         $$8.c().forEach($$5x -> {
            alk<T> $$6x = $$5x.h();
            kg.f<T> $$7x = new kg.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (js.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         js.b<T> $$9 = $$4.d($$2);
         $$9.c().forEach($$5x -> {
            alk<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kg.f<T> $$7x = new kg.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (js.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kg.g a(ke $$0, js.a $$1, ji.a $$2) {
      kg.b $$3 = this.b($$0);
      Map<alk<? extends kd<?>>, kg.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alk<? extends kd<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kg.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<js.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      js.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      js.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kg.g($$8, $$7);
   }

   static record b(kg.m a, kg.l b, Map<all, jr<?>> c, Map<alk<?>, kg.h<?>> d, List<RuntimeException> e) {

      public static kg.b a(ke $$0, Stream<alk<? extends kd<?>>> $$1) {
         kg.m $$2 = new kg.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kg.l $$4 = new kg.l($$2);
         Builder<all, jr<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), kg.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kg.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> rb<T> a() {
         return new rb<T>() {
            @Override
            public jq.c<T> a(alk<T> $$0, T $$1, Lifecycle $$2) {
               kg.h<?> $$3 = b.this.d.put($$0, new kg.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jr<S> a(alk<? extends kd<? extends S>> $$0) {
               return (jr<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (alk<Object> $$0 : this.b.a.keySet()) {
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

      public kg.m e() {
         return this.a;
      }

      public kg.l f() {
         return this.b;
      }

      public Map<all, jr<?>> g() {
         return this.c;
      }

      public Map<alk<?>, kg.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jr<T> {
      protected final jt<T> d;

      protected c(jt<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<ju.c<T>> a(axt<T> $$0) {
         return Optional.of(ju.a(this.d, $$0));
      }
   }

   static class d<T> extends kg.e<T> implements js.b.a<T> {
      private final js.b<T> a;

      d(jt<T> $$0, js.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public js.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kg.c<T> implements js.b<T> {
      protected e(jt<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<ju.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jq.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jt<T> $$0, @Nullable alk<T> $$1) {
         super(jq.c.a.a, $$0, $$1, null);
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

   public static record g(js.a a, js.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(rb<T> var1);
   }

   static record j<T>(alk<? extends kd<? extends T>> a, Lifecycle b, Map<alk<T>, kg.n<T>> c) {

      public js.b<T> a(kg.m $$0) {
         Map<alk<T>, jq.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kg.n<T> $$2 = (kg.n<T>)$$1x.getValue();
            jq.c<T> $$3 = $$2.b().orElseGet(() -> jq.c.a($$0.a(), (alk<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kg.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alk<? extends kd<T>> a, Lifecycle b, kg.i<T> c) {
      void b(kg.b $$0) {
         this.c.run($$0.a());
      }

      public kg.j<T> a(kg.b $$0) {
         Map<alk<T>, kg.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alk<?>, kg.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alk<?>, kg.h<?>> $$3 = $$2.next();
            alk<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kg.h<T> $$6 = (kg.h<T>)$$3.getValue();
               jq.c<T> $$7 = (jq.c<T>)$$0.b.a.remove($$4);
               $$1.put((alk<T>)$$4, new kg.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kg.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kg.c<Object> {
      final Map<alk<Object>, jq.c<Object>> a = new HashMap<>();

      public l(jt<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jq.c<Object>> a(alk<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jq.c<T> c(alk<T> $$0) {
         return (jq.c<T>)this.a.computeIfAbsent($$0, $$0x -> jq.c.a(this.d, $$0x));
      }
   }

   static class m implements jt<Object> {
      public <T> jt<T> a() {
         return this;
      }
   }

   static record n<T>(kg.h<T> a, Optional<jq.c<T>> b) {
   }
}
