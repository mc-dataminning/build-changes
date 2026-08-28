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

public class jw {
   private final List<jw.k<?>> a = new ArrayList<>();

   static <T> jh<T> a(final ji.b<T> $$0) {
      return new jw.c<T>($$0) {
         @Override
         public Optional<jg.c<T>> a(alj<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ji.b<T> a(final alj<? extends jt<? extends T>> $$0, final Lifecycle $$1, jj<T> $$2, final Map<alj<T>, jg.c<T>> $$3) {
      return new jw.e<T>($$2) {
         @Override
         public alj<? extends jt<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jg.c<T>> a(alj<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jg.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jw a(alj<? extends jt<T>> $$0, Lifecycle $$1, jw.i<T> $$2) {
      this.a.add(new jw.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jw a(alj<? extends jt<T>> $$0, jw.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jw.b b(ju $$0) {
      jw.b $$1 = jw.b.a($$0, this.a.stream().map(jw.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ji.a a(jw.m $$0, ju $$1, Stream<ji.b<?>> $$2) {
      record a<T>(ji.b<T> a, ali.b<T> b) {
         public static <T> a<T> a(ji.b<T> $$0) {
            return new a<>(new jw.d<>($$0, $$0), ali.b.a($$0));
         }

         public static <T> a<T> a(jw.m $$0, ji.b<T> $$1) {
            return new a<>(new jw.d<>($$0.a(), $$1), new ali.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<alj<? extends jt<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), jw$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), jw$a.a($$0, $$2x)));
      return new ji.a() {
         @Override
         public Stream<alj<? extends jt<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> f(alj<? extends jt<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<ji.b<T>> a(alj<? extends jt<? extends T>> $$0) {
            return this.f($$0).map(a::a);
         }

         @Override
         public <V> ali<V> a(DynamicOps<V> $$0) {
            return ali.a($$0, new ali.c() {
               @Override
               public <T> Optional<ali.b<T>> a(alj<? extends jt<? extends T>> $$0) {
                  return f($$0).map(a::b);
               }
            });
         }
      };
   }

   public ji.a a(ju $$0) {
      jw.b $$1 = this.b($$0);
      Stream<ji.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ji.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ji.a a(ju $$0, ji.a $$1, iy.a $$2, Map<alj<? extends jt<?>>, jw.j<?>> $$3, ji.a $$4) {
      jw.m $$5 = new jw.m();
      MutableObject<ji.a> $$6 = new MutableObject();
      List<ji.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      ji.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ji.b<T> a(jj<T> $$0, iy.a $$1, alj<? extends jt<? extends T>> $$2, ji.a $$3, ji.a $$4, MutableObject<ji.a> $$5) {
      iy<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<alj<T>, jg.c<T>> $$7 = new HashMap<>();
         ji.b<T> $$8 = $$3.e($$2);
         $$8.c().forEach($$5x -> {
            alj<T> $$6x = $$5x.h();
            jw.f<T> $$7x = new jw.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ji.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ji.b<T> $$9 = $$4.e($$2);
         $$9.c().forEach($$5x -> {
            alj<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jw.f<T> $$7x = new jw.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ji.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jw.g a(ju $$0, ji.a $$1, iy.a $$2) {
      jw.b $$3 = this.b($$0);
      Map<alj<? extends jt<?>>, jw.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<alj<? extends jt<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jw.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<ji.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ji.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      ji.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jw.g($$8, $$7);
   }

   static record b(jw.m a, jw.l b, Map<alk, jh<?>> c, Map<alj<?>, jw.h<?>> d, List<RuntimeException> e) {

      public static jw.b a(ju $$0, Stream<alj<? extends jt<?>>> $$1) {
         jw.m $$2 = new jw.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jw.l $$4 = new jw.l($$2);
         Builder<alk, jh<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), jw.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jw.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qi<T> a() {
         return new qi<T>() {
            @Override
            public jg.c<T> a(alj<T> $$0, T $$1, Lifecycle $$2) {
               jw.h<?> $$3 = b.this.d.put($$0, new jw.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jh<S> a(alj<? extends jt<? extends S>> $$0) {
               return (jh<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (alj<Object> $$0 : this.b.a.keySet()) {
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

      public jw.m e() {
         return this.a;
      }

      public jw.l f() {
         return this.b;
      }

      public Map<alk, jh<?>> g() {
         return this.c;
      }

      public Map<alj<?>, jw.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jh<T> {
      protected final jj<T> d;

      protected c(jj<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jk.c<T>> a(axv<T> $$0) {
         return Optional.of(jk.a(this.d, $$0));
      }
   }

   static class d<T> extends jw.e<T> implements ji.b.a<T> {
      private final ji.b<T> a;

      d(jj<T> $$0, ji.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public ji.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jw.c<T> implements ji.b<T> {
      protected e(jj<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jk.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jg.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jj<T> $$0, @Nullable alj<T> $$1) {
         super(jg.c.a.a, $$0, $$1, null);
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

   public static record g(ji.a a, ji.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qi<T> var1);
   }

   static record j<T>(alj<? extends jt<? extends T>> a, Lifecycle b, Map<alj<T>, jw.n<T>> c) {

      public ji.b<T> a(jw.m $$0) {
         Map<alj<T>, jg.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jw.n<T> $$2 = (jw.n<T>)$$1x.getValue();
            jg.c<T> $$3 = $$2.b().orElseGet(() -> jg.c.a($$0.a(), (alj<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jw.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(alj<? extends jt<T>> a, Lifecycle b, jw.i<T> c) {
      void b(jw.b $$0) {
         this.c.run($$0.a());
      }

      public jw.j<T> a(jw.b $$0) {
         Map<alj<T>, jw.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<alj<?>, jw.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<alj<?>, jw.h<?>> $$3 = $$2.next();
            alj<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jw.h<T> $$6 = (jw.h<T>)$$3.getValue();
               jg.c<T> $$7 = (jg.c<T>)$$0.b.a.remove($$4);
               $$1.put((alj<T>)$$4, new jw.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jw.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jw.c<Object> {
      final Map<alj<Object>, jg.c<Object>> a = new HashMap<>();

      public l(jj<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jg.c<Object>> a(alj<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jg.c<T> c(alj<T> $$0) {
         return (jg.c<T>)this.a.computeIfAbsent($$0, $$0x -> jg.c.a(this.d, $$0x));
      }
   }

   static class m implements jj<Object> {
      public <T> jj<T> a() {
         return this;
      }
   }

   static record n<T>(jw.h<T> a, Optional<jg.c<T>> b) {
   }
}
