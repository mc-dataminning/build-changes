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

public class jq {
   private final List<jq.k<?>> a = new ArrayList<>();

   static <T> jb<T> a(final jc.b<T> $$0) {
      return new jq.c<T>($$0) {
         @Override
         public Optional<ja.c<T>> a(aks<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jc.b<T> a(final aks<? extends jn<? extends T>> $$0, final Lifecycle $$1, jd<T> $$2, final Map<aks<T>, ja.c<T>> $$3) {
      return new jq.e<T>($$2) {
         @Override
         public aks<? extends jn<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ja.c<T>> a(aks<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<ja.c<T>> b() {
            return $$3.values().stream();
         }
      };
   }

   public <T> jq a(aks<? extends jn<T>> $$0, Lifecycle $$1, jq.i<T> $$2) {
      this.a.add(new jq.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> jq a(aks<? extends jn<T>> $$0, jq.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private jq.b b(jo $$0) {
      jq.b $$1 = jq.b.a($$0, this.a.stream().map(jq.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jc.a a(jq.m $$0, jo $$1, Stream<jc.b<?>> $$2) {
      record a<T>(jc.b<T> a, akr.a<T> b) {
         public static <T> a<T> a(jc.b<T> $$0) {
            return new a<>(new jq.d<>($$0, $$0), akr.a.a($$0));
         }

         public static <T> a<T> a(jq.m $$0, jc.b<T> $$1) {
            return new a<>(new jq.d<>($$0.a(), $$1), new akr.a<>($$0.a(), $$1, $$1.g()));
         }
      }

      final Map<aks<? extends jn<?>>, a<?>> $$3 = new HashMap<>();
      $$1.c().forEach($$1x -> $$3.put($$1x.a(), jq$a.a($$1x.b().p())));
      $$2.forEach($$2x -> $$3.put($$2x.f(), jq$a.a($$0, $$2x)));
      return new jc.a() {
         @Override
         public Stream<aks<? extends jn<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> c(aks<? extends jn<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0) {
            return this.c($$0).map(a::a);
         }

         @Override
         public <V> akr<V> a(DynamicOps<V> $$0) {
            return akr.a($$0, new akr.b() {
               @Override
               public <T> Optional<akr.a<T>> a(aks<? extends jn<? extends T>> $$0) {
                  return c($$0).map(a::b);
               }
            });
         }
      };
   }

   public jc.a a(jo $$0) {
      jq.b $$1 = this.b($$0);
      Stream<jc.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jc.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jc.a a(jo $$0, jc.a $$1, is.a $$2, Map<aks<? extends jn<?>>, jq.j<?>> $$3, jc.a $$4) {
      jq.m $$5 = new jq.m();
      MutableObject<jc.a> $$6 = new MutableObject();
      List<jc.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jc.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jc.b<T> a(jd<T> $$0, is.a $$1, aks<? extends jn<? extends T>> $$2, jc.a $$3, jc.a $$4, MutableObject<jc.a> $$5) {
      is<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<aks<T>, ja.c<T>> $$7 = new HashMap<>();
         jc.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            aks<T> $$6x = $$5x.h();
            jq.f<T> $$7x = new jq.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jc.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jc.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            aks<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               jq.f<T> $$7x = new jq.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jc.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public jq.g a(jo $$0, jc.a $$1, is.a $$2) {
      jq.b $$3 = this.b($$0);
      Map<aks<? extends jn<?>>, jq.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<aks<? extends jn<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new jq.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jc.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jc.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jc.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new jq.g($$8, $$7);
   }

   static record b(jq.m a, jq.l b, Map<akt, jb<?>> c, Map<aks<?>, jq.h<?>> d, List<RuntimeException> e) {

      public static jq.b a(jo $$0, Stream<aks<? extends jn<?>>> $$1) {
         jq.m $$2 = new jq.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         jq.l $$4 = new jq.l($$2);
         Builder<akt, jb<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), jq.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new jq.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qq<T> a() {
         return new qq<T>() {
            @Override
            public ja.c<T> a(aks<T> $$0, T $$1, Lifecycle $$2) {
               jq.h<?> $$3 = b.this.d.put($$0, new jq.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jb<S> a(aks<? extends jn<? extends S>> $$0) {
               return (jb<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (aks<Object> $$0 : this.b.a.keySet()) {
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

      public jq.m e() {
         return this.a;
      }

      public jq.l f() {
         return this.b;
      }

      public Map<akt, jb<?>> g() {
         return this.c;
      }

      public Map<aks<?>, jq.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jb<T> {
      protected final jd<T> d;

      protected c(jd<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<je.c<T>> a(awt<T> $$0) {
         return Optional.of(je.a(this.d, $$0));
      }
   }

   static class d<T> extends jq.e<T> implements jc.b.a<T> {
      private final jc.b<T> a;

      d(jd<T> $$0, jc.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jc.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends jq.c<T> implements jc.b<T> {
      protected e(jd<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<je.c<T>> d() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends ja.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jd<T> $$0, @Nullable aks<T> $$1) {
         super(ja.c.a.a, $$0, $$1, null);
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

   public static record g(jc.a a, jc.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qq<T> var1);
   }

   static record j<T>(aks<? extends jn<? extends T>> a, Lifecycle b, Map<aks<T>, jq.n<T>> c) {

      public jc.b<T> a(jq.m $$0) {
         Map<aks<T>, ja.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            jq.n<T> $$2 = (jq.n<T>)$$1x.getValue();
            ja.c<T> $$3 = $$2.b().orElseGet(() -> ja.c.a($$0.a(), (aks<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return jq.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(aks<? extends jn<T>> a, Lifecycle b, jq.i<T> c) {
      void b(jq.b $$0) {
         this.c.run($$0.a());
      }

      public jq.j<T> a(jq.b $$0) {
         Map<aks<T>, jq.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<aks<?>, jq.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aks<?>, jq.h<?>> $$3 = $$2.next();
            aks<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               jq.h<T> $$6 = (jq.h<T>)$$3.getValue();
               ja.c<T> $$7 = (ja.c<T>)$$0.b.a.remove($$4);
               $$1.put((aks<T>)$$4, new jq.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new jq.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends jq.c<Object> {
      final Map<aks<Object>, ja.c<Object>> a = new HashMap<>();

      public l(jd<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ja.c<Object>> a(aks<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ja.c<T> c(aks<T> $$0) {
         return (ja.c<T>)this.a.computeIfAbsent($$0, $$0x -> ja.c.a(this.d, $$0x));
      }
   }

   static class m implements jd<Object> {
      public <T> jd<T> a() {
         return this;
      }
   }

   static record n<T>(jq.h<T> a, Optional<ja.c<T>> b) {
   }
}
