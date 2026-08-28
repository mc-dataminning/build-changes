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

public class kd {
   private final List<kd.k<?>> a = new ArrayList<>();

   static <T> jo<T> a(final jp.b<T> $$0) {
      return new kd.c<T>($$0) {
         @Override
         public Optional<jn.c<T>> a(ala<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jp.b<T> a(final ala<? extends ka<? extends T>> $$0, final Lifecycle $$1, jq<T> $$2, final Map<ala<T>, jn.c<T>> $$3) {
      return new kd.e<T>($$2) {
         @Override
         public ala<? extends ka<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<jn.c<T>> a(ala<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jn.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kd a(ala<? extends ka<T>> $$0, Lifecycle $$1, kd.i<T> $$2) {
      this.a.add(new kd.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kd a(ala<? extends ka<T>> $$0, kd.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kd.b b(kb $$0) {
      kd.b $$1 = kd.b.a($$0, this.a.stream().map(kd.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jp.a a(kd.m $$0, kb $$1, Stream<jp.b<?>> $$2) {
      record a<T>(jp.b<T> a, akz.b<T> b) {
         public static <T> a<T> a(jp.b<T> $$0) {
            return new a<>(new kd.d<>($$0, $$0), akz.b.a($$0));
         }

         public static <T> a<T> a(kd.m $$0, jp.b<T> $$1) {
            return new a<>(new kd.d<>($$0.a(), $$1), new akz.b<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<ala<? extends ka<?>>, a<?>> $$3 = new HashMap<>();
      $$1.e().forEach($$1x -> $$3.put($$1x.a(), kd$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), kd$a.a($$0, $$2x)));
      return new jp.a() {
         @Override
         public Stream<ala<? extends ka<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(ala<? extends ka<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jp.b<T>> a(ala<? extends ka<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> akz<V> a(DynamicOps<V> $$0) {
            return akz.a($$0, new akz.c() {
               @Override
               public <T> Optional<akz.b<T>> a(ala<? extends ka<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public jp.a a(kb $$0) {
      kd.b $$1 = this.b($$0);
      Stream<jp.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jp.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jp.a a(kb $$0, jp.a $$1, jf.a $$2, Map<ala<? extends ka<?>>, kd.j<?>> $$3, jp.a $$4) {
      kd.m $$5 = new kd.m();
      MutableObject<jp.a> $$6 = new MutableObject();
      List<jp.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jp.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jp.b<T> a(jq<T> $$0, jf.a $$1, ala<? extends ka<? extends T>> $$2, jp.a $$3, jp.a $$4, MutableObject<jp.a> $$5) {
      jf<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ala<T>, jn.c<T>> $$7 = new HashMap<>();
         jp.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ala<T> $$6x = $$5x.h();
            kd.f<T> $$7x = new kd.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jp.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jp.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ala<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kd.f<T> $$7x = new kd.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jp.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kd.g a(kb $$0, jp.a $$1, jf.a $$2) {
      kd.b $$3 = this.b($$0);
      Map<ala<? extends ka<?>>, kd.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ala<? extends ka<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kd.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jp.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jp.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jp.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kd.g($$8, $$7);
   }

   static record b(kd.m a, kd.l b, Map<alb, jo<?>> c, Map<ala<?>, kd.h<?>> d, List<RuntimeException> e) {

      public static kd.b a(kb $$0, Stream<ala<? extends ka<?>>> $$1) {
         kd.m $$2 = new kd.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kd.l $$4 = new kd.l($$2);
         Builder<alb, jo<?>> $$5 = ImmutableMap.builder();
         $$0.e().forEach($$1x -> $$5.put($$1x.a().a(), kd.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kd.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qt<T> a() {
         return new qt<T>() {
            @Override
            public jn.c<T> a(ala<T> $$0, T $$1, Lifecycle $$2) {
               kd.h<?> $$3 = b.this.d.put($$0, new kd.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jo<S> a(ala<? extends ka<? extends S>> $$0) {
               return (jo<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ala<Object> $$0 : this.b.a.keySet()) {
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

      public kd.m e() {
         return this.a;
      }

      public kd.l f() {
         return this.b;
      }

      public Map<alb, jo<?>> g() {
         return this.c;
      }

      public Map<ala<?>, kd.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jo<T> {
      protected final jq<T> d;

      protected c(jq<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jr.c<T>> a(axi<T> $$0) {
         return Optional.of(jr.a(this.d, $$0));
      }
   }

   static class d<T> extends kd.e<T> implements jp.b.a<T> {
      private final jp.b<T> a;

      d(jq<T> $$0, jp.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jp.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kd.c<T> implements jp.b<T> {
      protected e(jq<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jr.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jn.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jq<T> $$0, @Nullable ala<T> $$1) {
         super(jn.c.a.a, $$0, $$1, null);
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

   public static record g(jp.a a, jp.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qt<T> var1);
   }

   static record j<T>(ala<? extends ka<? extends T>> a, Lifecycle b, Map<ala<T>, kd.n<T>> c) {

      public jp.b<T> a(kd.m $$0) {
         Map<ala<T>, jn.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kd.n<T> $$2 = (kd.n<T>)$$1x.getValue();
            jn.c<T> $$3 = $$2.b().orElseGet(() -> jn.c.a($$0.a(), (ala<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kd.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(ala<? extends ka<T>> a, Lifecycle b, kd.i<T> c) {
      void b(kd.b $$0) {
         this.c.run($$0.a());
      }

      public kd.j<T> a(kd.b $$0) {
         Map<ala<T>, kd.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<ala<?>, kd.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ala<?>, kd.h<?>> $$3 = $$2.next();
            ala<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kd.h<T> $$6 = (kd.h<T>)$$3.getValue();
               jn.c<T> $$7 = (jn.c<T>)$$0.b.a.remove($$4);
               $$1.put((ala<T>)$$4, new kd.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kd.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kd.c<Object> {
      final Map<ala<Object>, jn.c<Object>> a = new HashMap<>();

      public l(jq<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jn.c<Object>> a(ala<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jn.c<T> c(ala<T> $$0) {
         return (jn.c<T>)this.a.computeIfAbsent($$0, $$0x -> jn.c.a(this.d, $$0x));
      }
   }

   static class m implements jq<Object> {
      public <T> jq<T> a() {
         return this;
      }
   }

   static record n<T>(kd.h<T> a, Optional<jn.c<T>> b) {
   }
}
