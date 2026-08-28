public class grh extends gsr<cme, gxp, gbf<gxp>> {
   private static final alp a = alp.b("textures/entity/enderman/enderman.png");
   private final bac b = bac.a();

   public grh(grl.a $$0) {
      super($$0, new gbf<>($$0.a(gei.aH)), 0.5F);
      this.a(new gvi(this));
      this.a(new gva(this, $$0.d()));
   }

   public fbr a(gxp $$0) {
      fbr $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alp b(gxp $$0) {
      return a;
   }

   public gxp a() {
      return new gxp();
   }

   public void a(cme $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsc.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.x();
   }
}
