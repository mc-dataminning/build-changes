public class fus extends ftp<bzm, fgn<bzm>> {
   private static final aep a = new aep("textures/entity/strider/strider.png");
   private static final aep i = new aep("textures/entity/strider/strider_cold.png");

   public fus(fsj.a $$0) {
      super($$0, new fgn<>($$0.a(fhi.bx)), 0.5F);
      this.a(new fws<>(this, new fgn<>($$0.a(fhi.by)), new aep("textures/entity/strider/strider_saddle.png")));
   }

   public aep a(bzm $$0) {
      return $$0.p() ? i : a;
   }

   protected void a(bzm $$0, elh $$1, float $$2) {
      if ($$0.i_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzm $$0) {
      return super.a($$0) || $$0.p();
   }
}
