import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gds implements gde<don> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = axw.h(16);
   private static final float d = 0.6666667F;
   private static final etf e = new etf(0.0, 0.33333334F, 0.046666667F);
   private final Map<drl, gds.a> f;
   private final fef g;

   public gds(gdf.a $$0) {
      this.f = drl.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gds.a($$0.a(fuq.a($$1)))));
      this.g = $$0.f();
   }

   public void a(don $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      dpy $$6 = $$0.n();
      djv $$7 = (djv)$$6.b();
      drl $$8 = djv.a($$7);
      gds.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dkq;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(don $$0, exn $$1, gbe $$2, int $$3, int $$4, dpy $$5, djv $$6, drl $$7, fsn $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(exn $$0, float $$1, dpy $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dkq)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(exn $$0, gbe $$1, int $$2, int $$3, drl $$4, fsn $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gor $$7 = this.a($$4);
      exr $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(exn $$0, int $$1, int $$2, fsn $$3, exr $$4) {
      gds.a $$5 = (gds.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gor a(drl $$0) {
      return gbt.a($$0);
   }

   void a(im $$0, doo $$1, exn $$2, gbe $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axi[] $$10 = $$1.a(fcu.Q().aS(), $$1x -> {
         List<axi> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axi.a : $$2x.get(0);
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
         axi $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fef.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(exn $$0, boolean $$1, etf $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   etf d() {
      return e;
   }

   static boolean a(im $$0, int $$1) {
      if ($$1 == cqw.p.g()) {
         return true;
      } else {
         fcu $$2 = fcu.Q();
         gag $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gy()) {
            return true;
         } else {
            bql $$4 = $$2.ao();
            return $$4 != null && $$4.f(etf.b($$0)) < (double)c;
         }
      }
   }

   public static int a(doo $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cqw.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axg.b.b($$1) * 0.4);
         int $$4 = (int)((double)axg.b.c($$1) * 0.4);
         int $$5 = (int)((double)axg.b.d($$1) * 0.4);
         return axg.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gds.a a(fun $$0, drl $$1) {
      return new gds.a($$0.a(fuq.a($$1)));
   }

   public static fux f() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("sign", fuw.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fut.a);
      $$1.a("stick", fuw.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fut.a);
      return fux.a($$0, 64, 32);
   }

   public static final class a extends fsn {
      public final fur a;
      public final fur b;

      public a(fur $$0) {
         super(gbm::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
