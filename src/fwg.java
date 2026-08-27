public class fwg extends fun<byb, fhs<byb>> {
   private static final aex a = new aex("textures/entity/wither/wither_invulnerable.png");
   private static final aex i = new aex("textures/entity/wither/wither.png");

   public fwg(fth.a $$0) {
      super($$0, new fhs<>($$0.a(fib.bO)), 1.0F);
      this.a(new fyd(this, $$0.f()));
   }

   protected int a(byb $$0, gw $$1) {
      return 15;
   }

   public aex a(byb $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(byb $$0, elp $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
