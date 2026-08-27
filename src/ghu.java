import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ghu implements ghg<drr> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aym.h(16);
   private static final float d = 0.6666667F;
   private static final ewu e = new ewu(0.0, 0.33333334F, 0.046666667F);
   private final Map<dup, ghu.a> f;
   private final fhy g;

   public ghu(ghh.a $$0) {
      this.f = dup.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ghu.a($$0.a(fyr.a($$1)))));
      this.g = $$0.f();
   }

   public void a(drr $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      dtc $$6 = $$0.n();
      dmq $$7 = (dmq)$$6.b();
      dup $$8 = dmq.a($$7);
      ghu.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dnl;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(drr $$0, fbc $$1, gfg $$2, int $$3, int $$4, dtc $$5, dmq $$6, dup $$7, fwn $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fbc $$0, float $$1, dtc $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dnl)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fbc $$0, gfg $$1, int $$2, int $$3, dup $$4, fwn $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gtc $$7 = this.a($$4);
      fbg $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fbc $$0, int $$1, int $$2, fwn $$3, fbg $$4) {
      ghu.a $$5 = (ghu.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gtc a(dup $$0) {
      return gfv.a($$0);
   }

   void a(ir $$0, drs $$1, fbc $$2, gfg $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axy[] $$10 = $$1.a(fgj.Q().aT(), $$1x -> {
         List<axy> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axy.a : $$2x.get(0);
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
         axy $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhy.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fbc $$0, boolean $$1, ewu $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ewu d() {
      return e;
   }

   static boolean a(ir $$0, int $$1) {
      if ($$1 == csy.p.g()) {
         return true;
      } else {
         fgj $$2 = fgj.Q();
         gei $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gL()) {
            return true;
         } else {
            brv $$4 = $$2.ao();
            return $$4 != null && $$4.f(ewu.b($$0)) < (double)c;
         }
      }
   }

   public static int a(drs $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == csy.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axw.b.b($$1) * 0.4);
         int $$4 = (int)((double)axw.b.c($$1) * 0.4);
         int $$5 = (int)((double)axw.b.d($$1) * 0.4);
         return axw.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ghu.a a(fyo $$0, dup $$1) {
      return new ghu.a($$0.a(fyr.a($$1)));
   }

   public static fyy f() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("sign", fyx.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fyu.a);
      $$1.a("stick", fyx.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fyu.a);
      return fyy.a($$0, 64, 32);
   }

   public static final class a extends fwn {
      public final fys a;
      public final fys b;

      public a(fys $$0) {
         super(gfo::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
