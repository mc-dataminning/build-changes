import javax.annotation.Nullable;

public class gxh extends gxz<cog, hdm, ggt> {
   private static final alg a = alg.b("textures/entity/guardian.png");
   private static final alg j = alg.b("textures/entity/guardian_beam.png");
   private static final gqx k = gqx.g(j);

   public gxh(gwt.a $$0) {
      this($$0, 0.5F, gjn.bj);
   }

   protected gxh(gwt.a $$0, float $$1, gjm $$2) {
      super($$0, new ggt($$0.a($$2)), $$1);
   }

   public boolean a(cog $$0, guf $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.x()) {
            bxj $$5 = $$0.gt();
            if ($$5 != null) {
               fex $$6 = this.a($$5, (double)$$5.dq() * 0.5, 1.0F);
               fex $$7 = this.a($$0, (double)$$0.cR(), 1.0F);
               return $$1.a(new fes($$7.d, $$7.e, $$7.f, $$6.d, $$6.e, $$6.f));
            }
         }

         return false;
      }
   }

   private fex a(bxj $$0, double $$1, float $$2) {
      double $$3 = azm.d((double)$$2, $$0.aa, $$0.dz());
      double $$4 = azm.d((double)$$2, $$0.ab, $$0.dB()) + $$1;
      double $$5 = azm.d((double)$$2, $$0.ac, $$0.dF());
      return new fex($$3, $$4, $$5);
   }

   public void a(hdm $$0, fjy $$1, gqm $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      fex $$4 = $$0.f;
      if ($$4 != null) {
         float $$5 = $$0.g * 0.5F % 1.0F;
         $$1.a();
         $$1.a(0.0F, $$0.x, 0.0F);
         a($$1, $$2.getBuffer(k), $$4.d($$0.c), $$0.g, $$0.h, $$5);
         $$1.b();
      }
   }

   private static void a(fjy $$0, fkc $$1, fex $$2, float $$3, float $$4, float $$5) {
      float $$6 = (float)($$2.g() + 1.0);
      $$2 = $$2.d();
      float $$7 = (float)Math.acos($$2.e);
      float $$8 = (float) (Math.PI / 2) - (float)Math.atan2($$2.f, $$2.d);
      $$0.a(a.d.rotationDegrees($$8 * (180.0F / (float)Math.PI)));
      $$0.a(a.b.rotationDegrees($$7 * (180.0F / (float)Math.PI)));
      float $$9 = $$3 * 0.05F * -1.5F;
      float $$10 = $$4 * $$4;
      int $$11 = 64 + (int)($$10 * 191.0F);
      int $$12 = 32 + (int)($$10 * 191.0F);
      int $$13 = 128 - (int)($$10 * 64.0F);
      float $$14 = 0.2F;
      float $$15 = 0.282F;
      float $$16 = azm.b($$9 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float $$17 = azm.a($$9 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float $$18 = azm.b($$9 + (float) (Math.PI / 4)) * 0.282F;
      float $$19 = azm.a($$9 + (float) (Math.PI / 4)) * 0.282F;
      float $$20 = azm.b($$9 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float $$21 = azm.a($$9 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float $$22 = azm.b($$9 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float $$23 = azm.a($$9 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float $$24 = azm.b($$9 + (float) Math.PI) * 0.2F;
      float $$25 = azm.a($$9 + (float) Math.PI) * 0.2F;
      float $$26 = azm.b($$9 + 0.0F) * 0.2F;
      float $$27 = azm.a($$9 + 0.0F) * 0.2F;
      float $$28 = azm.b($$9 + (float) (Math.PI / 2)) * 0.2F;
      float $$29 = azm.a($$9 + (float) (Math.PI / 2)) * 0.2F;
      float $$30 = azm.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float $$31 = azm.a($$9 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float $$33 = 0.0F;
      float $$34 = 0.4999F;
      float $$35 = -1.0F + $$5;
      float $$36 = $$35 + $$6 * 2.5F;
      fjy.a $$37 = $$0.c();
      a($$1, $$37, $$24, $$6, $$25, $$11, $$12, $$13, 0.4999F, $$36);
      a($$1, $$37, $$24, 0.0F, $$25, $$11, $$12, $$13, 0.4999F, $$35);
      a($$1, $$37, $$26, 0.0F, $$27, $$11, $$12, $$13, 0.0F, $$35);
      a($$1, $$37, $$26, $$6, $$27, $$11, $$12, $$13, 0.0F, $$36);
      a($$1, $$37, $$28, $$6, $$29, $$11, $$12, $$13, 0.4999F, $$36);
      a($$1, $$37, $$28, 0.0F, $$29, $$11, $$12, $$13, 0.4999F, $$35);
      a($$1, $$37, $$30, 0.0F, $$31, $$11, $$12, $$13, 0.0F, $$35);
      a($$1, $$37, $$30, $$6, $$31, $$11, $$12, $$13, 0.0F, $$36);
      float $$38 = azm.d($$3) % 2 == 0 ? 0.5F : 0.0F;
      a($$1, $$37, $$16, $$6, $$17, $$11, $$12, $$13, 0.5F, $$38 + 0.5F);
      a($$1, $$37, $$18, $$6, $$19, $$11, $$12, $$13, 1.0F, $$38 + 0.5F);
      a($$1, $$37, $$22, $$6, $$23, $$11, $$12, $$13, 1.0F, $$38);
      a($$1, $$37, $$20, $$6, $$21, $$11, $$12, $$13, 0.5F, $$38);
   }

   private static void a(fkc $$0, fjy.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
      $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).b(hja.d).c(15728880).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public alg a(hdm $$0) {
      return a;
   }

   public hdm b() {
      return new hdm();
   }

   public void a(cog $$0, hdm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.J($$2);
      $$1.c = $$0.n($$2);
      bwi $$3 = a($$0);
      if ($$3 != null) {
         $$1.d = $$0.h($$2);
         $$1.e = $$3.n($$2);
      } else {
         $$1.d = null;
         $$1.e = null;
      }

      bxj $$4 = $$0.gt();
      if ($$4 != null) {
         $$1.h = $$0.L($$2);
         $$1.g = $$0.gu() + $$2;
         $$1.f = this.a($$4, (double)$$4.dq() * 0.5, $$2);
      } else {
         $$1.f = null;
      }
   }

   @Nullable
   private static bwi a(cog $$0) {
      bwi $$1 = fpo.Q().ao();
      return (bwi)($$0.x() ? $$0.gt() : $$1);
   }
}
