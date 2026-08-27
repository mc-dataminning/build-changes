import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gec implements gdo<dow> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = axz.h(16);
   private static final float d = 0.6666667F;
   private static final etp e = new etp(0.0, 0.33333334F, 0.046666667F);
   private final Map<dru, gec.a> f;
   private final fep g;

   public gec(gdp.a $$0) {
      this.f = dru.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gec.a($$0.a(fva.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dow $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      dqh $$6 = $$0.n();
      dke $$7 = (dke)$$6.b();
      dru $$8 = dke.a($$7);
      gec.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dkz;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dow $$0, exx $$1, gbo $$2, int $$3, int $$4, dqh $$5, dke $$6, dru $$7, fsx $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(exx $$0, float $$1, dqh $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dkz)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(exx $$0, gbo $$1, int $$2, int $$3, dru $$4, fsx $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gpc $$7 = this.a($$4);
      eyb $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(exx $$0, int $$1, int $$2, fsx $$3, eyb $$4) {
      gec.a $$5 = (gec.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gpc a(dru $$0) {
      return gcd.a($$0);
   }

   void a(in $$0, dox $$1, exx $$2, gbo $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axl[] $$10 = $$1.a(fde.Q().aT(), $$1x -> {
         List<axl> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axl.a : $$2x.get(0);
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
         axl $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fep.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(exx $$0, boolean $$1, etp $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   etp d() {
      return e;
   }

   static boolean a(in $$0, int $$1) {
      if ($$1 == crs.p.g()) {
         return true;
      } else {
         fde $$2 = fde.Q();
         gaq $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gy()) {
            return true;
         } else {
            brh $$4 = $$2.ao();
            return $$4 != null && $$4.f(etp.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dox $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == crs.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axj.b.b($$1) * 0.4);
         int $$4 = (int)((double)axj.b.c($$1) * 0.4);
         int $$5 = (int)((double)axj.b.d($$1) * 0.4);
         return axj.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gec.a a(fux $$0, dru $$1) {
      return new gec.a($$0.a(fva.a($$1)));
   }

   public static fvh f() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("sign", fvg.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fvd.a);
      $$1.a("stick", fvg.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fvd.a);
      return fvh.a($$0, 64, 32);
   }

   public static final class a extends fsx {
      public final fvb a;
      public final fvb b;

      public a(fvb $$0) {
         super(gbw::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(exx $$0, eyb $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
