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

public class jy<T> implements km<T> {
   private final alo<? extends kd<T>> b;
   private final ObjectList<jq.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = ae.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<alp, jq.c<T>> e = new HashMap<>();
   private final Map<alo<T>, jq.c<T>> f = new HashMap<>();
   private final Map<T, jq.c<T>> g = new IdentityHashMap<>();
   private final Map<alo<T>, kc> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<aya<T>, ju.c<T>> j = new IdentityHashMap<>();
   jy.a<T> k = jy.a.a();
   private boolean l;
   @Nullable
   private Map<T, jq.c<T>> m;

   @Override
   public Stream<ju.c<T>> e() {
      return this.l();
   }

   public jy(alo<? extends kd<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jy(alo<? extends kd<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public alo<? extends kd<T>> g() {
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

   private void h(alo<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jq.c<T> a(alo<T> $$0, T $$1, kc $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)ae.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)ae.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         jq.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> jq.c.a(this, $$0x));
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
   public alp b(T $$0) {
      jq.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<alo<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(jq.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T c(@Nullable alo<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((jq.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<jq.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((jq.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jq.c<T>> c(alp $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<jq.c<T>> a(alo<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jq.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((jq.c<T>)this.c.getFirst());
   }

   @Override
   public jq<T> e(T $$0) {
      jq.c<T> $$1 = this.g.get($$0);
      return (jq<T>)($$1 != null ? $$1 : jq.a($$0));
   }

   jq.c<T> i(alo<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jq.c.a(this, $$0x);
         }
      });
   }

   @Override
   public int d() {
      return this.f.size();
   }

   @Override
   public Optional<kc> d(alo<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle h() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), jq::a);
   }

   @Nullable
   @Override
   public T a(@Nullable alp $$0) {
      jq.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jq.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<alp> i() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<alo<T>> j() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<alo<T>, T>> k() {
      return Collections.unmodifiableSet(Maps.transformValues(this.f, jq::a).entrySet());
   }

   @Override
   public Stream<jq.c<T>> c() {
      return this.c.stream();
   }

   @Override
   public Stream<ju.c<T>> l() {
      return this.k.c();
   }

   ju.c<T> d(aya<T> $$0) {
      return this.j.computeIfAbsent($$0, this::e);
   }

   private ju.c<T> e(aya<T> $$0) {
      return new ju.c<>(this, $$0);
   }

   @Override
   public boolean m() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<jq.c<T>> a(bac $$0) {
      return ae.b(this.c, $$0);
   }

   @Override
   public boolean d(alp $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean e(alo<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public kd<T> n() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<alp> $$0 = this.f.entrySet().stream().filter($$0x -> !((jq.c)$$0x.getValue()).b()).map($$0x -> ((alo)$$0x.getKey()).a()).sorted().toList();
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
               List<alp> $$1 = this.j.entrySet().stream().filter($$0x -> !((ju.c)$$0x.getValue()).c()).map($$0x -> ((aya)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.g() + ": " + $$1);
               } else {
                  this.k = jy.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public jq.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jq.c.a(this, (T)$$0x));
      }
   }

   @Override
   public Optional<ju.c<T>> a(aya<T> $$0) {
      return this.k.a($$0);
   }

   private jq.c<T> a(aya<T> $$0, jq<T> $$1) {
      if (!$$1.a(this)) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof jq.c) {
         return (jq.c<T>)$$1;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(aya<T> $$0, List<jq<T>> $$1) {
      this.b();
      this.d($$0).b($$1);
   }

   void u() {
      Map<jq.c<T>, List<aya<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((jq.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (jq<T> $$3 : $$2) {
            jq.c<T> $$4 = this.a((aya<T>)$$1, $$3);
            $$0.get($$4).add((aya<T>)$$1);
         }
      });
      $$0.forEach(jq.c::a);
   }

   public void o() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jr<T> p() {
      this.b();
      return new jr<T>() {
         @Override
         public Optional<jq.c<T>> a(alo<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jq.c<T> b(alo<T> $$0) {
            return jy.this.i($$0);
         }

         @Override
         public Optional<ju.c<T>> a(aya<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ju.c<T> b(aya<T> $$0) {
            return jy.this.d($$0);
         }
      };
   }

   @Override
   public kd.a<T> a(ayb.c<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<aya<T>, ju.c<T>> $$1 = ImmutableMap.builder();
         final Map<aya<T>, List<jq<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            ju.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.e($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<aya<T>, ju.c<T>> $$3 = $$1.build();
         final js.b<T> $$4 = new js.b.a<T>() {
            @Override
            public js.b<T> a() {
               return jy.this;
            }

            @Override
            public Optional<ju.c<T>> a(aya<T> $$0) {
               return Optional.ofNullable((ju.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<ju.c<T>> e() {
               return $$3.values().stream();
            }
         };
         return new kd.a<T>() {
            @Override
            public alo<? extends kd<? extends T>> a() {
               return jy.this.g();
            }

            @Override
            public int b() {
               return $$2.size();
            }

            @Override
            public js.b<T> c() {
               return $$4;
            }

            @Override
            public void d() {
               $$3.forEach(($$1, $$2xx) -> {
                  List<jq<T>> $$3xx = $$2.getOrDefault($$1, List.of());
                  $$2xx.b($$3xx);
               });
               jy.this.k = jy.a.a($$3);
               jy.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jy.a<T> a() {
         return new jy.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<ju.c<T>> a(aya<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super aya<T>, ? super ju.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<ju.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jy.a<T> a(final Map<aya<T>, ju.c<T>> $$0) {
         return new jy.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<ju.c<T>> a(aya<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super aya<T>, ? super ju.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<ju.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<ju.c<T>> a(aya<T> var1);

      void a(BiConsumer<? super aya<T>, ? super ju.c<T>> var1);

      Stream<ju.c<T>> c();
   }
}
