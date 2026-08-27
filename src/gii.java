public class gii extends ggo<cfr, ftc<cfr>> {
   private static final ajt a = new ajt("textures/entity/wither/wither_invulnerable.png");
   private static final ajt i = new ajt("textures/entity/wither/wither.png");

   public gii(gfi.a $$0) {
      super($$0, new ftc<>($$0.a(ftl.bV)), 1.0F);
      this.a(new gkh(this, $$0.f()));
   }

   protected int a(cfr $$0, ib $$1) {
      return 15;
   }

   public ajt a(cfr $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cfr $$0, ewi $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
