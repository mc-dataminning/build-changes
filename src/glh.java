public class glh extends gkd<ckq, fwd<ckq>> {
   private static final alf a = new alf("textures/entity/strider/strider.png");
   private static final alf i = new alf("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glh(gix.a $$0) {
      super($$0, new fwd<>($$0.a(fwz.bD)), 0.5F);
      this.a(new gnk<>(this, new fwd<>($$0.a(fwz.bE)), new alf("textures/entity/strider/strider_saddle.png")));
   }

   public alf a(ckq $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckq $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckq $$0, ezy $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckq $$0) {
      return super.a($$0) || $$0.s();
   }
}
