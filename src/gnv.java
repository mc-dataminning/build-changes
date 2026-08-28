public class gnv extends gop<gds, fwj<gds>> {
   public gnv(glz<gds, fwj<gds>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, get $$1, int $$2, gds $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ah().getString()) && !$$3.ci()) {
         fbg $$10 = $$1.getBuffer(gfb.c($$3.b().a()));
         int $$11 = gle.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = ayn.i($$6, $$3.O, $$3.dG()) - ayn.i($$6, $$3.aZ, $$3.aY);
            float $$14 = ayn.i($$6, $$3.P, $$3.dI());
            $$0.a();
            $$0.a(a.d.rotationDegrees($$13));
            $$0.a(a.b.rotationDegrees($$14));
            $$0.a(0.375F * (float)($$12 * 2 - 1), 0.0F, 0.0F);
            $$0.a(0.0F, -0.375F, 0.0F);
            $$0.a(a.b.rotationDegrees(-$$14));
            $$0.a(a.d.rotationDegrees(-$$13));
            float $$15 = 1.3333334F;
            $$0.b(1.3333334F, 1.3333334F, 1.3333334F);
            this.c().b($$0, $$10, $$2, $$11);
            $$0.b();
         }
      }
   }
}
