public class fvl extends fui<bzq, fhb<bzq>> {
   private static final aeu a = new aeu("textures/entity/strider/strider.png");
   private static final aeu i = new aeu("textures/entity/strider/strider_cold.png");

   public fvl(ftc.a $$0) {
      super($$0, new fhb<>($$0.a(fhw.bx)), 0.5F);
      this.a(new fxl<>(this, new fhb<>($$0.a(fhw.by)), new aeu("textures/entity/strider/strider_saddle.png")));
   }

   public aeu a(bzq $$0) {
      return $$0.p() ? i : a;
   }

   protected void a(bzq $$0, elk $$1, float $$2) {
      if ($$0.i_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzq $$0) {
      return super.a($$0) || $$0.p();
   }
}
