public class gan extends gag<ccy, flk<ccy>> {
   private static final ahh a = new ahh("textures/entity/phantom.png");

   public gan(fza.a $$0) {
      super($$0, new flk<>($$0.a(fni.aD)), 0.75F);
      this.a(new gdj<>(this));
   }

   public ahh a(ccy $$0) {
      return a;
   }

   protected void a(ccy $$0, eqk $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(ccy $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dD()));
   }
}
