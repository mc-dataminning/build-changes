public class gkd extends giz<cjr, fuz<cjr>> {
   private static final akn a = new akn("textures/entity/strider/strider.png");
   private static final akn i = new akn("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gkd(ght.a $$0) {
      super($$0, new fuz<>($$0.a(fvv.bD)), 0.5F);
      this.a(new gmg<>(this, new fuz<>($$0.a(fvv.bE)), new akn("textures/entity/strider/strider_saddle.png")));
   }

   public akn a(cjr $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cjr $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cjr $$0, eyu $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cjr $$0) {
      return super.a($$0) || $$0.s();
   }
}
