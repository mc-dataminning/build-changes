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

public class ke {
   private final List<ke.k<?>> a = new ArrayList<>();

   static <T> jp<T> a(final jq.b<T> $$0) {
      return new ke.c<T>($$0) {
         @Override
         public Optional<jo.c<T>> a(ald<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jq.b<T> a(final ald<? extends kb<? extends T>> $$0, final Lifecycle $$1, jr<T> $$2, final Map<ald<T>, jo.c<T>> $$3) {
      return new ke.e<T>($$2) {
         @Override
         public ald<? extends kb<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jo.c<T>> a(ald<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jo.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> ke a(ald<? extends kb<T>> $$0, Lifecycle $$1, ke.i<T> $$2) {
      this.a.add(new ke.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> ke a(ald<? extends kb<T>> $$0, ke.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private ke.b b(kc $$0) {
      ke.b $$1 = ke.b.a($$0, this.a.stream().map(ke.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jq.a a(ke.m $$0, kc $$1, Stream<jq.b<?>> $$2) {
      record a<T>(jq.b<T> a, alc.b<T> b) {
         public static <T> a<T> a(jq.b<T> $$0) {
            return new a<>(new ke.d<>($$0, $$0), alc.b.a($$0));
         }

         public static <T> a<T> a(ke.m $$0, jq.b<T> $$1) {
            return new a<>(new ke.d<>($$0.a(), $$1), new alc.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<ald<? extends kb<?>>, a<?>> $$3 = new HashMap<>();
      $$1.d().forEach($$1x -> $$3.put($$1x.a(), ke$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), ke$a.a($$0, $$2x)));
      return new jq.a() {
         @Override
         public Stream<ald<? extends kb<?>>> a() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> e(ald<? extends kb<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jq.b<T>> a(ald<? extends kb<? extends T>> $$0) {
            return this.e($$0).map(a::a);
         }

         @Override
         public <V> alc<V> a(DynamicOps<V> $$0) {
            return alc.a($$0, new alc.c() {
               @Override
               public <T> Optional<alc.b<T>> a(ald<? extends kb<? extends T>> $$0) {
                  return e($$0).map(a::b);
               }
            });
         }
      };
   }

   public jq.a a(kc $$0) {
      ke.b $$1 = this.b($$0);
      Stream<jq.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jq.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jq.a a(kc $$0, jq.a $$1, jg.a $$2, Map<ald<? extends kb<?>>, ke.j<?>> $$3, jq.a $$4) {
      ke.m $$5 = new ke.m();
      MutableObject<jq.a> $$6 = new MutableObject();
      List<jq.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jq.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jq.b<T> a(jr<T> $$0, jg.a $$1, ald<? extends kb<? extends T>> $$2, jq.a $$3, jq.a $$4, MutableObject<jq.a> $$5) {
      jg<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ald<T>, jo.c<T>> $$7 = new HashMap<>();
         jq.b<T> $$8 = $$3.d($$2);
         $$8.c().forEach($$5x -> {
            ald<T> $$6x = $$5x.h();
            ke.f<T> $$7x = new ke.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jq.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jq.b<T> $$9 = $$4.d($$2);
         $$9.c().forEach($$5x -> {
            ald<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               ke.f<T> $$7x = new ke.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jq.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public ke.g a(kc $$0, jq.a $$1, jg.a $$2) {
      ke.b $$3 = this.b($$0);
      Map<ald<? extends kb<?>>, ke.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ald<? extends kb<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new ke.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jq.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jq.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jq.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new ke.g($$8, $$7);
   }

   static record b(ke.m a, ke.l b, Map<ale, jp<?>> c, Map<ald<?>, ke.h<?>> d, List<RuntimeException> e) {

      public static ke.b a(kc $$0, Stream<ald<? extends kb<?>>> $$1) {
         ke.m $$2 = new ke.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         ke.l $$4 = new ke.l($$2);
         Builder<ale, jp<?>> $$5 = ImmutableMap.builder();
         $$0.d().forEach($$1x -> $$5.put($$1x.a().a(), ke.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new ke.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qu<T> a() {
         return new qu<T>() {
            @Override
            public jo.c<T> a(ald<T> $$0, T $$1, Lifecycle $$2) {
               ke.h<?> $$3 = b.this.d.put($$0, new ke.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jp<S> a(ald<? extends kb<? extends S>> $$0) {
               return (jp<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ald<Object> $$0 : this.b.a.keySet()) {
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

      public ke.m e() {
         return this.a;
      }

      public ke.l f() {
         return this.b;
      }

      public Map<ale, jp<?>> g() {
         return this.c;
      }

      public Map<ald<?>, ke.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jp<T> {
      protected final jr<T> d;

      protected c(jr<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<js.c<T>> a(axl<T> $$0) {
         return Optional.of(js.a(this.d, $$0));
      }
   }

   static class d<T> extends ke.e<T> implements jq.b.a<T> {
      private final jq.b<T> a;

      d(jr<T> $$0, jq.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jq.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends ke.c<T> implements jq.b<T> {
      protected e(jr<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<js.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jo.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jr<T> $$0, @Nullable ald<T> $$1) {
         super(jo.c.a.a, $$0, $$1, null);
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

   public static record g(jq.a a, jq.a b) {
   }

   static record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qu<T> var1);
   }

   static record j<T>(ald<? extends kb<? extends T>> a, Lifecycle b, Map<ald<T>, ke.n<T>> c) {

      public jq.b<T> a(ke.m $$0) {
         Map<ald<T>, jo.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            ke.n<T> $$2 = (ke.n<T>)$$1x.getValue();
            jo.c<T> $$3 = $$2.b().orElseGet(() -> jo.c.a($$0.a(), (ald<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return ke.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   static record k<T>(ald<? extends kb<T>> a, Lifecycle b, ke.i<T> c) {
      void b(ke.b $$0) {
         this.c.run($$0.a());
      }

      public ke.j<T> a(ke.b $$0) {
         Map<ald<T>, ke.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<ald<?>, ke.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ald<?>, ke.h<?>> $$3 = $$2.next();
            ald<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               ke.h<T> $$6 = (ke.h<T>)$$3.getValue();
               jo.c<T> $$7 = (jo.c<T>)$$0.b.a.remove($$4);
               $$1.put((ald<T>)$$4, new ke.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new ke.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends ke.c<Object> {
      final Map<ald<Object>, jo.c<Object>> a = new HashMap<>();

      public l(jr<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jo.c<Object>> a(ald<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jo.c<T> c(ald<T> $$0) {
         return (jo.c<T>)this.a.computeIfAbsent($$0, $$0x -> jo.c.a(this.d, $$0x));
      }
   }

   static class m implements jr<Object> {
      public <T> jr<T> a() {
         return this;
      }
   }

   static record n<T>(ke.h<T> a, Optional<jo.c<T>> b) {
   }
}
