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

public class jr<T> implements kf<T> {
   private static final Logger b = LogUtils.getLogger();
   final akj<? extends jw<T>> c;
   private final ObjectList<jj.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ac.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<akk, jj.c<T>> f = new HashMap<>();
   private final Map<akj<T>, jj.c<T>> g = new HashMap<>();
   private final Map<T, jj.c<T>> h = new IdentityHashMap<>();
   private final Map<akj<T>, jv> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<awm<T>, jn.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, jj.c<T>> m;
   private final jl.b<T> n = new jl.b<T>() {
      @Override
      public akj<? extends jw<? extends T>> f() {
         return jr.this.c;
      }

      @Override
      public Lifecycle g() {
         return jr.this.e();
      }

      @Override
      public Optional<jj.c<T>> a(akj<T> $$0) {
         return jr.this.b($$0);
      }

      @Override
      public Stream<jj.c<T>> b() {
         return jr.this.i();
      }

      @Override
      public Optional<jn.c<T>> a(awm<T> $$0) {
         return jr.this.b($$0);
      }

      @Override
      public Stream<jn.c<T>> d() {
         return jr.this.j().map(Pair::getSecond);
      }
   };
   private final Object o = new Object();

   public jr(akj<? extends jw<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jr(akj<? extends jw<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public akj<? extends jw<T>> d() {
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

   private void h(akj<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jj.c<T> a(akj<T> $$0, T $$1, jv $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.f.containsKey($$0.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      }

      if (this.h.containsKey($$1)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      }

      jj.c<T> $$3;
      if (this.m != null) {
         $$3 = this.m.remove($$1);
         if ($$3 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
         }

         $$3.b($$0);
      } else {
         $$3 = this.g.computeIfAbsent($$0, $$0x -> jj.c.a(this.p(), $$0x));
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
   public akk b(T $$0) {
      jj.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<akj<T>> d(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(jj.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable akj<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? ((jj.c)this.d.get($$0)).a() : null);
   }

   @Override
   public Optional<jj.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((jj.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jj.c<T>> c(akk $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jj.c<T>> b(akj<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public Optional<jj.c<T>> a() {
      return this.d.isEmpty() ? Optional.empty() : Optional.of((jj.c<T>)this.d.getFirst());
   }

   @Override
   public jj<T> e(T $$0) {
      jj.c<T> $$1 = this.h.get($$0);
      return (jj<T>)($$1 != null ? $$1 : jj.a($$0));
   }

   jj.c<T> i(akj<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jj.c.a(this.p(), $$0x);
         }
      });
   }

   @Override
   public int c() {
      return this.g.size();
   }

   @Override
   public Optional<jv> c(akj<T> $$0) {
      return Optional.ofNullable(this.i.get($$0));
   }

   @Override
   public Lifecycle e() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.d.iterator(), jj::a);
   }

   @Nullable
   @Override
   public T a(@Nullable akk $$0) {
      jj.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jj.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<akk> f() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<akj<T>> g() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<akj<T>, T>> h() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, jj::a).entrySet());
   }

   @Override
   public Stream<jj.c<T>> i() {
      return this.d.stream();
   }

   @Override
   public Stream<Pair<awm<T>, jn.c<T>>> j() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public jn.c<T> a(awm<T> $$0) {
      jn.c<T> $$1 = this.k.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         synchronized (this.o) {
            $$1 = this.k.get($$0);
            if ($$1 != null) {
               return $$1;
            } else {
               $$1 = this.d($$0);
               Map<awm<T>, jn.c<T>> $$2 = new IdentityHashMap<>(this.k);
               $$2.put($$0, $$1);
               this.k = $$2;
               return $$1;
            }
         }
      }
   }

   private jn.c<T> d(awm<T> $$0) {
      return new jn.c<>(this.p(), $$0);
   }

   @Override
   public Stream<awm<T>> k() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean l() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<jj.c<T>> a(ayo $$0) {
      return ac.b(this.d, $$0);
   }

   @Override
   public boolean d(akk $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean d(akj<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public jw<T> m() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<akk> $$0 = this.g.entrySet().stream().filter($$0x -> !((jj.c)$$0x.getValue()).b()).map($$0x -> ((akj)$$0x.getKey()).a()).sorted().toList();
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
   public jj.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jj.c.a(this.q(), (T)$$0x));
      }
   }

   @Override
   public Optional<jn.c<T>> b(awm<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<awm<T>, List<jj<T>>> $$0) {
      Map<jj.c<T>, List<awm<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (jj<T> $$3x : $$2x) {
            if (!$$3x.a(this.q())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof jj.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<awm<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.d(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      synchronized (this.o) {
         Map<awm<T>, jn.c<T>> $$3 = new IdentityHashMap<>(this.k);
         $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
         $$1.forEach(jj.c::a);
         this.k = $$3;
      }
   }

   @Override
   public void n() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public jk<T> o() {
      this.b();
      return new jk<T>() {
         @Override
         public Optional<jj.c<T>> a(akj<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jj.c<T> b(akj<T> $$0) {
            return jr.this.i($$0);
         }

         @Override
         public Optional<jn.c<T>> a(awm<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jn.c<T> b(awm<T> $$0) {
            return jr.this.a($$0);
         }
      };
   }

   @Override
   public jm<T> p() {
      return this.n;
   }

   @Override
   public jl.b<T> q() {
      return this.n;
   }
}
