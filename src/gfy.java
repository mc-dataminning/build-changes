public class gfy extends gee<cer, fqt<cer>> {
   private static final ajh a = new ajh("textures/entity/wither/wither_invulnerable.png");
   private static final ajh i = new ajh("textures/entity/wither/wither.png");

   public gfy(gcy.a $$0) {
      super($$0, new fqt<>($$0.a(frc.bR)), 1.0F);
      this.a(new ghx(this, $$0.f()));
   }

   protected int a(cer $$0, ib $$1) {
      return 15;
   }

   public ajh a(cer $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cer $$0, etz $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
