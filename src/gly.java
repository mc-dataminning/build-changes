public class gly extends gkd<civ, fwq<civ>> {
   private static final alf a = new alf("textures/entity/wither/wither_invulnerable.png");
   private static final alf i = new alf("textures/entity/wither/wither.png");

   public gly(gix.a $$0) {
      super($$0, new fwq<>($$0.a(fwz.bV)), 1.0F);
      this.a(new gnx(this, $$0.f()));
   }

   protected int a(civ $$0, iz $$1) {
      return 15;
   }

   public alf a(civ $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(civ $$0, ezy $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
