public class fvw extends fud<bxt, fhi<bxt>> {
   private static final aer a = new aer("textures/entity/wither/wither_invulnerable.png");
   private static final aer i = new aer("textures/entity/wither/wither.png");

   public fvw(fsx.a $$0) {
      super($$0, new fhi<>($$0.a(fhr.bO)), 1.0F);
      this.a(new fxt(this, $$0.f()));
   }

   protected int a(bxt $$0, gu $$1) {
      return 15;
   }

   public aer a(bxt $$0) {
      int $$1 = $$0.t();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bxt $$0, elf $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.t();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
