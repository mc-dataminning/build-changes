public class gjg extends gid<cja, fue<cja>> {
   private static final akh a = new akh("textures/entity/strider/strider.png");
   private static final akh i = new akh("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gjg(ggx.a $$0) {
      super($$0, new fue<>($$0.a(fva.bD)), 0.5F);
      this.a(new glj<>(this, new fue<>($$0.a(fva.bE)), new akh("textures/entity/strider/strider_saddle.png")));
   }

   public akh a(cja $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(cja $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cja $$0, exx $$1, float $$2) {
      float $$3 = $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cja $$0) {
      return super.a($$0) || $$0.r();
   }
}
