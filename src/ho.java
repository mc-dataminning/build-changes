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

public class ho<T> implements ic<T> {
   private static final Logger b = LogUtils.getLogger();
   final aew<? extends ht<T>> c;
   private final ObjectList<hg.c<T>> d = new ObjectArrayList(256);
   private final Object2IntMap<T> e = ac.a(new Object2IntOpenCustomHashMap(ac.k()), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<aex, hg.c<T>> f = new HashMap<>();
   private final Map<aew<T>, hg.c<T>> g = new HashMap<>();
   private final Map<T, hg.c<T>> h = new IdentityHashMap<>();
   private final Map<T, Lifecycle> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<aqi<T>, hk.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, hg.c<T>> m;
   @Nullable
   private List<hg.c<T>> n;
   private int o;
   private final hi.c<T> p = new hi.c<T>() {
      @Override
      public aew<? extends ht<? extends T>> f() {
         return ho.this.c;
      }

      @Override
      public Lifecycle g() {
         return ho.this.d();
      }

      @Override
      public Optional<hg.c<T>> a(aew<T> $$0) {
         return ho.this.b($$0);
      }

      @Override
      public Stream<hg.c<T>> b() {
         return ho.this.h();
      }

      @Override
      public Optional<hk.c<T>> a(aqi<T> $$0) {
         return ho.this.b($$0);
      }

      @Override
      public Stream<hk.c<T>> d() {
         return ho.this.i().map(Pair::getSecond);
      }
   };

   public ho(aew<? extends ht<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public ho(aew<? extends ht<T>> $$0, Lifecycle $$1, boolean $$2) {
      aez.a(() -> "registry " + $$0);
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public aew<? extends ht<T>> c() {
      return this.c;
   }

   @Override
   public String toString() {
      return "Registry[" + this.c + " (" + this.j + ")]";
   }

   private List<hg.c<T>> a() {
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

   private void g(aew<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   public hg.c<T> a(int $$0, aew<T> $$1, T $$2, Lifecycle $$3) {
      this.g($$1);
      Validate.notNull($$1);
      Validate.notNull($$2);
      if (this.f.containsKey($$1.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$1 + "' to registry"));
      }

      if (this.h.containsKey($$2)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$2 + "' to registry"));
      }

      hg.c<T> $$4;
      if (this.m != null) {
         $$4 = this.m.remove($$2);
         if ($$4 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$1 + ":" + $$2);
         }

         $$4.b($$1);
      } else {
         $$4 = this.g.computeIfAbsent($$1, $$0x -> hg.c.a(this.o(), $$0x));
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
   public hg.c<T> a(aew<T> $$0, T $$1, Lifecycle $$2) {
      return this.a(this.o, $$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aex b(T $$0) {
      hg.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.g().a() : null;
   }

   @Override
   public Optional<aew<T>> c(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(hg.c::g);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable aew<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? a((hg.c<T>)this.d.get($$0)) : null;
   }

   @Override
   public Optional<hg.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((hg.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<hg.c<T>> b(aew<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public hg<T> d(T $$0) {
      hg.c<T> $$1 = this.h.get($$0);
      return (hg<T>)($$1 != null ? $$1 : hg.a($$0));
   }

   hg.c<T> h(aew<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.g($$0x);
            return hg.c.a(this.o(), $$0x);
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
      return Iterators.transform(this.a().iterator(), hg::a);
   }

   @Nullable
   @Override
   public T a(@Nullable aex $$0) {
      hg.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable hg.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<aex> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<aew<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<aew<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, hg::a).entrySet());
   }

   @Override
   public Stream<hg.c<T>> h() {
      return this.a().stream();
   }

   @Override
   public Stream<Pair<aqi<T>, hk.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public hk.c<T> a(aqi<T> $$0) {
      hk.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<aqi<T>, hk.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private hk.c<T> d(aqi<T> $$0) {
      return new hk.c<>(this.o(), $$0);
   }

   @Override
   public Stream<aqi<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<hg.c<T>> a(asc $$0) {
      return ac.b(this.a(), $$0);
   }

   @Override
   public boolean c(aex $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean c(aew<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public ht<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<aex> $$0 = this.g.entrySet().stream().filter($$0x -> !((hg.c)$$0x.getValue()).b()).map($$0x -> ((aew)$$0x.getKey()).a()).sorted().toList();
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
   public hg.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.v();
         return this.m.computeIfAbsent($$0, $$0x -> hg.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<hk.c<T>> b(aqi<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<aqi<T>, List<hg<T>>> $$0) {
      Map<hg.c<T>, List<aqi<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (hg<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof hg.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<aqi<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<aqi<T>, hk.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(hg.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public hh<T> n() {
      this.v();
      return new hh<T>() {
         @Override
         public Optional<hg.c<T>> a(aew<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hg.c<T> b(aew<T> $$0) {
            return ho.this.h($$0);
         }

         @Override
         public Optional<hk.c<T>> a(aqi<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hk.c<T> b(aqi<T> $$0) {
            return ho.this.a($$0);
         }
      };
   }

   @Override
   public hj<T> o() {
      return this.p;
   }

   @Override
   public hi.c<T> p() {
      return this.p;
   }
}
