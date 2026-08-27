public class gji extends gkc<fzh, fsa<fzh>> {
   public gji(ghm<fzh, fsa<fzh>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, fzh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.ad().getString()) && !$$3.ce()) {
         ewv $$10 = $$1.getBuffer(gaq.c($$3.b().a()));
         int $$11 = ggs.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = axm.i($$6, $$3.N, $$3.dC()) - axm.i($$6, $$3.aY, $$3.aX);
            float $$14 = axm.i($$6, $$3.O, $$3.dE());
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
