public class gkd extends giz<cjp, fuz<cjp>> {
   private static final akm a = new akm("textures/entity/strider/strider.png");
   private static final akm i = new akm("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gkd(ght.a $$0) {
      super($$0, new fuz<>($$0.a(fvv.bD)), 0.5F);
      this.a(new gmg<>(this, new fuz<>($$0.a(fvv.bE)), new akm("textures/entity/strider/strider_saddle.png")));
   }

   public akm a(cjp $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cjp $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cjp $$0, eys $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cjp $$0) {
      return super.a($$0) || $$0.s();
   }
}
