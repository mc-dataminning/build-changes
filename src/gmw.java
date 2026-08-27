public class gmw extends glz<cjn, fxq<cjn>> {
   private static final akt a = new akt("textures/entity/slime/slime.png");

   public gmw(gkq.a $$0) {
      super($$0, new fxq<>($$0.a(fyr.bw)), 0.25F);
      this.a(new gpn<>(this, $$0.f()));
   }

   public void a(cjn $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gz();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjn $$0, fbc $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gz();
      float $$5 = aym.i($$2, $$0.cg, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akt a(cjn $$0) {
      return a;
   }
}
