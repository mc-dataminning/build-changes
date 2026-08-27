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

public class iy {
   private final List<iy.i<?>> a = new ArrayList<>();

   static <T> ik<T> a(final il.c<T> $$0) {
      return new iy.c<T>($$0) {
         @Override
         public Optional<ij.c<T>> a(aix<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> il.c<T> a(final aix<? extends iv<? extends T>> $$0, final Lifecycle $$1, final Map<aix<T>, ij.c<T>> $$2) {
      return new il.c<T>() {
         @Override
         public aix<? extends iv<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<ij.c<T>> a(aix<T> $$0x) {
            return Optional.ofNullable($$2.get($$0));
         }

         @Override
         public Stream<ij.c<T>> b() {
            return $$2.values().stream();
         }

         @Override
         public Optional<in.c<T>> a(auo<T> $$0x) {
            return Optional.empty();
         }

         @Override
         public Stream<in.c<T>> d() {
            return Stream.empty();
         }
      };
   }

   public <T> iy a(aix<? extends iv<T>> $$0, Lifecycle $$1, iy.g<T> $$2) {
      this.a.add(new iy.i<>($$0, $$1, $$2));
      return this;
   }

   public <T> iy a(aix<? extends iv<T>> $$0, iy.g<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private iy.a b(iw $$0) {
      iy.a $$1 = iy.a.a($$0, this.a.stream().map(iy.i::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static il.b a(iw $$0, Stream<il.c<?>> $$1) {
      Stream<il.c<?>> $$2 = $$0.c().map($$0x -> $$0x.b().p());
      return il.b.a(Stream.concat($$2, $$1));
   }

   public il.b a(iw $$0) {
      iy.a $$1 = this.b($$0);
      Stream<il.c<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      il.b $$3 = a($$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private il.b a(iw $$0, il.b $$1, ia.a $$2, Map<aix<? extends iv<?>>, iy.h<?>> $$3, il.b $$4) {
      iy.b $$5 = new iy.b();
      MutableObject<il.b> $$6 = new MutableObject();
      List<il.c<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).peek($$5::b).collect(Collectors.toUnmodifiableList());
      il.b $$8 = a($$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> il.c<T> a(im<T> $$0, ia.a $$1, aix<? extends iv<? extends T>> $$2, il.b $$3, il.b $$4, MutableObject<il.b> $$5) {
      ia<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<aix<T>, ij.c<T>> $$7 = new HashMap<>();
         il.c<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            aix<T> $$6x = $$5x.h();
            iy.d<T> $$7x = new iy.d<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (il.b)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         il.c<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            aix<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               iy.d<T> $$7x = new iy.d<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (il.b)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$7);
      }
   }

   public iy.e a(iw $$0, il.b $$1, ia.a $$2) {
      iy.a $$3 = this.b($$0);
      Map<aix<? extends iv<?>>, iy.h<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<aix<? extends iv<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new iy.h($$1x, Lifecycle.stable(), Map.of())));
      Stream<il.c<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      il.b $$7 = a($$0, $$6);
      $$3.b();
      $$3.d();
      il.b $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new iy.e($$8, $$7);
   }

   static record a(iy.b a, iy.j b, Map<aiy, ik<?>> c, Map<aix<?>, iy.f<?>> d, List<RuntimeException> e) {

      public static iy.a a(iw $$0, Stream<aix<? extends iv<?>>> $$1) {
         iy.b $$2 = new iy.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         iy.j $$4 = new iy.j($$2);
         Builder<aiy, ik<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), iy.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new iy.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> ph<T> a() {
         return new ph<T>() {
            @Override
            public ij.c<T> a(aix<T> $$0, T $$1, Lifecycle $$2) {
               iy.f<?> $$3 = a.this.d.put($$0, new iy.f($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> ik<S> a(aix<? extends iv<? extends S>> $$0) {
               return (ik<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (aix<Object> $$0 : this.b.a.keySet()) {
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

      public iy.b e() {
         return this.a;
      }

      public iy.j f() {
         return this.b;
      }

      public Map<aiy, ik<?>> g() {
         return this.c;
      }

      public Map<aix<?>, iy.f<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements im<Object> {
      private final Set<im<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(im<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(im<?> $$0) {
         this.a.add($$0);
      }

      public <T> im<T> a() {
         return this;
      }
   }

   abstract static class c<T> implements ik<T> {
      protected final im<T> b;

      protected c(im<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<in.c<T>> a(auo<T> $$0) {
         return Optional.of(in.a(this.b, $$0));
      }
   }

   static class d<T> extends ij.c<T> {
      @Nullable
      Supplier<T> a;

      protected d(im<T> $$0, @Nullable aix<T> $$1) {
         super(ij.c.a.a, $$0, $$1, null);
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

   public static record e(il.b a, il.b b) {
   }

   static record f<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface g<T> {
      void run(ph<T> var1);
   }

   static record h<T>(aix<? extends iv<? extends T>> a, Lifecycle b, Map<aix<T>, iy.k<T>> c) {

      public il.c<T> a(iy.b $$0) {
         Map<aix<T>, ij.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            iy.k<T> $$2x = (iy.k<T>)$$1x.getValue();
            ij.c<T> $$3 = $$2x.b().orElseGet(() -> ij.c.a($$0.a(), (aix<T>)$$1x.getKey()));
            $$3.b($$2x.a().a());
            return $$3;
         }));
         il.c<T> $$2 = iy.a(this.a, this.b, $$1);
         $$0.b($$2);
         return $$2;
      }
   }

   static record i<T>(aix<? extends iv<T>> a, Lifecycle b, iy.g<T> c) {
      void b(iy.a $$0) {
         this.c.run($$0.a());
      }

      public iy.h<T> a(iy.a $$0) {
         Map<aix<T>, iy.k<T>> $$1 = new HashMap<>();
         Iterator<Entry<aix<?>, iy.f<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<aix<?>, iy.f<?>> $$3 = $$2.next();
            aix<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               iy.f<T> $$6 = (iy.f<T>)$$3.getValue();
               ij.c<T> $$7 = (ij.c<T>)$$0.b.a.remove($$4);
               $$1.put((aix<T>)$$4, new iy.k<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new iy.h<>(this.a, this.b, $$1);
      }
   }

   static class j extends iy.c<Object> {
      final Map<aix<Object>, ij.c<Object>> a = new HashMap<>();

      public j(im<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<ij.c<Object>> a(aix<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> ij.c<T> c(aix<T> $$0) {
         return (ij.c<T>)this.a.computeIfAbsent($$0, $$0x -> ij.c.a(this.b, $$0x));
      }
   }

   static record k<T>(iy.f<T> a, Optional<ij.c<T>> b) {
   }
}
