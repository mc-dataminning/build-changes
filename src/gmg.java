public class gmg extends glj<ckk, fxc<ckk>> {
   private static final akq a = akq.b("textures/entity/slime/slime.png");

   public gmg(gkd.a $$0) {
      super($$0, new fxc<>($$0.a(fyd.bt)), 0.25F);
      this.a(new gou<>(this, $$0.f()));
   }

   public void a(ckk $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gn();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckk $$0, fbc $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gn();
      float $$5 = ayn.i($$2, $$0.ca, $$0.bZ) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akq a(ckk $$0) {
      return a;
   }
}
