import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gge implements gfq<dqt> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayz.h(16);
   private static final float d = 0.6666667F;
   private static final evt e = new evt(0.0, 0.33333334F, 0.046666667F);
   private final Map<dtr, gge.a> f;
   private final fgr g;

   public gge(gfr.a $$0) {
      this.f = dtr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gge.a($$0.a(fxb.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dqt $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      dse $$6 = $$0.n();
      dmb $$7 = (dmb)$$6.b();
      dtr $$8 = dmb.a($$7);
      gge.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dmw;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dqt $$0, faa $$1, gdq $$2, int $$3, int $$4, dse $$5, dmb $$6, dtr $$7, fuy $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.ay_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.ay_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(faa $$0, float $$1, dse $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dmw)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(faa $$0, gdq $$1, int $$2, int $$3, dtr $$4, fuy $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      grf $$7 = this.a($$4);
      fae $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(faa $$0, int $$1, int $$2, fuy $$3, fae $$4) {
      gge.a $$5 = (gge.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   grf a(dtr $$0) {
      return gef.a($$0);
   }

   void a(iz $$0, dqu $$1, faa $$2, gdq $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayl[] $$10 = $$1.a(ffh.Q().aS(), $$1x -> {
         List<ayl> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ayl.a : $$2x.get(0);
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
         ayl $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fgr.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(faa $$0, boolean $$1, evt $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   evt d() {
      return e;
   }

   static boolean a(iz $$0, int $$1) {
      if ($$1 == ctk.p.g()) {
         return true;
      } else {
         ffh $$2 = ffh.Q();
         gcs $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            bsw $$4 = $$2.an();
            return $$4 != null && $$4.f(evt.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dqu $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ctk.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayj.b.b($$1) * 0.4);
         int $$4 = (int)((double)ayj.b.c($$1) * 0.4);
         int $$5 = (int)((double)ayj.b.d($$1) * 0.4);
         return ayj.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gge.a a(fwy $$0, dtr $$1) {
      return new gge.a($$0.a(fxb.a($$1)));
   }

   public static fxi f() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("sign", fxh.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxe.a);
      $$1.a("stick", fxh.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxe.a);
      return fxi.a($$0, 64, 32);
   }

   public static final class a extends fuy {
      public final fxc a;
      public final fxc b;

      public a(fxc $$0) {
         super(gdy::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(faa $$0, fae $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
