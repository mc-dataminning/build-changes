import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class hn<T> implements ib<T> {
   private static final Logger b = LogUtils.getLogger();
   final aeo<? extends hs<T>> c;
   private final ObjectList<hf.c<T>> d = new ObjectArrayList(256);
   private final Object2IntMap<T> e = ac.a(new Object2IntOpenCustomHashMap(ac.k()), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<aep, hf.c<T>> f = new HashMap<>();
   private final Map<aeo<T>, hf.c<T>> g = new HashMap<>();
   private final Map<T, hf.c<T>> h = new IdentityHashMap<>();
   private final Map<T, Lifecycle> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<apy<T>, hj.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, hf.c<T>> m;
   @Nullable
   private List<hf.c<T>> n;
   private int o;
   private final hh.c<T> p = new hh.c<T>() {
      @Override
      public aeo<? extends hs<? extends T>> f() {
         return hn.this.c;
      }

      @Override
      public Lifecycle g() {
         return hn.this.d();
      }

      @Override
      public Optional<hf.c<T>> a(aeo<T> $$0) {
         return hn.this.b($$0);
      }

      @Override
      public Stream<hf.c<T>> b() {
         return hn.this.h();
      }

      @Override
      public Optional<hj.c<T>> a(apy<T> $$0) {
         return hn.this.b($$0);
      }

      @Override
      public Stream<hj.c<T>> d() {
         return hn.this.i().map(Pair::getSecond);
      }
   };

   public hn(aeo<? extends hs<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public hn(aeo<? extends hs<T>> $$0, Lifecycle $$1, boolean $$2) {
      aer.a(() -> "registry " + $$0);
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public aeo<? extends hs<T>> c() {
      return this.c;
   }

   @Override
   public String toString() {
      return "Registry[" + this.c + " (" + this.j + ")]";
   }

   private List<hf.c<T>> a() {
      if (this.n == null) {
         this.n = this.d.stream().filter(Objects::nonNull).toList();
      }

      return this.n;
   }

   private void v() {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   private void g(aeo<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   public hf.c<T> a(int $$0, aeo<T> $$1, T $$2, Lifecycle $$3) {
      this.g($$1);
      Validate.notNull($$1);
      Validate.notNull($$2);
      if (this.f.containsKey($$1.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$1 + "' to registry"));
      }

      if (this.h.containsKey($$2)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$2 + "' to registry"));
      }

      hf.c<T> $$4;
      if (this.m != null) {
         $$4 = this.m.remove($$2);
         if ($$4 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$1 + ":" + $$2);
         }

         $$4.b($$1);
      } else {
         $$4 = this.g.computeIfAbsent($$1, $$0x -> hf.c.a(this.o(), $$0x));
      }

      this.g.put($$1, $$4);
      this.f.put($$1.a(), $$4);
      this.h.put($$2, $$4);
      this.d.size(Math.max(this.d.size(), $$0 + 1));
      this.d.set($$0, $$4);
      this.e.put($$2, $$0);
      if (this.o <= $$0) {
         this.o = $$0 + 1;
      }

      this.i.put($$2, $$3);
      this.j = this.j.add($$3);
      this.n = null;
      return $$4;
   }

   @Override
   public hf.c<T> a(aeo<T> $$0, T $$1, Lifecycle $$2) {
      return this.a(this.o, $$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aep b(T $$0) {
      hf.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.g().a() : null;
   }

   @Override
   public Optional<aeo<T>> c(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(hf.c::g);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable aeo<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? a((hf.c<T>)this.d.get($$0)) : null;
   }

   @Override
   public Optional<hf.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((hf.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<hf.c<T>> b(aeo<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public hf<T> d(T $$0) {
      hf.c<T> $$1 = this.h.get($$0);
      return (hf<T>)($$1 != null ? $$1 : hf.a($$0));
   }

   hf.c<T> h(aeo<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.g($$0x);
            return hf.c.a(this.o(), $$0x);
         }
      });
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public Lifecycle e(T $$0) {
      return this.i.get($$0);
   }

   @Override
   public Lifecycle d() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.a().iterator(), hf::a);
   }

   @Nullable
   @Override
   public T a(@Nullable aep $$0) {
      hf.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable hf.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<aep> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<aeo<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<aeo<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, hf::a).entrySet());
   }

   @Override
   public Stream<hf.c<T>> h() {
      return this.a().stream();
   }

   @Override
   public Stream<Pair<apy<T>, hj.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public hj.c<T> a(apy<T> $$0) {
      hj.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<apy<T>, hj.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private hj.c<T> d(apy<T> $$0) {
      return new hj.c<>(this.o(), $$0);
   }

   @Override
   public Stream<apy<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<hf.c<T>> a(art $$0) {
      return ac.b(this.a(), $$0);
   }

   @Override
   public boolean c(aep $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean c(aeo<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public hs<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<aep> $$0 = this.g.entrySet().stream().filter($$0x -> !((hf.c)$$0x.getValue()).b()).map($$0x -> ((aeo)$$0x.getKey()).a()).sorted().toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.c() + ": " + $$0);
         } else {
            if (this.m != null) {
               if (!this.m.isEmpty()) {
                  throw new IllegalStateException("Some intrusive holders were not registered: " + this.m.values());
               }

               this.m = null;
            }

            return this;
         }
      }
   }

   @Override
   public hf.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.v();
         return this.m.computeIfAbsent($$0, $$0x -> hf.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<hj.c<T>> b(apy<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<apy<T>, List<hf<T>>> $$0) {
      Map<hf.c<T>, List<apy<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (hf<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof hf.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<apy<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<apy<T>, hj.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(hf.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public hg<T> n() {
      this.v();
      return new hg<T>() {
         @Override
         public Optional<hf.c<T>> a(aeo<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hf.c<T> b(aeo<T> $$0) {
            return hn.this.h($$0);
         }

         @Override
         public Optional<hj.c<T>> a(apy<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hj.c<T> b(apy<T> $$0) {
            return hn.this.a($$0);
         }
      };
   }

   @Override
   public hi<T> o() {
      return this.p;
   }

   @Override
   public hh.c<T> p() {
      return this.p;
   }
}
