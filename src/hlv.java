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

public class hlv {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<alg, hlv.a> b = new Object2ObjectOpenHashMap();
   private final hlv.a c;
   private final Object2ObjectFunction<alg, hlv.a> d;
   private final hmb.a e;
   private final Queue<hlv.a> f = new ArrayDeque<>();

   public hlv(Map<alg, hmf> $$0, hmf $$1) {
      this.c = new hlv.a(hlr.a, $$1, true);
      this.b.put(hlr.a, this.c);
      this.d = $$1x -> {
         alg $$2 = (alg)$$1x;
         hmf $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(hmf $$0) {
      return $$0.f() == null;
   }

   private hlv.a a(alg $$0) {
      return (hlv.a)this.b.computeIfAbsent($$0, this.d);
   }

   private hlv.a b(alg $$0, hmf $$1) {
      boolean $$2 = a($$1);
      hlv.a $$3 = new hlv.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(hmb $$0) {
      $$0.a(this.e);
   }

   public void a(alg $$0, hmf $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         hlv.a $$2 = (hlv.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hmc a() {
      return this.c;
   }

   public Map<alg, hmc> b() {
      List<hlv.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<alg, hmc> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<hlv.a> $$0) {
      hlv.a $$1;
      while (($$1 = this.f.poll()) != null) {
         alg $$2 = Objects.requireNonNull($$1.n.f());
         hlv.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<hlv.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<hlv.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            hlv.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hmc {
      private static final hlv.b<Boolean> c = a(0);
      private static final hlv.b<hmf.a> d = a(1);
      private static final hlv.b<hme> e = a(2);
      private static final hlv.b<gsc> f = a(3);
      private static final hlv.b<gsg> g = a(4);
      private static final hlv.b<hjk> h = a(5);
      private static final hlv.b<hma> i = a(6);
      private static final int j = 7;
      private final alg k;
      boolean l;
      @Nullable
      hlv.a m;
      final hmf n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hly, hma> p = new ConcurrentHashMap<>();

      private static <T> hlv.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new hlv.b<>($$0);
      }

      a(alg $$0, hmf $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public hmf a() {
         return this.n;
      }

      @Nullable
      @Override
      public hmc b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(hlv.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(hlv.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(hlv.b<T> $$0, Function<hmc, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hmc::b);
      }

      @Override
      public hmf.a d() {
         return this.a(d, hmc::c);
      }

      @Override
      public gsc e() {
         return this.a(f, hmc::e);
      }

      @Override
      public hme f() {
         return this.a(e, hmc::d);
      }

      @Override
      public gsg g() {
         return this.a(g, hmc::a);
      }

      @Override
      public hjk a(gsg $$0, hls $$1) {
         hjk $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hmc.a($$0, $$1, this));
      }

      private hma b(gsg $$0, hls $$1, hly $$2) {
         hma $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public hma a(gsg $$0, hls $$1, hly $$2) {
         return $$2 == hlk.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hme $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   static record b<T>(int a) {
   }
}
