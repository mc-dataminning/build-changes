public class fyw extends fxd<cab, fke<cab>> {
   private static final agi a = new agi("textures/entity/wither/wither_invulnerable.png");
   private static final agi i = new agi("textures/entity/wither/wither.png");

   public fyw(fvx.a $$0) {
      super($$0, new fke<>($$0.a(fkn.bO)), 1.0F);
      this.a(new gat(this, $$0.f()));
   }

   protected int a(cab $$0, ht $$1) {
      return 15;
   }

   public agi a(cab $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cab $$0, enw $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
