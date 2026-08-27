import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gey implements gek<dps> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayf.h(16);
   private static final float d = 0.6666667F;
   private static final eum e = new eum(0.0, 0.33333334F, 0.046666667F);
   private final Map<dsq, gey.a> f;
   private final ffl g;

   public gey(gel.a $$0) {
      this.f = dsq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gey.a($$0.a(fvv.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dps $$0, float $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      drd $$6 = $$0.n();
      dla $$7 = (dla)$$6.b();
      dsq $$8 = dla.a($$7);
      gey.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dlv;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dps $$0, eyu $$1, gck $$2, int $$3, int $$4, drd $$5, dla $$6, dsq $$7, fts $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(eyu $$0, float $$1, drd $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dlv)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eyu $$0, gck $$1, int $$2, int $$3, dsq $$4, fts $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gpz $$7 = this.a($$4);
      eyy $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eyu $$0, int $$1, int $$2, fts $$3, eyy $$4) {
      gey.a $$5 = (gey.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gpz a(dsq $$0) {
      return gcz.a($$0);
   }

   void a(io $$0, dpt $$1, eyu $$2, gck $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axr[] $$10 = $$1.a(feb.Q().aS(), $$1x -> {
         List<axr> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axr.a : $$2x.get(0);
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
         axr $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ffl.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eyu $$0, boolean $$1, eum $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eum d() {
      return e;
   }

   static boolean a(io $$0, int $$1) {
      if ($$1 == csj.p.g()) {
         return true;
      } else {
         feb $$2 = feb.Q();
         gbm $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            brw $$4 = $$2.an();
            return $$4 != null && $$4.f(eum.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dpt $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == csj.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axp.b.b($$1) * 0.4);
         int $$4 = (int)((double)axp.b.c($$1) * 0.4);
         int $$5 = (int)((double)axp.b.d($$1) * 0.4);
         return axp.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gey.a a(fvs $$0, dsq $$1) {
      return new gey.a($$0.a(fvv.a($$1)));
   }

   public static fwc f() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("sign", fwb.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fvy.a);
      $$1.a("stick", fwb.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fvy.a);
      return fwc.a($$0, 64, 32);
   }

   public static final class a extends fts {
      public final fvw a;
      public final fvw b;

      public a(fvw $$0) {
         super(gcs::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eyu $$0, eyy $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
