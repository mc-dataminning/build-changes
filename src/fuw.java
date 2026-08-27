import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fuw implements fui<dhm> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aty.h(16);
   private static final float d = 0.6666667F;
   private static final elb e = new elb(0.0, 0.33333334F, 0.046666667F);
   private final Map<dkc, fuw.a> f;
   private final evu g;

   public fuw(fuj.a $$0) {
      this.f = dkc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fuw.a($$0.a(flx.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dhm $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      dip $$6 = $$0.r();
      dcy $$7 = (dcy)$$6.b();
      dkc $$8 = dcy.a($$7);
      fuw.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof ddt;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dhm $$0, epd $$1, fsi $$2, int $$3, int $$4, dip $$5, dcy $$6, dkc $$7, fju $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aB_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(epd $$0, float $$1, dip $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof ddt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(epd $$0, fsi $$1, int $$2, int $$3, dkc $$4, fju $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gfs $$7 = this.a($$4);
      eph $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(epd $$0, int $$1, int $$2, fju $$3, eph $$4) {
      fuw.a $$5 = (fuw.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gfs a(dkc $$0) {
      return fsx.a($$0);
   }

   void a(hv $$0, dhn $$1, epd $$2, fsi $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      atk[] $$10 = $$1.a(euk.N().aP(), $$1x -> {
         List<atk> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? atk.a : $$2x.get(0);
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
         atk $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, evu.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(epd $$0, boolean $$1, elb $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   elb d() {
      return e;
   }

   static boolean a(hv $$0, int $$1) {
      if ($$1 == ckv.p.g()) {
         return true;
      } else {
         euk $$2 = euk.N();
         frk $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gq()) {
            return true;
         } else {
            blf $$4 = $$2.al();
            return $$4 != null && $$4.f(elb.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dhn $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ckv.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ati.b.b($$1) * 0.4);
         int $$4 = (int)((double)ati.b.c($$1) * 0.4);
         int $$5 = (int)((double)ati.b.d($$1) * 0.4);
         return ati.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fuw.a a(flu $$0, dkc $$1) {
      return new fuw.a($$0.a(flx.a($$1)));
   }

   public static fme f() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("sign", fmd.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fma.a);
      $$1.a("stick", fmd.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fma.a);
      return fme.a($$0, 64, 32);
   }

   public static final class a extends fju {
      public final fly a;
      public final fly b;

      public a(fly $$0) {
         super(fsq::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(epd $$0, eph $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
