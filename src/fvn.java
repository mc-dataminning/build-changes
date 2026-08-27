public class fvn extends ftu<bxu, fhd<bxu>> {
   private static final aer a = new aer("textures/entity/wither/wither_invulnerable.png");
   private static final aer i = new aer("textures/entity/wither/wither.png");

   public fvn(fso.a $$0) {
      super($$0, new fhd<>($$0.a(fhm.bO)), 1.0F);
      this.a(new fxk(this, $$0.f()));
   }

   protected int a(bxu $$0, gu $$1) {
      return 15;
   }

   public aer a(bxu $$0) {
      int $$1 = $$0.t();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bxu $$0, elg $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.t();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
