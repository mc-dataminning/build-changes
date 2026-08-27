public class fzl extends gaf<fpt, fiu<fpt>> {
   public fzl(fxs<fpt, fiu<fpt>> $$0) {
      super($$0);
   }

   public void a(enw $$0, fqu $$1, int $$2, fpt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ad().getString()) && !$$3.ce()) {
         eoa $$10 = $$1.getBuffer(frc.c($$3.b().a()));
         int $$11 = fwy.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = atm.i($$6, $$3.N, $$3.dD()) - atm.i($$6, $$3.aV, $$3.aU);
            float $$14 = atm.i($$6, $$3.O, $$3.dF());
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
