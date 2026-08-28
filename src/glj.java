public class glj extends gkf<cks, fwf<cks>> {
   private static final alf a = new alf("textures/entity/strider/strider.png");
   private static final alf i = new alf("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glj(giz.a $$0) {
      super($$0, new fwf<>($$0.a(fxb.bD)), 0.5F);
      this.a(new gnm<>(this, new fwf<>($$0.a(fxb.bE)), new alf("textures/entity/strider/strider_saddle.png")));
   }

   public alf a(cks $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cks $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cks $$0, faa $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cks $$0) {
      return super.a($$0) || $$0.s();
   }
}
