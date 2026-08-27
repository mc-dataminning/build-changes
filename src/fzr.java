public class fzr extends fzt<cco, fkn<cco>> {
   private static final ahg a = new ahg("textures/entity/slime/magmacube.png");

   public fzr(fyn.a $$0) {
      super($$0, new fkn<>($$0.a(fmw.ax)), 0.25F);
   }

   protected int a(cco $$0, hx $$1) {
      return 15;
   }

   public ahg a(cco $$0) {
      return a;
   }

   public void a(cco $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cco $$0, eqb $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = auo.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
