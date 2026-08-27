public class gao extends fzl<ccw, fls<ccw>> {
   private static final ahd a = new ahd("textures/entity/strider/strider.png");
   private static final ahd i = new ahd("textures/entity/strider/strider_cold.png");

   public gao(fyf.a $$0) {
      super($$0, new fls<>($$0.a(fmo.bA)), 0.5F);
      this.a(new gcr<>(this, new fls<>($$0.a(fmo.bB)), new ahd("textures/entity/strider/strider_saddle.png")));
   }

   public ahd a(ccw $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(ccw $$0, ept $$1, float $$2) {
      if ($$0.o_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(ccw $$0) {
      return super.a($$0) || $$0.u();
   }
}
