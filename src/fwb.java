public class fwb extends fui<bxw, fhn<bxw>> {
   private static final aeu a = new aeu("textures/entity/wither/wither_invulnerable.png");
   private static final aeu i = new aeu("textures/entity/wither/wither.png");

   public fwb(ftc.a $$0) {
      super($$0, new fhn<>($$0.a(fhw.bO)), 1.0F);
      this.a(new fxy(this, $$0.f()));
   }

   protected int a(bxw $$0, gw $$1) {
      return 15;
   }

   public aeu a(bxw $$0) {
      int $$1 = $$0.t();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bxw $$0, elk $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.t();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
