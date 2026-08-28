public class gor extends goj<cpc, guv> {
   private static final ali a = ali.b("textures/entity/fishing_hook.png");
   private static final gir b = gir.e(a);
   private static final double h = 960.0;

   public gor(gok.a $$0) {
      super($$0);
   }

   public boolean a(cpc $$0, gly $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) && $$0.o() != null;
   }

   public void a(guv $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a();
      $$1.b(0.5F, 0.5F, 0.5F);
      $$1.a(this.e.b());
      feb.a $$4 = $$1.c();
      fef $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      float $$6 = (float)$$0.a.d;
      float $$7 = (float)$$0.a.e;
      float $$8 = (float)$$0.a.f;
      fef $$9 = $$2.getBuffer(gir.z());
      feb.a $$10 = $$1.c();
      int $$11 = 16;

      for (int $$12 = 0; $$12 <= 16; $$12++) {
         a($$6, $$7, $$8, $$9, $$10, a($$12, 16), a($$12 + 1, 16));
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ezn a(com $$0, float $$1, float $$2) {
      int $$3 = $$0.fA() == buu.b ? 1 : -1;
      cwb $$4 = $$0.fb();
      if (!$$4.a(cwf.qW)) {
         $$3 = -$$3;
      }

      if (this.e.d.aD().a() && $$0 == fji.Q().t) {
         double $$12 = 960.0 / (double)this.e.d.aj().c().intValue();
         ezn $$13 = this.e.b.j().a((float)$$3 * 0.525F, -0.1F).c($$12).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.m($$2).e($$13);
      } else {
         float $$5 = azk.h($$2, $$0.aY, $$0.aX) * (float) (Math.PI / 180.0);
         double $$6 = (double)azk.a($$5);
         double $$7 = (double)azk.b($$5);
         float $$8 = $$0.el();
         double $$9 = (double)$$3 * 0.35 * (double)$$8;
         double $$10 = 0.8 * (double)$$8;
         float $$11 = $$0.cj() ? -0.1875F : 0.0F;
         return $$0.m($$2).b(-$$7 * $$9 - $$6 * $$10, (double)$$11 - 0.45 * (double)$$8, -$$6 * $$9 + $$7 * $$10);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fef $$0, feb.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gxu.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, fef $$3, feb.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = azk.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public guv a() {
      return new guv();
   }

   public void a(cpc $$0, guv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      com $$3 = $$0.o();
      if ($$3 == null) {
         $$1.a = ezn.c;
      } else {
         float $$4 = $$3.D($$2);
         float $$5 = azk.a(azk.c($$4) * (float) Math.PI);
         ezn $$6 = this.a($$3, $$5, $$2);
         ezn $$7 = $$0.o($$2).b(0.0, 0.25, 0.0);
         $$1.a = $$6.d($$7);
      }
   }

   protected boolean a(cpc $$0) {
      return false;
   }
}
