public class ghe extends ggw<clv> {
   private static final akh a = new akh("textures/entity/fishing_hook.png");
   private static final gbw f = gbw.d(a);
   private static final double g = 960.0;

   public ghe(ggx.a $$0) {
      super($$0);
   }

   public void a(clv $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      clh $$6 = $$0.r();
      if ($$6 != null) {
         $$3.a();
         $$3.a();
         $$3.b(0.5F, 0.5F, 0.5F);
         $$3.a(this.c.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         exx.a $$7 = $$3.c();
         eyb $$8 = $$4.getBuffer(f);
         a($$8, $$7, $$5, 0.0F, 0, 0, 1);
         a($$8, $$7, $$5, 1.0F, 0, 1, 1);
         a($$8, $$7, $$5, 1.0F, 1, 1, 0);
         a($$8, $$7, $$5, 0.0F, 1, 0, 0);
         $$3.b();
         int $$9 = $$6.fs() == bru.b ? 1 : -1;
         csz $$10 = $$6.eV();
         if (!$$10.a(ctc.qV)) {
            $$9 = -$$9;
         }

         float $$11 = $$6.z($$2);
         float $$12 = axz.a(axz.c($$11) * (float) Math.PI);
         float $$13 = axz.i($$2, $$6.ba, $$6.aZ) * (float) (Math.PI / 180.0);
         double $$14 = (double)axz.a($$13);
         double $$15 = (double)axz.b($$13);
         double $$16 = (double)$$9 * 0.35;
         double $$17 = 0.8;
         double $$24;
         double $$25;
         double $$26;
         float $$27;
         if ((this.c.d == null || this.c.d.aA().a()) && $$6 == fde.Q().s) {
            double $$22 = 960.0 / (double)this.c.d.ah().c().intValue();
            etp $$23 = this.c.b.j().a((float)$$9 * 0.525F, -0.1F);
            $$23 = $$23.a($$22);
            $$23 = $$23.b($$12 * 0.5F);
            $$23 = $$23.a(-$$12 * 0.7F);
            $$24 = axz.d((double)$$2, $$6.L, $$6.ds()) + $$23.c;
            $$25 = axz.d((double)$$2, $$6.M, $$6.du()) + $$23.d;
            $$26 = axz.d((double)$$2, $$6.N, $$6.dy()) + $$23.e;
            $$27 = $$6.cJ();
         } else {
            $$24 = axz.d((double)$$2, $$6.L, $$6.ds()) - $$15 * $$16 - $$14 * 0.8;
            $$25 = $$6.M + (double)$$6.cJ() + ($$6.du() - $$6.M) * (double)$$2 - 0.45;
            $$26 = axz.d((double)$$2, $$6.N, $$6.dy()) - $$14 * $$16 + $$15 * 0.8;
            $$27 = $$6.bY() ? -0.1875F : 0.0F;
         }

         double $$28 = axz.d((double)$$2, $$0.L, $$0.ds());
         double $$29 = axz.d((double)$$2, $$0.M, $$0.du()) + 0.25;
         double $$30 = axz.d((double)$$2, $$0.N, $$0.dy());
         float $$31 = (float)($$24 - $$28);
         float $$32 = (float)($$25 - $$29) + $$27;
         float $$33 = (float)($$26 - $$30);
         eyb $$34 = $$4.getBuffer(gbw.z());
         exx.a $$35 = $$3.c();
         int $$36 = 16;

         for (int $$37 = 0; $$37 <= 16; $$37++) {
            a($$31, $$32, $$33, $$34, $$35, a($$37, 16), a($$37 + 1, 16));
         }

         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(eyb $$0, exx.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(gmp.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(float $$0, float $$1, float $$2, eyb $$3, exx.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = axz.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(0, 0, 0, 255).b($$4, $$10, $$11, $$12).e();
   }

   public akh a(clv $$0) {
      return a;
   }
}
