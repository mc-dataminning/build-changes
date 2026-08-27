import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class jf<T> implements jt<T> {
   private static final Logger b = LogUtils.getLogger();
   final akm<? extends jk<T>> c;
   private final ObjectList<ix.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ac.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<akn, ix.c<T>> f = new HashMap<>();
   private final Map<akm<T>, ix.c<T>> g = new HashMap<>();
   private final Map<T, ix.c<T>> h = new IdentityHashMap<>();
   private final Map<akm<T>, jj> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<awm<T>, jb.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, ix.c<T>> m;
   private final iz.b<T> n = new iz.b<T>() {
      @Override
      public akm<? extends jk<? extends T>> f() {
         return jf.this.c;
      }

      @Override
      public Lifecycle g() {
         return jf.this.d();
      }

      @Override
      public Optional<ix.c<T>> a(akm<T> $$0) {
         return jf.this.b($$0);
      }

      @Override
      public Stream<ix.c<T>> b() {
         return jf.this.h();
      }

      @Override
      public Optional<jb.c<T>> a(awm<T> $$0) {
         return jf.this.b($$0);
      }

      @Override
      public Stream<jb.c<T>> d() {
         return jf.this.i().map(Pair::getSecond);
      }
   };

   public jf(akm<? extends jk<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jf(akm<? extends jk<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public akm<? extends jk<T>> c() {
      return this.c;
   }

   @Override
   public String toString() {
      return "Registry[" + this.c + " (" + this.j + ")]";
   }

   private void a() {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   private void h(akm<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public ix.c<T> a(akm<T> $$0, T $$1, jj $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.f.containsKey($$0.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      }

      if (this.h.containsKey($$1)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      }

      ix.c<T> $$3;
      if (this.m != null) {
         $$3 = this.m.remove($$1);
         if ($$3 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
         }

         $$3.b($$0);
      } else {
         $$3 = this.g.computeIfAbsent($$0, $$0x -> ix.c.a(this.o(), $$0x));
      }

      this.g.put($$0, $$3);
      this.f.put($$0.a(), $$3);
      this.h.put($$1, $$3);
      int $$5 = this.d.size();
      this.d.add($$3);
      this.e.put($$1, $$5);
      this.i.put($$0, $$2);
      this.j = this.j.add($$2.b());
      return $$3;
   }

   @Nullable
   @Override
   public akn b(T $$0) {
      ix.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<akm<T>> d(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(ix.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable akm<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? ((ix.c)this.d.get($$0)).a() : null);
   }

   @Override
   public Optional<ix.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((ix.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<ix.c<T>> c(akn $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<ix.c<T>> b(akm<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public ix<T> e(T $$0) {
      ix.c<T> $$1 = this.h.get($$0);
      return (ix<T>)($$1 != null ? $$1 : ix.a($$0));
   }

   ix.c<T> i(akm<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return ix.c.a(this.o(), $$0x);
         }
      });
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public Optional<jj> c(akm<T> $$0) {
      return Optional.ofNullable(this.i.get($$0));
   }

   @Override
   public Lifecycle d() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.d.iterator(), ix::a);
   }

   @Nullable
   @Override
   public T a(@Nullable akn $$0) {
      ix.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable ix.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<akn> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<akm<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<akm<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, ix::a).entrySet());
   }

   @Override
   public Stream<ix.c<T>> h() {
      return this.d.stream();
   }

   @Override
   public Stream<Pair<awm<T>, jb.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public jb.c<T> a(awm<T> $$0) {
      jb.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<awm<T>, jb.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private jb.c<T> d(awm<T> $$0) {
      return new jb.c<>(this.o(), $$0);
   }

   @Override
   public Stream<awm<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<ix.c<T>> a(aym $$0) {
      return ac.b(this.d, $$0);
   }

   @Override
   public boolean d(akn $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean d(akm<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public jk<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<akn> $$0 = this.g.entrySet().stream().filter($$0x -> !((ix.c)$$0x.getValue()).b()).map($$0x -> ((akm)$$0x.getKey()).a()).sorted().toList();
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
   public ix.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.a();
         return this.m.computeIfAbsent($$0, $$0x -> ix.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<jb.c<T>> b(awm<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<awm<T>, List<ix<T>>> $$0) {
      Map<ix.c<T>, List<awm<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (ix<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof ix.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<awm<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<awm<T>, jb.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(ix.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public iy<T> n() {
      this.a();
      return new iy<T>() {
         @Override
         public Optional<ix.c<T>> a(akm<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ix.c<T> b(akm<T> $$0) {
            return jf.this.i($$0);
         }

         @Override
         public Optional<jb.c<T>> a(awm<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jb.c<T> b(awm<T> $$0) {
            return jf.this.a($$0);
         }
      };
   }

   @Override
   public ja<T> o() {
      return this.n;
   }

   @Override
   public iz.b<T> p() {
      return this.n;
   }
}
