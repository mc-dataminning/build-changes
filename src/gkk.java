public class gkk extends gkm<cjm, fuy<cjm>> {
   private static final akk a = new akk("textures/entity/slime/magmacube.png");

   public gkk(gjg.a $$0) {
      super($$0, new fuy<>($$0.a(fxh.aA)), 0.25F);
   }

   protected int a(cjm $$0, ja $$1) {
      return 15;
   }

   public akk a(cjm $$0) {
      return a;
   }

   public void a(cjm $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjm $$0, fag $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = aye.i($$2, $$0.ca, $$0.bZ) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
