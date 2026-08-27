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

public class iv<T> implements jj<T> {
   private static final Logger b = LogUtils.getLogger();
   final aju<? extends ja<T>> c;
   private final ObjectList<in.c<T>> d = new ObjectArrayList(256);
   private final Reference2IntMap<T> e = ac.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<ajv, in.c<T>> f = new HashMap<>();
   private final Map<aju<T>, in.c<T>> g = new HashMap<>();
   private final Map<T, in.c<T>> h = new IdentityHashMap<>();
   private final Map<aju<T>, iz> i = new IdentityHashMap<>();
   private Lifecycle j;
   private volatile Map<avt<T>, ir.c<T>> k = new IdentityHashMap<>();
   private boolean l;
   @Nullable
   private Map<T, in.c<T>> m;
   private final ip.b<T> n = new ip.b<T>() {
      @Override
      public aju<? extends ja<? extends T>> f() {
         return iv.this.c;
      }

      @Override
      public Lifecycle g() {
         return iv.this.d();
      }

      @Override
      public Optional<in.c<T>> a(aju<T> $$0) {
         return iv.this.b($$0);
      }

      @Override
      public Stream<in.c<T>> b() {
         return iv.this.h();
      }

      @Override
      public Optional<ir.c<T>> a(avt<T> $$0) {
         return iv.this.b($$0);
      }

      @Override
      public Stream<ir.c<T>> d() {
         return iv.this.i().map(Pair::getSecond);
      }
   };

   public iv(aju<? extends ja<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public iv(aju<? extends ja<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.c = $$0;
      this.j = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public aju<? extends ja<T>> c() {
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

   private void h(aju<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public in.c<T> a(aju<T> $$0, T $$1, iz $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.f.containsKey($$0.a())) {
         ac.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      }

      if (this.h.containsKey($$1)) {
         ac.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      }

      in.c<T> $$3;
      if (this.m != null) {
         $$3 = this.m.remove($$1);
         if ($$3 == null) {
            throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
         }

         $$3.b($$0);
      } else {
         $$3 = this.g.computeIfAbsent($$0, $$0x -> in.c.a(this.o(), $$0x));
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
   public ajv b(T $$0) {
      in.c<T> $$1 = this.h.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<aju<T>> d(T $$0) {
      return Optional.ofNullable(this.h.get($$0)).map(in.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.e.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable aju<T> $$0) {
      return a(this.g.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? ((in.c)this.d.get($$0)).a() : null);
   }

   @Override
   public Optional<in.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? Optional.ofNullable((in.c<T>)this.d.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<in.c<T>> c(ajv $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<in.c<T>> b(aju<T> $$0) {
      return Optional.ofNullable(this.g.get($$0));
   }

   @Override
   public in<T> e(T $$0) {
      in.c<T> $$1 = this.h.get($$0);
      return (in<T>)($$1 != null ? $$1 : in.a($$0));
   }

   in.c<T> i(aju<T> $$0) {
      return this.g.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return in.c.a(this.o(), $$0x);
         }
      });
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public Optional<iz> c(aju<T> $$0) {
      return Optional.ofNullable(this.i.get($$0));
   }

   @Override
   public Lifecycle d() {
      return this.j;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.d.iterator(), in::a);
   }

   @Nullable
   @Override
   public T a(@Nullable ajv $$0) {
      in.c<T> $$1 = this.f.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable in.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<ajv> e() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<aju<T>> f() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   @Override
   public Set<Entry<aju<T>, T>> g() {
      return Collections.unmodifiableSet(Maps.transformValues(this.g, in::a).entrySet());
   }

   @Override
   public Stream<in.c<T>> h() {
      return this.d.stream();
   }

   @Override
   public Stream<Pair<avt<T>, ir.c<T>>> i() {
      return this.k.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), $$0.getValue()));
   }

   @Override
   public ir.c<T> a(avt<T> $$0) {
      ir.c<T> $$1 = this.k.get($$0);
      if ($$1 == null) {
         $$1 = this.d($$0);
         Map<avt<T>, ir.c<T>> $$2 = new IdentityHashMap<>(this.k);
         $$2.put($$0, $$1);
         this.k = $$2;
      }

      return $$1;
   }

   private ir.c<T> d(avt<T> $$0) {
      return new ir.c<>(this.o(), $$0);
   }

   @Override
   public Stream<avt<T>> j() {
      return this.k.keySet().stream();
   }

   @Override
   public boolean k() {
      return this.g.isEmpty();
   }

   @Override
   public Optional<in.c<T>> a(axt $$0) {
      return ac.b(this.d, $$0);
   }

   @Override
   public boolean d(ajv $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public boolean d(aju<T> $$0) {
      return this.g.containsKey($$0);
   }

   @Override
   public ja<T> l() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.h.forEach(($$0x, $$1) -> $$1.b((T)$$0x));
         List<ajv> $$0 = this.g.entrySet().stream().filter($$0x -> !((in.c)$$0x.getValue()).b()).map($$0x -> ((aju)$$0x.getKey()).a()).sorted().toList();
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
   public in.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.a();
         return this.m.computeIfAbsent($$0, $$0x -> in.c.a(this.p(), (T)$$0x));
      }
   }

   @Override
   public Optional<ir.c<T>> b(avt<T> $$0) {
      return Optional.ofNullable(this.k.get($$0));
   }

   @Override
   public void a(Map<avt<T>, List<in<T>>> $$0) {
      Map<in.c<T>, List<avt<T>>> $$1 = new IdentityHashMap<>();
      this.g.values().forEach($$1x -> $$1.put($$1x, new ArrayList<>()));
      $$0.forEach(($$1x, $$2x) -> {
         for (in<T> $$3x : $$2x) {
            if (!$$3x.a(this.p())) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof in.c<T> $$4)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            $$1.get($$4).add($$1x);
         }
      });
      Set<avt<T>> $$2 = Sets.difference(this.k.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         b.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.c(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<avt<T>, ir.c<T>> $$3 = new IdentityHashMap<>(this.k);
      $$0.forEach(($$1x, $$2x) -> $$3.computeIfAbsent($$1x, this::d).b($$2x));
      $$1.forEach(in.c::a);
      this.k = $$3;
   }

   @Override
   public void m() {
      this.k.values().forEach($$0 -> $$0.b(List.of()));
      this.g.values().forEach($$0 -> $$0.a(Set.of()));
   }

   @Override
   public io<T> n() {
      this.a();
      return new io<T>() {
         @Override
         public Optional<in.c<T>> a(aju<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public in.c<T> b(aju<T> $$0) {
            return iv.this.i($$0);
         }

         @Override
         public Optional<ir.c<T>> a(avt<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ir.c<T> b(avt<T> $$0) {
            return iv.this.a($$0);
         }
      };
   }

   @Override
   public iq<T> o() {
      return this.n;
   }

   @Override
   public ip.b<T> p() {
      return this.n;
   }
}
