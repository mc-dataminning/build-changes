public class gnu extends glz<chu, fyi<chu>> {
   private static final akt a = new akt("textures/entity/wither/wither_invulnerable.png");
   private static final akt b = new akt("textures/entity/wither/wither.png");

   public gnu(gkq.a $$0) {
      super($$0, new fyi<>($$0.a(fyr.cb)), 1.0F);
      this.a(new gpw(this, $$0.f()));
   }

   protected int a(chu $$0, ir $$1) {
      return 15;
   }

   public akt a(chu $$0) {
      int $$1 = $$0.x();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   protected void a(chu $$0, fbc $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.x();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
