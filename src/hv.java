import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hv {
   private final List<hv.g<?>> a = new ArrayList<>();

   static <T> hg<T> a(final hh.c<T> $$0) {
      return new hv.c<T>($$0) {
         @Override
         public Optional<hf.c<T>> a(aeo<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   public <T> hv a(aeo<? extends hs<T>> $$0, Lifecycle $$1, hv.e<T> $$2) {
      this.a.add(new hv.g<>($$0, $$1, $$2));
      return this;
   }

   public <T> hv a(aeo<? extends hs<T>> $$0, hv.e<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private hv.a b(ht $$0) {
      hv.a $$1 = hv.a.a($$0, this.a.stream().map(hv.g::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   public hh.b a(ht $$0) {
      hv.a $$1 = this.b($$0);
      Stream<hh.c<?>> $$2 = $$0.b().map($$0x -> $$0x.b().p());
      Stream<hh.c<?>> $$3 = this.a.stream().map($$1x -> $$1x.a($$1).a());
      hh.b $$4 = hh.b.a(Stream.concat($$2, $$3.peek($$1::a)));
      $$1.b();
      $$1.c();
      return $$4;
   }

   public hh.b a(ht $$0, hh.b $$1) {
      hv.a $$2 = this.b($$0);
      Map<aeo<? extends hs<?>>, hv.f<?>> $$3 = new HashMap<>();
      $$2.d().forEach($$1x -> $$3.put($$1x.a, $$1x));
      this.a.stream().map($$1x -> $$1x.a($$2)).forEach($$1x -> $$3.put($$1x.a, $$1x));
      Stream<hh.c<?>> $$4 = $$0.b().map($$0x -> $$0x.b().p());
      hh.b $$5 = hh.b.a(Stream.concat($$4, $$3.values().stream().map(hv.f::a).peek($$2::a)));
      $$2.a($$1);
      $$2.b();
      $$2.c();
      return $$5;
   }

   static record a(hv.b a, hv.h b, Map<aep, hg<?>> c, Map<aeo<?>, hv.d<?>> d, List<RuntimeException> e) {

      public static hv.a a(ht $$0, Stream<aeo<? extends hs<?>>> $$1) {
         hv.b $$2 = new hv.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         hv.h $$4 = new hv.h($$2);
         Builder<aep, hg<?>> $$5 = ImmutableMap.builder();
         $$0.b().forEach($$1x -> $$5.put($$1x.a().a(), hv.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new hv.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> nn<T> a() {
         return new nn<T>() {
            @Override
            public hf.c<T> a(aeo<T> $$0, T $$1, Lifecycle $$2) {
               hv.d<?> $$3 = a.this.d.put($$0, new hv.d($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> hg<S> a(aeo<? extends hs<? extends S>> $$0) {
               return (hg<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         for (aeo<Object> $$0 : this.b.a.keySet()) {
            this.e.add(new IllegalStateException("Unreferenced key: " + $$0));
         }

         this.d.forEach(($$0x, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0x)));
      }

      public void c() {
         if (!this.e.isEmpty()) {
            IllegalStateException $$0 = new IllegalStateException("Errors during registry creation");

            for (RuntimeException $$1 : this.e) {
               $$0.addSuppressed($$1);
            }

            throw $$0;
         }
      }

      public void a(hi<?> $$0) {
         this.a.b($$0);
      }

      public void a(hh.b $$0) {
         Map<aep, Optional<? extends hh<Object>>> $$1 = new HashMap<>();
         Iterator<Entry<aeo<Object>, hf.c<Object>>> $$2 = this.b.a.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aeo<Object>, hf.c<Object>> $$3 = $$2.next();
            aeo<Object> $$4 = $$3.getKey();
            hf.c<Object> $$5 = $$3.getValue();
            $$1.computeIfAbsent($$4.b(), $$1x -> $$0.a(aeo.a($$1x))).flatMap($$1x -> $$1x.a($$4)).ifPresent($$2x -> {
               $$5.b($$2x.a());
               $$2.remove();
            });
         }
      }

      public Stream<hv.f<?>> d() {
         return this.b.a.keySet().stream().map(aeo::b).distinct().map($$0 -> new hv.f(aeo.a($$0), Lifecycle.stable(), Map.of()));
      }

      public hv.b e() {
         return this.a;
      }

      public hv.h f() {
         return this.b;
      }

      public Map<aep, hg<?>> g() {
         return this.c;
      }

      public Map<aeo<?>, hv.d<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements hi<Object> {
      private final Set<hi<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(hi<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(hi<?> $$0) {
         this.a.add($$0);
      }
   }

   abstract static class c<T> implements hg<T> {
      protected final hi<T> b;

      protected c(hi<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<hj.c<T>> a(apy<T> $$0) {
         return Optional.of(hj.a(this.b, $$0));
      }
   }

   static record d<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface e<T> {
      void run(nn<T> var1);
   }

   static record f<T>(aeo<? extends hs<? extends T>> a, Lifecycle b, Map<aeo<T>, hv.i<T>> c) {

      public hh.c<T> a() {
         return new hh.c<T>() {
            private final Map<aeo<T>, hf.c<T>> b = f.this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$0x -> {
               hv.i<T> $$1 = (hv.i<T>)$$0x.getValue();
               hf.c<T> $$2 = $$1.b().orElseGet(() -> hf.c.a(this, (aeo<T>)$$0x.getKey()));
               $$2.b($$1.a().a());
               return $$2;
            }));

            @Override
            public aeo<? extends hs<? extends T>> f() {
               return f.this.a;
            }

            @Override
            public Lifecycle g() {
               return f.this.b;
            }

            @Override
            public Optional<hf.c<T>> a(aeo<T> $$0) {
               return Optional.ofNullable(this.b.get($$0));
            }

            @Override
            public Stream<hf.c<T>> b() {
               return this.b.values().stream();
            }

            @Override
            public Optional<hj.c<T>> a(apy<T> $$0) {
               return Optional.empty();
            }

            @Override
            public Stream<hj.c<T>> d() {
               return Stream.empty();
            }
         };
      }

      public aeo<? extends hs<? extends T>> b() {
         return this.a;
      }

      public Lifecycle c() {
         return this.b;
      }

      public Map<aeo<T>, hv.i<T>> d() {
         return this.c;
      }
   }

   static record g<T>(aeo<? extends hs<T>> a, Lifecycle b, hv.e<T> c) {
      void b(hv.a $$0) {
         this.c.run($$0.a());
      }

      public hv.f<T> a(hv.a $$0) {
         Map<aeo<T>, hv.i<T>> $$1 = new HashMap<>();
         Iterator<Entry<aeo<?>, hv.d<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aeo<?>, hv.d<?>> $$3 = $$2.next();
            aeo<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               hv.d<T> $$6 = (hv.d<T>)$$3.getValue();
               hf.c<T> $$7 = (hf.c<T>)$$0.b.a.remove($$4);
               $$1.put((aeo<T>)$$4, new hv.i<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new hv.f<>(this.a, this.b, $$1);
      }
   }

   static class h extends hv.c<Object> {
      final Map<aeo<Object>, hf.c<Object>> a = new HashMap<>();

      public h(hi<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<hf.c<Object>> a(aeo<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> hf.c<T> c(aeo<T> $$0) {
         return (hf.c<T>)this.a.computeIfAbsent($$0, $$0x -> hf.c.a(this.b, $$0x));
      }
   }

   static record i<T>(hv.d<T> a, Optional<hf.c<T>> b) {
   }
}
