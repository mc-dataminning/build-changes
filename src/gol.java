public class gol extends gpi<gef, fww<gef>> {
   public gol(gmp<gef, fww<gef>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, gef $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.af().getString()) && !$$3.cm()) {
         fbg $$10 = $$1.getBuffer(gfo.c($$3.b().a()));
         int $$11 = glt.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = aym.i($$6, $$3.P, $$3.dK()) - aym.i($$6, $$3.bk, $$3.bj);
            float $$14 = aym.i($$6, $$3.Q, $$3.dM());
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
