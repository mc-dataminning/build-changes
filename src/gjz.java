public class gjz extends gkb<cka, fuo<cka>> {
   private static final ale a = new ale("textures/entity/slime/magmacube.png");

   public gjz(giv.a $$0) {
      super($$0, new fuo<>($$0.a(fwx.aA)), 0.25F);
   }

   protected int a(cka $$0, iz $$1) {
      return 15;
   }

   public ale a(cka $$0) {
      return a;
   }

   public void a(cka $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cka $$0, ezw $$1, float $$2) {
      int $$3 = $$0.gr();
      float $$4 = ayx.i($$2, $$0.bY, $$0.bX) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
