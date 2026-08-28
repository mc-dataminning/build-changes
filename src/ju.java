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

public class ju<T> implements ki<T> {
   private static final Logger b = LogUtils.getLogger();
   final akq<? extends jz<T>> c;
   private final ObjectList<jm.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ad.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<akr, jm.c<T>> f = new HashMap<>();
   private final Map<akq<T>, jm.c<T>> g = new HashMap<>();
   private final Map<T, jm.c<T>> h = new IdentityHashMap<>();
   private final Map<akq<T>, jy> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<awu<T>, jq.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, jm.c<T>> m;
   private final jo.b<T> n = new jo.b<T>() {
      @Override
      public akq<? extends jz<? extends T>> f() {
         return ju.this.c;
      }

      @Override
      public Lifecycle g() {
         return ju.this.e();
      }

      @Override
      public Optional<jm.c<T>> a(akq<T> $$0) {
         return ju.this.b($$0);
      }

      @Override
      public Stream<jm.c<T>> b() {
         return ju.this.i();
      }

      @Override
      public Optional<jq.c<T>> a(awu<T> $$0) {
         return ju.this.b($$0);
      }

      @Override
      public Stream<jq.c<T>> d() {
         return ju.this.j().map(Pair::getSecond);
      }
   };
   private final Object o = new Object();

   public ju(akq<? extends jz<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public ju(akq<? extends jz<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public akq<? extends jz<T>> d() {
      return this.c;
   }

   @Override
   public String toString() {
      return "Registry[" + this.c + " (" + this.j + ")]";
   }

   private void b() {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   private void h(akq<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jm.c<T> a(akq<T> $$0, T $$1, jy $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.f.containsKey($$0.a())) {
         ad.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      }

      if (this.h.containsKey($$1)) {
         ad.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      }

      jm.c<T> $$3;
      if (this.m != null) {
         $$3 = this.m.remove($$1);
         if ($$3 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
         }

         $$3.b($$0);
      } else {
         $$3 = this.g.computeIfAbsent($$0, $$0x -> jm.c.a(this.p(), $$0x));
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
   public akr b(T $$0) {
      jm.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<akq<T>> d(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(jm.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable akq<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? ((jm.c)this.d.get($$0)).a() : null);
   }

   @Override
   public Optional<jm.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((jm.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jm.c<T>> c(akr $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jm.c<T>> b(akq<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public Optional<jm.c<T>> a() {
      return this.d.isEmpty() ? Optional.empty() : Optional.of((jm.c<T>)this.d.getFirst());
   }

   @Override
   public jm<T> e(T $$0) {
      jm.c<T> $$1 = this.h.get($$0);
      return (jm<T>)($$1 != null ? $$1 : jm.a($$0));
   }

   jm.c<T> i(akq<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jm.c.a(this.p(), $$0x);
         }
      });
   }

   @Override
   public int c() {
      return this.g.size();
   }

   @Override
   public Optional<jy> c(akq<T> $$0) {
      return Optional.ofNullable(this.i.get($$0));
   }

   @Override
   public Lifecycle e() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.d.iterator(), jm::a);
   }

   @Nullable
   @Override
   public T a(@Nullable akr $$0) {
      jm.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jm.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<akr> f() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<akq<T>> g() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<akq<T>, T>> h() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, jm::a).entrySet());
   }

   @Override
   public Stream<jm.c<T>> i() {
      return this.d.stream();
   }

   @Override
   public Stream<Pair<awu<T>, jq.c<T>>> j() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public jq.c<T> a(awu<T> $$0) {
      jq.c<T> $$1 = this.k.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         synchronized (this.o) {
            $$1 = this.k.get($$0);
            if ($$1 != null) {
               return $$1;
            } else {
               $$1 = this.d($$0);
               Map<awu<T>, jq.c<T>> $$2 = new IdentityHashMap<>(this.k);
               $$2.put($$0, $$1);
               this.k = $$2;
               return $$1;
            }
         }
      }
   }

   private jq.c<T> d(awu<T> $$0) {
      return new jq.c<>(this.p(), $$0);
   }

   @Override
   public Stream<awu<T>> k() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean l() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<jm.c<T>> a(ayw $$0) {
      return ad.b(this.d, $$0);
   }

   @Override
   public boolean d(akr $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean d(akq<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public jz<T> m() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<akr> $$0 = this.g.entrySet().stream().filter($$0x -> !((jm.c)$$0x.getValue()).b()).map($$0x -> ((akq)$$0x.getKey()).a()).sorted().toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.d() + ": " + $$0);
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
   public jm.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jm.c.a(this.q(), (T)$$0x));
      }
   }

   @Override
   public Optional<jq.c<T>> b(awu<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<awu<T>, List<jm<T>>> $$0) {
      Map<jm.c<T>, List<awu<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (jm<T> $$3x : $$2x) {
            if (!$$3x.a(this.q())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof jm.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<awu<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.d(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      synchronized (this.o) {
         Map<awu<T>, jq.c<T>> $$3 = new IdentityHashMap<>(this.k);
         $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
         $$1.forEach(jm.c::a);
         this.k = $$3;
      }
   }

   @Override
   public void n() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public jn<T> o() {
      this.b();
      return new jn<T>() {
         @Override
         public Optional<jm.c<T>> a(akq<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jm.c<T> b(akq<T> $$0) {
            return ju.this.i($$0);
         }

         @Override
         public Optional<jq.c<T>> a(awu<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jq.c<T> b(awu<T> $$0) {
            return ju.this.a($$0);
         }
      };
   }

   @Override
   public jp<T> p() {
      return this.n;
   }

   @Override
   public jo.b<T> q() {
      return this.n;
   }
}
