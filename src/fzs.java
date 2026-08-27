public class fzs extends fzl<ccl, fkq<ccl>> {
   private static final ahd a = new ahd("textures/entity/phantom.png");

   public fzs(fyf.a $$0) {
      super($$0, new fkq<>($$0.a(fmo.aE)), 0.75F);
      this.a(new gco<>(this));
   }

   public ahd a(ccl $$0) {
      return a;
   }

   protected void a(ccl $$0, ept $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(ccl $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
