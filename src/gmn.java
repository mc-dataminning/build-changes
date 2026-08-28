public class gmn extends gks<cih, fxe<cih>> {
   private static final akk a = new akk("textures/entity/wither/wither_invulnerable.png");
   private static final akk i = new akk("textures/entity/wither/wither.png");

   public gmn(gjm.a $$0) {
      super($$0, new fxe<>($$0.a(fxn.bV)), 1.0F);
      this.a(new gom(this, $$0.f()));
   }

   protected int a(cih $$0, ja $$1) {
      return 15;
   }

   public akk a(cih $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cih $$0, fam $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
