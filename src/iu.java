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
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class iu {
   private final List<iu.i<?>> a = new ArrayList<>();

   static <T> ig<T> a(final ih.c<T> $$0) {
      return new iu.c<T>($$0) {
         @Override
         public Optional<ie.c<T>> a(ags<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ih.c<T> a(final ags<? extends ir<? extends T>> $$0, final Lifecycle $$1, final Map<ags<T>, ie.c<T>> $$2) {
      return new ih.c<T>() {
         @Override
         public ags<? extends ir<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ie.c<T>> a(ags<T> $$0x) {
            return Optional.ofNullable($$2.get($$0));
         }

         @Override
         public Stream<ie.c<T>> b() {
            return $$2.values().stream();
         }

         @Override
         public Optional<ij.c<T>> a(asg<T> $$0x) {
            return Optional.empty();
         }

         @Override
         public Stream<ij.c<T>> d() {
            return Stream.empty();
         }
      };
   }

   public <T> iu a(ags<? extends ir<T>> $$0, Lifecycle $$1, iu.g<T> $$2) {
      this.a.add(new iu.i<>($$0, $$1, $$2));
      return this;
   }

   public <T> iu a(ags<? extends ir<T>> $$0, iu.g<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private iu.a b(is $$0) {
      iu.a $$1 = iu.a.a($$0, this.a.stream().map(iu.i::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ih.b a(is $$0, Stream<ih.c<?>> $$1) {
      Stream<ih.c<?>> $$2 = $$0.c().map($$0x -> $$0x.b().p());
      return ih.b.a(Stream.concat($$2, $$1));
   }

   public ih.b a(is $$0) {
      iu.a $$1 = this.b($$0);
      Stream<ih.c<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ih.b $$3 = a($$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ih.b a(is $$0, ih.b $$1, hw.a $$2, Map<ags<? extends ir<?>>, iu.h<?>> $$3, ih.b $$4) {
      iu.b $$5 = new iu.b();
      MutableObject<ih.b> $$6 = new MutableObject();
      List<ih.c<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).peek($$5::b).collect(Collectors.toUnmodifiableList());
      ih.b $$8 = a($$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ih.c<T> a(ii<T> $$0, hw.a $$1, ags<? extends ir<? extends T>> $$2, ih.b $$3, ih.b $$4, MutableObject<ih.b> $$5) {
      hw<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ags<T>, ie.c<T>> $$7 = new HashMap<>();
         ih.c<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ags<T> $$6x = $$5x.g();
            iu.d<T> $$7x = new iu.d<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ih.b)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ih.c<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ags<T> $$6x = $$5x.g();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               iu.d<T> $$7x = new iu.d<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ih.b)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$7);
      }
   }

   public iu.e a(is $$0, ih.b $$1, hw.a $$2) {
      iu.a $$3 = this.b($$0);
      Map<ags<? extends ir<?>>, iu.h<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ags<? extends ir<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new iu.h($$1x, Lifecycle.stable(), Map.of())));
      Stream<ih.c<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ih.b $$7 = a($$0, $$6);
      $$3.b();
      $$3.d();
      ih.b $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new iu.e($$8, $$7);
   }

   static record a(iu.b a, iu.j b, Map<agt, ig<?>> c, Map<ags<?>, iu.f<?>> d, List<RuntimeException> e) {

      public static iu.a a(is $$0, Stream<ags<? extends ir<?>>> $$1) {
         iu.b $$2 = new iu.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         iu.j $$4 = new iu.j($$2);
         Builder<agt, ig<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), iu.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new iu.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> pa<T> a() {
         return new pa<T>() {
            @Override
            public ie.c<T> a(ags<T> $$0, T $$1, Lifecycle $$2) {
               iu.f<?> $$3 = a.this.d.put($$0, new iu.f($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> ig<S> a(ags<? extends ir<? extends S>> $$0) {
               return (ig<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ags<Object> $$0 : this.b.a.keySet()) {
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

      public iu.b e() {
         return this.a;
      }

      public iu.j f() {
         return this.b;
      }

      public Map<agt, ig<?>> g() {
         return this.c;
      }

      public Map<ags<?>, iu.f<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements ii<Object> {
      private final Set<ii<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(ii<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(ii<?> $$0) {
         this.a.add($$0);
      }

      public <T> ii<T> a() {
         return this;
      }
   }

   abstract static class c<T> implements ig<T> {
      protected final ii<T> b;

      protected c(ii<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<ij.c<T>> a(asg<T> $$0) {
         return Optional.of(ij.a(this.b, $$0));
      }
   }

   static class d<T> extends ie.c<T> {
      @Nullable
      Supplier<T> a;

      protected d(ii<T> $$0, @Nullable ags<T> $$1) {
         super(ie.c.a.a, $$0, $$1, null);
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

   public static record e(ih.b a, ih.b b) {
   }

   static record f<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface g<T> {
      void run(pa<T> var1);
   }

   static record h<T>(ags<? extends ir<? extends T>> a, Lifecycle b, Map<ags<T>, iu.k<T>> c) {

      public ih.c<T> a(iu.b $$0) {
         Map<ags<T>, ie.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            iu.k<T> $$2x = (iu.k<T>)$$1x.getValue();
            ie.c<T> $$3 = $$2x.b().orElseGet(() -> ie.c.a($$0.a(), (ags<T>)$$1x.getKey()));
            $$3.b($$2x.a().a());
            return $$3;
         }));
         ih.c<T> $$2 = iu.a(this.a, this.b, $$1);
         $$0.b($$2);
         return $$2;
      }
   }

   static record i<T>(ags<? extends ir<T>> a, Lifecycle b, iu.g<T> c) {
      void b(iu.a $$0) {
         this.c.run($$0.a());
      }

      public iu.h<T> a(iu.a $$0) {
         Map<ags<T>, iu.k<T>> $$1 = new HashMap<>();
         Iterator<Entry<ags<?>, iu.f<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ags<?>, iu.f<?>> $$3 = $$2.next();
            ags<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               iu.f<T> $$6 = (iu.f<T>)$$3.getValue();
               ie.c<T> $$7 = (ie.c<T>)$$0.b.a.remove($$4);
               $$1.put((ags<T>)$$4, new iu.k<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new iu.h<>(this.a, this.b, $$1);
      }
   }

   static class j extends iu.c<Object> {
      final Map<ags<Object>, ie.c<Object>> a = new HashMap<>();

      public j(ii<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ie.c<Object>> a(ags<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ie.c<T> c(ags<T> $$0) {
         return (ie.c<T>)this.a.computeIfAbsent($$0, $$0x -> ie.c.a(this.b, $$0x));
      }
   }

   static record k<T>(iu.f<T> a, Optional<ie.c<T>> b) {
   }
}
