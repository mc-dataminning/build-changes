public class giz extends gid<ciw, ftz<ciw>> {
   private static final akh a = new akh("textures/entity/slime/slime.png");

   public giz(ggx.a $$0) {
      super($$0, new ftz<>($$0.a(fva.bs)), 0.25F);
      this.a(new gln<>(this, $$0.f()));
   }

   public void a(ciw $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ciw $$0, exx $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gq();
      float $$5 = axz.i($$2, $$0.bX, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akh a(ciw $$0) {
      return a;
   }
}
