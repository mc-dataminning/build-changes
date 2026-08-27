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

public class iv {
   private final List<iv.g<?>> a = new ArrayList<>();

   static <T> ih<T> a(final ii.c<T> $$0) {
      return new iv.c<T>($$0) {
         @Override
         public Optional<ig.c<T>> a(agl<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   public <T> iv a(agl<? extends is<T>> $$0, Lifecycle $$1, iv.e<T> $$2) {
      this.a.add(new iv.g<>($$0, $$1, $$2));
      return this;
   }

   public <T> iv a(agl<? extends is<T>> $$0, iv.e<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private iv.a b(it $$0) {
      iv.a $$1 = iv.a.a($$0, this.a.stream().map(iv.g::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   public ii.b a(it $$0) {
      iv.a $$1 = this.b($$0);
      Stream<ii.c<?>> $$2 = $$0.b().map($$0x -> $$0x.b().p());
      Stream<ii.c<?>> $$3 = this.a.stream().map($$1x -> $$1x.a($$1).a());
      ii.b $$4 = ii.b.a(Stream.concat($$2, $$3.peek($$1::a)));
      $$1.b();
      $$1.c();
      return $$4;
   }

   public ii.b a(it $$0, ii.b $$1) {
      iv.a $$2 = this.b($$0);
      Map<agl<? extends is<?>>, iv.f<?>> $$3 = new HashMap<>();
      $$2.d().forEach($$1x -> $$3.put($$1x.a, $$1x));
      this.a.stream().map($$1x -> $$1x.a($$2)).forEach($$1x -> $$3.put($$1x.a, $$1x));
      Stream<ii.c<?>> $$4 = $$0.b().map($$0x -> $$0x.b().p());
      ii.b $$5 = ii.b.a(Stream.concat($$4, $$3.values().stream().map(iv.f::a).peek($$2::a)));
      $$2.a($$1);
      $$2.b();
      $$2.c();
      return $$5;
   }

   static record a(iv.b a, iv.h b, Map<agm, ih<?>> c, Map<agl<?>, iv.d<?>> d, List<RuntimeException> e) {

      public static iv.a a(it $$0, Stream<agl<? extends is<?>>> $$1) {
         iv.b $$2 = new iv.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         iv.h $$4 = new iv.h($$2);
         Builder<agm, ih<?>> $$5 = ImmutableMap.builder();
         $$0.b().forEach($$1x -> $$5.put($$1x.a().a(), iv.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new iv.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> oz<T> a() {
         return new oz<T>() {
            @Override
            public ig.c<T> a(agl<T> $$0, T $$1, Lifecycle $$2) {
               iv.d<?> $$3 = a.this.d.put($$0, new iv.d($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> ih<S> a(agl<? extends is<? extends S>> $$0) {
               return (ih<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         for (agl<Object> $$0 : this.b.a.keySet()) {
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

      public void a(ij<?> $$0) {
         this.a.b($$0);
      }

      public void a(ii.b $$0) {
         Map<agm, Optional<? extends ii<Object>>> $$1 = new HashMap<>();
         Iterator<Entry<agl<Object>, ig.c<Object>>> $$2 = this.b.a.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<agl<Object>, ig.c<Object>> $$3 = $$2.next();
            agl<Object> $$4 = $$3.getKey();
            ig.c<Object> $$5 = $$3.getValue();
            $$1.computeIfAbsent($$4.b(), $$1x -> $$0.a(agl.a($$1x))).flatMap($$1x -> $$1x.a($$4)).ifPresent($$2x -> {
               $$5.b($$2x.a());
               $$2.remove();
            });
         }
      }

      public Stream<iv.f<?>> d() {
         return this.b.a.keySet().stream().map(agl::b).distinct().map($$0 -> new iv.f(agl.a($$0), Lifecycle.stable(), Map.of()));
      }

      public iv.b e() {
         return this.a;
      }

      public iv.h f() {
         return this.b;
      }

      public Map<agm, ih<?>> g() {
         return this.c;
      }

      public Map<agl<?>, iv.d<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements ij<Object> {
      private final Set<ij<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(ij<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(ij<?> $$0) {
         this.a.add($$0);
      }
   }

   abstract static class c<T> implements ih<T> {
      protected final ij<T> b;

      protected c(ij<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<ik.c<T>> a(arz<T> $$0) {
         return Optional.of(ik.a(this.b, $$0));
      }
   }

   static record d<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface e<T> {
      void run(oz<T> var1);
   }

   static record f<T>(agl<? extends is<? extends T>> a, Lifecycle b, Map<agl<T>, iv.i<T>> c) {

      public ii.c<T> a() {
         return new ii.c<T>() {
            private final Map<agl<T>, ig.c<T>> b = f.this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$0x -> {
               iv.i<T> $$1 = (iv.i<T>)$$0x.getValue();
               ig.c<T> $$2 = $$1.b().orElseGet(() -> ig.c.a(this, (agl<T>)$$0x.getKey()));
               $$2.b($$1.a().a());
               return $$2;
            }));

            @Override
            public agl<? extends is<? extends T>> f() {
               return f.this.a;
            }

            @Override
            public Lifecycle g() {
               return f.this.b;
            }

            @Override
            public Optional<ig.c<T>> a(agl<T> $$0) {
               return Optional.ofNullable(this.b.get($$0));
            }

            @Override
            public Stream<ig.c<T>> b() {
               return this.b.values().stream();
            }

            @Override
            public Optional<ik.c<T>> a(arz<T> $$0) {
               return Optional.empty();
            }

            @Override
            public Stream<ik.c<T>> d() {
               return Stream.empty();
            }
         };
      }

      public agl<? extends is<? extends T>> b() {
         return this.a;
      }

      public Lifecycle c() {
         return this.b;
      }

      public Map<agl<T>, iv.i<T>> d() {
         return this.c;
      }
   }

   static record g<T>(agl<? extends is<T>> a, Lifecycle b, iv.e<T> c) {
      void b(iv.a $$0) {
         this.c.run($$0.a());
      }

      public iv.f<T> a(iv.a $$0) {
         Map<agl<T>, iv.i<T>> $$1 = new HashMap<>();
         Iterator<Entry<agl<?>, iv.d<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<agl<?>, iv.d<?>> $$3 = $$2.next();
            agl<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               iv.d<T> $$6 = (iv.d<T>)$$3.getValue();
               ig.c<T> $$7 = (ig.c<T>)$$0.b.a.remove($$4);
               $$1.put((agl<T>)$$4, new iv.i<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new iv.f<>(this.a, this.b, $$1);
      }
   }

   static class h extends iv.c<Object> {
      final Map<agl<Object>, ig.c<Object>> a = new HashMap<>();

      public h(ij<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ig.c<Object>> a(agl<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ig.c<T> c(agl<T> $$0) {
         return (ig.c<T>)this.a.computeIfAbsent($$0, $$0x -> ig.c.a(this.b, $$0x));
      }
   }

   static record i<T>(iv.d<T> a, Optional<ig.c<T>> b) {
   }
}
