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

public class jv {
   private final List<jv.k<?>> a = new ArrayList<>();

   static <T> jg<T> a(final jh.b<T> $$0) {
      return new jv.c<T>($$0) {
         @Override
         public Optional<jf.c<T>> a(alf<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jh.b<T> a(final alf<? extends js<? extends T>> $$0, final Lifecycle $$1, ji<T> $$2, final Map<alf<T>, jf.c<T>> $$3) {
      return new jv.e<T>($$2) {
         @Override
         public alf<? extends js<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jf.c<T>> a(alf<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jf.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jv a(alf<? extends js<T>> $$0, Lifecycle $$1, jv.i<T> $$2) {
      this.a.add(new jv.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jv a(alf<? extends js<T>> $$0, jv.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jv.b b(jt $$0) {
      jv.b $$1 = jv.b.a($$0, this.a.stream().map(jv.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jh.a a(jv.m $$0, jt $$1, Stream<jh.b<?>> $$2) {
      record a<T>(jh.b<T> a, ale.b<T> b) {
         public static <T> a<T> a(jh.b<T> $$0) {
            return new a<>(new jv.d<>($$0, $$0), ale.b.a($$0));
         }

         public static <T> a<T> a(jv.m $$0, jh.b<T> $$1) {
            return new a<>(new jv.d<>($$0.a(), $$1), new ale.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alf<? extends js<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), jv$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), jv$a.a($$0, $$2x)));
      return new jh.a() {
         @Override
         public Stream<alf<? extends js<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> f(alf<? extends js<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jh.b<T>> a(alf<? extends js<? extends T>> $$0) {
            return this.f($$0).map(a::a);
         }

         @Override
         public <V> ale<V> a(DynamicOps<V> $$0) {
            return ale.a($$0, new ale.c() {
               @Override
               public <T> Optional<ale.b<T>> a(alf<? extends js<? extends T>> $$0) {
                  return f($$0).map(a::b);
               }
            });
         }
      };
   }

   public jh.a a(jt $$0) {
      jv.b $$1 = this.b($$0);
      Stream<jh.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jh.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jh.a a(jt $$0, jh.a $$1, ix.a $$2, Map<alf<? extends js<?>>, jv.j<?>> $$3, jh.a $$4) {
      jv.m $$5 = new jv.m();
      MutableObject<jh.a> $$6 = new MutableObject();
      List<jh.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jh.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jh.b<T> a(ji<T> $$0, ix.a $$1, alf<? extends js<? extends T>> $$2, jh.a $$3, jh.a $$4, MutableObject<jh.a> $$5) {
      ix<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alf<T>, jf.c<T>> $$7 = new HashMap<>();
         jh.b<T> $$8 = $$3.e($$2);
         $$8.c().forEach($$5x -> {
            alf<T> $$6x = $$5x.h();
            jv.f<T> $$7x = new jv.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jh.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jh.b<T> $$9 = $$4.e($$2);
         $$9.c().forEach($$5x -> {
            alf<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jv.f<T> $$7x = new jv.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jh.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jv.g a(jt $$0, jh.a $$1, ix.a $$2) {
      jv.b $$3 = this.b($$0);
      Map<alf<? extends js<?>>, jv.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alf<? extends js<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jv.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jh.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jh.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jh.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jv.g($$8, $$7);
   }

   static record b(jv.m a, jv.l b, Map<alg, jg<?>> c, Map<alf<?>, jv.h<?>> d, List<RuntimeException> e) {

      public static jv.b a(jt $$0, Stream<alf<? extends js<?>>> $$1) {
         jv.m $$2 = new jv.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jv.l $$4 = new jv.l($$2);
         Builder<alg, jg<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), jv.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jv.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qh<T> a() {
         return new qh<T>() {
            @Override
            public jf.c<T> a(alf<T> $$0, T $$1, Lifecycle $$2) {
               jv.h<?> $$3 = b.this.d.put($$0, new jv.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jg<S> a(alf<? extends js<? extends S>> $$0) {
               return (jg<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (alf<Object> $$0 : this.b.a.keySet()) {
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

      public jv.m e() {
         return this.a;
      }

      public jv.l f() {
         return this.b;
      }

      public Map<alg, jg<?>> g() {
         return this.c;
      }

      public Map<alf<?>, jv.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jg<T> {
      protected final ji<T> d;

      protected c(ji<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jj.c<T>> a(axr<T> $$0) {
         return Optional.of(jj.a(this.d, $$0));
      }
   }

   static class d<T> extends jv.e<T> implements jh.b.a<T> {
      private final jh.b<T> a;

      d(ji<T> $$0, jh.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jh.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jv.c<T> implements jh.b<T> {
      protected e(ji<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jj.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jf.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(ji<T> $$0, @Nullable alf<T> $$1) {
         super(jf.c.a.a, $$0, $$1, null);
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

   public static record g(jh.a a, jh.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qh<T> var1);
   }

   static record j<T>(alf<? extends js<? extends T>> a, Lifecycle b, Map<alf<T>, jv.n<T>> c) {

      public jh.b<T> a(jv.m $$0) {
         Map<alf<T>, jf.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jv.n<T> $$2 = (jv.n<T>)$$1x.getValue();
            jf.c<T> $$3 = $$2.b().orElseGet(() -> jf.c.a($$0.a(), (alf<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jv.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alf<? extends js<T>> a, Lifecycle b, jv.i<T> c) {
      void b(jv.b $$0) {
         this.c.run($$0.a());
      }

      public jv.j<T> a(jv.b $$0) {
         Map<alf<T>, jv.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alf<?>, jv.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alf<?>, jv.h<?>> $$3 = $$2.next();
            alf<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jv.h<T> $$6 = (jv.h<T>)$$3.getValue();
               jf.c<T> $$7 = (jf.c<T>)$$0.b.a.remove($$4);
               $$1.put((alf<T>)$$4, new jv.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jv.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jv.c<Object> {
      final Map<alf<Object>, jf.c<Object>> a = new HashMap<>();

      public l(ji<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jf.c<Object>> a(alf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jf.c<T> c(alf<T> $$0) {
         return (jf.c<T>)this.a.computeIfAbsent($$0, $$0x -> jf.c.a(this.d, $$0x));
      }
   }

   static class m implements ji<Object> {
      public <T> ji<T> a() {
         return this;
      }
   }

   static record n<T>(jv.h<T> a, Optional<jf.c<T>> b) {
   }
}
