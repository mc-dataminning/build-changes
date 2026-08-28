import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ghn implements ggz<drs> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayo.h(16);
   private static final float d = 0.6666667F;
   private static final exc e = new exc(0.0, 0.33333334F, 0.046666667F);
   private final Map<dup, ghn.a> f;
   private final fhx g;

   public ghn(gha.a $$0) {
      this.f = dup.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ghn.a($$0.a(fyj.a($$1)))));
      this.g = $$0.f();
   }

   public void a(drs $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      dtc $$6 = $$0.n();
      dmz $$7 = (dmz)$$6.b();
      dup $$8 = dmz.a($$7);
      ghn.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dnu;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(drs $$0, fbi $$1, gez $$2, int $$3, int $$4, dtc $$5, dmz $$6, dup $$7, fwg $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aD_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aD_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fbi $$0, float $$1, dtc $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dnu)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fbi $$0, gez $$1, int $$2, int $$3, dup $$4, fwg $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gsq $$7 = this.a($$4);
      fbm $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fbi $$0, int $$1, int $$2, fwg $$3, fbm $$4) {
      ghn.a $$5 = (ghn.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gsq a(dup $$0) {
      return gfo.a($$0);
   }

   void a(jd $$0, drt $$1, fbi $$2, gez $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aya[] $$10 = $$1.a(fgo.Q().aQ(), $$1x -> {
         List<aya> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? aya.a : $$2x.get(0);
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
         aya $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhx.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fbi $$0, boolean $$1, exc $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   exc d() {
      return e;
   }

   static boolean a(jd $$0, int $$1) {
      if ($$1 == cti.p.g()) {
         return true;
      } else {
         fgo $$2 = fgo.Q();
         geb $$3 = $$2.s;
         if ($$3 != null && $$2.m.aB().a() && $$3.gw()) {
            return true;
         } else {
            bsr $$4 = $$2.an();
            return $$4 != null && $$4.g(exc.b($$0)) < (double)c;
         }
      }
   }

   public static int a(drt $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cti.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axy.b.b($$1) * 0.4);
         int $$4 = (int)((double)axy.b.c($$1) * 0.4);
         int $$5 = (int)((double)axy.b.d($$1) * 0.4);
         return axy.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ghn.a a(fyg $$0, dup $$1) {
      return new ghn.a($$0.a(fyj.a($$1)));
   }

   public static fyq f() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("sign", fyp.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fym.a);
      $$1.a("stick", fyp.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fym.a);
      return fyq.a($$0, 64, 32);
   }

   public static final class a extends fwg {
      public final fyk a;
      public final fyk b;

      public a(fyk $$0) {
         super(gfh::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
         this.a.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
