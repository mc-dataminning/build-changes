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

public class jb {
   private final List<jb.k<?>> a = new ArrayList<>();

   static <T> im<T> a(final in.b<T> $$0) {
      return new jb.c<T>($$0) {
         @Override
         public Optional<il.c<T>> a(ajs<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> in.b<T> a(final ajs<? extends iy<? extends T>> $$0, final Lifecycle $$1, io<T> $$2, final Map<ajs<T>, il.c<T>> $$3) {
      return new jb.e<T>($$2) {
         @Override
         public ajs<? extends iy<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<il.c<T>> a(ajs<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<il.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jb a(ajs<? extends iy<T>> $$0, Lifecycle $$1, jb.i<T> $$2) {
      this.a.add(new jb.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jb a(ajs<? extends iy<T>> $$0, jb.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jb.b b(iz $$0) {
      jb.b $$1 = jb.b.a($$0, this.a.stream().map(jb.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static in.a a(jb.m $$0, iz $$1, Stream<in.b<?>> $$2) {
      record a<T>(in.b<T> a, ajr.a<T> b) {
         public static <T> a<T> a(in.b<T> $$0) {
            return new a<>(new jb.d<>($$0, $$0), ajr.a.a($$0));
         }

         public static <T> a<T> a(jb.m $$0, in.b<T> $$1) {
            return new a<>(new jb.d<>($$0.a(), $$1), new ajr.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<ajs<? extends iy<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jb$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jb$a.a($$0, $$2x)));
      return new in.a() {
         @Override
         public Stream<ajs<? extends iy<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(ajs<? extends iy<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> ajr<V> a(DynamicOps<V> $$0) {
            return ajr.a($$0, new ajr.b() {
               @Override
               public <T> Optional<ajr.a<T>> a(ajs<? extends iy<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public in.a a(iz $$0) {
      jb.b $$1 = this.b($$0);
      Stream<in.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      in.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private in.a a(iz $$0, in.a $$1, ic.a $$2, Map<ajs<? extends iy<?>>, jb.j<?>> $$3, in.a $$4) {
      jb.m $$5 = new jb.m();
      MutableObject<in.a> $$6 = new MutableObject();
      List<in.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      in.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> in.b<T> a(io<T> $$0, ic.a $$1, ajs<? extends iy<? extends T>> $$2, in.a $$3, in.a $$4, MutableObject<in.a> $$5) {
      ic<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ajs<T>, il.c<T>> $$7 = new HashMap<>();
         in.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ajs<T> $$6x = $$5x.h();
            jb.f<T> $$7x = new jb.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (in.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         in.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ajs<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jb.f<T> $$7x = new jb.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (in.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jb.g a(iz $$0, in.a $$1, ic.a $$2) {
      jb.b $$3 = this.b($$0);
      Map<ajs<? extends iy<?>>, jb.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ajs<? extends iy<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jb.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<in.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      in.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      in.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jb.g($$8, $$7);
   }

   static record b(jb.m a, jb.l b, Map<ajt, im<?>> c, Map<ajs<?>, jb.h<?>> d, List<RuntimeException> e) {

      public static jb.b a(iz $$0, Stream<ajs<? extends iy<?>>> $$1) {
         jb.m $$2 = new jb.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jb.l $$4 = new jb.l($$2);
         Builder<ajt, im<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jb.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jb.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> px<T> a() {
         return new px<T>() {
            @Override
            public il.c<T> a(ajs<T> $$0, T $$1, Lifecycle $$2) {
               jb.h<?> $$3 = b.this.d.put($$0, new jb.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> im<S> a(ajs<? extends iy<? extends S>> $$0) {
               return (im<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ajs<Object> $$0 : this.b.a.keySet()) {
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

      public jb.m e() {
         return this.a;
      }

      public jb.l f() {
         return this.b;
      }

      public Map<ajt, im<?>> g() {
         return this.c;
      }

      public Map<ajs<?>, jb.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements im<T> {
      protected final io<T> d;

      protected c(io<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<ip.c<T>> a(avr<T> $$0) {
         return Optional.of(ip.a(this.d, $$0));
      }
   }

   static class d<T> extends jb.e<T> implements in.b.a<T> {
      private final in.b<T> a;

      d(io<T> $$0, in.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public in.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jb.c<T> implements in.b<T> {
      protected e(io<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<ip.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends il.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(io<T> $$0, @Nullable ajs<T> $$1) {
         super(il.c.a.a, $$0, $$1, null);
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

   public static record g(in.a a, in.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(px<T> var1);
   }

   static record j<T>(ajs<? extends iy<? extends T>> a, Lifecycle b, Map<ajs<T>, jb.n<T>> c) {

      public in.b<T> a(jb.m $$0) {
         Map<ajs<T>, il.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jb.n<T> $$2 = (jb.n<T>)$$1x.getValue();
            il.c<T> $$3 = $$2.b().orElseGet(() -> il.c.a($$0.a(), (ajs<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jb.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(ajs<? extends iy<T>> a, Lifecycle b, jb.i<T> c) {
      void b(jb.b $$0) {
         this.c.run($$0.a());
      }

      public jb.j<T> a(jb.b $$0) {
         Map<ajs<T>, jb.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<ajs<?>, jb.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ajs<?>, jb.h<?>> $$3 = $$2.next();
            ajs<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jb.h<T> $$6 = (jb.h<T>)$$3.getValue();
               il.c<T> $$7 = (il.c<T>)$$0.b.a.remove($$4);
               $$1.put((ajs<T>)$$4, new jb.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jb.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jb.c<Object> {
      final Map<ajs<Object>, il.c<Object>> a = new HashMap<>();

      public l(io<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<il.c<Object>> a(ajs<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> il.c<T> c(ajs<T> $$0) {
         return (il.c<T>)this.a.computeIfAbsent($$0, $$0x -> il.c.a(this.d, $$0x));
      }
   }

   static class m implements io<Object> {
      public <T> io<T> a() {
         return this;
      }
   }

   static record n<T>(jb.h<T> a, Optional<il.c<T>> b) {
   }
}
