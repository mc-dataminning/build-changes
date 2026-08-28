public class glc extends gjy<ckl, fvy<ckl>> {
   private static final alb a = new alb("textures/entity/strider/strider.png");
   private static final alb i = new alb("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glc(gis.a $$0) {
      super($$0, new fvy<>($$0.a(fwu.bD)), 0.5F);
      this.a(new gnf<>(this, new fvy<>($$0.a(fwu.bE)), new alb("textures/entity/strider/strider_saddle.png")));
   }

   public alb a(ckl $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckl $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckl $$0, ezt $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckl $$0) {
      return super.a($$0) || $$0.s();
   }
}
