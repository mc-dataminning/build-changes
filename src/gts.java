public class gts extends gtk<cma, gzt, gda> {
   private static final akv a = akv.b("textures/entity/phantom.png");

   public gts(gse.a $$0) {
      super($$0, new gda($$0.a(gfc.bO)), 0.75F);
      this.a(new gwr(this));
   }

   public akv a(gzt $$0) {
      return a;
   }

   public gzt b() {
      return new gzt();
   }

   public void a(cma $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.u;
      $$1.b = $$0.m();
   }

   protected void a(gzt $$0, ffu $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzt $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
