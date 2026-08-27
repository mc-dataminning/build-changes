public class gaw extends fzt<cdc, fma<cdc>> {
   private static final ahg a = new ahg("textures/entity/strider/strider.png");
   private static final ahg i = new ahg("textures/entity/strider/strider_cold.png");

   public gaw(fyn.a $$0) {
      super($$0, new fma<>($$0.a(fmw.bA)), 0.5F);
      this.a(new gcz<>(this, new fma<>($$0.a(fmw.bB)), new ahg("textures/entity/strider/strider_saddle.png")));
   }

   public ahg a(cdc $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cdc $$0, eqb $$1, float $$2) {
      if ($$0.o_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cdc $$0) {
      return super.a($$0) || $$0.u();
   }
}
