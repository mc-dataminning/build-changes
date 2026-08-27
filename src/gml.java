public class gml extends gmf<cfc, fuw<cfc>> {
   private final gde a;
   private final gir b;

   public gml(gjp<cfc, fuw<cfc>> $$0, gde $$1, gir $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(eys $$0, gck $$1, int $$2, cfc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fdz.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cto $$12 = new cto(dea.ee);
            if ($$10) {
               drb $$13 = dea.ee.n();
               gpw $$14 = this.a.a($$13);
               int $$15 = giu.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gcs.r(gnu.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, ctl.f, false, $$0, $$1, $$3.dP(), $$2, giu.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
