public class fwm extends fvj<cay, fia<cay>> {
   private static final afw a = new afw("textures/entity/strider/strider.png");
   private static final afw i = new afw("textures/entity/strider/strider_cold.png");

   public fwm(fud.a $$0) {
      super($$0, new fia<>($$0.a(fiv.bx)), 0.5F);
      this.a(new fym<>(this, new fia<>($$0.a(fiv.by)), new afw("textures/entity/strider/strider_saddle.png")));
   }

   public afw a(cay $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(cay $$0, emh $$1, float $$2) {
      if ($$0.n_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cay $$0) {
      return super.a($$0) || $$0.s();
   }
}
