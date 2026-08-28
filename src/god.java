import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class god implements gnp<dwc> {
   private static final int a = -988212;
   private static final int b = bae.h(16);
   private static final float c = 0.6666667F;
   private static final fbs d = new fbs(0.0, 0.33333334F, 0.046666667F);
   private final Map<dyz, god.a> e;
   private final fnj f;

   public god(gnq.a $$0) {
      this.e = dyz.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new god.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dwc $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      dxn $$6 = $$0.m();
      drh $$7 = (drh)$$6.b();
      dyz $$8 = drh.a($$7);
      god.a $$9 = this.e.get($$8);
      gca $$10 = $$6.b() instanceof dsc ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dwc $$0, fgl $$1, gle $$2, int $$3, int $$4, dxn $$5, drh $$6, dyz $$7, gca $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fgl $$0, float $$1, dxn $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dsc)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fgl $$0, gle $$1, int $$2, int $$3, dyz $$4, gca $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hdn $$7 = this.a($$4);
      fgp $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hdn a(dyz $$0) {
      return glz.a($$0);
   }

   void a(jh $$0, dwd $$1, fgl $$2, gle $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azq[] $$10 = $$1.a(flz.Q().aU(), $$1x -> {
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
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fnj.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fgl $$0, boolean $$1, fbs $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   fbs d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cwh.p.g()) {
         return true;
      } else {
         flz $$2 = flz.Q();
         gka $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gF()) {
            return true;
         } else {
            bvf $$4 = $$2.ao();
            return $$4 != null && $$4.f(fbs.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dwd $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cwh.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayp.b($$1) * 0.4);
         int $$4 = (int)((double)ayp.c($$1) * 0.4);
         int $$5 = (int)((double)ayp.d($$1) * 0.4);
         return ayp.a(0, $$3, $$4, $$5);
      }
   }

   public static gca a(ged $$0, dyz $$1, boolean $$2) {
      gef $$3 = $$2 ? geg.a($$1) : geg.b($$1);
      return new gca.a($$0.a($$3), glo::f);
   }

   public static gen a(boolean $$0) {
      gep $$1 = new gep();
      ger $$2 = $$1.a();
      $$2.a("sign", gem.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gej.a);
      if ($$0) {
         $$2.a("stick", gem.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gej.a);
      }

      return gen.a($$1, 64, 32);
   }

   static record a(gca a, gca b) {
   }
}
