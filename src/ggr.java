import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ggr implements ggd<dra> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayg.h(16);
   private static final float d = 0.6666667F;
   private static final ewf e = new ewf(0.0, 0.33333334F, 0.046666667F);
   private final Map<dtx, ggr.a> f;
   private final fhd g;

   public ggr(gge.a $$0) {
      this.f = dtx.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggr.a($$0.a(fxn.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dra $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      dsk $$6 = $$0.n();
      dmh $$7 = (dmh)$$6.b();
      dtx $$8 = dmh.a($$7);
      ggr.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dnc;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dra $$0, fam $$1, ged $$2, int $$3, int $$4, dsk $$5, dmh $$6, dtx $$7, fvk $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fam $$0, float $$1, dsk $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dnc)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fam $$0, ged $$1, int $$2, int $$3, dtx $$4, fvk $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      grs $$7 = this.a($$4);
      faq $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fam $$0, int $$1, int $$2, fvk $$3, faq $$4) {
      ggr.a $$5 = (ggr.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   grs a(dtx $$0) {
      return ges.a($$0);
   }

   void a(ja $$0, drb $$1, fam $$2, ged $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axs[] $$10 = $$1.a(fft.Q().aS(), $$1x -> {
         List<axs> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axs.a : $$2x.get(0);
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
         axs $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhd.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fam $$0, boolean $$1, ewf $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ewf d() {
      return e;
   }

   static boolean a(ja $$0, int $$1) {
      if ($$1 == csv.p.g()) {
         return true;
      } else {
         fft $$2 = fft.Q();
         gdf $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gx()) {
            return true;
         } else {
            bsg $$4 = $$2.an();
            return $$4 != null && $$4.f(ewf.b($$0)) < (double)c;
         }
      }
   }

   public static int a(drb $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == csv.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axq.b.b($$1) * 0.4);
         int $$4 = (int)((double)axq.b.c($$1) * 0.4);
         int $$5 = (int)((double)axq.b.d($$1) * 0.4);
         return axq.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ggr.a a(fxk $$0, dtx $$1) {
      return new ggr.a($$0.a(fxn.a($$1)));
   }

   public static fxu f() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("sign", fxt.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxq.a);
      $$1.a("stick", fxt.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxq.a);
      return fxu.a($$0, 64, 32);
   }

   public static final class a extends fvk {
      public final fxo a;
      public final fxo b;

      public a(fxo $$0) {
         super(gel::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fam $$0, faq $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
