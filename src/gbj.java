public class gbj extends gag<cdj, fmm<cdj>> {
   private static final ahh a = new ahh("textures/entity/strider/strider.png");
   private static final ahh i = new ahh("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gbj(fza.a $$0) {
      super($$0, new fmm<>($$0.a(fni.bz)), 0.5F);
      this.a(new gdm<>(this, new fmm<>($$0.a(fni.bA)), new ahh("textures/entity/strider/strider_saddle.png")));
   }

   public ahh a(cdj $$0) {
      return $$0.u() ? i : a;
   }

   protected float b(cdj $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected boolean c(cdj $$0) {
      return super.a($$0) || $$0.u();
   }
}
