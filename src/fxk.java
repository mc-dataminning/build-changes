public class fxk extends fxd<cbk, fiq<cbk>> {
   private static final agi a = new agi("textures/entity/phantom.png");

   public fxk(fvx.a $$0) {
      super($$0, new fiq<>($$0.a(fkn.aB)), 0.75F);
      this.a(new gad<>(this));
   }

   public agi a(cbk $$0) {
      return a;
   }

   protected void a(cbk $$0, enw $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cbk $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dF()));
   }
}
