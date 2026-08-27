public class fun extends fup<bzj, ffv<bzj>> {
   private static final aey a = new aey("textures/entity/slime/magmacube.png");

   public fun(ftj.a $$0) {
      super($$0, new ffv<>($$0.a(fid.au)), 0.25F);
   }

   protected int a(bzj $$0, gw $$1) {
      return 15;
   }

   public aey a(bzj $$0) {
      return a;
   }

   public void a(bzj $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzj $$0, elr $$1, float $$2) {
      int $$3 = $$0.ge();
      float $$4 = ary.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
