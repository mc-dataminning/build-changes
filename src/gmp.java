public class gmp extends gku<cii, fxg<cii>> {
   private static final akk a = new akk("textures/entity/wither/wither_invulnerable.png");
   private static final akk i = new akk("textures/entity/wither/wither.png");

   public gmp(gjo.a $$0) {
      super($$0, new fxg<>($$0.a(fxp.bV)), 1.0F);
      this.a(new goo(this, $$0.f()));
   }

   protected int a(cii $$0, ja $$1) {
      return 15;
   }

   public akk a(cii $$0) {
      int $$1 = $$0.x();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cii $$0, fao $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.x();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
