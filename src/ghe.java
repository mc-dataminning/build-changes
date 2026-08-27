public class ghe extends ggx<chi, frw<chi>> {
   private static final ajv a = new ajv("textures/entity/phantom.png");

   public ghe(gfr.a $$0) {
      super($$0, new frw<>($$0.a(ftu.aH)), 0.75F);
      this.a(new gka<>(this));
   }

   public ajv a(chi $$0) {
      return a;
   }

   protected void a(chi $$0, ewr $$1, float $$2) {
      int $$3 = $$0.r();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(chi $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
