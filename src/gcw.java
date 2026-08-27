import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gcw implements gci<dny> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = axm.h(16);
   private static final float d = 0.6666667F;
   private static final esj e = new esj(0.0, 0.33333334F, 0.046666667F);
   private final Map<dqv, gcw.a> f;
   private final fdj g;

   public gcw(gcj.a $$0) {
      this.f = dqv.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gcw.a($$0.a(ftu.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dny $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      dpi $$6 = $$0.n();
      djg $$7 = (djg)$$6.b();
      dqv $$8 = djg.a($$7);
      gcw.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dkb;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dny $$0, ewr $$1, gai $$2, int $$3, int $$4, dpi $$5, djg $$6, dqv $$7, frr $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(ewr $$0, float $$1, dpi $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dkb)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(ewr $$0, gai $$1, int $$2, int $$3, dqv $$4, frr $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gnv $$7 = this.a($$4);
      ewv $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(ewr $$0, int $$1, int $$2, frr $$3, ewv $$4) {
      gcw.a $$5 = (gcw.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gnv a(dqv $$0) {
      return gax.a($$0);
   }

   void a(id $$0, dnz $$1, ewr $$2, gai $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      awy[] $$10 = $$1.a(fby.Q().aS(), $$1x -> {
         List<awy> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? awy.a : $$2x.get(0);
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
         awy $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fdj.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ewr $$0, boolean $$1, esj $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   esj d() {
      return e;
   }

   static boolean a(id $$0, int $$1) {
      if ($$1 == cql.p.g()) {
         return true;
      } else {
         fby $$2 = fby.Q();
         fzk $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gx()) {
            return true;
         } else {
            bqa $$4 = $$2.ao();
            return $$4 != null && $$4.f(esj.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dnz $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cql.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)aww.b.b($$1) * 0.4);
         int $$4 = (int)((double)aww.b.c($$1) * 0.4);
         int $$5 = (int)((double)aww.b.d($$1) * 0.4);
         return aww.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gcw.a a(ftr $$0, dqv $$1) {
      return new gcw.a($$0.a(ftu.a($$1)));
   }

   public static fub f() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("sign", fua.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), ftx.a);
      $$1.a("stick", fua.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), ftx.a);
      return fub.a($$0, 64, 32);
   }

   public static final class a extends frr {
      public final ftv a;
      public final ftv b;

      public a(ftv $$0) {
         super(gaq::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(ewr $$0, ewv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
