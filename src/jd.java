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

public class jd {
   private final List<jd.k<?>> a = new ArrayList<>();

   static <T> io<T> a(final ip.b<T> $$0) {
      return new jd.c<T>($$0) {
         @Override
         public Optional<in.c<T>> a(aju<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ip.b<T> a(final aju<? extends ja<? extends T>> $$0, final Lifecycle $$1, iq<T> $$2, final Map<aju<T>, in.c<T>> $$3) {
      return new jd.e<T>($$2) {
         @Override
         public aju<? extends ja<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<in.c<T>> a(aju<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<in.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jd a(aju<? extends ja<T>> $$0, Lifecycle $$1, jd.i<T> $$2) {
      this.a.add(new jd.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jd a(aju<? extends ja<T>> $$0, jd.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jd.b b(jb $$0) {
      jd.b $$1 = jd.b.a($$0, this.a.stream().map(jd.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ip.a a(jd.m $$0, jb $$1, Stream<ip.b<?>> $$2) {
      record a<T>(ip.b<T> a, ajt.a<T> b) {
         public static <T> a<T> a(ip.b<T> $$0) {
            return new a<>(new jd.d<>($$0, $$0), ajt.a.a($$0));
         }

         public static <T> a<T> a(jd.m $$0, ip.b<T> $$1) {
            return new a<>(new jd.d<>($$0.a(), $$1), new ajt.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<aju<? extends ja<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jd$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jd$a.a($$0, $$2x)));
      return new ip.a() {
         @Override
         public Stream<aju<? extends ja<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(aju<? extends ja<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<ip.b<T>> a(aju<? extends ja<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> ajt<V> a(DynamicOps<V> $$0) {
            return ajt.a($$0, new ajt.b() {
               @Override
               public <T> Optional<ajt.a<T>> a(aju<? extends ja<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public ip.a a(jb $$0) {
      jd.b $$1 = this.b($$0);
      Stream<ip.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ip.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ip.a a(jb $$0, ip.a $$1, ie.a $$2, Map<aju<? extends ja<?>>, jd.j<?>> $$3, ip.a $$4) {
      jd.m $$5 = new jd.m();
      MutableObject<ip.a> $$6 = new MutableObject();
      List<ip.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      ip.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ip.b<T> a(iq<T> $$0, ie.a $$1, aju<? extends ja<? extends T>> $$2, ip.a $$3, ip.a $$4, MutableObject<ip.a> $$5) {
      ie<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<aju<T>, in.c<T>> $$7 = new HashMap<>();
         ip.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            aju<T> $$6x = $$5x.h();
            jd.f<T> $$7x = new jd.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ip.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ip.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            aju<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jd.f<T> $$7x = new jd.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ip.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jd.g a(jb $$0, ip.a $$1, ie.a $$2) {
      jd.b $$3 = this.b($$0);
      Map<aju<? extends ja<?>>, jd.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<aju<? extends ja<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jd.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<ip.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ip.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      ip.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jd.g($$8, $$7);
   }

   static record b(jd.m a, jd.l b, Map<ajv, io<?>> c, Map<aju<?>, jd.h<?>> d, List<RuntimeException> e) {

      public static jd.b a(jb $$0, Stream<aju<? extends ja<?>>> $$1) {
         jd.m $$2 = new jd.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jd.l $$4 = new jd.l($$2);
         Builder<ajv, io<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jd.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jd.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> pz<T> a() {
         return new pz<T>() {
            @Override
            public in.c<T> a(aju<T> $$0, T $$1, Lifecycle $$2) {
               jd.h<?> $$3 = b.this.d.put($$0, new jd.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> io<S> a(aju<? extends ja<? extends S>> $$0) {
               return (io<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (aju<Object> $$0 : this.b.a.keySet()) {
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

      public jd.m e() {
         return this.a;
      }

      public jd.l f() {
         return this.b;
      }

      public Map<ajv, io<?>> g() {
         return this.c;
      }

      public Map<aju<?>, jd.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements io<T> {
      protected final iq<T> d;

      protected c(iq<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<ir.c<T>> a(avt<T> $$0) {
         return Optional.of(ir.a(this.d, $$0));
      }
   }

   static class d<T> extends jd.e<T> implements ip.b.a<T> {
      private final ip.b<T> a;

      d(iq<T> $$0, ip.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public ip.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jd.c<T> implements ip.b<T> {
      protected e(iq<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<ir.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends in.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(iq<T> $$0, @Nullable aju<T> $$1) {
         super(in.c.a.a, $$0, $$1, null);
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

   public static record g(ip.a a, ip.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(pz<T> var1);
   }

   static record j<T>(aju<? extends ja<? extends T>> a, Lifecycle b, Map<aju<T>, jd.n<T>> c) {

      public ip.b<T> a(jd.m $$0) {
         Map<aju<T>, in.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jd.n<T> $$2 = (jd.n<T>)$$1x.getValue();
            in.c<T> $$3 = $$2.b().orElseGet(() -> in.c.a($$0.a(), (aju<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jd.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(aju<? extends ja<T>> a, Lifecycle b, jd.i<T> c) {
      void b(jd.b $$0) {
         this.c.run($$0.a());
      }

      public jd.j<T> a(jd.b $$0) {
         Map<aju<T>, jd.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<aju<?>, jd.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aju<?>, jd.h<?>> $$3 = $$2.next();
            aju<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jd.h<T> $$6 = (jd.h<T>)$$3.getValue();
               in.c<T> $$7 = (in.c<T>)$$0.b.a.remove($$4);
               $$1.put((aju<T>)$$4, new jd.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jd.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jd.c<Object> {
      final Map<aju<Object>, in.c<Object>> a = new HashMap<>();

      public l(iq<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<in.c<Object>> a(aju<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> in.c<T> c(aju<T> $$0) {
         return (in.c<T>)this.a.computeIfAbsent($$0, $$0x -> in.c.a(this.d, $$0x));
      }
   }

   static class m implements iq<Object> {
      public <T> iq<T> a() {
         return this;
      }
   }

   static record n<T>(jd.h<T> a, Optional<in.c<T>> b) {
   }
}
