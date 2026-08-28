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

public class ju {
   private final List<ju.k<?>> a = new ArrayList<>();

   static <T> jf<T> a(final jg.b<T> $$0) {
      return new ju.c<T>($$0) {
         @Override
         public Optional<je.c<T>> a(alf<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jg.b<T> a(final alf<? extends jr<? extends T>> $$0, final Lifecycle $$1, jh<T> $$2, final Map<alf<T>, je.c<T>> $$3) {
      return new ju.e<T>($$2) {
         @Override
         public alf<? extends jr<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<je.c<T>> a(alf<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<je.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> ju a(alf<? extends jr<T>> $$0, Lifecycle $$1, ju.i<T> $$2) {
      this.a.add(new ju.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> ju a(alf<? extends jr<T>> $$0, ju.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private ju.b b(js $$0) {
      ju.b $$1 = ju.b.a($$0, this.a.stream().map(ju.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jg.a a(ju.m $$0, js $$1, Stream<jg.b<?>> $$2) {
      record a<T>(jg.b<T> a, ale.b<T> b) {
         public static <T> a<T> a(jg.b<T> $$0) {
            return new a<>(new ju.d<>($$0, $$0), ale.b.a($$0));
         }

         public static <T> a<T> a(ju.m $$0, jg.b<T> $$1) {
            return new a<>(new ju.d<>($$0.a(), $$1), new ale.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alf<? extends jr<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), ju$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), ju$a.a($$0, $$2x)));
      return new jg.a() {
         @Override
         public Stream<alf<? extends jr<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> f(alf<? extends jr<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jg.b<T>> a(alf<? extends jr<? extends T>> $$0) {
            return this.f($$0).map(a::a);
         }

         @Override
         public <V> ale<V> a(DynamicOps<V> $$0) {
            return ale.a($$0, new ale.c() {
               @Override
               public <T> Optional<ale.b<T>> a(alf<? extends jr<? extends T>> $$0) {
                  return f($$0).map(a::b);
               }
            });
         }
      };
   }

   public jg.a a(js $$0) {
      ju.b $$1 = this.b($$0);
      Stream<jg.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jg.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jg.a a(js $$0, jg.a $$1, iw.a $$2, Map<alf<? extends jr<?>>, ju.j<?>> $$3, jg.a $$4) {
      ju.m $$5 = new ju.m();
      MutableObject<jg.a> $$6 = new MutableObject();
      List<jg.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jg.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jg.b<T> a(jh<T> $$0, iw.a $$1, alf<? extends jr<? extends T>> $$2, jg.a $$3, jg.a $$4, MutableObject<jg.a> $$5) {
      iw<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alf<T>, je.c<T>> $$7 = new HashMap<>();
         jg.b<T> $$8 = $$3.e($$2);
         $$8.c().forEach($$5x -> {
            alf<T> $$6x = $$5x.h();
            ju.f<T> $$7x = new ju.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jg.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jg.b<T> $$9 = $$4.e($$2);
         $$9.c().forEach($$5x -> {
            alf<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               ju.f<T> $$7x = new ju.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jg.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public ju.g a(js $$0, jg.a $$1, iw.a $$2) {
      ju.b $$3 = this.b($$0);
      Map<alf<? extends jr<?>>, ju.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alf<? extends jr<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new ju.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jg.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jg.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jg.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new ju.g($$8, $$7);
   }

   static record b(ju.m a, ju.l b, Map<alg, jf<?>> c, Map<alf<?>, ju.h<?>> d, List<RuntimeException> e) {

      public static ju.b a(js $$0, Stream<alf<? extends jr<?>>> $$1) {
         ju.m $$2 = new ju.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         ju.l $$4 = new ju.l($$2);
         Builder<alg, jf<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), ju.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new ju.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qh<T> a() {
         return new qh<T>() {
            @Override
            public je.c<T> a(alf<T> $$0, T $$1, Lifecycle $$2) {
               ju.h<?> $$3 = b.this.d.put($$0, new ju.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jf<S> a(alf<? extends jr<? extends S>> $$0) {
               return (jf<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
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

      public ju.m e() {
         return this.a;
      }

      public ju.l f() {
         return this.b;
      }

      public Map<alg, jf<?>> g() {
         return this.c;
      }

      public Map<alf<?>, ju.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jf<T> {
      protected final jh<T> d;

      protected c(jh<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<ji.c<T>> a(axr<T> $$0) {
         return Optional.of(ji.a(this.d, $$0));
      }
   }

   static class d<T> extends ju.e<T> implements jg.b.a<T> {
      private final jg.b<T> a;

      d(jh<T> $$0, jg.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jg.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends ju.c<T> implements jg.b<T> {
      protected e(jh<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<ji.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends je.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jh<T> $$0, @Nullable alf<T> $$1) {
         super(je.c.a.a, $$0, $$1, null);
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

   public static record g(jg.a a, jg.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qh<T> var1);
   }

   static record j<T>(alf<? extends jr<? extends T>> a, Lifecycle b, Map<alf<T>, ju.n<T>> c) {

      public jg.b<T> a(ju.m $$0) {
         Map<alf<T>, je.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            ju.n<T> $$2 = (ju.n<T>)$$1x.getValue();
            je.c<T> $$3 = $$2.b().orElseGet(() -> je.c.a($$0.a(), (alf<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return ju.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alf<? extends jr<T>> a, Lifecycle b, ju.i<T> c) {
      void b(ju.b $$0) {
         this.c.run($$0.a());
      }

      public ju.j<T> a(ju.b $$0) {
         Map<alf<T>, ju.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alf<?>, ju.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alf<?>, ju.h<?>> $$3 = $$2.next();
            alf<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               ju.h<T> $$6 = (ju.h<T>)$$3.getValue();
               je.c<T> $$7 = (je.c<T>)$$0.b.a.remove($$4);
               $$1.put((alf<T>)$$4, new ju.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new ju.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends ju.c<Object> {
      final Map<alf<Object>, je.c<Object>> a = new HashMap<>();

      public l(jh<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<je.c<Object>> a(alf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> je.c<T> c(alf<T> $$0) {
         return (je.c<T>)this.a.computeIfAbsent($$0, $$0x -> je.c.a(this.d, $$0x));
      }
   }

   static class m implements jh<Object> {
      public <T> jh<T> a() {
         return this;
      }
   }

   static record n<T>(ju.h<T> a, Optional<je.c<T>> b) {
   }
}
