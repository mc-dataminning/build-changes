public class gmm extends glp<ckm, fxi<ckm>> {
   private static final akr a = akr.b("textures/entity/slime/slime.png");

   public gmm(gkj.a $$0) {
      super($$0, new fxi<>($$0.a(fyj.bt)), 0.25F);
      this.a(new gpa<>(this, $$0.f()));
   }

   public void a(ckm $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gl();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckm $$0, fbi $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gl();
      float $$5 = ayo.i($$2, $$0.ca, $$0.bZ) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akr a(ckm $$0) {
      return a;
   }
}
