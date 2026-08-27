public class fxp extends fxi<cbp, fiv<cbp>> {
   private static final agm a = new agm("textures/entity/phantom.png");

   public fxp(fwc.a $$0) {
      super($$0, new fiv<>($$0.a(fks.aB)), 0.75F);
      this.a(new gai<>(this));
   }

   public agm a(cbp $$0) {
      return a;
   }

   protected void a(cbp $$0, eob $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cbp $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dF()));
   }
}
