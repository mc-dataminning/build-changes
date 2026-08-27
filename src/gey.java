public class gey extends gde<cdz, fpv<cdz>> {
   private static final ajc a = new ajc("textures/entity/wither/wither_invulnerable.png");
   private static final ajc i = new ajc("textures/entity/wither/wither.png");

   public gey(gby.a $$0) {
      super($$0, new fpv<>($$0.a(fqe.bR)), 1.0F);
      this.a(new ggx(this, $$0.f()));
   }

   protected int a(cdz $$0, ib $$1) {
      return 15;
   }

   public ajc a(cdz $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cdz $$0, etd $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
