public class gkx extends gkp<cmn> {
   private static final akt a = new akt("textures/entity/fishing_hook.png");
   private static final gfo b = gfo.d(a);
   private static final double g = 960.0;

   public gkx(gkq.a $$0) {
      super($$0);
   }

   public void a(cmn $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      cly $$6 = $$0.r();
      if ($$6 != null) {
         $$3.a();
         $$3.a();
         $$3.b(0.5F, 0.5F, 0.5F);
         $$3.a(this.d.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         fbc.a $$7 = $$3.c();
         fbg $$8 = $$4.getBuffer(b);
         a($$8, $$7, $$5, 0.0F, 0, 0, 1);
         a($$8, $$7, $$5, 1.0F, 0, 1, 1);
         a($$8, $$7, $$5, 1.0F, 1, 1, 0);
         a($$8, $$7, $$5, 0.0F, 1, 0, 0);
         $$3.b();
         ewu $$9 = a($$6, $$2, cuk.ss, this.d);
         double $$10 = aym.d((double)$$2, $$0.M, $$0.dz());
         double $$11 = aym.d((double)$$2, $$0.N, $$0.dB()) + 0.25;
         double $$12 = aym.d((double)$$2, $$0.O, $$0.dF());
         float $$13 = (float)($$9.c - $$10);
         float $$14 = (float)($$9.d - $$11);
         float $$15 = (float)($$9.e - $$12);
         fbg $$16 = $$4.getBuffer(gfo.A());
         fbc.a $$17 = $$3.c();
         int $$18 = 16;

         for (int $$19 = 0; $$19 <= 16; $$19++) {
            a($$13, $$14, $$15, $$16, $$17, a($$19, 16), a($$19 + 1, 16));
         }

         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public static ewu a(cly $$0, float $$1, cuc $$2, gko $$3) {
      int $$4 = $$0.fD() == bsi.b ? 1 : -1;
      cuh $$5 = $$0.fg();
      if (!$$5.a($$2)) {
         $$4 = -$$4;
      }

      float $$6 = $$0.z($$1);
      float $$7 = aym.a(aym.c($$6) * (float) Math.PI);
      float $$8 = aym.i($$1, $$0.bk, $$0.bj) * (float) (Math.PI / 180.0);
      double $$9 = (double)aym.a($$8);
      double $$10 = (double)aym.b($$8);
      double $$11 = (double)$$4 * 0.35;
      double $$12 = 0.8;
      if (($$3.d == null || $$3.d.aA().a()) && $$0 == fgj.Q().s) {
         double $$14 = 960.0 / (double)$$3.d.ah().c().intValue();
         ewu $$15 = $$3.b.j().a((float)$$4 * 0.525F, -0.1F);
         $$15 = $$15.a($$14);
         $$15 = $$15.b($$7 * 0.5F);
         $$15 = $$15.a(-$$7 * 0.7F);
         return new ewu(
            aym.d((double)$$1, $$0.M, $$0.dz()) + $$15.c,
            aym.d((double)$$1, $$0.N, $$0.dB()) + $$15.d + (double)$$0.cQ(),
            aym.d((double)$$1, $$0.O, $$0.dF()) + $$15.e
         );
      } else {
         float $$13 = $$0.cf() ? -0.1875F : 0.0F;
         return new ewu(
            aym.d((double)$$1, $$0.M, $$0.dz()) - $$10 * $$11 - $$9 * 0.8,
            $$0.N + (double)$$0.cQ() + ($$0.dB() - $$0.N) * (double)$$1 - 0.45 + (double)$$13,
            aym.d((double)$$1, $$0.O, $$0.dF()) - $$9 * $$11 + $$10 * 0.8
         );
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fbg $$0, fbc.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(gqp.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(float $$0, float $$1, float $$2, fbg $$3, fbc.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = aym.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(0, 0, 0, 255).b($$4, $$10, $$11, $$12).e();
   }

   public akt a(cmn $$0) {
      return a;
   }
}
