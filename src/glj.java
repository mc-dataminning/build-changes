public class glj extends gkm<cjw, fwg<cjw>> {
   private static final akk a = new akk("textures/entity/slime/slime.png");

   public glj(gjg.a $$0) {
      super($$0, new fwg<>($$0.a(fxh.bs)), 0.25F);
      this.a(new gnx<>(this, $$0.f()));
   }

   public void a(cjw $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjw $$0, fag $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.go();
      float $$5 = aye.i($$2, $$0.ca, $$0.bZ) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akk a(cjw $$0) {
      return a;
   }
}
