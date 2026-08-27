public class fyg extends fxd<cbv, fjs<cbv>> {
   private static final agi a = new agi("textures/entity/strider/strider.png");
   private static final agi i = new agi("textures/entity/strider/strider_cold.png");

   public fyg(fvx.a $$0) {
      super($$0, new fjs<>($$0.a(fkn.bx)), 0.5F);
      this.a(new gag<>(this, new fjs<>($$0.a(fkn.by)), new agi("textures/entity/strider/strider_saddle.png")));
   }

   public agi a(cbv $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cbv $$0, enw $$1, float $$2) {
      if ($$0.n_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cbv $$0) {
      return super.a($$0) || $$0.u();
   }
}
