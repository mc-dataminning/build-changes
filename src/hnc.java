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

public class hnc {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<alr, hnc.a> b = new Object2ObjectOpenHashMap();
   private final hnc.a c;
   private final Object2ObjectFunction<alr, hnc.a> d;
   private final hnh.a e;
   private final Queue<hnc.a> f = new ArrayDeque<>();

   public hnc(Map<alr, hnl> $$0, hnl $$1) {
      this.c = new hnc.a(hmy.a, $$1, true);
      this.b.put(hmy.a, this.c);
      this.d = $$1x -> {
         alr $$2 = (alr)$$1x;
         hnl $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(hnl $$0) {
      return $$0.f() == null;
   }

   private hnc.a a(alr $$0) {
      return (hnc.a)this.b.computeIfAbsent($$0, this.d);
   }

   private hnc.a b(alr $$0, hnl $$1) {
      boolean $$2 = a($$1);
      hnc.a $$3 = new hnc.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(hnh $$0) {
      $$0.a(this.e);
   }

   public void a(alr $$0, hnl $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         hnc.a $$2 = (hnc.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hni a() {
      return this.c;
   }

   public Map<alr, hni> b() {
      List<hnc.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<alr, hni> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<hnc.a> $$0) {
      hnc.a $$1;
      while (($$1 = this.f.poll()) != null) {
         alr $$2 = Objects.requireNonNull($$1.n.f());
         hnc.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<hnc.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<hnc.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            hnc.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hni {
      private static final hnc.b<Boolean> c = a(0);
      private static final hnc.b<hnl.a> d = a(1);
      private static final hnc.b<hnk> e = a(2);
      private static final hnc.b<gte> f = a(3);
      private static final hnc.b<gti> g = a(4);
      private static final hnc.b<hkq> h = a(5);
      private static final hnc.b<hng> i = a(6);
      private static final int j = 7;
      private final alr k;
      boolean l;
      @Nullable
      hnc.a m;
      final hnl n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hnf, hng> p = new ConcurrentHashMap<>();

      private static <T> hnc.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new hnc.b<>($$0);
      }

      a(alr $$0, hnl $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public hnl a() {
         return this.n;
      }

      @Nullable
      @Override
      public hni b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(hnc.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(hnc.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(hnc.b<T> $$0, Function<hni, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hni::b);
      }

      @Override
      public hnl.a d() {
         return this.a(d, hni::c);
      }

      @Override
      public gte e() {
         return this.a(f, hni::e);
      }

      @Override
      public hnk f() {
         return this.a(e, hni::d);
      }

      @Override
      public gti g() {
         return this.a(g, hni::a);
      }

      @Override
      public hkq a(gti $$0, hmz $$1) {
         hkq $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hni.a($$0, $$1, this));
      }

      private hng b(gti $$0, hmz $$1, hnf $$2) {
         hng $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public hng a(gti $$0, hmz $$1, hnf $$2) {
         return $$2 == hmr.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hnk $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   static record b<T>(int a) {
   }
}
