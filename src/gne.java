public class gne extends glj<cis, fxu<cis>> {
   private static final akq a = akq.b("textures/entity/wither/wither_invulnerable.png");
   private static final akq i = akq.b("textures/entity/wither/wither.png");

   public gne(gkd.a $$0) {
      super($$0, new fxu<>($$0.a(fyd.bW)), 1.0F);
      this.a(new gpd(this, $$0.f()));
   }

   protected int a(cis $$0, jd $$1) {
      return 15;
   }

   public akq a(cis $$0) {
      int $$1 = $$0.x();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cis $$0, fbc $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.x();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
