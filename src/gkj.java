public class gkj extends gkb<ckd, fuz<ckd>> {
   private static final ale a = new ale("textures/entity/phantom.png");

   public gkj(giv.a $$0) {
      super($$0, new fuz<>($$0.a(fwx.aH)), 0.75F);
      this.a(new gnf<>(this));
   }

   public ale a(ckd $$0) {
      return a;
   }

   protected void a(ckd $$0, ezw $$1, float $$2) {
      int $$3 = $$0.s();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(ckd $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dH()));
   }
}
