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

public class hu {
   private final List<hu.g<?>> a = new ArrayList<>();

   static <T> hf<T> a(final hg.c<T> $$0) {
      return new hu.c<T>($$0) {
         @Override
         public Optional<he.c<T>> a(acp<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   public <T> hu a(acp<? extends hr<T>> $$0, Lifecycle $$1, hu.e<T> $$2) {
      this.a.add(new hu.g<>($$0, $$1, $$2));
      return this;
   }

   public <T> hu a(acp<? extends hr<T>> $$0, hu.e<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private hu.a b(hs $$0) {
      hu.a $$1 = hu.a.a($$0, this.a.stream().map(hu.g::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   public hg.b a(hs $$0) {
      hu.a $$1 = this.b($$0);
      Stream<hg.c<?>> $$2 = $$0.b().map($$0x -> $$0x.b().p());
      Stream<hg.c<?>> $$3 = this.a.stream().map($$1x -> $$1x.a($$1).a());
      hg.b $$4 = hg.b.a(Stream.concat($$2, $$3.peek($$1::a)));
      $$1.b();
      $$1.c();
      return $$4;
   }

   public hg.b a(hs $$0, hg.b $$1) {
      hu.a $$2 = this.b($$0);
      Map<acp<? extends hr<?>>, hu.f<?>> $$3 = new HashMap<>();
      $$2.d().forEach($$1x -> $$3.put($$1x.a, $$1x));
      this.a.stream().map($$1x -> $$1x.a($$2)).forEach($$1x -> $$3.put($$1x.a, $$1x));
      Stream<hg.c<?>> $$4 = $$0.b().map($$0x -> $$0x.b().p());
      hg.b $$5 = hg.b.a(Stream.concat($$4, $$3.values().stream().map(hu.f::a).peek($$2::a)));
      $$2.a($$1);
      $$2.b();
      $$2.c();
      return $$5;
   }

   static record a(hu.b a, hu.h b, Map<acq, hf<?>> c, Map<acp<?>, hu.d<?>> d, List<RuntimeException> e) {

      public static hu.a a(hs $$0, Stream<acp<? extends hr<?>>> $$1) {
         hu.b $$2 = new hu.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         hu.h $$4 = new hu.h($$2);
         Builder<acq, hf<?>> $$5 = ImmutableMap.builder();
         $$0.b().forEach($$1x -> $$5.put($$1x.a().a(), hu.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new hu.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> nm<T> a() {
         return new nm<T>() {
            @Override
            public he.c<T> a(acp<T> $$0, T $$1, Lifecycle $$2) {
               hu.d<?> $$3 = a.this.d.put($$0, new hu.d($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> hf<S> a(acp<? extends hr<? extends S>> $$0) {
               return (hf<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         for (acp<Object> $$0 : this.b.a.keySet()) {
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

      public void a(hh<?> $$0) {
         this.a.b($$0);
      }

      public void a(hg.b $$0) {
         Map<acq, Optional<? extends hg<Object>>> $$1 = new HashMap<>();
         Iterator<Entry<acp<Object>, he.c<Object>>> $$2 = this.b.a.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<acp<Object>, he.c<Object>> $$3 = $$2.next();
            acp<Object> $$4 = $$3.getKey();
            he.c<Object> $$5 = $$3.getValue();
            $$1.computeIfAbsent($$4.b(), $$1x -> $$0.a(acp.a($$1x))).flatMap($$1x -> $$1x.a($$4)).ifPresent($$2x -> {
               $$5.b($$2x.a());
               $$2.remove();
            });
         }
      }

      public Stream<hu.f<?>> d() {
         return this.b.a.keySet().stream().map(acp::b).distinct().map($$0 -> new hu.f(acp.a($$0), Lifecycle.stable(), Map.of()));
      }

      public hu.b e() {
         return this.a;
      }

      public hu.h f() {
         return this.b;
      }

      public Map<acq, hf<?>> g() {
         return this.c;
      }

      public Map<acp<?>, hu.d<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements hh<Object> {
      private final Set<hh<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(hh<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(hh<?> $$0) {
         this.a.add($$0);
      }
   }

   abstract static class c<T> implements hf<T> {
      protected final hh<T> b;

      protected c(hh<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<hi.c<T>> a(anl<T> $$0) {
         return Optional.of(hi.a(this.b, $$0));
      }
   }

   static record d<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface e<T> {
      void run(nm<T> var1);
   }

   static record f<T>(acp<? extends hr<? extends T>> a, Lifecycle b, Map<acp<T>, hu.i<T>> c) {

      public hg.c<T> a() {
         return new hg.c<T>() {
            private final Map<acp<T>, he.c<T>> b = f.this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$0x -> {
               hu.i<T> $$1 = (hu.i<T>)$$0x.getValue();
               he.c<T> $$2 = $$1.b().orElseGet(() -> he.c.a(this, (acp<T>)$$0x.getKey()));
               $$2.b($$1.a().a());
               return $$2;
            }));

            @Override
            public acp<? extends hr<? extends T>> f() {
               return f.this.a;
            }

            @Override
            public Lifecycle g() {
               return f.this.b;
            }

            @Override
            public Optional<he.c<T>> a(acp<T> $$0) {
               return Optional.ofNullable(this.b.get($$0));
            }

            @Override
            public Stream<he.c<T>> b() {
               return this.b.values().stream();
            }

            @Override
            public Optional<hi.c<T>> a(anl<T> $$0) {
               return Optional.empty();
            }

            @Override
            public Stream<hi.c<T>> d() {
               return Stream.empty();
            }
         };
      }

      public acp<? extends hr<? extends T>> b() {
         return this.a;
      }

      public Lifecycle c() {
         return this.b;
      }

      public Map<acp<T>, hu.i<T>> d() {
         return this.c;
      }
   }

   static record g<T>(acp<? extends hr<T>> a, Lifecycle b, hu.e<T> c) {
      void b(hu.a $$0) {
         this.c.run($$0.a());
      }

      public hu.f<T> a(hu.a $$0) {
         Map<acp<T>, hu.i<T>> $$1 = new HashMap<>();
         Iterator<Entry<acp<?>, hu.d<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<acp<?>, hu.d<?>> $$3 = $$2.next();
            acp<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               hu.d<T> $$6 = (hu.d<T>)$$3.getValue();
               he.c<T> $$7 = (he.c<T>)$$0.b.a.remove($$4);
               $$1.put((acp<T>)$$4, new hu.i<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new hu.f<>(this.a, this.b, $$1);
      }
   }

   static class h extends hu.c<Object> {
      final Map<acp<Object>, he.c<Object>> a = new HashMap<>();

      public h(hh<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<he.c<Object>> a(acp<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> he.c<T> c(acp<T> $$0) {
         return (he.c<T>)this.a.computeIfAbsent($$0, $$0x -> he.c.a(this.b, $$0x));
      }
   }

   static record i<T>(hu.d<T> a, Optional<he.c<T>> b) {
   }
}
