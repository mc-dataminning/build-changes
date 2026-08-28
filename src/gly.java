public class gly extends gku<cke, fwt<cke>> {
   private static final akk a = new akk("textures/entity/strider/strider.png");
   private static final akk i = new akk("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gly(gjo.a $$0) {
      super($$0, new fwt<>($$0.a(fxp.bD)), 0.5F);
      this.a(new gob<>(this, new fwt<>($$0.a(fxp.bE)), new akk("textures/entity/strider/strider_saddle.png")));
   }

   public akk a(cke $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cke $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cke $$0, fao $$1, float $$2) {
      float $$3 = $$0.ec();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cke $$0) {
      return super.a($$0) || $$0.s();
   }
}
