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

public class jn {
   private final List<jn.k<?>> a = new ArrayList<>();

   static <T> iy<T> a(final iz.b<T> $$0) {
      return new jn.c<T>($$0) {
         @Override
         public Optional<ix.c<T>> a(akm<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> iz.b<T> a(final akm<? extends jk<? extends T>> $$0, final Lifecycle $$1, ja<T> $$2, final Map<akm<T>, ix.c<T>> $$3) {
      return new jn.e<T>($$2) {
         @Override
         public akm<? extends jk<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ix.c<T>> a(akm<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<ix.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jn a(akm<? extends jk<T>> $$0, Lifecycle $$1, jn.i<T> $$2) {
      this.a.add(new jn.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jn a(akm<? extends jk<T>> $$0, jn.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jn.b b(jl $$0) {
      jn.b $$1 = jn.b.a($$0, this.a.stream().map(jn.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static iz.a a(jn.m $$0, jl $$1, Stream<iz.b<?>> $$2) {
      record a<T>(iz.b<T> a, akl.a<T> b) {
         public static <T> a<T> a(iz.b<T> $$0) {
            return new a<>(new jn.d<>($$0, $$0), akl.a.a($$0));
         }

         public static <T> a<T> a(jn.m $$0, iz.b<T> $$1) {
            return new a<>(new jn.d<>($$0.a(), $$1), new akl.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<akm<? extends jk<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jn$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jn$a.a($$0, $$2x)));
      return new iz.a() {
         @Override
         public Stream<akm<? extends jk<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(akm<? extends jk<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> akl<V> a(DynamicOps<V> $$0) {
            return akl.a($$0, new akl.b() {
               @Override
               public <T> Optional<akl.a<T>> a(akm<? extends jk<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public iz.a a(jl $$0) {
      jn.b $$1 = this.b($$0);
      Stream<iz.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      iz.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private iz.a a(jl $$0, iz.a $$1, ip.a $$2, Map<akm<? extends jk<?>>, jn.j<?>> $$3, iz.a $$4) {
      jn.m $$5 = new jn.m();
      MutableObject<iz.a> $$6 = new MutableObject();
      List<iz.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      iz.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> iz.b<T> a(ja<T> $$0, ip.a $$1, akm<? extends jk<? extends T>> $$2, iz.a $$3, iz.a $$4, MutableObject<iz.a> $$5) {
      ip<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<akm<T>, ix.c<T>> $$7 = new HashMap<>();
         iz.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            akm<T> $$6x = $$5x.h();
            jn.f<T> $$7x = new jn.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (iz.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         iz.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            akm<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jn.f<T> $$7x = new jn.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (iz.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jn.g a(jl $$0, iz.a $$1, ip.a $$2) {
      jn.b $$3 = this.b($$0);
      Map<akm<? extends jk<?>>, jn.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<akm<? extends jk<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jn.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<iz.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      iz.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      iz.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jn.g($$8, $$7);
   }

   static record b(jn.m a, jn.l b, Map<akn, iy<?>> c, Map<akm<?>, jn.h<?>> d, List<RuntimeException> e) {

      public static jn.b a(jl $$0, Stream<akm<? extends jk<?>>> $$1) {
         jn.m $$2 = new jn.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jn.l $$4 = new jn.l($$2);
         Builder<akn, iy<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jn.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jn.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qo<T> a() {
         return new qo<T>() {
            @Override
            public ix.c<T> a(akm<T> $$0, T $$1, Lifecycle $$2) {
               jn.h<?> $$3 = b.this.d.put($$0, new jn.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> iy<S> a(akm<? extends jk<? extends S>> $$0) {
               return (iy<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (akm<Object> $$0 : this.b.a.keySet()) {
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

      public jn.m e() {
         return this.a;
      }

      public jn.l f() {
         return this.b;
      }

      public Map<akn, iy<?>> g() {
         return this.c;
      }

      public Map<akm<?>, jn.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements iy<T> {
      protected final ja<T> d;

      protected c(ja<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jb.c<T>> a(awm<T> $$0) {
         return Optional.of(jb.a(this.d, $$0));
      }
   }

   static class d<T> extends jn.e<T> implements iz.b.a<T> {
      private final iz.b<T> a;

      d(ja<T> $$0, iz.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public iz.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jn.c<T> implements iz.b<T> {
      protected e(ja<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jb.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends ix.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(ja<T> $$0, @Nullable akm<T> $$1) {
         super(ix.c.a.a, $$0, $$1, null);
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

   public static record g(iz.a a, iz.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qo<T> var1);
   }

   static record j<T>(akm<? extends jk<? extends T>> a, Lifecycle b, Map<akm<T>, jn.n<T>> c) {

      public iz.b<T> a(jn.m $$0) {
         Map<akm<T>, ix.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jn.n<T> $$2 = (jn.n<T>)$$1x.getValue();
            ix.c<T> $$3 = $$2.b().orElseGet(() -> ix.c.a($$0.a(), (akm<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jn.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(akm<? extends jk<T>> a, Lifecycle b, jn.i<T> c) {
      void b(jn.b $$0) {
         this.c.run($$0.a());
      }

      public jn.j<T> a(jn.b $$0) {
         Map<akm<T>, jn.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<akm<?>, jn.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<akm<?>, jn.h<?>> $$3 = $$2.next();
            akm<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jn.h<T> $$6 = (jn.h<T>)$$3.getValue();
               ix.c<T> $$7 = (ix.c<T>)$$0.b.a.remove($$4);
               $$1.put((akm<T>)$$4, new jn.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jn.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jn.c<Object> {
      final Map<akm<Object>, ix.c<Object>> a = new HashMap<>();

      public l(ja<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ix.c<Object>> a(akm<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ix.c<T> c(akm<T> $$0) {
         return (ix.c<T>)this.a.computeIfAbsent($$0, $$0x -> ix.c.a(this.d, $$0x));
      }
   }

   static class m implements ja<Object> {
      public <T> ja<T> a() {
         return this;
      }
   }

   static record n<T>(jn.h<T> a, Optional<ix.c<T>> b) {
   }
}
