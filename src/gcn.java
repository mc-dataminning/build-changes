import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gcn implements gbz<dnp> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = axk.h(16);
   private static final float d = 0.6666667F;
   private static final esa e = new esa(0.0, 0.33333334F, 0.046666667F);
   private final Map<dqm, gcn.a> f;
   private final fda g;

   public gcn(gca.a $$0) {
      this.f = dqm.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gcn.a($$0.a(ftl.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dnp $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      doz $$6 = $$0.n();
      dix $$7 = (dix)$$6.b();
      dqm $$8 = dix.a($$7);
      gcn.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof djs;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dnp $$0, ewi $$1, fzz $$2, int $$3, int $$4, doz $$5, dix $$6, dqm $$7, fri $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(ewi $$0, float $$1, doz $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof djs)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(ewi $$0, fzz $$1, int $$2, int $$3, dqm $$4, fri $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gnm $$7 = this.a($$4);
      ewm $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(ewi $$0, int $$1, int $$2, fri $$3, ewm $$4) {
      gcn.a $$5 = (gcn.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gnm a(dqm $$0) {
      return gao.a($$0);
   }

   void a(ib $$0, dnq $$1, ewi $$2, fzz $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aww[] $$10 = $$1.a(fbp.Q().aS(), $$1x -> {
         List<aww> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? aww.a : $$2x.get(0);
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
         aww $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fda.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ewi $$0, boolean $$1, esa $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   esa d() {
      return e;
   }

   static boolean a(ib $$0, int $$1) {
      if ($$1 == cqc.p.g()) {
         return true;
      } else {
         fbp $$2 = fbp.Q();
         fzb $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gx()) {
            return true;
         } else {
            bpv $$4 = $$2.ao();
            return $$4 != null && $$4.f(esa.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dnq $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cqc.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)awu.b.b($$1) * 0.4);
         int $$4 = (int)((double)awu.b.c($$1) * 0.4);
         int $$5 = (int)((double)awu.b.d($$1) * 0.4);
         return awu.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gcn.a a(fti $$0, dqm $$1) {
      return new gcn.a($$0.a(ftl.a($$1)));
   }

   public static fts f() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("sign", ftr.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fto.a);
      $$1.a("stick", ftr.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fto.a);
      return fts.a($$0, 64, 32);
   }

   public static final class a extends fri {
      public final ftm a;
      public final ftm b;

      public a(ftm $$0) {
         super(gah::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
