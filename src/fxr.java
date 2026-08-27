public class fxr extends fyl<fnz, fhc<fnz>> {
   public fxr(fvy<fnz, fhc<fnz>> $$0) {
      super($$0);
   }

   public void a(emh $$0, fpb $$1, int $$2, fnz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ab().getString()) && !$$3.cd()) {
         eml $$10 = $$1.getBuffer(fpj.c($$3.b().a()));
         int $$11 = fve.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = asy.i($$6, $$3.N, $$3.dB()) - asy.i($$6, $$3.aV, $$3.aU);
            float $$14 = asy.i($$6, $$3.O, $$3.dD());
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
