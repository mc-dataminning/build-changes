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

public class jm {
   private final List<jm.k<?>> a = new ArrayList<>();

   static <T> ix<T> a(final iy.b<T> $$0) {
      return new jm.c<T>($$0) {
         @Override
         public Optional<iw.c<T>> a(akg<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> iy.b<T> a(final akg<? extends jj<? extends T>> $$0, final Lifecycle $$1, iz<T> $$2, final Map<akg<T>, iw.c<T>> $$3) {
      return new jm.e<T>($$2) {
         @Override
         public akg<? extends jj<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<iw.c<T>> a(akg<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<iw.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jm a(akg<? extends jj<T>> $$0, Lifecycle $$1, jm.i<T> $$2) {
      this.a.add(new jm.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jm a(akg<? extends jj<T>> $$0, jm.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jm.b b(jk $$0) {
      jm.b $$1 = jm.b.a($$0, this.a.stream().map(jm.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static iy.a a(jm.m $$0, jk $$1, Stream<iy.b<?>> $$2) {
      record a<T>(iy.b<T> a, akf.a<T> b) {
         public static <T> a<T> a(iy.b<T> $$0) {
            return new a<>(new jm.d<>($$0, $$0), akf.a.a($$0));
         }

         public static <T> a<T> a(jm.m $$0, iy.b<T> $$1) {
            return new a<>(new jm.d<>($$0.a(), $$1), new akf.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<akg<? extends jj<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jm$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jm$a.a($$0, $$2x)));
      return new iy.a() {
         @Override
         public Stream<akg<? extends jj<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(akg<? extends jj<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> akf<V> a(DynamicOps<V> $$0) {
            return akf.a($$0, new akf.b() {
               @Override
               public <T> Optional<akf.a<T>> a(akg<? extends jj<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public iy.a a(jk $$0) {
      jm.b $$1 = this.b($$0);
      Stream<iy.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      iy.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private iy.a a(jk $$0, iy.a $$1, io.a $$2, Map<akg<? extends jj<?>>, jm.j<?>> $$3, iy.a $$4) {
      jm.m $$5 = new jm.m();
      MutableObject<iy.a> $$6 = new MutableObject();
      List<iy.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      iy.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> iy.b<T> a(iz<T> $$0, io.a $$1, akg<? extends jj<? extends T>> $$2, iy.a $$3, iy.a $$4, MutableObject<iy.a> $$5) {
      io<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<akg<T>, iw.c<T>> $$7 = new HashMap<>();
         iy.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            akg<T> $$6x = $$5x.h();
            jm.f<T> $$7x = new jm.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (iy.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         iy.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            akg<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jm.f<T> $$7x = new jm.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (iy.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jm.g a(jk $$0, iy.a $$1, io.a $$2) {
      jm.b $$3 = this.b($$0);
      Map<akg<? extends jj<?>>, jm.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<akg<? extends jj<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jm.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<iy.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      iy.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      iy.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jm.g($$8, $$7);
   }

   static record b(jm.m a, jm.l b, Map<akh, ix<?>> c, Map<akg<?>, jm.h<?>> d, List<RuntimeException> e) {

      public static jm.b a(jk $$0, Stream<akg<? extends jj<?>>> $$1) {
         jm.m $$2 = new jm.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jm.l $$4 = new jm.l($$2);
         Builder<akh, ix<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jm.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jm.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> ql<T> a() {
         return new ql<T>() {
            @Override
            public iw.c<T> a(akg<T> $$0, T $$1, Lifecycle $$2) {
               jm.h<?> $$3 = b.this.d.put($$0, new jm.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> ix<S> a(akg<? extends jj<? extends S>> $$0) {
               return (ix<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (akg<Object> $$0 : this.b.a.keySet()) {
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

      public jm.m e() {
         return this.a;
      }

      public jm.l f() {
         return this.b;
      }

      public Map<akh, ix<?>> g() {
         return this.c;
      }

      public Map<akg<?>, jm.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements ix<T> {
      protected final iz<T> d;

      protected c(iz<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<ja.c<T>> a(awg<T> $$0) {
         return Optional.of(ja.a(this.d, $$0));
      }
   }

   static class d<T> extends jm.e<T> implements iy.b.a<T> {
      private final iy.b<T> a;

      d(iz<T> $$0, iy.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public iy.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jm.c<T> implements iy.b<T> {
      protected e(iz<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<ja.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends iw.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(iz<T> $$0, @Nullable akg<T> $$1) {
         super(iw.c.a.a, $$0, $$1, null);
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

   public static record g(iy.a a, iy.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(ql<T> var1);
   }

   static record j<T>(akg<? extends jj<? extends T>> a, Lifecycle b, Map<akg<T>, jm.n<T>> c) {

      public iy.b<T> a(jm.m $$0) {
         Map<akg<T>, iw.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jm.n<T> $$2 = (jm.n<T>)$$1x.getValue();
            iw.c<T> $$3 = $$2.b().orElseGet(() -> iw.c.a($$0.a(), (akg<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jm.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(akg<? extends jj<T>> a, Lifecycle b, jm.i<T> c) {
      void b(jm.b $$0) {
         this.c.run($$0.a());
      }

      public jm.j<T> a(jm.b $$0) {
         Map<akg<T>, jm.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<akg<?>, jm.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<akg<?>, jm.h<?>> $$3 = $$2.next();
            akg<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jm.h<T> $$6 = (jm.h<T>)$$3.getValue();
               iw.c<T> $$7 = (iw.c<T>)$$0.b.a.remove($$4);
               $$1.put((akg<T>)$$4, new jm.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jm.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jm.c<Object> {
      final Map<akg<Object>, iw.c<Object>> a = new HashMap<>();

      public l(iz<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<iw.c<Object>> a(akg<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> iw.c<T> c(akg<T> $$0) {
         return (iw.c<T>)this.a.computeIfAbsent($$0, $$0x -> iw.c.a(this.d, $$0x));
      }
   }

   static class m implements iz<Object> {
      public <T> iz<T> a() {
         return this;
      }
   }

   static record n<T>(jm.h<T> a, Optional<iw.c<T>> b) {
   }
}
