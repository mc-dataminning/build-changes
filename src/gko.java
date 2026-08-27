public class gko extends gli<gan, ftg<gan>> {
   public gko(gis<gan, ftg<gan>> $$0) {
      super($$0);
   }

   public void a(exx $$0, gbo $$1, int $$2, gan $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ad().getString()) && !$$3.cf()) {
         eyb $$10 = $$1.getBuffer(gbw.c($$3.b().a()));
         int $$11 = ghy.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = axz.i($$6, $$3.O, $$3.dD()) - axz.i($$6, $$3.ba, $$3.aZ);
            float $$14 = axz.i($$6, $$3.P, $$3.dF());
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
