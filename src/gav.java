public class gav extends fzs<cdb, flz<cdb>> {
   private static final ahg a = new ahg("textures/entity/strider/strider.png");
   private static final ahg i = new ahg("textures/entity/strider/strider_cold.png");

   public gav(fym.a $$0) {
      super($$0, new flz<>($$0.a(fmv.bA)), 0.5F);
      this.a(new gcy<>(this, new flz<>($$0.a(fmv.bB)), new ahg("textures/entity/strider/strider_saddle.png")));
   }

   public ahg a(cdb $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cdb $$0, eqa $$1, float $$2) {
      if ($$0.o_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cdb $$0) {
      return super.a($$0) || $$0.u();
   }
}
