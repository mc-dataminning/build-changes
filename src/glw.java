public class glw extends gkb<cit, fwo<cit>> {
   private static final ale a = new ale("textures/entity/wither/wither_invulnerable.png");
   private static final ale i = new ale("textures/entity/wither/wither.png");

   public glw(giv.a $$0) {
      super($$0, new fwo<>($$0.a(fwx.bV)), 1.0F);
      this.a(new gnv(this, $$0.f()));
   }

   protected int a(cit $$0, iz $$1) {
      return 15;
   }

   public ale a(cit $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cit $$0, ezw $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
