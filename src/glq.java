public class glq extends gkp<cmq> {
   private final glp a;

   public glq(gkq.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(cmq $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      cly $$6 = $$0.u();
      if ($$6 != null) {
         $$3.a();
         this.a.a(new cuh(cuk.vT), cue.h, $$5, gqp.d, $$3, $$4, $$0.dU(), $$0.al());
         ewu $$7 = gkx.a($$6, $$2, cuk.Ar, this.d);
         ewu $$8 = new ewu(aym.d((double)$$2, $$0.M, $$0.dz()), aym.d((double)$$2, $$0.N, $$0.dB()) + (double)$$0.cQ(), aym.d((double)$$2, $$0.O, $$0.dF()));
         float $$9 = (float)$$0.am + $$2;
         float $$10 = $$9 * 0.15F % 1.0F;
         ewu $$11 = $$7.d($$8);
         float $$12 = (float)($$11.f() + 0.1);
         $$11 = $$11.d();
         float $$13 = (float)Math.acos($$11.d);
         float $$14 = (float)Math.atan2($$11.e, $$11.c);
         $$3.a(a.d.rotationDegrees(((float) (Math.PI / 2) - $$14) * (180.0F / (float)Math.PI)));
         $$3.a(a.b.rotationDegrees($$13 * (180.0F / (float)Math.PI)));
         float $$15 = $$9 * 0.05F * -1.5F;
         float $$16 = 0.2F;
         float $$17 = aym.b($$15 + (float) Math.PI) * 0.2F;
         float $$18 = aym.a($$15 + (float) Math.PI) * 0.2F;
         float $$19 = aym.b($$15 + 0.0F) * 0.2F;
         float $$20 = aym.a($$15 + 0.0F) * 0.2F;
         float $$21 = aym.b($$15 + (float) (Math.PI / 2)) * 0.2F;
         float $$22 = aym.a($$15 + (float) (Math.PI / 2)) * 0.2F;
         float $$23 = aym.b($$15 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$24 = aym.a($$15 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$26 = 0.0F;
         float $$27 = 0.4999F;
         float $$28 = -1.0F + $$10;
         float $$29 = $$12 * 2.5F + $$28;
         fbg $$30 = $$4.getBuffer(gfo.e(glf.g));
         fbc.a $$31 = $$3.c();
         a($$30, $$31, $$17, $$12, $$18, 0.4999F, $$29);
         a($$30, $$31, $$17, 0.0F, $$18, 0.4999F, $$28);
         a($$30, $$31, $$19, 0.0F, $$20, 0.0F, $$28);
         a($$30, $$31, $$19, $$12, $$20, 0.0F, $$29);
         a($$30, $$31, $$21, $$12, $$22, 0.4999F, $$29);
         a($$30, $$31, $$21, 0.0F, $$22, 0.4999F, $$28);
         a($$30, $$31, $$23, 0.0F, $$24, 0.0F, $$28);
         a($$30, $$31, $$23, $$12, $$24, 0.0F, $$29);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void a(fbg $$0, fbc.a $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$0.a($$1, $$2, $$3, $$4).a(128, 255, 128, 255).a($$5, $$6).c(gqp.d).b(15728880).a(0.0F, 1.0F, 0.0F).e();
   }

   public akt a(cmq $$0) {
      return gqx.e;
   }
}
