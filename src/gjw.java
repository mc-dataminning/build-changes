public class gjw extends giz<cjl, fuu<cjl>> {
   private static final akm a = new akm("textures/entity/slime/slime.png");

   public gjw(ght.a $$0) {
      super($$0, new fuu<>($$0.a(fvv.bs)), 0.25F);
      this.a(new gmk<>(this, $$0.f()));
   }

   public void a(cjl $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjl $$0, eys $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gq();
      float $$5 = ayd.i($$2, $$0.bY, $$0.bX) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akm a(cjl $$0) {
      return a;
   }
}
