public class gih extends giz<cja, ftd> {
   private static final akn a = new akn("textures/entity/guardian.png");
   private static final akn i = new akn("textures/entity/guardian_beam.png");
   private static final gcs j = gcs.e(i);

   public gih(ght.a $$0) {
      this($$0, 0.5F, fvv.am);
   }

   protected gih(ght.a $$0, float $$1, fvu $$2) {
      super($$0, new ftd($$0.a($$2)), $$1);
   }

   public boolean a(cja $$0, gfo $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.gr()) {
            bsq $$5 = $$0.gs();
            if ($$5 != null) {
               eum $$6 = this.a($$5, (double)$$5.dk() * 0.5, 1.0F);
               eum $$7 = this.a($$0, (double)$$0.cL(), 1.0F);
               return $$1.a(new euh($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private eum a(bsq $$0, double $$1, float $$2) {
      double $$3 = ayf.d((double)$$2, $$0.ad, $$0.du());
      double $$4 = ayf.d((double)$$2, $$0.ae, $$0.dw()) + $$1;
      double $$5 = ayf.d((double)$$2, $$0.af, $$0.dA());
      return new eum($$3, $$4, $$5);
   }

   public void a(cja $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      bsq $$6 = $$0.gs();
      if ($$6 != null) {
         float $$7 = $$0.I($$2);
         float $$8 = $$0.gt() + $$2;
         float $$9 = $$8 * 0.5F % 1.0F;
         float $$10 = $$0.cL();
         $$3.a();
         $$3.a(0.0F, $$10, 0.0F);
         eum $$11 = this.a($$6, (double)$$6.dk() * 0.5, $$2);
         eum $$12 = this.a($$0, (double)$$10, $$2);
         eum $$13 = $$11.d($$12);
         float $$14 = (float)($$13.f() + 1.0);
         $$13 = $$13.d();
         float $$15 = (float)Math.acos($$13.d);
         float $$16 = (float)Math.atan2($$13.e, $$13.c);
         $$3.a(a.d.rotationDegrees(((float) (Math.PI / 2) - $$16) * (180.0F / (float)Math.PI)));
         $$3.a(a.b.rotationDegrees($$15 * (180.0F / (float)Math.PI)));
         int $$17 = 1;
         float $$18 = $$8 * 0.05F * -1.5F;
         float $$19 = $$7 * $$7;
         int $$20 = 64 + (int)($$19 * 191.0F);
         int $$21 = 32 + (int)($$19 * 191.0F);
         int $$22 = 128 - (int)($$19 * 64.0F);
         float $$23 = 0.2F;
         float $$24 = 0.282F;
         float $$25 = ayf.b($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$26 = ayf.a($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$27 = ayf.b($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$28 = ayf.a($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$29 = ayf.b($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$30 = ayf.a($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$31 = ayf.b($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$32 = ayf.a($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$33 = ayf.b($$18 + (float) Math.PI) * 0.2F;
         float $$34 = ayf.a($$18 + (float) Math.PI) * 0.2F;
         float $$35 = ayf.b($$18 + 0.0F) * 0.2F;
         float $$36 = ayf.a($$18 + 0.0F) * 0.2F;
         float $$37 = ayf.b($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$38 = ayf.a($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$39 = ayf.b($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$40 = ayf.a($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$42 = 0.0F;
         float $$43 = 0.4999F;
         float $$44 = -1.0F + $$9;
         float $$45 = $$14 * 2.5F + $$44;
         eyy $$46 = $$4.getBuffer(j);
         eyu.a $$47 = $$3.c();
         a($$46, $$47, $$33, $$14, $$34, $$20, $$21, $$22, 0.4999F, $$45);
         a($$46, $$47, $$33, 0.0F, $$34, $$20, $$21, $$22, 0.4999F, $$44);
         a($$46, $$47, $$35, 0.0F, $$36, $$20, $$21, $$22, 0.0F, $$44);
         a($$46, $$47, $$35, $$14, $$36, $$20, $$21, $$22, 0.0F, $$45);
         a($$46, $$47, $$37, $$14, $$38, $$20, $$21, $$22, 0.4999F, $$45);
         a($$46, $$47, $$37, 0.0F, $$38, $$20, $$21, $$22, 0.4999F, $$44);
         a($$46, $$47, $$39, 0.0F, $$40, $$20, $$21, $$22, 0.0F, $$44);
         a($$46, $$47, $$39, $$14, $$40, $$20, $$21, $$22, 0.0F, $$45);
         float $$48 = 0.0F;
         if ($$0.ai % 2 == 0) {
            $$48 = 0.5F;
         }

         a($$46, $$47, $$25, $$14, $$26, $$20, $$21, $$22, 0.5F, $$48 + 0.5F);
         a($$46, $$47, $$27, $$14, $$28, $$20, $$21, $$22, 1.0F, $$48 + 0.5F);
         a($$46, $$47, $$31, $$14, $$32, $$20, $$21, $$22, 1.0F, $$48);
         a($$46, $$47, $$29, $$14, $$30, $$20, $$21, $$22, 0.5F, $$48);
         $$3.b();
      }
   }

   private static void a(eyy $$0, eyu.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
      $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).c(gnm.d).b(15728880).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public akn a(cja $$0) {
      return a;
   }
}
