public class gkd extends gkf<cke, fus<cke>> {
   private static final alf a = new alf("textures/entity/slime/magmacube.png");

   public gkd(giz.a $$0) {
      super($$0, new fus<>($$0.a(fxb.aA)), 0.25F);
   }

   protected int a(cke $$0, iz $$1) {
      return 15;
   }

   public alf a(cke $$0) {
      return a;
   }

   public void a(cke $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cke $$0, faa $$1, float $$2) {
      int $$3 = $$0.gr();
      float $$4 = ayz.i($$2, $$0.bY, $$0.bX) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
