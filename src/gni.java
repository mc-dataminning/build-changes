public class gni extends gln<ciu, fxy<ciu>> {
   private static final akr a = akr.b("textures/entity/wither/wither_invulnerable.png");
   private static final akr i = akr.b("textures/entity/wither/wither.png");

   public gni(gkh.a $$0) {
      super($$0, new fxy<>($$0.a(fyh.bW)), 1.0F);
      this.a(new gph(this, $$0.f()));
   }

   protected int a(ciu $$0, jd $$1) {
      return 15;
   }

   public akr a(ciu $$0) {
      int $$1 = $$0.x();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(ciu $$0, fbg $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.x();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
