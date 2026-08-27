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

public class hw {
   private final List<hw.g<?>> a = new ArrayList<>();

   static <T> hh<T> a(final hi.c<T> $$0) {
      return new hw.c<T>($$0) {
         @Override
         public Optional<hg.c<T>> a(aet<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   public <T> hw a(aet<? extends ht<T>> $$0, Lifecycle $$1, hw.e<T> $$2) {
      this.a.add(new hw.g<>($$0, $$1, $$2));
      return this;
   }

   public <T> hw a(aet<? extends ht<T>> $$0, hw.e<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private hw.a b(hu $$0) {
      hw.a $$1 = hw.a.a($$0, this.a.stream().map(hw.g::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   public hi.b a(hu $$0) {
      hw.a $$1 = this.b($$0);
      Stream<hi.c<?>> $$2 = $$0.b().map($$0x -> $$0x.b().p());
      Stream<hi.c<?>> $$3 = this.a.stream().map($$1x -> $$1x.a($$1).a());
      hi.b $$4 = hi.b.a(Stream.concat($$2, $$3.peek($$1::a)));
      $$1.b();
      $$1.c();
      return $$4;
   }

   public hi.b a(hu $$0, hi.b $$1) {
      hw.a $$2 = this.b($$0);
      Map<aet<? extends ht<?>>, hw.f<?>> $$3 = new HashMap<>();
      $$2.d().forEach($$1x -> $$3.put($$1x.a, $$1x));
      this.a.stream().map($$1x -> $$1x.a($$2)).forEach($$1x -> $$3.put($$1x.a, $$1x));
      Stream<hi.c<?>> $$4 = $$0.b().map($$0x -> $$0x.b().p());
      hi.b $$5 = hi.b.a(Stream.concat($$4, $$3.values().stream().map(hw.f::a).peek($$2::a)));
      $$2.a($$1);
      $$2.b();
      $$2.c();
      return $$5;
   }

   static record a(hw.b a, hw.h b, Map<aeu, hh<?>> c, Map<aet<?>, hw.d<?>> d, List<RuntimeException> e) {

      public static hw.a a(hu $$0, Stream<aet<? extends ht<?>>> $$1) {
         hw.b $$2 = new hw.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         hw.h $$4 = new hw.h($$2);
         Builder<aeu, hh<?>> $$5 = ImmutableMap.builder();
         $$0.b().forEach($$1x -> $$5.put($$1x.a().a(), hw.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new hw.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> np<T> a() {
         return new np<T>() {
            @Override
            public hg.c<T> a(aet<T> $$0, T $$1, Lifecycle $$2) {
               hw.d<?> $$3 = a.this.d.put($$0, new hw.d($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> hh<S> a(aet<? extends ht<? extends S>> $$0) {
               return (hh<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         for (aet<Object> $$0 : this.b.a.keySet()) {
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

      public void a(hj<?> $$0) {
         this.a.b($$0);
      }

      public void a(hi.b $$0) {
         Map<aeu, Optional<? extends hi<Object>>> $$1 = new HashMap<>();
         Iterator<Entry<aet<Object>, hg.c<Object>>> $$2 = this.b.a.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aet<Object>, hg.c<Object>> $$3 = $$2.next();
            aet<Object> $$4 = $$3.getKey();
            hg.c<Object> $$5 = $$3.getValue();
            $$1.computeIfAbsent($$4.b(), $$1x -> $$0.a(aet.a($$1x))).flatMap($$1x -> $$1x.a($$4)).ifPresent($$2x -> {
               $$5.b($$2x.a());
               $$2.remove();
            });
         }
      }

      public Stream<hw.f<?>> d() {
         return this.b.a.keySet().stream().map(aet::b).distinct().map($$0 -> new hw.f(aet.a($$0), Lifecycle.stable(), Map.of()));
      }

      public hw.b e() {
         return this.a;
      }

      public hw.h f() {
         return this.b;
      }

      public Map<aeu, hh<?>> g() {
         return this.c;
      }

      public Map<aet<?>, hw.d<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements hj<Object> {
      private final Set<hj<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(hj<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(hj<?> $$0) {
         this.a.add($$0);
      }
   }

   abstract static class c<T> implements hh<T> {
      protected final hj<T> b;

      protected c(hj<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<hk.c<T>> a(aqd<T> $$0) {
         return Optional.of(hk.a(this.b, $$0));
      }
   }

   static record d<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface e<T> {
      void run(np<T> var1);
   }

   static record f<T>(aet<? extends ht<? extends T>> a, Lifecycle b, Map<aet<T>, hw.i<T>> c) {

      public hi.c<T> a() {
         return new hi.c<T>() {
            private final Map<aet<T>, hg.c<T>> b = f.this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$0x -> {
               hw.i<T> $$1 = (hw.i<T>)$$0x.getValue();
               hg.c<T> $$2 = $$1.b().orElseGet(() -> hg.c.a(this, (aet<T>)$$0x.getKey()));
               $$2.b($$1.a().a());
               return $$2;
            }));

            @Override
            public aet<? extends ht<? extends T>> f() {
               return f.this.a;
            }

            @Override
            public Lifecycle g() {
               return f.this.b;
            }

            @Override
            public Optional<hg.c<T>> a(aet<T> $$0) {
               return Optional.ofNullable(this.b.get($$0));
            }

            @Override
            public Stream<hg.c<T>> b() {
               return this.b.values().stream();
            }

            @Override
            public Optional<hk.c<T>> a(aqd<T> $$0) {
               return Optional.empty();
            }

            @Override
            public Stream<hk.c<T>> d() {
               return Stream.empty();
            }
         };
      }

      public aet<? extends ht<? extends T>> b() {
         return this.a;
      }

      public Lifecycle c() {
         return this.b;
      }

      public Map<aet<T>, hw.i<T>> d() {
         return this.c;
      }
   }

   static record g<T>(aet<? extends ht<T>> a, Lifecycle b, hw.e<T> c) {
      void b(hw.a $$0) {
         this.c.run($$0.a());
      }

      public hw.f<T> a(hw.a $$0) {
         Map<aet<T>, hw.i<T>> $$1 = new HashMap<>();
         Iterator<Entry<aet<?>, hw.d<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aet<?>, hw.d<?>> $$3 = $$2.next();
            aet<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               hw.d<T> $$6 = (hw.d<T>)$$3.getValue();
               hg.c<T> $$7 = (hg.c<T>)$$0.b.a.remove($$4);
               $$1.put((aet<T>)$$4, new hw.i<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new hw.f<>(this.a, this.b, $$1);
      }
   }

   static class h extends hw.c<Object> {
      final Map<aet<Object>, hg.c<Object>> a = new HashMap<>();

      public h(hj<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<hg.c<Object>> a(aet<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> hg.c<T> c(aet<T> $$0) {
         return (hg.c<T>)this.a.computeIfAbsent($$0, $$0x -> hg.c.a(this.b, $$0x));
      }
   }

   static record i<T>(hw.d<T> a, Optional<hg.c<T>> b) {
   }
}
