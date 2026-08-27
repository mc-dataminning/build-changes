public class gbn extends fzt<cbi, fmn<cbi>> {
   private static final ahg a = new ahg("textures/entity/wither/wither_invulnerable.png");
   private static final ahg i = new ahg("textures/entity/wither/wither.png");

   public gbn(fyn.a $$0) {
      super($$0, new fmn<>($$0.a(fmw.bS)), 1.0F);
      this.a(new gdm(this, $$0.f()));
   }

   protected int a(cbi $$0, hx $$1) {
      return 15;
   }

   public ahg a(cbi $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cbi $$0, eqb $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
