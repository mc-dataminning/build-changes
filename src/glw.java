import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class glw implements gli<dud> {
   private static final int a = -988212;
   private static final int b = azn.h(16);
   private static final float c = 0.6666667F;
   private static final ezr d = new ezr(0.0, 0.33333334F, 0.046666667F);
   private final Map<dxa, glw.a> e;
   private final flh f;

   public glw(glj.a $$0) {
      this.e = dxa.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new glw.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dud $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      dvo $$6 = $$0.m();
      dpj $$7 = (dpj)$$6.b();
      dxa $$8 = dpj.a($$7);
      glw.a $$9 = this.e.get($$8);
      fzv $$10 = $$6.b() instanceof dqe ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dud $$0, fek $$1, gix $$2, int $$3, int $$4, dvo $$5, dpj $$6, dxa $$7, fzv $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fek $$0, float $$1, dvo $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dqe)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fek $$0, gix $$1, int $$2, int $$3, dxa $$4, fzv $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hbc $$7 = this.a($$4);
      feo $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hbc a(dxa $$0) {
      return gjs.a($$0);
   }

   void a(jh $$0, due $$1, fek $$2, gix $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayz[] $$10 = $$1.a(fjx.Q().aU(), $$1x -> {
         List<ayz> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayz.a : $$2x.get(0);
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
         ayz $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, flh.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fek $$0, boolean $$1, ezr $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   ezr d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cvc.p.g()) {
         return true;
      } else {
         fjx $$2 = fjx.Q();
         ght $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gK()) {
            return true;
         } else {
            bui $$4 = $$2.ao();
            return $$4 != null && $$4.f(ezr.b($$0)) < (double)b;
         }
      }
   }

   public static int a(due $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cvc.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axy.b($$1) * 0.4);
         int $$4 = (int)((double)axy.c($$1) * 0.4);
         int $$5 = (int)((double)axy.d($$1) * 0.4);
         return axy.a(0, $$3, $$4, $$5);
      }
   }

   public static fzv a(gby $$0, dxa $$1, boolean $$2) {
      gca $$3 = $$2 ? gcb.a($$1) : gcb.b($$1);
      return new fzv.a($$0.a($$3), gjh::f);
   }

   public static gci a(boolean $$0) {
      gck $$1 = new gck();
      gcm $$2 = $$1.a();
      $$2.a("sign", gch.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gce.a);
      if ($$0) {
         $$2.a("stick", gch.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gce.a);
      }

      return gci.a($$1, 64, 32);
   }

   static record a(fzv a, fzv b) {
   }
}
