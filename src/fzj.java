public class fzj extends fzl<cci, fkf<cci>> {
   private static final ahd a = new ahd("textures/entity/slime/magmacube.png");

   public fzj(fyf.a $$0) {
      super($$0, new fkf<>($$0.a(fmo.ax)), 0.25F);
   }

   protected int a(cci $$0, hx $$1) {
      return 15;
   }

   public ahd a(cci $$0) {
      return a;
   }

   public void a(cci $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cci $$0, ept $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = aui.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
