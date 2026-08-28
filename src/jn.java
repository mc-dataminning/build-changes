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

public class jn<T> implements kb<T> {
   private final alh<? extends js<T>> b;
   private final ObjectList<jf.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = ag.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<ali, jf.c<T>> e = new HashMap<>();
   private final Map<alh<T>, jf.c<T>> f = new HashMap<>();
   private final Map<T, jf.c<T>> g = new IdentityHashMap<>();
   private final Map<alh<T>, jr> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<axt<T>, jj.c<T>> j = new IdentityHashMap<>();
   jn.a<T> k = jn.a.a();
   private boolean l;
   @Nullable
   private Map<T, jf.c<T>> m;

   @Override
   public Stream<jj.c<T>> e() {
      return this.l();
   }

   public jn(alh<? extends js<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jn(alh<? extends js<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public alh<? extends js<T>> g() {
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

   private void h(alh<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jf.c<T> a(alh<T> $$0, T $$1, jr $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)ag.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)ag.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         jf.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> jf.c.a(this, $$0x));
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
   public ali b(T $$0) {
      jf.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<alh<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(jf.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T c(@Nullable alh<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((jf.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<jf.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((jf.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jf.c<T>> c(ali $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<jf.c<T>> a(alh<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jf.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((jf.c<T>)this.c.getFirst());
   }

   @Override
   public jf<T> e(T $$0) {
      jf.c<T> $$1 = this.g.get($$0);
      return (jf<T>)($$1 != null ? $$1 : jf.a($$0));
   }

   jf.c<T> i(alh<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jf.c.a(this, $$0x);
         }
      });
   }

   @Override
   public int d() {
      return this.f.size();
   }

   @Override
   public Optional<jr> d(alh<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle h() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), jf::a);
   }

   @Nullable
   @Override
   public T a(@Nullable ali $$0) {
      jf.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jf.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<ali> i() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<alh<T>> j() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<alh<T>, T>> k() {
      return Collections.unmodifiableSet(ag.<alh<T>, jf.c<T>, T>a(this.f, jf::a).entrySet());
   }

   @Override
   public Stream<jf.c<T>> c() {
      return this.c.stream();
   }

   @Override
   public Stream<jj.c<T>> l() {
      return this.k.c();
   }

   jj.c<T> d(axt<T> $$0) {
      return this.j.computeIfAbsent($$0, this::e);
   }

   private jj.c<T> e(axt<T> $$0) {
      return new jj.c<>(this, $$0);
   }

   @Override
   public boolean m() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<jf.c<T>> a(azx $$0) {
      return ag.b(this.c, $$0);
   }

   @Override
   public boolean d(ali $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean e(alh<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public js<T> n() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<ali> $$0 = this.f.entrySet().stream().filter($$0x -> !((jf.c)$$0x.getValue()).b()).map($$0x -> ((alh)$$0x.getKey()).a()).sorted().toList();
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
               List<ali> $$1 = this.j.entrySet().stream().filter($$0x -> !((jj.c)$$0x.getValue()).c()).map($$0x -> ((axt)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.g() + ": " + $$1);
               } else {
                  this.k = jn.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public jf.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jf.c.a(this, (T)$$0x));
      }
   }

   @Override
   public Optional<jj.c<T>> a(axt<T> $$0) {
      return this.k.a($$0);
   }

   private jf.c<T> a(axt<T> $$0, jf<T> $$1) {
      if (!$$1.a(this)) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof jf.c) {
         return (jf.c<T>)$$1;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(axt<T> $$0, List<jf<T>> $$1) {
      this.b();
      this.d($$0).b($$1);
   }

   void u() {
      Map<jf.c<T>, List<axt<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((jf.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (jf<T> $$3 : $$2) {
            jf.c<T> $$4 = this.a((axt<T>)$$1, $$3);
            $$0.get($$4).add((axt<T>)$$1);
         }
      });
      $$0.forEach(jf.c::a);
   }

   public void o() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jg<T> p() {
      this.b();
      return new jg<T>() {
         @Override
         public Optional<jf.c<T>> a(alh<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jf.c<T> b(alh<T> $$0) {
            return jn.this.i($$0);
         }

         @Override
         public Optional<jj.c<T>> a(axt<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jj.c<T> b(axt<T> $$0) {
            return jn.this.d($$0);
         }
      };
   }

   @Override
   public js.a<T> a(axu.c<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<axt<T>, jj.c<T>> $$1 = ImmutableMap.builder();
         final Map<axt<T>, List<jf<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            jj.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.e($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<axt<T>, jj.c<T>> $$3 = $$1.build();
         final jh.b<T> $$4 = new jh.b.a<T>() {
            @Override
            public jh.b<T> a() {
               return jn.this;
            }

            @Override
            public Optional<jj.c<T>> a(axt<T> $$0) {
               return Optional.ofNullable((jj.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<jj.c<T>> e() {
               return $$3.values().stream();
            }
         };
         return new js.a<T>() {
            @Override
            public alh<? extends js<? extends T>> a() {
               return jn.this.g();
            }

            @Override
            public int b() {
               return $$2.size();
            }

            @Override
            public jh.b<T> c() {
               return $$4;
            }

            @Override
            public void d() {
               $$3.forEach(($$1, $$2xx) -> {
                  List<jf<T>> $$3xx = $$2.getOrDefault($$1, List.of());
                  $$2xx.b($$3xx);
               });
               jn.this.k = jn.a.a($$3);
               jn.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jn.a<T> a() {
         return new jn.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<jj.c<T>> a(axt<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super axt<T>, ? super jj.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<jj.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jn.a<T> a(final Map<axt<T>, jj.c<T>> $$0) {
         return new jn.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<jj.c<T>> a(axt<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super axt<T>, ? super jj.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<jj.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<jj.c<T>> a(axt<T> var1);

      void a(BiConsumer<? super axt<T>, ? super jj.c<T>> var1);

      Stream<jj.c<T>> c();
   }
}
