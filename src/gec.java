public class gec extends gee<cfx, fot<cfx>> {
   private static final ajh a = new ajh("textures/entity/slime/magmacube.png");

   public gec(gcy.a $$0) {
      super($$0, new fot<>($$0.a(frc.aw)), 0.25F);
   }

   protected int a(cfx $$0, ib $$1) {
      return 15;
   }

   public ajh a(cfx $$0) {
      return a;
   }

   public void a(cfx $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cfx $$0, etz $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = aww.i($$2, $$0.bW, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
