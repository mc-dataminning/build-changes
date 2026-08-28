import javax.annotation.Nullable;

public class gvy extends gwq<cnp, hcc, gfm> {
   private static final ale a = ale.b("textures/entity/guardian.png");
   private static final ale j = ale.b("textures/entity/guardian_beam.png");
   private static final gpn k = gpn.g(j);

   public gvy(gvk.a $$0) {
      this($$0, 0.5F, gif.bf);
   }

   protected gvy(gvk.a $$0, float $$1, gie $$2) {
      super($$0, new gfm($$0.a($$2)), $$1);
   }

   public boolean a(cnp $$0, gsw $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.x()) {
            bwz $$5 = $$0.gq();
            if ($$5 != null) {
               fdw $$6 = this.a($$5, (double)$$5.dr() * 0.5, 1.0F);
               fdw $$7 = this.a($$0, (double)$$0.cS(), 1.0F);
               return $$1.a(new fdr($$7.d, $$7.e, $$7.f, $$6.d, $$6.e, $$6.f));
            }
         }

         return false;
      }
   }

   private fdw a(bwz $$0, double $$1, float $$2) {
      double $$3 = azk.d((double)$$2, $$0.aa, $$0.dA());
      double $$4 = azk.d((double)$$2, $$0.ab, $$0.dC()) + $$1;
      double $$5 = azk.d((double)$$2, $$0.ac, $$0.dG());
      return new fdw($$3, $$4, $$5);
   }

   public void a(hcc $$0, fiq $$1, gpd $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      fdw $$4 = $$0.f;
      if ($$4 != null) {
         float $$5 = $$0.g * 0.5F % 1.0F;
         $$1.a();
         $$1.a(0.0F, $$0.x, 0.0F);
         a($$1, $$2.getBuffer(k), $$4.d($$0.c), $$0.g, $$0.h, $$5);
         $$1.b();
      }
   }

   private static void a(fiq $$0, fiu $$1, fdw $$2, float $$3, float $$4, float $$5) {
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
      float $$16 = azk.b($$9 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float $$17 = azk.a($$9 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float $$18 = azk.b($$9 + (float) (Math.PI / 4)) * 0.282F;
      float $$19 = azk.a($$9 + (float) (Math.PI / 4)) * 0.282F;
      float $$20 = azk.b($$9 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float $$21 = azk.a($$9 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float $$22 = azk.b($$9 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float $$23 = azk.a($$9 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float $$24 = azk.b($$9 + (float) Math.PI) * 0.2F;
      float $$25 = azk.a($$9 + (float) Math.PI) * 0.2F;
      float $$26 = azk.b($$9 + 0.0F) * 0.2F;
      float $$27 = azk.a($$9 + 0.0F) * 0.2F;
      float $$28 = azk.b($$9 + (float) (Math.PI / 2)) * 0.2F;
      float $$29 = azk.a($$9 + (float) (Math.PI / 2)) * 0.2F;
      float $$30 = azk.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float $$31 = azk.a($$9 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float $$33 = 0.0F;
      float $$34 = 0.4999F;
      float $$35 = -1.0F + $$5;
      float $$36 = $$35 + $$6 * 2.5F;
      fiq.a $$37 = $$0.c();
      a($$1, $$37, $$24, $$6, $$25, $$11, $$12, $$13, 0.4999F, $$36);
      a($$1, $$37, $$24, 0.0F, $$25, $$11, $$12, $$13, 0.4999F, $$35);
      a($$1, $$37, $$26, 0.0F, $$27, $$11, $$12, $$13, 0.0F, $$35);
      a($$1, $$37, $$26, $$6, $$27, $$11, $$12, $$13, 0.0F, $$36);
      a($$1, $$37, $$28, $$6, $$29, $$11, $$12, $$13, 0.4999F, $$36);
      a($$1, $$37, $$28, 0.0F, $$29, $$11, $$12, $$13, 0.4999F, $$35);
      a($$1, $$37, $$30, 0.0F, $$31, $$11, $$12, $$13, 0.0F, $$35);
      a($$1, $$37, $$30, $$6, $$31, $$11, $$12, $$13, 0.0F, $$36);
      float $$38 = azk.d($$3) % 2 == 0 ? 0.5F : 0.0F;
      a($$1, $$37, $$16, $$6, $$17, $$11, $$12, $$13, 0.5F, $$38 + 0.5F);
      a($$1, $$37, $$18, $$6, $$19, $$11, $$12, $$13, 1.0F, $$38 + 0.5F);
      a($$1, $$37, $$22, $$6, $$23, $$11, $$12, $$13, 1.0F, $$38);
      a($$1, $$37, $$20, $$6, $$21, $$11, $$12, $$13, 0.5F, $$38);
   }

   private static void a(fiu $$0, fiq.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
      $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).b(hhp.d).c(15728880).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public ale a(hcc $$0) {
      return a;
   }

   public hcc b() {
      return new hcc();
   }

   public void a(cnp $$0, hcc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.J($$2);
      $$1.c = $$0.n($$2);
      bwa $$3 = a($$0);
      if ($$3 != null) {
         $$1.d = $$0.h($$2);
         $$1.e = $$3.n($$2);
      } else {
         $$1.d = null;
         $$1.e = null;
      }

      bwz $$4 = $$0.gq();
      if ($$4 != null) {
         $$1.h = $$0.L($$2);
         $$1.g = $$0.gr() + $$2;
         $$1.f = this.a($$4, (double)$$4.dr() * 0.5, $$2);
      } else {
         $$1.f = null;
      }
   }

   @Nullable
   private static bwa a(cnp $$0) {
      bwa $$1 = fof.Q().ao();
      return (bwa)($$0.x() ? $$0.gq() : $$1);
   }
}
