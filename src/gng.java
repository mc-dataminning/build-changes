public class gng extends goa<gde, fvv<gde>> {
   public gng(glk<gde, fvv<gde>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, gde $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ah().getString()) && !$$3.cj()) {
         fas $$10 = $$1.getBuffer(gen.c($$3.b().a()));
         int $$11 = gkp.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = ayg.i($$6, $$3.O, $$3.dH()) - ayg.i($$6, $$3.ba, $$3.aZ);
            float $$14 = ayg.i($$6, $$3.P, $$3.dJ());
            $$0.a();
            $$0.a(a.d.rotationDegrees($$13));
            $$0.a(a.b.rotationDegrees($$14));
            $$0.a(0.375F * (float)($$12 * 2 - 1), 0.0F, 0.0F);
            $$0.a(0.0F, -0.375F, 0.0F);
            $$0.a(a.b.rotationDegrees(-$$14));
            $$0.a(a.d.rotationDegrees(-$$13));
            float $$15 = 1.3333334F;
            $$0.b(1.3333334F, 1.3333334F, 1.3333334F);
            this.c().a($$0, $$10, $$2, $$11);
            $$0.b();
         }
      }
   }
}
