import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gok implements gnw<dwk> {
   private static final int a = -988212;
   private static final int b = bae.h(16);
   private static final float c = 0.6666667F;
   private static final fby d = new fby(0.0, 0.33333334F, 0.046666667F);
   private final Map<dzh, gok.a> e;
   private final fnq f;

   public gok(gnx.a $$0) {
      this.e = dzh.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gok.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dwk $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      dxv $$6 = $$0.m();
      drp $$7 = (drp)$$6.b();
      dzh $$8 = drp.a($$7);
      gok.a $$9 = this.e.get($$8);
      gch $$10 = $$6.b() instanceof dsk ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dwk $$0, fgs $$1, gll $$2, int $$3, int $$4, dxv $$5, drp $$6, dzh $$7, gch $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fgs $$0, float $$1, dxv $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dsk)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fgs $$0, gll $$1, int $$2, int $$3, dzh $$4, gch $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hdu $$7 = this.a($$4);
      fgw $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hdu a(dzh $$0) {
      return gmg.a($$0);
   }

   void a(jh $$0, dwl $$1, fgs $$2, gll $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azq[] $$10 = $$1.a(fmg.Q().aU(), $$1x -> {
         List<azq> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? azq.a : $$2x.get(0);
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
         azq $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fnq.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fgs $$0, boolean $$1, fby $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   fby d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cwm.p.g()) {
         return true;
      } else {
         fmg $$2 = fmg.Q();
         gkh $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bvk $$4 = $$2.ao();
            return $$4 != null && $$4.f(fby.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dwl $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cwm.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayp.b($$1) * 0.4);
         int $$4 = (int)((double)ayp.c($$1) * 0.4);
         int $$5 = (int)((double)ayp.d($$1) * 0.4);
         return ayp.a(0, $$3, $$4, $$5);
      }
   }

   public static gch a(gek $$0, dzh $$1, boolean $$2) {
      gem $$3 = $$2 ? gen.a($$1) : gen.b($$1);
      return new gch.a($$0.a($$3), glv::g);
   }

   public static geu a(boolean $$0) {
      gew $$1 = new gew();
      gey $$2 = $$1.a();
      $$2.a("sign", get.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), geq.a);
      if ($$0) {
         $$2.a("stick", get.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), geq.a);
      }

      return geu.a($$1, 64, 32);
   }

   static record a(gch a, gch b) {
   }
}
