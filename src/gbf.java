public class gbf extends fzl<cbc, fmf<cbc>> {
   private static final ahd a = new ahd("textures/entity/wither/wither_invulnerable.png");
   private static final ahd i = new ahd("textures/entity/wither/wither.png");

   public gbf(fyf.a $$0) {
      super($$0, new fmf<>($$0.a(fmo.bS)), 1.0F);
      this.a(new gde(this, $$0.f()));
   }

   protected int a(cbc $$0, hx $$1) {
      return 15;
   }

   public ahd a(cbc $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cbc $$0, ept $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
