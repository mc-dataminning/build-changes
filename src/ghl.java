import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ghl implements ggx<drs> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayo.h(16);
   private static final float d = 0.6666667F;
   private static final exa e = new exa(0.0, 0.33333334F, 0.046666667F);
   private final Map<dup, ghl.a> f;
   private final fhv g;

   public ghl(ggy.a $$0) {
      this.f = dup.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ghl.a($$0.a(fyh.a($$1)))));
      this.g = $$0.f();
   }

   public void a(drs $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      dtc $$6 = $$0.n();
      dmz $$7 = (dmz)$$6.b();
      dup $$8 = dmz.a($$7);
      ghl.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dnu;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(drs $$0, fbg $$1, gex $$2, int $$3, int $$4, dtc $$5, dmz $$6, dup $$7, fwe $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aD_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aD_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fbg $$0, float $$1, dtc $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dnu)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fbg $$0, gex $$1, int $$2, int $$3, dup $$4, fwe $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gso $$7 = this.a($$4);
      fbk $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fbg $$0, int $$1, int $$2, fwe $$3, fbk $$4) {
      ghl.a $$5 = (ghl.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gso a(dup $$0) {
      return gfm.a($$0);
   }

   void a(jd $$0, drt $$1, fbg $$2, gex $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aya[] $$10 = $$1.a(fgm.Q().aQ(), $$1x -> {
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
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fhv.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fbg $$0, boolean $$1, exa $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   exa d() {
      return e;
   }

   static boolean a(jd $$0, int $$1) {
      if ($$1 == cti.p.g()) {
         return true;
      } else {
         fgm $$2 = fgm.Q();
         gdz $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gx()) {
            return true;
         } else {
            bsr $$4 = $$2.an();
            return $$4 != null && $$4.g(exa.b($$0)) < (double)c;
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

   public static ghl.a a(fye $$0, dup $$1) {
      return new ghl.a($$0.a(fyh.a($$1)));
   }

   public static fyo f() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("sign", fyn.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fyk.a);
      $$1.a("stick", fyn.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fyk.a);
      return fyo.a($$0, 64, 32);
   }

   public static final class a extends fwe {
      public final fyi a;
      public final fyi b;

      public a(fyi $$0) {
         super(gff::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
         this.a.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
