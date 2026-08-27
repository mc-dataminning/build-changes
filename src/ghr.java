public class ghr extends ght<chq, fsh<chq>> {
   private static final akf a = new akf("textures/entity/slime/magmacube.png");

   public ghr(ggn.a $$0) {
      super($$0, new fsh<>($$0.a(fuq.aA)), 0.25F);
   }

   protected int a(chq $$0, im $$1) {
      return 15;
   }

   public akf a(chq $$0) {
      return a;
   }

   public void a(chq $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(chq $$0, exn $$1, float $$2) {
      int $$3 = $$0.gq();
      float $$4 = axw.i($$2, $$0.bX, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
