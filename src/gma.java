public class gma extends gkf<cix, fws<cix>> {
   private static final alf a = new alf("textures/entity/wither/wither_invulnerable.png");
   private static final alf i = new alf("textures/entity/wither/wither.png");

   public gma(giz.a $$0) {
      super($$0, new fws<>($$0.a(fxb.bV)), 1.0F);
      this.a(new gnz(this, $$0.f()));
   }

   protected int a(cix $$0, iz $$1) {
      return 15;
   }

   public alf a(cix $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cix $$0, faa $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
