public class gdl extends gde<cfi, fof<cfi>> {
   private static final ajc a = new ajc("textures/entity/phantom.png");

   public gdl(gby.a $$0) {
      super($$0, new fof<>($$0.a(fqe.aD)), 0.75F);
      this.a(new ggh<>(this));
   }

   public ajc a(cfi $$0) {
      return a;
   }

   protected void a(cfi $$0, etd $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cfi $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dB()));
   }
}
