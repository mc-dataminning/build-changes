public class gmr extends gnl<gcp, fvh<gcp>> {
   public gmr(gkv<gcp, fvh<gcp>> $$0) {
      super($$0);
   }

   public void a(faa $$0, gdq $$1, int $$2, gcp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.af().getString()) && !$$3.ch()) {
         fae $$10 = $$1.getBuffer(gdy.c($$3.b().a()));
         int $$11 = gka.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = ayz.i($$6, $$3.O, $$3.dF()) - ayz.i($$6, $$3.aZ, $$3.aY);
            float $$14 = ayz.i($$6, $$3.P, $$3.dH());
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
