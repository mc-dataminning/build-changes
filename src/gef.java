public class gef extends geh<cfz, fov<cfz>> {
   private static final ajh a = new ajh("textures/entity/slime/magmacube.png");

   public gef(gdb.a $$0) {
      super($$0, new fov<>($$0.a(fre.aA)), 0.25F);
   }

   protected int a(cfz $$0, ib $$1) {
      return 15;
   }

   public ajh a(cfz $$0) {
      return a;
   }

   public void a(cfz $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cfz $$0, eub $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = aww.i($$2, $$0.bW, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
