public class gdj implements gde<dnj> {
   private static final float a = 0.375F;
   private final ghl b;

   public gdj(gdf.a $$0) {
      this.b = $$0.d();
   }

   public void a(dnj $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      ir $$6 = $$0.n().c(ddj.f);
      je<csd> $$7 = $$0.b();
      int $$8 = (int)$$0.az_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         csd $$10 = $$7.get($$9);
         if ($$10 != csd.i) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ir $$11 = ir.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, csa.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
