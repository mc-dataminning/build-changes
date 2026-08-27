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

public class ir {
   private final List<ir.g<?>> a = new ArrayList<>();

   static <T> ic<T> a(final id.c<T> $$0) {
      return new ir.c<T>($$0) {
         @Override
         public Optional<ib.c<T>> a(agf<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   public <T> ir a(agf<? extends io<T>> $$0, Lifecycle $$1, ir.e<T> $$2) {
      this.a.add(new ir.g<>($$0, $$1, $$2));
      return this;
   }

   public <T> ir a(agf<? extends io<T>> $$0, ir.e<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private ir.a b(ip $$0) {
      ir.a $$1 = ir.a.a($$0, this.a.stream().map(ir.g::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   public id.b a(ip $$0) {
      ir.a $$1 = this.b($$0);
      Stream<id.c<?>> $$2 = $$0.b().map($$0x -> $$0x.b().p());
      Stream<id.c<?>> $$3 = this.a.stream().map($$1x -> $$1x.a($$1).a());
      id.b $$4 = id.b.a(Stream.concat($$2, $$3.peek($$1::a)));
      $$1.b();
      $$1.c();
      return $$4;
   }

   public id.b a(ip $$0, id.b $$1) {
      ir.a $$2 = this.b($$0);
      Map<agf<? extends io<?>>, ir.f<?>> $$3 = new HashMap<>();
      $$2.d().forEach($$1x -> $$3.put($$1x.a, $$1x));
      this.a.stream().map($$1x -> $$1x.a($$2)).forEach($$1x -> $$3.put($$1x.a, $$1x));
      Stream<id.c<?>> $$4 = $$0.b().map($$0x -> $$0x.b().p());
      id.b $$5 = id.b.a(Stream.concat($$4, $$3.values().stream().map(ir.f::a).peek($$2::a)));
      $$2.a($$1);
      $$2.b();
      $$2.c();
      return $$5;
   }

   static record a(ir.b a, ir.h b, Map<agg, ic<?>> c, Map<agf<?>, ir.d<?>> d, List<RuntimeException> e) {

      public static ir.a a(ip $$0, Stream<agf<? extends io<?>>> $$1) {
         ir.b $$2 = new ir.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         ir.h $$4 = new ir.h($$2);
         Builder<agg, ic<?>> $$5 = ImmutableMap.builder();
         $$0.b().forEach($$1x -> $$5.put($$1x.a().a(), ir.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new ir.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> ou<T> a() {
         return new ou<T>() {
            @Override
            public ib.c<T> a(agf<T> $$0, T $$1, Lifecycle $$2) {
               ir.d<?> $$3 = a.this.d.put($$0, new ir.d($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> ic<S> a(agf<? extends io<? extends S>> $$0) {
               return (ic<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         for (agf<Object> $$0 : this.b.a.keySet()) {
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

      public void a(ie<?> $$0) {
         this.a.b($$0);
      }

      public void a(id.b $$0) {
         Map<agg, Optional<? extends id<Object>>> $$1 = new HashMap<>();
         Iterator<Entry<agf<Object>, ib.c<Object>>> $$2 = this.b.a.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<agf<Object>, ib.c<Object>> $$3 = $$2.next();
            agf<Object> $$4 = $$3.getKey();
            ib.c<Object> $$5 = $$3.getValue();
            $$1.computeIfAbsent($$4.b(), $$1x -> $$0.a(agf.a($$1x))).flatMap($$1x -> $$1x.a($$4)).ifPresent($$2x -> {
               $$5.b($$2x.a());
               $$2.remove();
            });
         }
      }

      public Stream<ir.f<?>> d() {
         return this.b.a.keySet().stream().map(agf::b).distinct().map($$0 -> new ir.f(agf.a($$0), Lifecycle.stable(), Map.of()));
      }

      public ir.b e() {
         return this.a;
      }

      public ir.h f() {
         return this.b;
      }

      public Map<agg, ic<?>> g() {
         return this.c;
      }

      public Map<agf<?>, ir.d<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements ie<Object> {
      private final Set<ie<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(ie<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(ie<?> $$0) {
         this.a.add($$0);
      }
   }

   abstract static class c<T> implements ic<T> {
      protected final ie<T> b;

      protected c(ie<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<ig.c<T>> a(arr<T> $$0) {
         return Optional.of(ig.a(this.b, $$0));
      }
   }

   static record d<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface e<T> {
      void run(ou<T> var1);
   }

   static record f<T>(agf<? extends io<? extends T>> a, Lifecycle b, Map<agf<T>, ir.i<T>> c) {

      public id.c<T> a() {
         return new id.c<T>() {
            private final Map<agf<T>, ib.c<T>> b = f.this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$0x -> {
               ir.i<T> $$1 = (ir.i<T>)$$0x.getValue();
               ib.c<T> $$2 = $$1.b().orElseGet(() -> ib.c.a(this, (agf<T>)$$0x.getKey()));
               $$2.b($$1.a().a());
               return $$2;
            }));

            @Override
            public agf<? extends io<? extends T>> f() {
               return f.this.a;
            }

            @Override
            public Lifecycle g() {
               return f.this.b;
            }

            @Override
            public Optional<ib.c<T>> a(agf<T> $$0) {
               return Optional.ofNullable(this.b.get($$0));
            }

            @Override
            public Stream<ib.c<T>> b() {
               return this.b.values().stream();
            }

            @Override
            public Optional<ig.c<T>> a(arr<T> $$0) {
               return Optional.empty();
            }

            @Override
            public Stream<ig.c<T>> d() {
               return Stream.empty();
            }
         };
      }

      public agf<? extends io<? extends T>> b() {
         return this.a;
      }

      public Lifecycle c() {
         return this.b;
      }

      public Map<agf<T>, ir.i<T>> d() {
         return this.c;
      }
   }

   static record g<T>(agf<? extends io<T>> a, Lifecycle b, ir.e<T> c) {
      void b(ir.a $$0) {
         this.c.run($$0.a());
      }

      public ir.f<T> a(ir.a $$0) {
         Map<agf<T>, ir.i<T>> $$1 = new HashMap<>();
         Iterator<Entry<agf<?>, ir.d<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<agf<?>, ir.d<?>> $$3 = $$2.next();
            agf<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               ir.d<T> $$6 = (ir.d<T>)$$3.getValue();
               ib.c<T> $$7 = (ib.c<T>)$$0.b.a.remove($$4);
               $$1.put((agf<T>)$$4, new ir.i<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new ir.f<>(this.a, this.b, $$1);
      }
   }

   static class h extends ir.c<Object> {
      final Map<agf<Object>, ib.c<Object>> a = new HashMap<>();

      public h(ie<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ib.c<Object>> a(agf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ib.c<T> c(agf<T> $$0) {
         return (ib.c<T>)this.a.computeIfAbsent($$0, $$0x -> ib.c.a(this.b, $$0x));
      }
   }

   static record i<T>(ir.d<T> a, Optional<ib.c<T>> b) {
   }
}
