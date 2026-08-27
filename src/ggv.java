public class ggv extends ggo<chb, frn<chb>> {
   private static final ajt a = new ajt("textures/entity/phantom.png");

   public ggv(gfi.a $$0) {
      super($$0, new frn<>($$0.a(ftl.aH)), 0.75F);
      this.a(new gjr<>(this));
   }

   public ajt a(chb $$0) {
      return a;
   }

   protected void a(chb $$0, ewi $$1, float $$2) {
      int $$3 = $$0.r();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(chb $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
