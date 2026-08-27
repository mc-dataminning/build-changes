public class fxc extends fvj<bze, fim<bze>> {
   private static final afw a = new afw("textures/entity/wither/wither_invulnerable.png");
   private static final afw i = new afw("textures/entity/wither/wither.png");

   public fxc(fud.a $$0) {
      super($$0, new fim<>($$0.a(fiv.bO)), 1.0F);
      this.a(new fyz(this, $$0.f()));
   }

   protected int a(bze $$0, ht $$1) {
      return 15;
   }

   public afw a(bze $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bze $$0, emh $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
