public class ght extends ggx<chp, fst<chp>> {
   private static final ajv a = new ajv("textures/entity/slime/slime.png");

   public ght(gfr.a $$0) {
      super($$0, new fst<>($$0.a(ftu.bs)), 0.25F);
      this.a(new gkh<>(this, $$0.f()));
   }

   public void a(chp $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(chp $$0, ewr $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.go();
      float $$5 = axm.i($$2, $$0.bW, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ajv a(chp $$0) {
      return a;
   }
}
