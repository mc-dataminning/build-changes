import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ggt implements ggf<drb> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayg.h(16);
   private static final float d = 0.6666667F;
   private static final ewh e = new ewh(0.0, 0.33333334F, 0.046666667F);
   private final Map<dty, ggt.a> f;
   private final fhf g;

   public ggt(ggg.a $$0) {
      this.f = dty.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggt.a($$0.a(fxp.a($$1)))));
      this.g = $$0.f();
   }

   public void a(drb $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      dsl $$6 = $$0.n();
      dmi $$7 = (dmi)$$6.b();
      dty $$8 = dmi.a($$7);
      ggt.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dnd;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(drb $$0, fao $$1, gef $$2, int $$3, int $$4, dsl $$5, dmi $$6, dty $$7, fvm $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fao $$0, float $$1, dsl $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dnd)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fao $$0, gef $$1, int $$2, int $$3, dty $$4, fvm $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gru $$7 = this.a($$4);
      fas $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fao $$0, int $$1, int $$2, fvm $$3, fas $$4) {
      ggt.a $$5 = (ggt.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gru a(dty $$0) {
      return geu.a($$0);
   }

   void a(ja $$0, drc $$1, fao $$2, gef $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axs[] $$10 = $$1.a(ffw.Q().aQ(), $$1x -> {
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
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhf.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fao $$0, boolean $$1, ewh $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ewh d() {
      return e;
   }

   static boolean a(ja $$0, int $$1) {
      if ($$1 == csw.p.g()) {
         return true;
      } else {
         ffw $$2 = ffw.Q();
         gdh $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gy()) {
            return true;
         } else {
            bsh $$4 = $$2.an();
            return $$4 != null && $$4.g(ewh.b($$0)) < (double)c;
         }
      }
   }

   public static int a(drc $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == csw.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axq.b.b($$1) * 0.4);
         int $$4 = (int)((double)axq.b.c($$1) * 0.4);
         int $$5 = (int)((double)axq.b.d($$1) * 0.4);
         return axq.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ggt.a a(fxm $$0, dty $$1) {
      return new ggt.a($$0.a(fxp.a($$1)));
   }

   public static fxw f() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("sign", fxv.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxs.a);
      $$1.a("stick", fxv.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxs.a);
      return fxw.a($$0, 64, 32);
   }

   public static final class a extends fvm {
      public final fxq a;
      public final fxq b;

      public a(fxq $$0) {
         super(gen::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
