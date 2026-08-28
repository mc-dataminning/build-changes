public class gxf extends gwx<csd, hdn> {
   private static final alg a = alg.b("textures/entity/fishing_hook.png");
   private static final grc g = grc.f(a);
   private static final double h = 960.0;

   public gxf(gwy.a $$0) {
      super($$0);
   }

   public boolean a(csd $$0, guk $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) && $$0.g() != null;
   }

   public void a(hdn $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.a();
      $$1.b(0.5F, 0.5F, 0.5F);
      $$1.a(this.d.b());
      fkd.a $$4 = $$1.c();
      fkh $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      float $$6 = (float)$$0.a.d;
      float $$7 = (float)$$0.a.e;
      float $$8 = (float)$$0.a.f;
      fkh $$9 = $$2.getBuffer(grc.A());
      fkd.a $$10 = $$1.c();
      int $$11 = 16;

      for (int $$12 = 0; $$12 <= 16; $$12++) {
         a($$6, $$7, $$8, $$9, $$10, a($$12, 16), a($$12 + 1, 16));
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public static bxa a(crm $$0) {
      return $$0.fa().h() instanceof cyw ? $$0.fx() : $$0.fx().e();
   }

   private ffc a(crm $$0, float $$1, float $$2) {
      int $$3 = a($$0) == bxa.b ? 1 : -1;
      if (this.d.d.aE().a() && $$0 == fpt.Q().t) {
         double $$11 = 960.0 / (double)this.d.d.ak().c().intValue();
         ffc $$12 = this.d.b.j().a((float)$$3 * 0.525F, -0.1F).c($$11).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.n($$2).e($$12);
      } else {
         float $$4 = azm.h($$2, $$0.aW, $$0.aV) * (float) (Math.PI / 180.0);
         double $$5 = (double)azm.a($$4);
         double $$6 = (double)azm.b($$4);
         float $$7 = $$0.ek();
         double $$8 = (double)$$3 * 0.35 * (double)$$7;
         double $$9 = 0.8 * (double)$$7;
         float $$10 = $$0.cg() ? -0.1875F : 0.0F;
         return $$0.n($$2).b(-$$6 * $$8 - $$5 * $$9, (double)$$10 - 0.45 * (double)$$7, -$$5 * $$8 + $$6 * $$9);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fkh $$0, fkd.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hjg.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, fkh $$3, fkd.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = azm.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public hdn a() {
      return new hdn();
   }

   public void a(csd $$0, hdn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      crm $$3 = $$0.g();
      if ($$3 == null) {
         $$1.a = ffc.c;
      } else {
         float $$4 = $$3.D($$2);
         float $$5 = azm.a(azm.c($$4) * (float) Math.PI);
         ffc $$6 = this.a($$3, $$5, $$2);
         ffc $$7 = $$0.p($$2).b(0.0, 0.25, 0.0);
         $$1.a = $$6.d($$7);
      }
   }

   protected boolean a(csd $$0) {
      return false;
   }
}
