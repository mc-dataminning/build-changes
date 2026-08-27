public class fzz extends fzs<ccq, fkx<ccq>> {
   private static final ahg a = new ahg("textures/entity/phantom.png");

   public fzz(fym.a $$0) {
      super($$0, new fkx<>($$0.a(fmv.aE)), 0.75F);
      this.a(new gcv<>(this));
   }

   public ahg a(ccq $$0) {
      return a;
   }

   protected void a(ccq $$0, eqa $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(ccq $$0, eqa $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
