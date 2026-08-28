import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
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

public class jm<T> implements ka<T> {
   private final alf<? extends jr<T>> b;
   private final ObjectList<je.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = af.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<alg, je.c<T>> e = new HashMap<>();
   private final Map<alf<T>, je.c<T>> f = new HashMap<>();
   private final Map<T, je.c<T>> g = new IdentityHashMap<>();
   private final Map<alf<T>, jq> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<axr<T>, ji.c<T>> j = new IdentityHashMap<>();
   jm.a<T> k = jm.a.a();
   private boolean l;
   @Nullable
   private Map<T, je.c<T>> m;

   @Override
   public Stream<ji.c<T>> e() {
      return this.l();
   }

   public jm(alf<? extends jr<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jm(alf<? extends jr<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public alf<? extends jr<T>> g() {
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

   private void h(alf<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public je.c<T> a(alf<T> $$0, T $$1, jq $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)af.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)af.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         je.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> je.c.a(this, $$0x));
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
   public alg b(T $$0) {
      je.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<alf<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(je.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T c(@Nullable alf<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((je.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<je.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((je.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<je.c<T>> c(alg $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<je.c<T>> a(alf<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<je.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((je.c<T>)this.c.getFirst());
   }

   @Override
   public je<T> e(T $$0) {
      je.c<T> $$1 = this.g.get($$0);
      return (je<T>)($$1 != null ? $$1 : je.a($$0));
   }

   je.c<T> i(alf<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return je.c.a(this, $$0x);
         }
      });
   }

   @Override
   public int d() {
      return this.f.size();
   }

   @Override
   public Optional<jq> d(alf<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle h() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), je::a);
   }

   @Nullable
   @Override
   public T a(@Nullable alg $$0) {
      je.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable je.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<alg> i() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<alf<T>> j() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<alf<T>, T>> k() {
      return Collections.unmodifiableSet(af.<alf<T>, je.c<T>, T>a(this.f, je::a).entrySet());
   }

   @Override
   public Stream<je.c<T>> c() {
      return this.c.stream();
   }

   @Override
   public Stream<ji.c<T>> l() {
      return this.k.c();
   }

   ji.c<T> d(axr<T> $$0) {
      return this.j.computeIfAbsent($$0, this::e);
   }

   private ji.c<T> e(axr<T> $$0) {
      return new ji.c<>(this, $$0);
   }

   @Override
   public boolean m() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<je.c<T>> a(azv $$0) {
      return af.b(this.c, $$0);
   }

   @Override
   public boolean d(alg $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean e(alf<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public jr<T> n() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<alg> $$0 = this.f.entrySet().stream().filter($$0x -> !((je.c)$$0x.getValue()).b()).map($$0x -> ((alf)$$0x.getKey()).a()).sorted().toList();
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
               List<alg> $$1 = this.j.entrySet().stream().filter($$0x -> !((ji.c)$$0x.getValue()).c()).map($$0x -> ((axr)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.g() + ": " + $$1);
               } else {
                  this.k = jm.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public je.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> je.c.a(this, (T)$$0x));
      }
   }

   @Override
   public Optional<ji.c<T>> a(axr<T> $$0) {
      return this.k.a($$0);
   }

   private je.c<T> a(axr<T> $$0, je<T> $$1) {
      if (!$$1.a(this)) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof je.c) {
         return (je.c<T>)$$1;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(axr<T> $$0, List<je<T>> $$1) {
      this.b();
      this.d($$0).b($$1);
   }

   void u() {
      Map<je.c<T>, List<axr<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((je.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (je<T> $$3 : $$2) {
            je.c<T> $$4 = this.a((axr<T>)$$1, $$3);
            $$0.get($$4).add((axr<T>)$$1);
         }
      });
      $$0.forEach(je.c::a);
   }

   public void o() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jf<T> p() {
      this.b();
      return new jf<T>() {
         @Override
         public Optional<je.c<T>> a(alf<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public je.c<T> b(alf<T> $$0) {
            return jm.this.i($$0);
         }

         @Override
         public Optional<ji.c<T>> a(axr<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ji.c<T> b(axr<T> $$0) {
            return jm.this.d($$0);
         }
      };
   }

   @Override
   public jr.a<T> a(axs.c<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<axr<T>, ji.c<T>> $$1 = ImmutableMap.builder();
         final Map<axr<T>, List<je<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            ji.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.e($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<axr<T>, ji.c<T>> $$3 = $$1.build();
         final jg.b<T> $$4 = new jg.b.a<T>() {
            @Override
            public jg.b<T> a() {
               return jm.this;
            }

            @Override
            public Optional<ji.c<T>> a(axr<T> $$0) {
               return Optional.ofNullable((ji.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<ji.c<T>> e() {
               return $$3.values().stream();
            }
         };
         return new jr.a<T>() {
            @Override
            public alf<? extends jr<? extends T>> a() {
               return jm.this.g();
            }

            @Override
            public int b() {
               return $$2.size();
            }

            @Override
            public jg.b<T> c() {
               return $$4;
            }

            @Override
            public void d() {
               $$3.forEach(($$1, $$2xx) -> {
                  List<je<T>> $$3xx = $$2.getOrDefault($$1, List.of());
                  $$2xx.b($$3xx);
               });
               jm.this.k = jm.a.a($$3);
               jm.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jm.a<T> a() {
         return new jm.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<ji.c<T>> a(axr<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super axr<T>, ? super ji.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<ji.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jm.a<T> a(final Map<axr<T>, ji.c<T>> $$0) {
         return new jm.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<ji.c<T>> a(axr<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super axr<T>, ? super ji.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<ji.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<ji.c<T>> a(axr<T> var1);

      void a(BiConsumer<? super axr<T>, ? super ji.c<T>> var1);

      Stream<ji.c<T>> c();
   }
}
