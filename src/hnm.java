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

public class hnm {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<ali, hnm.a> b = new Object2ObjectOpenHashMap();
   private final hnm.a c;
   private final Object2ObjectFunction<ali, hnm.a> d;
   private final hnr.a e;
   private final Queue<hnm.a> f = new ArrayDeque<>();

   public hnm(Map<ali, hnv> $$0, hnv $$1) {
      this.c = new hnm.a(hni.a, $$1, true);
      this.b.put(hni.a, this.c);
      this.d = $$1x -> {
         ali $$2 = (ali)$$1x;
         hnv $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(hnv $$0) {
      return $$0.f() == null;
   }

   private hnm.a a(ali $$0) {
      return (hnm.a)this.b.computeIfAbsent($$0, this.d);
   }

   private hnm.a b(ali $$0, hnv $$1) {
      boolean $$2 = a($$1);
      hnm.a $$3 = new hnm.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(hnr $$0) {
      $$0.a(this.e);
   }

   public void a(ali $$0, hnv $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         hnm.a $$2 = (hnm.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hns a() {
      return this.c;
   }

   public Map<ali, hns> b() {
      List<hnm.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<ali, hns> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<hnm.a> $$0) {
      hnm.a $$1;
      while (($$1 = this.f.poll()) != null) {
         ali $$2 = Objects.requireNonNull($$1.n.f());
         hnm.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<hnm.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<hnm.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            hnm.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hns {
      private static final hnm.b<Boolean> c = a(0);
      private static final hnm.b<hnv.a> d = a(1);
      private static final hnm.b<hnu> e = a(2);
      private static final hnm.b<gtr> f = a(3);
      private static final hnm.b<gtv> g = a(4);
      private static final hnm.b<hla> h = a(5);
      private static final hnm.b<hnq> i = a(6);
      private static final int j = 7;
      private final ali k;
      boolean l;
      @Nullable
      hnm.a m;
      final hnv n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hnp, hnq> p = new ConcurrentHashMap<>();

      private static <T> hnm.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new hnm.b<>($$0);
      }

      a(ali $$0, hnv $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public hnv a() {
         return this.n;
      }

      @Nullable
      @Override
      public hns b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(hnm.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(hnm.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(hnm.b<T> $$0, Function<hns, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hns::b);
      }

      @Override
      public hnv.a d() {
         return this.a(d, hns::c);
      }

      @Override
      public gtr e() {
         return this.a(f, hns::e);
      }

      @Override
      public hnu f() {
         return this.a(e, hns::d);
      }

      @Override
      public gtv g() {
         return this.a(g, hns::a);
      }

      @Override
      public hla a(gtv $$0, hnj $$1) {
         hla $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hns.a($$0, $$1, this));
      }

      private hnq b(gtv $$0, hnj $$1, hnp $$2) {
         hnq $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public hnq a(gtv $$0, hnj $$1, hnp $$2) {
         return $$2 == hnb.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hnu $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   static record b<T>(int a) {
   }
}
