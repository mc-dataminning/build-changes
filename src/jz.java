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

public class jz {
   private final List<jz.k<?>> a = new ArrayList<>();

   static <T> jk<T> a(final jl.b<T> $$0) {
      return new jz.c<T>($$0) {
         @Override
         public Optional<jj.c<T>> a(akj<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jl.b<T> a(final akj<? extends jw<? extends T>> $$0, final Lifecycle $$1, jm<T> $$2, final Map<akj<T>, jj.c<T>> $$3) {
      return new jz.e<T>($$2) {
         @Override
         public akj<? extends jw<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<jj.c<T>> a(akj<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jj.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jz a(akj<? extends jw<T>> $$0, Lifecycle $$1, jz.i<T> $$2) {
      this.a.add(new jz.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jz a(akj<? extends jw<T>> $$0, jz.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jz.b b(jx $$0) {
      jz.b $$1 = jz.b.a($$0, this.a.stream().map(jz.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jl.a a(jz.m $$0, jx $$1, Stream<jl.b<?>> $$2) {
      record a<T>(jl.b<T> a, aki.b<T> b) {
         public static <T> a<T> a(jl.b<T> $$0) {
            return new a<>(new jz.d<>($$0, $$0), aki.b.a($$0));
         }

         public static <T> a<T> a(jz.m $$0, jl.b<T> $$1) {
            return new a<>(new jz.d<>($$0.a(), $$1), new aki.b<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<akj<? extends jw<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jz$a.a($$1x.b().q())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jz$a.a($$0, $$2x)));
      return new jl.a() {
         @Override
         public Stream<akj<? extends jw<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(akj<? extends jw<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> aki<V> a(DynamicOps<V> $$0) {
            return aki.a($$0, new aki.c() {
               @Override
               public <T> Optional<aki.b<T>> a(akj<? extends jw<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public jl.a a(jx $$0) {
      jz.b $$1 = this.b($$0);
      Stream<jl.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jl.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jl.a a(jx $$0, jl.a $$1, jb.a $$2, Map<akj<? extends jw<?>>, jz.j<?>> $$3, jl.a $$4) {
      jz.m $$5 = new jz.m();
      MutableObject<jl.a> $$6 = new MutableObject();
      List<jl.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jl.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jl.b<T> a(jm<T> $$0, jb.a $$1, akj<? extends jw<? extends T>> $$2, jl.a $$3, jl.a $$4, MutableObject<jl.a> $$5) {
      jb<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<akj<T>, jj.c<T>> $$7 = new HashMap<>();
         jl.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            akj<T> $$6x = $$5x.h();
            jz.f<T> $$7x = new jz.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jl.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jl.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            akj<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jz.f<T> $$7x = new jz.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jl.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jz.g a(jx $$0, jl.a $$1, jb.a $$2) {
      jz.b $$3 = this.b($$0);
      Map<akj<? extends jw<?>>, jz.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<akj<? extends jw<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jz.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jl.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jl.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jl.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jz.g($$8, $$7);
   }

   static record b(jz.m a, jz.l b, Map<akk, jk<?>> c, Map<akj<?>, jz.h<?>> d, List<RuntimeException> e) {

      public static jz.b a(jx $$0, Stream<akj<? extends jw<?>>> $$1) {
         jz.m $$2 = new jz.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jz.l $$4 = new jz.l($$2);
         Builder<akk, jk<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jz.a($$1x.b().q())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jz.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qm<T> a() {
         return new qm<T>() {
            @Override
            public jj.c<T> a(akj<T> $$0, T $$1, Lifecycle $$2) {
               jz.h<?> $$3 = b.this.d.put($$0, new jz.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jk<S> a(akj<? extends jw<? extends S>> $$0) {
               return (jk<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (akj<Object> $$0 : this.b.a.keySet()) {
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

      public jz.m e() {
         return this.a;
      }

      public jz.l f() {
         return this.b;
      }

      public Map<akk, jk<?>> g() {
         return this.c;
      }

      public Map<akj<?>, jz.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jk<T> {
      protected final jm<T> d;

      protected c(jm<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jn.c<T>> a(awk<T> $$0) {
         return Optional.of(jn.a(this.d, $$0));
      }
   }

   static class d<T> extends jz.e<T> implements jl.b.a<T> {
      private final jl.b<T> a;

      d(jm<T> $$0, jl.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jl.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jz.c<T> implements jl.b<T> {
      protected e(jm<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jn.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jj.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jm<T> $$0, @Nullable akj<T> $$1) {
         super(jj.c.a.a, $$0, $$1, null);
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

   public static record g(jl.a a, jl.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qm<T> var1);
   }

   static record j<T>(akj<? extends jw<? extends T>> a, Lifecycle b, Map<akj<T>, jz.n<T>> c) {

      public jl.b<T> a(jz.m $$0) {
         Map<akj<T>, jj.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jz.n<T> $$2 = (jz.n<T>)$$1x.getValue();
            jj.c<T> $$3 = $$2.b().orElseGet(() -> jj.c.a($$0.a(), (akj<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jz.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(akj<? extends jw<T>> a, Lifecycle b, jz.i<T> c) {
      void b(jz.b $$0) {
         this.c.run($$0.a());
      }

      public jz.j<T> a(jz.b $$0) {
         Map<akj<T>, jz.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<akj<?>, jz.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<akj<?>, jz.h<?>> $$3 = $$2.next();
            akj<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jz.h<T> $$6 = (jz.h<T>)$$3.getValue();
               jj.c<T> $$7 = (jj.c<T>)$$0.b.a.remove($$4);
               $$1.put((akj<T>)$$4, new jz.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jz.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jz.c<Object> {
      final Map<akj<Object>, jj.c<Object>> a = new HashMap<>();

      public l(jm<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jj.c<Object>> a(akj<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jj.c<T> c(akj<T> $$0) {
         return (jj.c<T>)this.a.computeIfAbsent($$0, $$0x -> jj.c.a(this.d, $$0x));
      }
   }

   static class m implements jm<Object> {
      public <T> jm<T> a() {
         return this;
      }
   }

   static record n<T>(jz.h<T> a, Optional<jj.c<T>> b) {
   }
}
