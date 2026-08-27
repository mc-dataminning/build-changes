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
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class io<T> implements jb<T> {
   private static final Logger b = LogUtils.getLogger();
   final agl<? extends is<T>> c;
   private final ObjectList<ig.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ac.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<agm, ig.c<T>> f = new HashMap<>();
   private final Map<agl<T>, ig.c<T>> g = new HashMap<>();
   private final Map<T, ig.c<T>> h = new IdentityHashMap<>();
   private final Map<T, Lifecycle> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<arz<T>, ik.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, ig.c<T>> m;
   @Nullable
   private List<ig.c<T>> n;
   private int o;
   private final ii.c<T> p = new ii.c<T>() {
      @Override
      public agl<? extends is<? extends T>> f() {
         return io.this.c;
      }

      @Override
      public Lifecycle g() {
         return io.this.d();
      }

      @Override
      public Optional<ig.c<T>> a(agl<T> $$0) {
         return io.this.b($$0);
      }

      @Override
      public Stream<ig.c<T>> b() {
         return io.this.h();
      }

      @Override
      public Optional<ik.c<T>> a(arz<T> $$0) {
         return io.this.b($$0);
      }

      @Override
      public Stream<ik.c<T>> d() {
         return io.this.i().map(Pair::getSecond);
      }
   };

   public io(agl<? extends is<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public io(agl<? extends is<T>> $$0, Lifecycle $$1, boolean $$2) {
      ago.a(() -> "registry " + $$0);
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public agl<? extends is<T>> c() {
      return this.c;
   }

   @Override
   public String toString() {
      return "Registry[" + this.c + " (" + this.j + ")]";
   }

   private List<ig.c<T>> a() {
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

   private void g(agl<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   public ig.c<T> a(int $$0, agl<T> $$1, T $$2, Lifecycle $$3) {
      this.g($$1);
      Validate.notNull($$1);
      Validate.notNull($$2);
      if (this.f.containsKey($$1.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$1 + "' to registry"));
      }

      if (this.h.containsKey($$2)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$2 + "' to registry"));
      }

      ig.c<T> $$4;
      if (this.m != null) {
         $$4 = this.m.remove($$2);
         if ($$4 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$1 + ":" + $$2);
         }

         $$4.b($$1);
      } else {
         $$4 = this.g.computeIfAbsent($$1, $$0x -> ig.c.a(this.o(), $$0x));
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
   public ig.c<T> a(agl<T> $$0, T $$1, Lifecycle $$2) {
      return this.a(this.o, $$0, $$1, $$2);
   }

   @Nullable
   @Override
   public agm b(T $$0) {
      ig.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.g().a() : null;
   }

   @Override
   public Optional<agl<T>> c(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(ig.c::g);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable agl<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? a((ig.c<T>)this.d.get($$0)) : null;
   }

   @Override
   public Optional<ig.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((ig.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<ig.c<T>> b(agl<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public ig<T> d(T $$0) {
      ig.c<T> $$1 = this.h.get($$0);
      return (ig<T>)($$1 != null ? $$1 : ig.a($$0));
   }

   ig.c<T> h(agl<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.g($$0x);
            return ig.c.a(this.o(), $$0x);
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
      return Iterators.transform(this.a().iterator(), ig::a);
   }

   @Nullable
   @Override
   public T a(@Nullable agm $$0) {
      ig.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable ig.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<agm> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<agl<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<agl<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, ig::a).entrySet());
   }

   @Override
   public Stream<ig.c<T>> h() {
      return this.a().stream();
   }

   @Override
   public Stream<Pair<arz<T>, ik.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public ik.c<T> a(arz<T> $$0) {
      ik.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<arz<T>, ik.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private ik.c<T> d(arz<T> $$0) {
      return new ik.c<>(this.o(), $$0);
   }

   @Override
   public Stream<arz<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<ig.c<T>> a(atw $$0) {
      return ac.b(this.a(), $$0);
   }

   @Override
   public boolean c(agm $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean c(agl<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public is<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<agm> $$0 = this.g.entrySet().stream().filter($$0x -> !((ig.c)$$0x.getValue()).b()).map($$0x -> ((agl)$$0x.getKey()).a()).sorted().toList();
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
   public ig.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.v();
         return this.m.computeIfAbsent($$0, $$0x -> ig.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<ik.c<T>> b(arz<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<arz<T>, List<ig<T>>> $$0) {
      Map<ig.c<T>, List<arz<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (ig<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof ig.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<arz<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<arz<T>, ik.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(ig.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public ih<T> n() {
      this.v();
      return new ih<T>() {
         @Override
         public Optional<ig.c<T>> a(agl<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ig.c<T> b(agl<T> $$0) {
            return io.this.h($$0);
         }

         @Override
         public Optional<ik.c<T>> a(arz<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ik.c<T> b(arz<T> $$0) {
            return io.this.a($$0);
         }
      };
   }

   @Override
   public ij<T> o() {
      return this.p;
   }

   @Override
   public ii.c<T> p() {
      return this.p;
   }
}
