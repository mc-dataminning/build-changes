import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gkk implements gjw<dth> {
   private static final int a = -988212;
   private static final int b = azf.h(16);
   private static final float c = 0.6666667F;
   private static final eyw d = new eyw(0.0, 0.33333334F, 0.046666667F);
   private final Map<dwf, gkk.a> e;
   private final fjz f;

   public gkk(gjx.a $$0) {
      this.e = dwf.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkk.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dth $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      dus $$6 = $$0.m();
      don $$7 = (don)$$6.b();
      dwf $$8 = don.a($$7);
      gkk.a $$9 = this.e.get($$8);
      fyj $$10 = $$6.b() instanceof dpi ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dth $$0, fdi $$1, ghl $$2, int $$3, int $$4, dus $$5, don $$6, dwf $$7, fyj $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aC_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aC_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fdi $$0, float $$1, dus $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dpi)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fdi $$0, ghl $$1, int $$2, int $$3, dwf $$4, fyj $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gzm $$7 = this.a($$4);
      fdm $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   gzm a(dwf $$0) {
      return gig.a($$0);
   }

   void a(jf $$0, dti $$1, fdi $$2, ghl $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayr[] $$10 = $$1.a(fip.Q().aU(), $$1x -> {
         List<ayr> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayr.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         ayr $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fjz.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fdi $$0, boolean $$1, eyw $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   eyw d() {
      return d;
   }

   static boolean a(jf $$0, int $$1) {
      if ($$1 == cum.p.g()) {
         return true;
      } else {
         fip $$2 = fip.Q();
         ggh $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gB()) {
            return true;
         } else {
            btr $$4 = $$2.ao();
            return $$4 != null && $$4.f(eyw.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dti $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cum.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axq.b($$1) * 0.4);
         int $$4 = (int)((double)axq.c($$1) * 0.4);
         int $$5 = (int)((double)axq.d($$1) * 0.4);
         return axq.a(0, $$3, $$4, $$5);
      }
   }

   public static fyj a(gam $$0, dwf $$1, boolean $$2) {
      gao $$3 = $$2 ? gap.a($$1) : gap.b($$1);
      return new fyj.a($$0.a($$3), ghv::f);
   }

   public static gaw a(boolean $$0) {
      gay $$1 = new gay();
      gba $$2 = $$1.a();
      $$2.a("sign", gav.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gas.a);
      if ($$0) {
         $$2.a("stick", gav.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gas.a);
      }

      return gaw.a($$1, 64, 32);
   }

   static record a(fyj a, fyj b) {
   }
}
