public class gkb extends gkd<ckc, fuq<ckc>> {
   private static final alf a = new alf("textures/entity/slime/magmacube.png");

   public gkb(gix.a $$0) {
      super($$0, new fuq<>($$0.a(fwz.aA)), 0.25F);
   }

   protected int a(ckc $$0, iz $$1) {
      return 15;
   }

   public alf a(ckc $$0) {
      return a;
   }

   public void a(ckc $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckc $$0, ezy $$1, float $$2) {
      int $$3 = $$0.gr();
      float $$4 = ayz.i($$2, $$0.bY, $$0.bX) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
