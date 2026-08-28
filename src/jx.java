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

public class jx<T> implements kl<T> {
   private final alg<? extends kc<T>> b;
   private final ObjectList<jp.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = ad.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<alh, jp.c<T>> e = new HashMap<>();
   private final Map<alg<T>, jp.c<T>> f = new HashMap<>();
   private final Map<T, jp.c<T>> g = new IdentityHashMap<>();
   private final Map<alg<T>, kb> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<axp<T>, jt.c<T>> j = new IdentityHashMap<>();
   jx.a<T> k = jx.a.a();
   private boolean l;
   @Nullable
   private Map<T, jp.c<T>> m;

   @Override
   public Stream<jt.c<T>> e() {
      return this.l();
   }

   public jx(alg<? extends kc<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jx(alg<? extends kc<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public alg<? extends kc<T>> g() {
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

   private void h(alg<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jp.c<T> a(alg<T> $$0, T $$1, kb $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)ad.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)ad.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         jp.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> jp.c.a(this, $$0x));
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
   public alh b(T $$0) {
      jp.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<alg<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(jp.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T c(@Nullable alg<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((jp.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<jp.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((jp.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jp.c<T>> c(alh $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<jp.c<T>> a(alg<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jp.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((jp.c<T>)this.c.getFirst());
   }

   @Override
   public jp<T> e(T $$0) {
      jp.c<T> $$1 = this.g.get($$0);
      return (jp<T>)($$1 != null ? $$1 : jp.a($$0));
   }

   jp.c<T> i(alg<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jp.c.a(this, $$0x);
         }
      });
   }

   @Override
   public int d() {
      return this.f.size();
   }

   @Override
   public Optional<kb> d(alg<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle h() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), jp::a);
   }

   @Nullable
   @Override
   public T a(@Nullable alh $$0) {
      jp.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jp.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<alh> i() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<alg<T>> j() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<alg<T>, T>> k() {
      return Collections.unmodifiableSet(Maps.transformValues(this.f, jp::a).entrySet());
   }

   @Override
   public Stream<jp.c<T>> c() {
      return this.c.stream();
   }

   @Override
   public Stream<jt.c<T>> l() {
      return this.k.c();
   }

   jt.c<T> d(axp<T> $$0) {
      return this.j.computeIfAbsent($$0, this::e);
   }

   private jt.c<T> e(axp<T> $$0) {
      return new jt.c<>(this, $$0);
   }

   @Override
   public boolean m() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<jp.c<T>> a(azr $$0) {
      return ad.b(this.c, $$0);
   }

   @Override
   public boolean d(alh $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean e(alg<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public kc<T> n() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<alh> $$0 = this.f.entrySet().stream().filter($$0x -> !((jp.c)$$0x.getValue()).b()).map($$0x -> ((alg)$$0x.getKey()).a()).sorted().toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.g() + ": " + $$0);
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
               List<alh> $$1 = this.j.entrySet().stream().filter($$0x -> !((jt.c)$$0x.getValue()).c()).map($$0x -> ((axp)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.g() + ": " + $$1);
               } else {
                  this.k = jx.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public jp.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jp.c.a(this, (T)$$0x));
      }
   }

   @Override
   public Optional<jt.c<T>> a(axp<T> $$0) {
      return this.k.a($$0);
   }

   private jp.c<T> a(axp<T> $$0, jp<T> $$1) {
      if (!$$1.a(this)) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof jp.c) {
         return (jp.c<T>)$$1;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(axp<T> $$0, List<jp<T>> $$1) {
      this.b();
      this.d($$0).b($$1);
   }

   void u() {
      Map<jp.c<T>, List<axp<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((jp.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (jp<T> $$3 : $$2) {
            jp.c<T> $$4 = this.a((axp<T>)$$1, $$3);
            $$0.get($$4).add((axp<T>)$$1);
         }
      });
      $$0.forEach(jp.c::a);
   }

   public void o() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jq<T> p() {
      this.b();
      return new jq<T>() {
         @Override
         public Optional<jp.c<T>> a(alg<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jp.c<T> b(alg<T> $$0) {
            return jx.this.i($$0);
         }

         @Override
         public Optional<jt.c<T>> a(axp<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jt.c<T> b(axp<T> $$0) {
            return jx.this.d($$0);
         }
      };
   }

   @Override
   public kc.a<T> a(axq.b<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<axp<T>, jt.c<T>> $$1 = ImmutableMap.builder();
         final Map<axp<T>, List<jp<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            jt.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.e($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<axp<T>, jt.c<T>> $$3 = $$1.build();
         final jr.b<T> $$4 = new jr.b.a<T>() {
            @Override
            public jr.b<T> a() {
               return jx.this;
            }

            @Override
            public Optional<jt.c<T>> a(axp<T> $$0) {
               return Optional.ofNullable((jt.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<jt.c<T>> e() {
               return $$3.values().stream();
            }
         };
         return new kc.a<T>() {
            @Override
            public alg<? extends kc<? extends T>> a() {
               return jx.this.g();
            }

            @Override
            public jr.b<T> b() {
               return $$4;
            }

            @Override
            public void c() {
               $$3.forEach(($$1, $$2xx) -> {
                  List<jp<T>> $$3xx = $$2.getOrDefault($$1, List.of());
                  $$2xx.b($$3xx);
               });
               jx.this.k = jx.a.a($$3);
               jx.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jx.a<T> a() {
         return new jx.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<jt.c<T>> a(axp<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super axp<T>, ? super jt.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<jt.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jx.a<T> a(final Map<axp<T>, jt.c<T>> $$0) {
         return new jx.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<jt.c<T>> a(axp<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super axp<T>, ? super jt.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<jt.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<jt.c<T>> a(axp<T> var1);

      void a(BiConsumer<? super axp<T>, ? super jt.c<T>> var1);

      Stream<jt.c<T>> c();
   }
}
