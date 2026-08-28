import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class jv<T> implements kj<T> {
   final alb<? extends ka<T>> b;
   private final ObjectList<jn.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = ad.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<alc, jn.c<T>> e = new HashMap<>();
   private final Map<alb<T>, jn.c<T>> f = new HashMap<>();
   private final Map<T, jn.c<T>> g = new IdentityHashMap<>();
   private final Map<alb<T>, jz> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<axj<T>, jr.c<T>> j = new IdentityHashMap<>();
   jv.a<T> k = jv.a.a();
   private boolean l;
   @Nullable
   private Map<T, jn.c<T>> m;
   private final jp.b<T> n = new jp.b<T>() {
      @Override
      public alb<? extends ka<? extends T>> f() {
         return jv.this.b;
      }

      @Override
      public Lifecycle g() {
         return jv.this.e();
      }

      @Override
      public Optional<jn.c<T>> a(alb<T> $$0) {
         return jv.this.b($$0);
      }

      @Override
      public Stream<jn.c<T>> b() {
         return jv.this.i();
      }

      @Override
      public Optional<jr.c<T>> a(axj<T> $$0) {
         return jv.this.a($$0);
      }

      @Override
      public Stream<jr.c<T>> d() {
         return jv.this.j();
      }
   };

   public jv(alb<? extends ka<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jv(alb<? extends ka<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public alb<? extends ka<T>> d() {
      return this.b;
   }

   @Override
   public String toString() {
      return "Registry[" + this.b + " (" + this.i + ")]";
   }

   private void b() {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   private void h(alb<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jn.c<T> a(alb<T> $$0, T $$1, jz $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)ad.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)ad.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         jn.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> jn.c.a(this.o(), $$0x));
         }

         this.f.put($$0, $$3);
         this.e.put($$0.a(), $$3);
         this.g.put($$1, $$3);
         int $$5 = this.c.size();
         this.c.add($$3);
         this.d.put($$1, $$5);
         this.h.put($$0, $$2);
         this.i = this.i.add($$2.b());
         return $$3;
      }
   }

   @Nullable
   @Override
   public alc b(T $$0) {
      jn.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<alb<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(jn.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable alb<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((jn.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<jn.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((jn.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jn.c<T>> c(alc $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<jn.c<T>> b(alb<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jn.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((jn.c<T>)this.c.getFirst());
   }

   @Override
   public jn<T> e(T $$0) {
      jn.c<T> $$1 = this.g.get($$0);
      return (jn<T>)($$1 != null ? $$1 : jn.a($$0));
   }

   jn.c<T> i(alb<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jn.c.a(this.o(), $$0x);
         }
      });
   }

   @Override
   public int c() {
      return this.f.size();
   }

   @Override
   public Optional<jz> c(alb<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle e() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), jn::a);
   }

   @Nullable
   @Override
   public T a(@Nullable alc $$0) {
      jn.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jn.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<alc> f() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<alb<T>> g() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<alb<T>, T>> h() {
      return Collections.unmodifiableSet(Maps.transformValues(this.f, jn::a).entrySet());
   }

   @Override
   public Stream<jn.c<T>> i() {
      return this.c.stream();
   }

   @Override
   public Stream<jr.c<T>> j() {
      return this.k.c();
   }

   jr.c<T> c(axj<T> $$0) {
      return this.j.computeIfAbsent($$0, this::d);
   }

   private jr.c<T> d(axj<T> $$0) {
      return new jr.c<>(this.o(), $$0);
   }

   @Override
   public boolean k() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<jn.c<T>> a(azl $$0) {
      return ad.b(this.c, $$0);
   }

   @Override
   public boolean d(alc $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean d(alb<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public ka<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<alc> $$0 = this.f.entrySet().stream().filter($$0x -> !((jn.c)$$0x.getValue()).b()).map($$0x -> ((alb)$$0x.getKey()).a()).sorted().toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.d() + ": " + $$0);
         } else {
            if (this.m != null) {
               if (!this.m.isEmpty()) {
                  throw new IllegalStateException("Some intrusive holders were not registered: " + this.m.values());
               }

               this.m = null;
            }

            if (this.k.b()) {
               throw new IllegalStateException("Tags already present before freezing");
            } else {
               List<alc> $$1 = this.j.entrySet().stream().filter($$0x -> !((jr.c)$$0x.getValue()).c()).map($$0x -> ((axj)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.d() + ": " + $$1);
               } else {
                  this.k = jv.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public jn.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jn.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<jr.c<T>> a(axj<T> $$0) {
      return this.k.a($$0);
   }

   private jn.c<T> a(axj<T> $$0, jn<T> $$1) {
      if (!$$1.a(this.o())) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof jn.c) {
         return (jn.c<T>)$$1;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(axj<T> $$0, List<jn<T>> $$1) {
      this.b();
      this.c($$0).b($$1);
   }

   void u() {
      Map<jn.c<T>, List<axj<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((jn.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (jn<T> $$3 : $$2) {
            jn.c<T> $$4 = this.a((axj<T>)$$1, $$3);
            $$0.get($$4).add((axj<T>)$$1);
         }
      });
      $$0.forEach(jn.c::a);
   }

   public void m() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jo<T> n() {
      this.b();
      return new jo<T>() {
         @Override
         public Optional<jn.c<T>> a(alb<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jn.c<T> b(alb<T> $$0) {
            return jv.this.i($$0);
         }

         @Override
         public Optional<jr.c<T>> a(axj<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jr.c<T> b(axj<T> $$0) {
            return jv.this.c($$0);
         }
      };
   }

   @Override
   public jq<T> o() {
      return this.n;
   }

   @Override
   public jp.b<T> p() {
      return this.n;
   }

   @Override
   public ka.a<T> a(axk.b<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<axj<T>, jr.c<T>> $$1 = ImmutableMap.builder();
         final Map<axj<T>, List<jn<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            jr.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.d($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<axj<T>, jr.c<T>> $$3 = $$1.build();
         final jp.b<T> $$4 = new jp.b.a<T>() {
            @Override
            public jp.b<T> a() {
               return jv.this.p();
            }

            @Override
            public Optional<jr.c<T>> a(axj<T> $$0) {
               return Optional.ofNullable((jr.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<jr.c<T>> d() {
               return $$3.values().stream();
            }
         };
         return new ka.a<T>() {
            @Override
            public alb<? extends ka<? extends T>> a() {
               return jv.this.d();
            }

            @Override
            public jp.b<T> b() {
               return $$4;
            }

            @Override
            public void c() {
               $$3.forEach(($$1, $$2xx) -> {
                  List<jn<T>> $$3xx = $$2.getOrDefault($$1, List.of());
                  $$2xx.b($$3xx);
               });
               jv.this.k = jv.a.a($$3);
               jv.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jv.a<T> a() {
         return new jv.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<jr.c<T>> a(axj<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super axj<T>, ? super jr.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<jr.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jv.a<T> a(final Map<axj<T>, jr.c<T>> $$0) {
         return new jv.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<jr.c<T>> a(axj<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super axj<T>, ? super jr.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<jr.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<jr.c<T>> a(axj<T> var1);

      void a(BiConsumer<? super axj<T>, ? super jr.c<T>> var1);

      Stream<jr.c<T>> c();
   }
}
