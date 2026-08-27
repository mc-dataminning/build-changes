public class gcn implements gci<dmu> {
   private static final float a = 0.375F;
   private final ggp b;

   public gcn(gcj.a $$0) {
      this.b = $$0.d();
   }

   public void a(dmu $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      ij $$6 = $$0.n().c(dcv.f);
      iw<crs> $$7 = $$0.b();
      int $$8 = (int)$$0.az_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         crs $$10 = $$7.get($$9);
         if ($$10 != crs.i) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ij $$11 = ij.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, crp.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
