public class ggv extends ggx<chf, frl<chf>> {
   private static final ajv a = new ajv("textures/entity/slime/magmacube.png");

   public ggv(gfr.a $$0) {
      super($$0, new frl<>($$0.a(ftu.aA)), 0.25F);
   }

   protected int a(chf $$0, id $$1) {
      return 15;
   }

   public ajv a(chf $$0) {
      return a;
   }

   public void a(chf $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(chf $$0, ewr $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = axm.i($$2, $$0.bW, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
