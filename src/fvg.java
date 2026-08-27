public class fvg extends fud<bzn, fgw<bzn>> {
   private static final aer a = new aer("textures/entity/strider/strider.png");
   private static final aer i = new aer("textures/entity/strider/strider_cold.png");

   public fvg(fsx.a $$0) {
      super($$0, new fgw<>($$0.a(fhr.bx)), 0.5F);
      this.a(new fxg<>(this, new fgw<>($$0.a(fhr.by)), new aer("textures/entity/strider/strider_saddle.png")));
   }

   public aer a(bzn $$0) {
      return $$0.p() ? i : a;
   }

   protected void a(bzn $$0, elf $$1, float $$2) {
      if ($$0.i_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzn $$0) {
      return super.a($$0) || $$0.p();
   }
}
