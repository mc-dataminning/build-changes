public class fzq extends fzs<ccn, fkm<ccn>> {
   private static final ahg a = new ahg("textures/entity/slime/magmacube.png");

   public fzq(fym.a $$0) {
      super($$0, new fkm<>($$0.a(fmv.ax)), 0.25F);
   }

   protected int a(ccn $$0, hx $$1) {
      return 15;
   }

   public ahg a(ccn $$0) {
      return a;
   }

   public void a(ccn $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ccn $$0, eqa $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = aun.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
