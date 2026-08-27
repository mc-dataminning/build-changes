import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fwh implements fvt<dim> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aup.h(16);
   private static final float d = 0.6666667F;
   private static final emc e = new emc(0.0, 0.33333334F, 0.046666667F);
   private final Map<dlc, fwh.a> f;
   private final exc g;

   public fwh(fvu.a $$0) {
      this.f = dlc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fwh.a($$0.a(fni.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dim $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      djp $$6 = $$0.r();
      ddx $$7 = (ddx)$$6.b();
      dlc $$8 = ddx.a($$7);
      fwh.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof des;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dim $$0, eqk $$1, ftt $$2, int $$3, int $$4, djp $$5, ddx $$6, dlc $$7, flf $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aE_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aE_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(eqk $$0, float $$1, djp $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof des)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eqk $$0, ftt $$1, int $$2, int $$3, dlc $$4, flf $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      ghe $$7 = this.a($$4);
      eqo $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eqk $$0, int $$1, int $$2, flf $$3, eqo $$4) {
      fwh.a $$5 = (fwh.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   ghe a(dlc $$0) {
      return fui.a($$0);
   }

   void a(hx $$0, din $$1, eqk $$2, ftt $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aub[] $$10 = $$1.a(evr.O().aQ(), $$1x -> {
         List<aub> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? aub.a : $$2x.get(0);
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
         aub $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, exc.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eqk $$0, boolean $$1, emc $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   emc d() {
      return e;
   }

   static boolean a(hx $$0, int $$1) {
      if ($$1 == clv.p.g()) {
         return true;
      } else {
         evr $$2 = evr.O();
         fsv $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gq()) {
            return true;
         } else {
            blw $$4 = $$2.am();
            return $$4 != null && $$4.f(emc.b($$0)) < (double)c;
         }
      }
   }

   public static int a(din $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == clv.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)atz.b.b($$1) * 0.4);
         int $$4 = (int)((double)atz.b.c($$1) * 0.4);
         int $$5 = (int)((double)atz.b.d($$1) * 0.4);
         return atz.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fwh.a a(fnf $$0, dlc $$1) {
      return new fwh.a($$0.a(fni.a($$1)));
   }

   public static fnp f() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("sign", fno.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fnl.a);
      $$1.a("stick", fno.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fnl.a);
      return fnp.a($$0, 64, 32);
   }

   public static final class a extends flf {
      public final fnj a;
      public final fnj b;

      public a(fnj $$0) {
         super(fub::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
