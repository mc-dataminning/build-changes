public class gjx extends gid<chf, fur<chf>> {
   private static final akh a = new akh("textures/entity/wither/wither_invulnerable.png");
   private static final akh i = new akh("textures/entity/wither/wither.png");

   public gjx(ggx.a $$0) {
      super($$0, new fur<>($$0.a(fva.bV)), 1.0F);
      this.a(new glw(this, $$0.f()));
   }

   protected int a(chf $$0, in $$1) {
      return 15;
   }

   public akh a(chf $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(chf $$0, exx $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
