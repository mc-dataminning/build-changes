public class glr extends gku<cka, fwo<cka>> {
   private static final akk a = new akk("textures/entity/slime/slime.png");

   public glr(gjo.a $$0) {
      super($$0, new fwo<>($$0.a(fxp.bs)), 0.25F);
      this.a(new gof<>(this, $$0.f()));
   }

   public void a(cka $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cka $$0, fao $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.go();
      float $$5 = ayg.i($$2, $$0.ca, $$0.bZ) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akk a(cka $$0) {
      return a;
   }
}
