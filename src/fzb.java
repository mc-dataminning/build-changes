public class fzb extends fyu<ccb, fjz<ccb>> {
   private static final agt a = new agt("textures/entity/phantom.png");

   public fzb(fxo.a $$0) {
      super($$0, new fjz<>($$0.a(flx.aE)), 0.75F);
      this.a(new gbx<>(this));
   }

   public agt a(ccb $$0) {
      return a;
   }

   protected void a(ccb $$0, epd $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(ccb $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
