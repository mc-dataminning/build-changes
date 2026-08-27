public class gao extends fyu<cas, flo<cas>> {
   private static final agt a = new agt("textures/entity/wither/wither_invulnerable.png");
   private static final agt i = new agt("textures/entity/wither/wither.png");

   public gao(fxo.a $$0) {
      super($$0, new flo<>($$0.a(flx.bS)), 1.0F);
      this.a(new gcn(this, $$0.f()));
   }

   protected int a(cas $$0, hv $$1) {
      return 15;
   }

   public agt a(cas $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cas $$0, epd $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
