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

public class hno {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<alk, hno.a> b = new Object2ObjectOpenHashMap();
   private final hno.a c;
   private final Object2ObjectFunction<alk, hno.a> d;
   private final hnt.a e;
   private final Queue<hno.a> f = new ArrayDeque<>();

   public hno(Map<alk, hnx> $$0, hnx $$1) {
      this.c = new hno.a(hnk.a, $$1, true);
      this.b.put(hnk.a, this.c);
      this.d = $$1x -> {
         alk $$2 = (alk)$$1x;
         hnx $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(hnx $$0) {
      return $$0.f() == null;
   }

   private hno.a a(alk $$0) {
      return (hno.a)this.b.computeIfAbsent($$0, this.d);
   }

   private hno.a b(alk $$0, hnx $$1) {
      boolean $$2 = a($$1);
      hno.a $$3 = new hno.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(hnt $$0) {
      $$0.a(this.e);
   }

   public void a(alk $$0, hnx $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         hno.a $$2 = (hno.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hnu a() {
      return this.c;
   }

   public Map<alk, hnu> b() {
      List<hno.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<alk, hnu> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<hno.a> $$0) {
      hno.a $$1;
      while (($$1 = this.f.poll()) != null) {
         alk $$2 = Objects.requireNonNull($$1.n.f());
         hno.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<hno.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<hno.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            hno.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hnu {
      private static final hno.b<Boolean> c = a(0);
      private static final hno.b<hnx.a> d = a(1);
      private static final hno.b<hnw> e = a(2);
      private static final hno.b<gtt> f = a(3);
      private static final hno.b<gtx> g = a(4);
      private static final hno.b<hlc> h = a(5);
      private static final hno.b<hns> i = a(6);
      private static final int j = 7;
      private final alk k;
      boolean l;
      @Nullable
      hno.a m;
      final hnx n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hnr, hns> p = new ConcurrentHashMap<>();

      private static <T> hno.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new hno.b<>($$0);
      }

      a(alk $$0, hnx $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public hnx a() {
         return this.n;
      }

      @Nullable
      @Override
      public hnu b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(hno.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(hno.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(hno.b<T> $$0, Function<hnu, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hnu::b);
      }

      @Override
      public hnx.a d() {
         return this.a(d, hnu::c);
      }

      @Override
      public gtt e() {
         return this.a(f, hnu::e);
      }

      @Override
      public hnw f() {
         return this.a(e, hnu::d);
      }

      @Override
      public gtx g() {
         return this.a(g, hnu::a);
      }

      @Override
      public hlc a(gtx $$0, hnl $$1) {
         hlc $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hnu.a($$0, $$1, this));
      }

      private hns b(gtx $$0, hnl $$1, hnr $$2) {
         hns $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public hns a(gtx $$0, hnl $$1, hnr $$2) {
         return $$2 == hnd.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hnw $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   static record b<T>(int a) {
   }
}
