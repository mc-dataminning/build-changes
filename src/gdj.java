public class gdj extends gcg<cfe, fol<cfe>> {
   private static final aiy a = new aiy("textures/entity/strider/strider.png");
   private static final aiy i = new aiy("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gdj(gba.a $$0) {
      super($$0, new fol<>($$0.a(fpi.bz)), 0.5F);
      this.a(new gfm<>(this, new fol<>($$0.a(fpi.bA)), new aiy("textures/entity/strider/strider_saddle.png")));
   }

   public aiy a(cfe $$0) {
      return $$0.u() ? i : a;
   }

   protected float b(cfe $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cfe $$0, esh $$1, float $$2) {
      float $$3 = $$0.dZ();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cfe $$0) {
      return super.a($$0) || $$0.u();
   }
}
