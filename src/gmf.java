import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gmf implements glr<duk> {
   private static final int a = -988212;
   private static final int b = azm.h(16);
   private static final float c = 0.6666667F;
   private static final ezy d = new ezy(0.0, 0.33333334F, 0.046666667F);
   private final Map<dxh, gmf.a> e;
   private final flo f;

   public gmf(gls.a $$0) {
      this.e = dxh.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gmf.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(duk $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      dvv $$6 = $$0.m();
      dpq $$7 = (dpq)$$6.b();
      dxh $$8 = dpq.a($$7);
      gmf.a $$9 = this.e.get($$8);
      gae $$10 = $$6.b() instanceof dql ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(duk $$0, fer $$1, gjg $$2, int $$3, int $$4, dvv $$5, dpq $$6, dxh $$7, gae $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fer $$0, float $$1, dvv $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dql)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fer $$0, gjg $$1, int $$2, int $$3, dxh $$4, gae $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hbn $$7 = this.a($$4);
      fev $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hbn a(dxh $$0) {
      return gkb.a($$0);
   }

   void a(jh $$0, dul $$1, fer $$2, gjg $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayy[] $$10 = $$1.a(fke.Q().aU(), $$1x -> {
         List<ayy> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayy.a : $$2x.get(0);
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
         ayy $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, flo.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fer $$0, boolean $$1, ezy $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   ezy d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cvj.p.g()) {
         return true;
      } else {
         fke $$2 = fke.Q();
         gic $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gF()) {
            return true;
         } else {
            bul $$4 = $$2.ao();
            return $$4 != null && $$4.f(ezy.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dul $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cvj.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axx.b($$1) * 0.4);
         int $$4 = (int)((double)axx.c($$1) * 0.4);
         int $$5 = (int)((double)axx.d($$1) * 0.4);
         return axx.a(0, $$3, $$4, $$5);
      }
   }

   public static gae a(gch $$0, dxh $$1, boolean $$2) {
      gcj $$3 = $$2 ? gck.a($$1) : gck.b($$1);
      return new gae.a($$0.a($$3), gjq::f);
   }

   public static gcr a(boolean $$0) {
      gct $$1 = new gct();
      gcv $$2 = $$1.a();
      $$2.a("sign", gcq.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gcn.a);
      if ($$0) {
         $$2.a("stick", gcq.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gcn.a);
      }

      return gcr.a($$1, 64, 32);
   }

   static record a(gae a, gae b) {
   }
}
