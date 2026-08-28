public class gmo extends gni<gcm, fve<gcm>> {
   public gmo(gks<gcm, fve<gcm>> $$0) {
      super($$0);
   }

   public void a(ezx $$0, gdn $$1, int $$2, gcm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ("deadmau5".equals($$3.af().getString()) && !$$3.ch()) {
         fab $$10 = $$1.getBuffer(gdv.c($$3.b().a()));
         int $$11 = gjx.c($$3, 0.0F);

         for (int $$12 = 0; $$12 < 2; $$12++) {
            float $$13 = ayy.i($$6, $$3.O, $$3.dF()) - ayy.i($$6, $$3.aZ, $$3.aY);
            float $$14 = ayy.i($$6, $$3.P, $$3.dH());
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
