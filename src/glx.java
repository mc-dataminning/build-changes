public class glx extends gkc<ciu, fwp<ciu>> {
   private static final ale a = new ale("textures/entity/wither/wither_invulnerable.png");
   private static final ale i = new ale("textures/entity/wither/wither.png");

   public glx(giw.a $$0) {
      super($$0, new fwp<>($$0.a(fwy.bV)), 1.0F);
      this.a(new gnw(this, $$0.f()));
   }

   protected int a(ciu $$0, iz $$1) {
      return 15;
   }

   public ale a(ciu $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(ciu $$0, ezx $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
