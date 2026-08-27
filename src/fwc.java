public class fwc extends fuj<byh, fhn<byh>> {
   private static final aez a = new aez("textures/entity/wither/wither_invulnerable.png");
   private static final aez i = new aez("textures/entity/wither/wither.png");

   public fwc(ftd.a $$0) {
      super($$0, new fhn<>($$0.a(fhw.bO)), 1.0F);
      this.a(new fxz(this, $$0.f()));
   }

   protected int a(byh $$0, gw $$1) {
      return 15;
   }

   public aez a(byh $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(byh $$0, elj $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
