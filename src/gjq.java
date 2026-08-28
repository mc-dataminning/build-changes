import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gjq implements gjc<dsq> {
   private static final int a = -988212;
   private static final int b = azc.h(16);
   private static final float c = 0.6666667F;
   private static final eye d = new eye(0.0, 0.33333334F, 0.046666667F);
   private final Map<dvn, gjq.a> e;
   private final fjl f;

   public gjq(gjd.a $$0) {
      this.e = dvn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gjq.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dsq $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      dua $$6 = $$0.m();
      dnw $$7 = (dnw)$$6.b();
      dvn $$8 = dnw.a($$7);
      gjq.a $$9 = this.e.get($$8);
      fxv $$10 = $$6.b() instanceof dor ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dsq $$0, fcu $$1, ggv $$2, int $$3, int $$4, dua $$5, dnw $$6, dvn $$7, fxv $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aD_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aD_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fcu $$0, float $$1, dua $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dor)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fcu $$0, ggv $$1, int $$2, int $$3, dvn $$4, fxv $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gyq $$7 = this.a($$4);
      fcy $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   gyq a(dvn $$0) {
      return ghm.a($$0);
   }

   void a(je $$0, dsr $$1, fcu $$2, ggv $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayo[] $$10 = $$1.a(fib.Q().aT(), $$1x -> {
         List<ayo> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayo.a : $$2x.get(0);
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
         ayo $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fjl.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fcu $$0, boolean $$1, eye $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   eye d() {
      return d;
   }

   static boolean a(je $$0, int $$1) {
      if ($$1 == cue.p.g()) {
         return true;
      } else {
         fib $$2 = fib.Q();
         gfs $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gA()) {
            return true;
         } else {
            btj $$4 = $$2.an();
            return $$4 != null && $$4.f(eye.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dsr $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cue.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axn.b($$1) * 0.4);
         int $$4 = (int)((double)axn.c($$1) * 0.4);
         int $$5 = (int)((double)axn.d($$1) * 0.4);
         return axn.a(0, $$3, $$4, $$5);
      }
   }

   public static fxv a(fzx $$0, dvn $$1, boolean $$2) {
      fzz $$3 = $$2 ? gaa.a($$1) : gaa.b($$1);
      return new fxv.a($$0.a($$3), ghe::f);
   }

   public static gah a(boolean $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      $$2.a("sign", gag.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gad.a);
      if ($$0) {
         $$2.a("stick", gag.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gad.a);
      }

      return gah.a($$1, 64, 32);
   }

   static record a(fxv a, fxv b) {
   }
}
