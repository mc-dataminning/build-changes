public class glf extends gkb<cko, fwb<cko>> {
   private static final ale a = new ale("textures/entity/strider/strider.png");
   private static final ale i = new ale("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glf(giv.a $$0) {
      super($$0, new fwb<>($$0.a(fwx.bD)), 0.5F);
      this.a(new gni<>(this, new fwb<>($$0.a(fwx.bE)), new ale("textures/entity/strider/strider_saddle.png")));
   }

   public ale a(cko $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cko $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cko $$0, ezw $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cko $$0) {
      return super.a($$0) || $$0.s();
   }
}
