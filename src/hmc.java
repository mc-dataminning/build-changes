import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hmc {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<alg, hmc.a> b = new Object2ObjectOpenHashMap();
   private final hmc.a c;
   private final Object2ObjectFunction<alg, hmc.a> d;
   private final hmi.a e;
   private final Queue<hmc.a> f = new ArrayDeque<>();

   public hmc(Map<alg, hmm> $$0, hmm $$1) {
      this.c = new hmc.a(hly.a, $$1, true);
      this.b.put(hly.a, this.c);
      this.d = $$1x -> {
         alg $$2 = (alg)$$1x;
         hmm $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(hmm $$0) {
      return $$0.f() == null;
   }

   private hmc.a a(alg $$0) {
      return (hmc.a)this.b.computeIfAbsent($$0, this.d);
   }

   private hmc.a b(alg $$0, hmm $$1) {
      boolean $$2 = a($$1);
      hmc.a $$3 = new hmc.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(hmi $$0) {
      $$0.a(this.e);
   }

   public void a(alg $$0, hmm $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         hmc.a $$2 = (hmc.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hmj a() {
      return this.c;
   }

   public Map<alg, hmj> b() {
      List<hmc.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<alg, hmj> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<hmc.a> $$0) {
      hmc.a $$1;
      while (($$1 = this.f.poll()) != null) {
         alg $$2 = Objects.requireNonNull($$1.n.f());
         hmc.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<hmc.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<hmc.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            hmc.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hmj {
      private static final hmc.b<Boolean> c = a(0);
      private static final hmc.b<hmm.a> d = a(1);
      private static final hmc.b<hml> e = a(2);
      private static final hmc.b<gsh> f = a(3);
      private static final hmc.b<gsl> g = a(4);
      private static final hmc.b<hjq> h = a(5);
      private static final hmc.b<hmh> i = a(6);
      private static final int j = 7;
      private final alg k;
      boolean l;
      @Nullable
      hmc.a m;
      final hmm n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hmf, hmh> p = new ConcurrentHashMap<>();

      private static <T> hmc.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new hmc.b<>($$0);
      }

      a(alg $$0, hmm $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public hmm a() {
         return this.n;
      }

      @Nullable
      @Override
      public hmj b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(hmc.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(hmc.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(hmc.b<T> $$0, Function<hmj, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hmj::b);
      }

      @Override
      public hmm.a d() {
         return this.a(d, hmj::c);
      }

      @Override
      public gsh e() {
         return this.a(f, hmj::e);
      }

      @Override
      public hml f() {
         return this.a(e, hmj::d);
      }

      @Override
      public gsl g() {
         return this.a(g, hmj::a);
      }

      @Override
      public hjq a(gsl $$0, hlz $$1) {
         hjq $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hmj.a($$0, $$1, this));
      }

      private hmh b(gsl $$0, hlz $$1, hmf $$2) {
         hmh $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public hmh a(gsl $$0, hlz $$1, hmf $$2) {
         return $$2 == hlr.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hml $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   static record b<T>(int a) {
   }
}
