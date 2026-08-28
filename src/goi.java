import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class goi implements gnu<dwj> {
   private static final int a = -988212;
   private static final int b = bae.h(16);
   private static final float c = 0.6666667F;
   private static final fbx d = new fbx(0.0, 0.33333334F, 0.046666667F);
   private final Map<dzg, goi.a> e;
   private final fno f;

   public goi(gnv.a $$0) {
      this.e = dzg.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new goi.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dwj $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      dxu $$6 = $$0.m();
      dro $$7 = (dro)$$6.b();
      dzg $$8 = dro.a($$7);
      goi.a $$9 = this.e.get($$8);
      gcf $$10 = $$6.b() instanceof dsj ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dwj $$0, fgq $$1, glj $$2, int $$3, int $$4, dxu $$5, dro $$6, dzg $$7, gcf $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fgq $$0, float $$1, dxu $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dsj)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fgq $$0, glj $$1, int $$2, int $$3, dzg $$4, gcf $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hds $$7 = this.a($$4);
      fgu $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hds a(dzg $$0) {
      return gme.a($$0);
   }

   void a(jh $$0, dwk $$1, fgq $$2, glj $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azq[] $$10 = $$1.a(fme.Q().aU(), $$1x -> {
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
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fno.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fgq $$0, boolean $$1, fbx $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   fbx d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cwl.p.g()) {
         return true;
      } else {
         fme $$2 = fme.Q();
         gkf $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gF()) {
            return true;
         } else {
            bvj $$4 = $$2.ao();
            return $$4 != null && $$4.f(fbx.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dwk $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cwl.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayp.b($$1) * 0.4);
         int $$4 = (int)((double)ayp.c($$1) * 0.4);
         int $$5 = (int)((double)ayp.d($$1) * 0.4);
         return ayp.a(0, $$3, $$4, $$5);
      }
   }

   public static gcf a(gei $$0, dzg $$1, boolean $$2) {
      gek $$3 = $$2 ? gel.a($$1) : gel.b($$1);
      return new gcf.a($$0.a($$3), glt::f);
   }

   public static ges a(boolean $$0) {
      geu $$1 = new geu();
      gew $$2 = $$1.a();
      $$2.a("sign", ger.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), geo.a);
      if ($$0) {
         $$2.a("stick", ger.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), geo.a);
      }

      return ges.a($$1, 64, 32);
   }

   static record a(gcf a, gcf b) {
   }
}
