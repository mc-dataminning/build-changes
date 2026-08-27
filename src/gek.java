public class gek extends gfe<ful, fng<ful>> {
   public gek(gco<ful, fng<ful>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvm $$1, int $$2, ful $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ad().getString()) && !$$3.ce()) {
         ese $$10 = $$1.getBuffer(fvu.c($$3.b().a()));
         int $$11 = gbu.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = awh.i($$6, $$3.M, $$3.dC()) - awh.i($$6, $$3.aV, $$3.aU);
            float $$14 = awh.i($$6, $$3.N, $$3.dE());
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
