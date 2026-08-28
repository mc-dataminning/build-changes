public class glg extends gkc<ckp, fwc<ckp>> {
   private static final ale a = new ale("textures/entity/strider/strider.png");
   private static final ale i = new ale("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glg(giw.a $$0) {
      super($$0, new fwc<>($$0.a(fwy.bD)), 0.5F);
      this.a(new gnj<>(this, new fwc<>($$0.a(fwy.bE)), new ale("textures/entity/strider/strider_saddle.png")));
   }

   public ale a(ckp $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckp $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckp $$0, ezx $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckp $$0) {
      return super.a($$0) || $$0.s();
   }
}
