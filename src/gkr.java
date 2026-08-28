public class gkr extends glj<cjx, fvl> {
   private static final akq a = akq.b("textures/entity/guardian.png");
   private static final akq i = akq.b("textures/entity/guardian_beam.png");
   private static final gfb j = gfb.e(i);

   public gkr(gkd.a $$0) {
      this($$0, 0.5F, fyd.an);
   }

   protected gkr(gkd.a $$0, float $$1, fyc $$2) {
      super($$0, new fvl($$0.a($$2)), $$1);
   }

   public boolean a(cjx $$0, ghy $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.go()) {
            btl $$5 = $$0.gp();
            if ($$5 != null) {
               eww $$6 = this.a($$5, (double)$$5.dl() * 0.5, 1.0F);
               eww $$7 = this.a($$0, (double)$$0.cM(), 1.0F);
               return $$1.a(new ewr($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private eww a(btl $$0, double $$1, float $$2) {
      double $$3 = ayn.d((double)$$2, $$0.ad, $$0.dv());
      double $$4 = ayn.d((double)$$2, $$0.ae, $$0.dx()) + $$1;
      double $$5 = ayn.d((double)$$2, $$0.af, $$0.dB());
      return new eww($$3, $$4, $$5);
   }

   public void a(cjx $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      btl $$6 = $$0.gp();
      if ($$6 != null) {
         float $$7 = $$0.J($$2);
         float $$8 = $$0.gq() + $$2;
         float $$9 = $$8 * 0.5F % 1.0F;
         float $$10 = $$0.cM();
         $$3.a();
         $$3.a(0.0F, $$10, 0.0F);
         eww $$11 = this.a($$6, (double)$$6.dl() * 0.5, $$2);
         eww $$12 = this.a($$0, (double)$$10, $$2);
         eww $$13 = $$11.d($$12);
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
         float $$25 = ayn.b($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$26 = ayn.a($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$27 = ayn.b($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$28 = ayn.a($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$29 = ayn.b($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$30 = ayn.a($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$31 = ayn.b($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$32 = ayn.a($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$33 = ayn.b($$18 + (float) Math.PI) * 0.2F;
         float $$34 = ayn.a($$18 + (float) Math.PI) * 0.2F;
         float $$35 = ayn.b($$18 + 0.0F) * 0.2F;
         float $$36 = ayn.a($$18 + 0.0F) * 0.2F;
         float $$37 = ayn.b($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$38 = ayn.a($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$39 = ayn.b($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$40 = ayn.a($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$42 = 0.0F;
         float $$43 = 0.4999F;
         float $$44 = -1.0F + $$9;
         float $$45 = $$14 * 2.5F + $$44;
         fbg $$46 = $$4.getBuffer(j);
         fbc.a $$47 = $$3.c();
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

   private static void a(fbg $$0, fbc.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
      $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).b(gpw.d).c(15728880).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public akq a(cjx $$0) {
      return a;
   }
}
