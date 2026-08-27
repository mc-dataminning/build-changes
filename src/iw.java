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

public class iw {
   private final List<iw.i<?>> a = new ArrayList<>();

   static <T> ii<T> a(final ij.c<T> $$0) {
      return new iw.c<T>($$0) {
         @Override
         public Optional<ih.c<T>> a(ahf<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> ij.c<T> a(final ahf<? extends it<? extends T>> $$0, final Lifecycle $$1, final Map<ahf<T>, ih.c<T>> $$2) {
      return new ij.c<T>() {
         @Override
         public ahf<? extends it<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ih.c<T>> a(ahf<T> $$0x) {
            return Optional.ofNullable($$2.get($$0));
         }

         @Override
         public Stream<ih.c<T>> b() {
            return $$2.values().stream();
         }

         @Override
         public Optional<il.c<T>> a(asw<T> $$0x) {
            return Optional.empty();
         }

         @Override
         public Stream<il.c<T>> d() {
            return Stream.empty();
         }
      };
   }

   public <T> iw a(ahf<? extends it<T>> $$0, Lifecycle $$1, iw.g<T> $$2) {
      this.a.add(new iw.i<>($$0, $$1, $$2));
      return this;
   }

   public <T> iw a(ahf<? extends it<T>> $$0, iw.g<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private iw.a b(iu $$0) {
      iw.a $$1 = iw.a.a($$0, this.a.stream().map(iw.i::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static ij.b a(iu $$0, Stream<ij.c<?>> $$1) {
      Stream<ij.c<?>> $$2 = $$0.c().map($$0x -> $$0x.b().p());
      return ij.b.a(Stream.concat($$2, $$1));
   }

   public ij.b a(iu $$0) {
      iw.a $$1 = this.b($$0);
      Stream<ij.c<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      ij.b $$3 = a($$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private ij.b a(iu $$0, ij.b $$1, hy.a $$2, Map<ahf<? extends it<?>>, iw.h<?>> $$3, ij.b $$4) {
      iw.b $$5 = new iw.b();
      MutableObject<ij.b> $$6 = new MutableObject();
      List<ij.c<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).peek($$5::b).collect(Collectors.toUnmodifiableList());
      ij.b $$8 = a($$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> ij.c<T> a(ik<T> $$0, hy.a $$1, ahf<? extends it<? extends T>> $$2, ij.b $$3, ij.b $$4, MutableObject<ij.b> $$5) {
      hy<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ahf<T>, ih.c<T>> $$7 = new HashMap<>();
         ij.c<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ahf<T> $$6x = $$5x.g();
            iw.d<T> $$7x = new iw.d<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (ij.b)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         ij.c<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ahf<T> $$6x = $$5x.g();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               iw.d<T> $$7x = new iw.d<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (ij.b)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$7);
      }
   }

   public iw.e a(iu $$0, ij.b $$1, hy.a $$2) {
      iw.a $$3 = this.b($$0);
      Map<ahf<? extends it<?>>, iw.h<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ahf<? extends it<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new iw.h($$1x, Lifecycle.stable(), Map.of())));
      Stream<ij.c<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      ij.b $$7 = a($$0, $$6);
      $$3.b();
      $$3.d();
      ij.b $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new iw.e($$8, $$7);
   }

   static record a(iw.b a, iw.j b, Map<ahg, ii<?>> c, Map<ahf<?>, iw.f<?>> d, List<RuntimeException> e) {

      public static iw.a a(iu $$0, Stream<ahf<? extends it<?>>> $$1) {
         iw.b $$2 = new iw.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         iw.j $$4 = new iw.j($$2);
         Builder<ahg, ii<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), iw.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new iw.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> pe<T> a() {
         return new pe<T>() {
            @Override
            public ih.c<T> a(ahf<T> $$0, T $$1, Lifecycle $$2) {
               iw.f<?> $$3 = a.this.d.put($$0, new iw.f($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> ii<S> a(ahf<? extends it<? extends S>> $$0) {
               return (ii<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ahf<Object> $$0 : this.b.a.keySet()) {
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

      public iw.b e() {
         return this.a;
      }

      public iw.j f() {
         return this.b;
      }

      public Map<ahg, ii<?>> g() {
         return this.c;
      }

      public Map<ahf<?>, iw.f<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements ik<Object> {
      private final Set<ik<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(ik<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(ik<?> $$0) {
         this.a.add($$0);
      }

      public <T> ik<T> a() {
         return this;
      }
   }

   abstract static class c<T> implements ii<T> {
      protected final ik<T> b;

      protected c(ik<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<il.c<T>> a(asw<T> $$0) {
         return Optional.of(il.a(this.b, $$0));
      }
   }

   static class d<T> extends ih.c<T> {
      @Nullable
      Supplier<T> a;

      protected d(ik<T> $$0, @Nullable ahf<T> $$1) {
         super(ih.c.a.a, $$0, $$1, null);
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

   public static record e(ij.b a, ij.b b) {
   }

   static record f<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface g<T> {
      void run(pe<T> var1);
   }

   static record h<T>(ahf<? extends it<? extends T>> a, Lifecycle b, Map<ahf<T>, iw.k<T>> c) {

      public ij.c<T> a(iw.b $$0) {
         Map<ahf<T>, ih.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            iw.k<T> $$2x = (iw.k<T>)$$1x.getValue();
            ih.c<T> $$3 = $$2x.b().orElseGet(() -> ih.c.a($$0.a(), (ahf<T>)$$1x.getKey()));
            $$3.b($$2x.a().a());
            return $$3;
         }));
         ij.c<T> $$2 = iw.a(this.a, this.b, $$1);
         $$0.b($$2);
         return $$2;
      }
   }

   static record i<T>(ahf<? extends it<T>> a, Lifecycle b, iw.g<T> c) {
      void b(iw.a $$0) {
         this.c.run($$0.a());
      }

      public iw.h<T> a(iw.a $$0) {
         Map<ahf<T>, iw.k<T>> $$1 = new HashMap<>();
         Iterator<Entry<ahf<?>, iw.f<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ahf<?>, iw.f<?>> $$3 = $$2.next();
            ahf<?> $$4 = $$3.getKey();
            if ($$4.b(this.a)) {
               iw.f<T> $$6 = (iw.f<T>)$$3.getValue();
               ih.c<T> $$7 = (ih.c<T>)$$0.b.a.remove($$4);
               $$1.put((ahf<T>)$$4, new iw.k<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new iw.h<>(this.a, this.b, $$1);
      }
   }

   static class j extends iw.c<Object> {
      final Map<ahf<Object>, ih.c<Object>> a = new HashMap<>();

      public j(ik<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ih.c<Object>> a(ahf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ih.c<T> c(ahf<T> $$0) {
         return (ih.c<T>)this.a.computeIfAbsent($$0, $$0x -> ih.c.a(this.b, $$0x));
      }
   }

   static record k<T>(iw.f<T> a, Optional<ih.c<T>> b) {
   }
}
