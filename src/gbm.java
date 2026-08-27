public class gbm extends fzs<cbh, fmm<cbh>> {
   private static final ahg a = new ahg("textures/entity/wither/wither_invulnerable.png");
   private static final ahg i = new ahg("textures/entity/wither/wither.png");

   public gbm(fym.a $$0) {
      super($$0, new fmm<>($$0.a(fmv.bS)), 1.0F);
      this.a(new gdl(this, $$0.f()));
   }

   protected int a(cbh $$0, hx $$1) {
      return 15;
   }

   public ahg a(cbh $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cbh $$0, eqa $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
