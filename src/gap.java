public class gap extends fzt<ccy, flv<ccy>> {
   private static final ahg a = new ahg("textures/entity/slime/slime.png");

   public gap(fyn.a $$0) {
      super($$0, new flv<>($$0.a(fmw.bp)), 0.25F);
      this.a(new gdc<>(this, $$0.f()));
   }

   public void a(ccy $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ccy $$0, eqb $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gf();
      float $$5 = auo.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ahg a(ccy $$0) {
      return a;
   }
}
