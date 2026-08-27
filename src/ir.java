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

public class ir<T> implements je<T> {
   private static final Logger b = LogUtils.getLogger();
   final aix<? extends iv<T>> c;
   private final ObjectList<ij.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ac.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<aiy, ij.c<T>> f = new HashMap<>();
   private final Map<aix<T>, ij.c<T>> g = new HashMap<>();
   private final Map<T, ij.c<T>> h = new IdentityHashMap<>();
   private final Map<T, Lifecycle> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<aup<T>, in.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, ij.c<T>> m;
   private final il.c<T> n = new il.c<T>() {
      @Override
      public aix<? extends iv<? extends T>> f() {
         return ir.this.c;
      }

      @Override
      public Lifecycle g() {
         return ir.this.d();
      }

      @Override
      public Optional<ij.c<T>> a(aix<T> $$0) {
         return ir.this.b($$0);
      }

      @Override
      public Stream<ij.c<T>> b() {
         return ir.this.h();
      }

      @Override
      public Optional<in.c<T>> a(aup<T> $$0) {
         return ir.this.b($$0);
      }

      @Override
      public Stream<in.c<T>> d() {
         return ir.this.i().map(Pair::getSecond);
      }
   };

   public ir(aix<? extends iv<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public ir(aix<? extends iv<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public aix<? extends iv<T>> c() {
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

   private void g(aix<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public ij.c<T> a(aix<T> $$0, T $$1, Lifecycle $$2) {
      this.g($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.f.containsKey($$0.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      }

      if (this.h.containsKey($$1)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      }

      ij.c<T> $$3;
      if (this.m != null) {
         $$3 = this.m.remove($$1);
         if ($$3 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
         }

         $$3.b($$0);
      } else {
         $$3 = this.g.computeIfAbsent($$0, $$0x -> ij.c.a(this.o(), $$0x));
      }

      this.g.put($$0, $$3);
      this.f.put($$0.a(), $$3);
      this.h.put($$1, $$3);
      int $$5 = this.d.size();
      this.d.add($$3);
      this.e.put($$1, $$5);
      this.i.put($$1, $$2);
      this.j = this.j.add($$2);
      return $$3;
   }

   @Nullable
   @Override
   public aiy b(T $$0) {
      ij.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<aix<T>> d(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(ij.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable aix<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? ((ij.c)this.d.get($$0)).a() : null);
   }

   @Override
   public Optional<ij.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((ij.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<ij.c<T>> c(aiy $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<ij.c<T>> b(aix<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public ij<T> e(T $$0) {
      ij.c<T> $$1 = this.h.get($$0);
      return (ij<T>)($$1 != null ? $$1 : ij.a($$0));
   }

   ij.c<T> h(aix<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.g($$0x);
            return ij.c.a(this.o(), $$0x);
         }
      });
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public Lifecycle f(T $$0) {
      return this.i.get($$0);
   }

   @Override
   public Lifecycle d() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.d.iterator(), ij::a);
   }

   @Nullable
   @Override
   public T a(@Nullable aiy $$0) {
      ij.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable ij.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<aiy> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<aix<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<aix<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, ij::a).entrySet());
   }

   @Override
   public Stream<ij.c<T>> h() {
      return this.d.stream();
   }

   @Override
   public Stream<Pair<aup<T>, in.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public in.c<T> a(aup<T> $$0) {
      in.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<aup<T>, in.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private in.c<T> d(aup<T> $$0) {
      return new in.c<>(this.o(), $$0);
   }

   @Override
   public Stream<aup<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<ij.c<T>> a(awp $$0) {
      return ac.b(this.d, $$0);
   }

   @Override
   public boolean d(aiy $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean c(aix<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public iv<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<aiy> $$0 = this.g.entrySet().stream().filter($$0x -> !((ij.c)$$0x.getValue()).b()).map($$0x -> ((aix)$$0x.getKey()).a()).sorted().toList();
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
   public ij.c<T> g(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.a();
         return this.m.computeIfAbsent($$0, $$0x -> ij.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<in.c<T>> b(aup<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<aup<T>, List<ij<T>>> $$0) {
      Map<ij.c<T>, List<aup<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (ij<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof ij.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<aup<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<aup<T>, in.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(ij.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public ik<T> n() {
      this.a();
      return new ik<T>() {
         @Override
         public Optional<ij.c<T>> a(aix<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ij.c<T> b(aix<T> $$0) {
            return ir.this.h($$0);
         }

         @Override
         public Optional<in.c<T>> a(aup<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public in.c<T> b(aup<T> $$0) {
            return ir.this.a($$0);
         }
      };
   }

   @Override
   public im<T> o() {
      return this.n;
   }

   @Override
   public il.c<T> p() {
      return this.n;
   }
}
