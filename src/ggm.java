public class ggm extends ggo<cgy, frc<cgy>> {
   private static final ajt a = new ajt("textures/entity/slime/magmacube.png");

   public ggm(gfi.a $$0) {
      super($$0, new frc<>($$0.a(ftl.aA)), 0.25F);
   }

   protected int a(cgy $$0, ib $$1) {
      return 15;
   }

   public ajt a(cgy $$0) {
      return a;
   }

   public void a(cgy $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cgy $$0, ewi $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = axk.i($$2, $$0.bW, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
