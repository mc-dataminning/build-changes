public class fwr extends fxl<fmz, fgd<fmz>> {
   public fwr(fuy<fmz, fgd<fmz>> $$0) {
      super($$0);
   }

   public void a(elj $$0, foa $$1, int $$2, fmz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ab().getString()) && !$$3.cd()) {
         eln $$10 = $$1.getBuffer(foi.c($$3.b().a()));
         int $$11 = fue.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = asb.i($$6, $$3.N, $$3.dB()) - asb.i($$6, $$3.aV, $$3.aU);
            float $$14 = asb.i($$6, $$3.O, $$3.dD());
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
