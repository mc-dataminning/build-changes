import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ghh implements ggt<drq> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayn.h(16);
   private static final float d = 0.6666667F;
   private static final eww e = new eww(0.0, 0.33333334F, 0.046666667F);
   private final Map<dun, ghh.a> f;
   private final fhr g;

   public ghh(ggu.a $$0) {
      this.f = dun.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ghh.a($$0.a(fyd.a($$1)))));
      this.g = $$0.f();
   }

   public void a(drq $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      dta $$6 = $$0.n();
      dmx $$7 = (dmx)$$6.b();
      dun $$8 = dmx.a($$7);
      ghh.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dns;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(drq $$0, fbc $$1, get $$2, int $$3, int $$4, dta $$5, dmx $$6, dun $$7, fwa $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fbc $$0, float $$1, dta $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dns)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fbc $$0, get $$1, int $$2, int $$3, dun $$4, fwa $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gsj $$7 = this.a($$4);
      fbg $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fbc $$0, int $$1, int $$2, fwa $$3, fbg $$4) {
      ghh.a $$5 = (ghh.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gsj a(dun $$0) {
      return gfi.a($$0);
   }

   void a(jd $$0, drr $$1, fbc $$2, get $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axz[] $$10 = $$1.a(fgi.Q().aQ(), $$1x -> {
         List<axz> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axz.a : $$2x.get(0);
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
         axz $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhr.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fbc $$0, boolean $$1, eww $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eww d() {
      return e;
   }

   static boolean a(jd $$0, int $$1) {
      if ($$1 == ctg.p.g()) {
         return true;
      } else {
         fgi $$2 = fgi.Q();
         gdv $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gx()) {
            return true;
         } else {
            bsq $$4 = $$2.an();
            return $$4 != null && $$4.g(eww.b($$0)) < (double)c;
         }
      }
   }

   public static int a(drr $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ctg.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axx.b.b($$1) * 0.4);
         int $$4 = (int)((double)axx.b.c($$1) * 0.4);
         int $$5 = (int)((double)axx.b.d($$1) * 0.4);
         return axx.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ghh.a a(fya $$0, dun $$1) {
      return new ghh.a($$0.a(fyd.a($$1)));
   }

   public static fyk f() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("sign", fyj.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fyg.a);
      $$1.a("stick", fyj.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fyg.a);
      return fyk.a($$0, 64, 32);
   }

   public static final class a extends fwa {
      public final fye a;
      public final fye b;

      public a(fye $$0) {
         super(gfb::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
         this.a.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
