public class gcn extends gcg<cet, fnj<cet>> {
   private static final aiy a = new aiy("textures/entity/phantom.png");

   public gcn(gba.a $$0) {
      super($$0, new fnj<>($$0.a(fpi.aD)), 0.75F);
      this.a(new gfj<>(this));
   }

   public aiy a(cet $$0) {
      return a;
   }

   protected void a(cet $$0, esh $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cet $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
