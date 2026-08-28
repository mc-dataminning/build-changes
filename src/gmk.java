public class gmk extends gln<ckm, fxg<ckm>> {
   private static final akr a = akr.b("textures/entity/slime/slime.png");

   public gmk(gkh.a $$0) {
      super($$0, new fxg<>($$0.a(fyh.bt)), 0.25F);
      this.a(new goy<>(this, $$0.f()));
   }

   public void a(ckm $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckm $$0, fbg $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gm();
      float $$5 = ayo.i($$2, $$0.ca, $$0.bZ) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akr a(ckm $$0) {
      return a;
   }
}
