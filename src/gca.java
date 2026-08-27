public class gca extends gag<cbp, fmz<cbp>> {
   private static final ahh a = new ahh("textures/entity/wither/wither_invulnerable.png");
   private static final ahh i = new ahh("textures/entity/wither/wither.png");

   public gca(fza.a $$0) {
      super($$0, new fmz<>($$0.a(fni.bR)), 1.0F);
      this.a(new gdz(this, $$0.f()));
   }

   protected int a(cbp $$0, hx $$1) {
      return 15;
   }

   public ahh a(cbp $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cbp $$0, eqk $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
