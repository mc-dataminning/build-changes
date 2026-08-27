public class fvq extends fvj<can, fgy<can>> {
   private static final afw a = new afw("textures/entity/phantom.png");

   public fvq(fud.a $$0) {
      super($$0, new fgy<>($$0.a(fiv.aB)), 0.75F);
      this.a(new fyj<>(this));
   }

   public afw a(can $$0) {
      return a;
   }

   protected void a(can $$0, emh $$1, float $$2) {
      int $$3 = $$0.s();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(can $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dD()));
   }
}
