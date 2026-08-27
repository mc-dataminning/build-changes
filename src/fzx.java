public class fzx extends fyu<ccm, flb<ccm>> {
   private static final agt a = new agt("textures/entity/strider/strider.png");
   private static final agt i = new agt("textures/entity/strider/strider_cold.png");

   public fzx(fxo.a $$0) {
      super($$0, new flb<>($$0.a(flx.bA)), 0.5F);
      this.a(new gca<>(this, new flb<>($$0.a(flx.bB)), new agt("textures/entity/strider/strider_saddle.png")));
   }

   public agt a(ccm $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(ccm $$0, epd $$1, float $$2) {
      if ($$0.o_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(ccm $$0) {
      return super.a($$0) || $$0.u();
   }
}
