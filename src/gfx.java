import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gfx implements gfj<dqm> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayu.h(16);
   private static final float d = 0.6666667F;
   private static final evm e = new evm(0.0, 0.33333334F, 0.046666667F);
   private final Map<dtk, gfx.a> f;
   private final fgk g;

   public gfx(gfk.a $$0) {
      this.f = dtk.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gfx.a($$0.a(fwu.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dqm $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      drx $$6 = $$0.n();
      dlu $$7 = (dlu)$$6.b();
      dtk $$8 = dlu.a($$7);
      gfx.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dmp;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dqm $$0, ezt $$1, gdj $$2, int $$3, int $$4, drx $$5, dlu $$6, dtk $$7, fur $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(ezt $$0, float $$1, drx $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dmp)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(ezt $$0, gdj $$1, int $$2, int $$3, dtk $$4, fur $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gqy $$7 = this.a($$4);
      ezx $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(ezt $$0, int $$1, int $$2, fur $$3, ezx $$4) {
      gfx.a $$5 = (gfx.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gqy a(dtk $$0) {
      return gdy.a($$0);
   }

   void a(iz $$0, dqn $$1, ezt $$2, gdj $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayg[] $$10 = $$1.a(ffa.Q().aS(), $$1x -> {
         List<ayg> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ayg.a : $$2x.get(0);
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
         ayg $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fgk.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ezt $$0, boolean $$1, evm $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   evm d() {
      return e;
   }

   static boolean a(iz $$0, int $$1) {
      if ($$1 == ctd.p.g()) {
         return true;
      } else {
         ffa $$2 = ffa.Q();
         gcl $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            bsp $$4 = $$2.an();
            return $$4 != null && $$4.f(evm.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dqn $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ctd.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)aye.b.b($$1) * 0.4);
         int $$4 = (int)((double)aye.b.c($$1) * 0.4);
         int $$5 = (int)((double)aye.b.d($$1) * 0.4);
         return aye.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gfx.a a(fwr $$0, dtk $$1) {
      return new gfx.a($$0.a(fwu.a($$1)));
   }

   public static fxb f() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("sign", fxa.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fwx.a);
      $$1.a("stick", fxa.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fwx.a);
      return fxb.a($$0, 64, 32);
   }

   public static final class a extends fur {
      public final fwv a;
      public final fwv b;

      public a(fwv $$0) {
         super(gdr::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
