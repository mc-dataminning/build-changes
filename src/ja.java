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

public class ja {
   private final List<ja.i<?>> a = new ArrayList<>();

   static <T> im<T> a(final in.b<T> $$0) {
      return new ja.c<T>($$0) {
         @Override
         public Optional<il.c<T>> a(ajb<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> in.b<T> a(final ajb<? extends ix<? extends T>> $$0, final Lifecycle $$1, final Map<ajb<T>, il.c<T>> $$2) {
      return new in.b<T>() {
         @Override
         public ajb<? extends ix<? extends T>> f() {
            return $$0;
         }

         @Override
         public Lifecycle g() {
            return $$1;
         }

         @Override
         public Optional<il.c<T>> a(ajb<T> $$0x) {
            return Optional.ofNullable($$2.get($$0));
         }

         @Override
         public Stream<il.c<T>> b() {
            return $$2.values().stream();
         }

         @Override
         public Optional<ip.c<T>> a(aut<T> $$0x) {
            return Optional.empty();
         }

         @Override
         public Stream<ip.c<T>> d() {
            return Stream.empty();
         }
      };
   }

   public <T> ja a(ajb<? extends ix<T>> $$0, Lifecycle $$1, ja.g<T> $$2) {
      this.a.add(new ja.i<>($$0, $$1, $$2));
      return this;
   }

   public <T> ja a(ajb<? extends ix<T>> $$0, ja.g<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private ja.a b(iy $$0) {
      ja.a $$1 = ja.a.a($$0, this.a.stream().map(ja.i::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static in.a a(iy $$0, Stream<in.b<?>> $$1) {
      Stream<in.b<?>> $$2 = $$0.c().map($$0x -> $$0x.b().p());
      return in.a.a(Stream.concat($$2, $$1));
   }

   public in.a a(iy $$0) {
      ja.a $$1 = this.b($$0);
      Stream<in.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      in.a $$3 = a($$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private in.a a(iy $$0, in.a $$1, ic.a $$2, Map<ajb<? extends ix<?>>, ja.h<?>> $$3, in.a $$4) {
      ja.b $$5 = new ja.b();
      MutableObject<in.a> $$6 = new MutableObject();
      List<in.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).peek($$5::b).collect(Collectors.toUnmodifiableList());
      in.a $$8 = a($$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> in.b<T> a(io<T> $$0, ic.a $$1, ajb<? extends ix<? extends T>> $$2, in.a $$3, in.a $$4, MutableObject<in.a> $$5) {
      ic<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<ajb<T>, il.c<T>> $$7 = new HashMap<>();
         in.b<T> $$8 = $$3.b($$2);
         $$8.b().forEach($$5x -> {
            ajb<T> $$6x = $$5x.h();
            ja.d<T> $$7x = new ja.d<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (in.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         in.b<T> $$9 = $$4.b($$2);
         $$9.b().forEach($$5x -> {
            ajb<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               ja.d<T> $$7x = new ja.d<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (in.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.g().add($$9.g());
         return a($$2, $$10, $$7);
      }
   }

   public ja.e a(iy $$0, in.a $$1, ic.a $$2) {
      ja.a $$3 = this.b($$0);
      Map<ajb<? extends ix<?>>, ja.h<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<ajb<? extends ix<?>>> $$5 = $$0.a().collect(Collectors.toUnmodifiableSet());
      $$1.a().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new ja.h($$1x, Lifecycle.stable(), Map.of())));
      Stream<in.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      in.a $$7 = a($$0, $$6);
      $$3.b();
      $$3.d();
      in.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new ja.e($$8, $$7);
   }

   static record a(ja.b a, ja.j b, Map<ajc, im<?>> c, Map<ajb<?>, ja.f<?>> d, List<RuntimeException> e) {

      public static ja.a a(iy $$0, Stream<ajb<? extends ix<?>>> $$1) {
         ja.b $$2 = new ja.b();
         List<RuntimeException> $$3 = new ArrayList<>();
         ja.j $$4 = new ja.j($$2);
         Builder<ajc, im<?>> $$5 = ImmutableMap.builder();
         $$0.c().forEach($$1x -> $$5.put($$1x.a().a(), ja.a($$1x.b().p())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new ja.a($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> pj<T> a() {
         return new pj<T>() {
            @Override
            public il.c<T> a(ajb<T> $$0, T $$1, Lifecycle $$2) {
               ja.f<?> $$3 = a.this.d.put($$0, new ja.f($$1, $$2));
               if ($$3 != null) {
                  a.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return a.this.b.c($$0);
            }

            @Override
            public <S> im<S> a(ajb<? extends ix<? extends S>> $$0) {
               return (im<S>)a.this.c.getOrDefault($$0.a(), a.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (ajb<Object> $$0 : this.b.a.keySet()) {
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

      public ja.b e() {
         return this.a;
      }

      public ja.j f() {
         return this.b;
      }

      public Map<ajc, im<?>> g() {
         return this.c;
      }

      public Map<ajb<?>, ja.f<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   static class b implements io<Object> {
      private final Set<io<?>> a = Sets.newIdentityHashSet();

      @Override
      public boolean a(io<Object> $$0) {
         return this.a.contains($$0);
      }

      public void b(io<?> $$0) {
         this.a.add($$0);
      }

      public <T> io<T> a() {
         return this;
      }
   }

   abstract static class c<T> implements im<T> {
      protected final io<T> b;

      protected c(io<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<ip.c<T>> a(aut<T> $$0) {
         return Optional.of(ip.a(this.b, $$0));
      }
   }

   static class d<T> extends il.c<T> {
      @Nullable
      Supplier<T> a;

      protected d(io<T> $$0, @Nullable ajb<T> $$1) {
         super(il.c.a.a, $$0, $$1, null);
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

   public static record e(in.a a, in.a b) {
   }

   static record f<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface g<T> {
      void run(pj<T> var1);
   }

   static record h<T>(ajb<? extends ix<? extends T>> a, Lifecycle b, Map<ajb<T>, ja.k<T>> c) {

      public in.b<T> a(ja.b $$0) {
         Map<ajb<T>, il.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            ja.k<T> $$2x = (ja.k<T>)$$1x.getValue();
            il.c<T> $$3 = $$2x.b().orElseGet(() -> il.c.a($$0.a(), (ajb<T>)$$1x.getKey()));
            $$3.b($$2x.a().a());
            return $$3;
         }));
         in.b<T> $$2 = ja.a(this.a, this.b, $$1);
         $$0.b($$2);
         return $$2;
      }
   }

   static record i<T>(ajb<? extends ix<T>> a, Lifecycle b, ja.g<T> c) {
      void b(ja.a $$0) {
         this.c.run($$0.a());
      }

      public ja.h<T> a(ja.a $$0) {
         Map<ajb<T>, ja.k<T>> $$1 = new HashMap<>();
         Iterator<Entry<ajb<?>, ja.f<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<ajb<?>, ja.f<?>> $$3 = $$2.next();
            ajb<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               ja.f<T> $$6 = (ja.f<T>)$$3.getValue();
               il.c<T> $$7 = (il.c<T>)$$0.b.a.remove($$4);
               $$1.put((ajb<T>)$$4, new ja.k<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new ja.h<>(this.a, this.b, $$1);
      }
   }

   static class j extends ja.c<Object> {
      final Map<ajb<Object>, il.c<Object>> a = new HashMap<>();

      public j(io<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<il.c<Object>> a(ajb<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> il.c<T> c(ajb<T> $$0) {
         return (il.c<T>)this.a.computeIfAbsent($$0, $$0x -> il.c.a(this.b, $$0x));
      }
   }

   static record k<T>(ja.f<T> a, Optional<il.c<T>> b) {
   }
}
