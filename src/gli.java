public class gli extends gke<ckr, fwe<ckr>> {
   private static final alf a = new alf("textures/entity/strider/strider.png");
   private static final alf i = new alf("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gli(giy.a $$0) {
      super($$0, new fwe<>($$0.a(fxa.bD)), 0.5F);
      this.a(new gnl<>(this, new fwe<>($$0.a(fxa.bE)), new alf("textures/entity/strider/strider_saddle.png")));
   }

   public alf a(ckr $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckr $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckr $$0, ezz $$1, float $$2) {
      float $$3 = $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckr $$0) {
      return super.a($$0) || $$0.s();
   }
}
