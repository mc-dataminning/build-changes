import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fxz implements fxl<dkc> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = awh.h(16);
   private static final float d = 0.6666667F;
   private static final ens e = new ens(0.0, 0.33333334F, 0.046666667F);
   private final Map<dms, fxz.a> f;
   private final eys g;

   public fxz(fxm.a $$0) {
      this.f = dms.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fxz.a($$0.a(fpb.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dkc $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      dlf $$6 = $$0.r();
      dfn $$7 = (dfn)$$6.b();
      dms $$8 = dfn.a($$7);
      fxz.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dgi;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dkc $$0, esa $$1, fvl $$2, int $$3, int $$4, dlf $$5, dfn $$6, dms $$7, fmx $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aE_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aE_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(esa $$0, float $$1, dlf $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dgi)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(esa $$0, fvl $$1, int $$2, int $$3, dms $$4, fmx $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      giw $$7 = this.a($$4);
      ese $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(esa $$0, int $$1, int $$2, fmx $$3, ese $$4) {
      fxz.a $$5 = (fxz.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   giw a(dms $$0) {
      return fwa.a($$0);
   }

   void a(hz $$0, dkd $$1, esa $$2, fvl $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      avt[] $$10 = $$1.a(exh.O().aQ(), $$1x -> {
         List<avt> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? avt.a : $$2x.get(0);
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
         avt $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eys.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(esa $$0, boolean $$1, ens $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ens d() {
      return e;
   }

   static boolean a(hz $$0, int $$1) {
      if ($$1 == cnn.p.g()) {
         return true;
      } else {
         exh $$2 = exh.O();
         fun $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gr()) {
            return true;
         } else {
            bno $$4 = $$2.am();
            return $$4 != null && $$4.f(ens.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dkd $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cnn.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)avr.b.b($$1) * 0.4);
         int $$4 = (int)((double)avr.b.c($$1) * 0.4);
         int $$5 = (int)((double)avr.b.d($$1) * 0.4);
         return avr.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fxz.a a(foy $$0, dms $$1) {
      return new fxz.a($$0.a(fpb.a($$1)));
   }

   public static fpi f() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("sign", fph.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fpe.a);
      $$1.a("stick", fph.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fpe.a);
      return fpi.a($$0, 64, 32);
   }

   public static final class a extends fmx {
      public final fpc a;
      public final fpc b;

      public a(fpc $$0) {
         super(fvt::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(esa $$0, ese $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
