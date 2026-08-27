public class glf extends glz<ciy, fvx> {
   private static final akt a = new akt("textures/entity/guardian.png");
   private static final akt b = new akt("textures/entity/toxifin.png");
   private static final akt k = new akt("textures/entity/guardian_beam.png");
   public static final akt g = new akt("textures/entity/toxifin_beam.png");

   public glf(gkq.a $$0, fyq $$1) {
      this($$0, 0.5F, $$1);
   }

   protected glf(gkq.a $$0, float $$1, fyq $$2) {
      super($$0, new fvx($$0.a($$2)), $$1);
   }

   public boolean a(ciy $$0, gik $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.gC()) {
            bso $$5 = $$0.gD();
            if ($$5 != null) {
               ewu $$6 = this.a($$5, (double)$$5.dp() * 0.5, 1.0F);
               ewu $$7 = this.a($$0, (double)$$0.cQ(), 1.0F);
               return $$1.a(new ewp($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private ewu a(bso $$0, double $$1, float $$2) {
      double $$3 = aym.d((double)$$2, $$0.ae, $$0.dz());
      double $$4 = aym.d((double)$$2, $$0.af, $$0.dB()) + $$1;
      double $$5 = aym.d((double)$$2, $$0.ag, $$0.dF());
      return new ewu($$3, $$4, $$5);
   }

   public void a(ciy $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      bso $$6 = $$0.gD();
      boolean $$7 = $$0.gz();
      if ($$6 != null) {
         float $$8 = $$0.I($$2);
         float $$9 = $$0.gE() + $$2;
         float $$10 = $$9 * ($$7 ? 0.15F : 0.5F) % 1.0F;
         float $$11 = $$0.cQ();
         $$3.a();
         $$3.a(0.0F, $$11, 0.0F);
         ewu $$12 = this.a($$6, (double)$$6.dp() * 0.5, $$2);
         ewu $$13 = this.a($$0, (double)$$11, $$2);
         ewu $$14 = $$12.d($$13);
         float $$15 = (float)($$14.f() + ($$7 ? 0.1 : 1.0));
         $$14 = $$14.d();
         float $$16 = (float)Math.acos($$14.d);
         float $$17 = (float)Math.atan2($$14.e, $$14.c);
         $$3.a(a.d.rotationDegrees(((float) (Math.PI / 2) - $$17) * (180.0F / (float)Math.PI)));
         $$3.a(a.b.rotationDegrees($$16 * (180.0F / (float)Math.PI)));
         int $$18 = 1;
         float $$19 = $$9 * 0.05F * -1.5F;
         float $$20 = $$8 * $$8;
         int $$21;
         int $$22;
         int $$23;
         if ($$7) {
            $$21 = 255 - (int)($$20 * 127.0F);
            $$22 = 255;
            $$23 = 255 - (int)($$20 * 127.0F);
         } else {
            $$21 = 64 + (int)($$20 * 191.0F);
            $$22 = 32 + (int)($$20 * 191.0F);
            $$23 = 128 - (int)($$20 * 64.0F);
         }

         float $$27 = 0.2F;
         float $$28 = 0.282F;
         float $$29 = aym.b($$19 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$30 = aym.a($$19 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$31 = aym.b($$19 + (float) (Math.PI / 4)) * 0.282F;
         float $$32 = aym.a($$19 + (float) (Math.PI / 4)) * 0.282F;
         float $$33 = aym.b($$19 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$34 = aym.a($$19 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$35 = aym.b($$19 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$36 = aym.a($$19 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$37 = aym.b($$19 + (float) Math.PI) * 0.2F;
         float $$38 = aym.a($$19 + (float) Math.PI) * 0.2F;
         float $$39 = aym.b($$19 + 0.0F) * 0.2F;
         float $$40 = aym.a($$19 + 0.0F) * 0.2F;
         float $$41 = aym.b($$19 + (float) (Math.PI / 2)) * 0.2F;
         float $$42 = aym.a($$19 + (float) (Math.PI / 2)) * 0.2F;
         float $$43 = aym.b($$19 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$44 = aym.a($$19 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$46 = 0.0F;
         float $$47 = 0.4999F;
         float $$48 = -1.0F + $$10;
         float $$49 = $$15 * 2.5F + $$48;
         fbg $$50 = $$4.getBuffer(gfo.e($$7 ? g : k));
         fbc.a $$51 = $$3.c();
         a($$50, $$51, $$37, $$15, $$38, $$21, $$22, $$23, 0.4999F, $$49);
         a($$50, $$51, $$37, 0.0F, $$38, $$21, $$22, $$23, 0.4999F, $$48);
         a($$50, $$51, $$39, 0.0F, $$40, $$21, $$22, $$23, 0.0F, $$48);
         a($$50, $$51, $$39, $$15, $$40, $$21, $$22, $$23, 0.0F, $$49);
         a($$50, $$51, $$41, $$15, $$42, $$21, $$22, $$23, 0.4999F, $$49);
         a($$50, $$51, $$41, 0.0F, $$42, $$21, $$22, $$23, 0.4999F, $$48);
         a($$50, $$51, $$43, 0.0F, $$44, $$21, $$22, $$23, 0.0F, $$48);
         a($$50, $$51, $$43, $$15, $$44, $$21, $$22, $$23, 0.0F, $$49);
         float $$52 = 0.0F;
         if (!$$7 && $$0.am % 2 == 0) {
            $$52 = 0.5F;
         }

         a($$50, $$51, $$29, $$15, $$30, $$21, $$22, $$23, 0.5F, $$52 + 0.5F);
         a($$50, $$51, $$31, $$15, $$32, $$21, $$22, $$23, 1.0F, $$52 + 0.5F);
         a($$50, $$51, $$35, $$15, $$36, $$21, $$22, $$23, 1.0F, $$52);
         a($$50, $$51, $$33, $$15, $$34, $$21, $$22, $$23, 0.5F, $$52);
         $$3.b();
      }
   }

   private static void a(fbg $$0, fbc.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
      $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).c(gqp.d).b(15728880).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public akt a(ciy $$0) {
      return $$0.gz() ? b : a;
   }
}
