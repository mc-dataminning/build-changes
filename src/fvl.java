public class fvl extends fup<bzt, fhd<bzt>> {
   private static final aey a = new aey("textures/entity/slime/slime.png");

   public fvl(ftj.a $$0) {
      super($$0, new fhd<>($$0.a(fid.bm)), 0.25F);
      this.a(new fxv<>(this, $$0.f()));
   }

   public void a(bzt $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzt $$0, elr $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.ge();
      float $$5 = ary.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public aey a(bzt $$0) {
      return a;
   }
}
