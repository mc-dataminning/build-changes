public class gew extends ggo<cgl, fqg<cgl>> {
   private static final ajt a = new ajt("textures/entity/creeper/creeper.png");

   public gew(gfi.a $$0) {
      super($$0, new fqg<>($$0.a(ftl.H)), 0.5F);
      this.a(new giw(this, $$0.f()));
   }

   protected void a(cgl $$0, ewi $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + axk.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = axk.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cgl $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : axk.a($$2, 0.5F, 1.0F);
   }

   public ajt a(cgl $$0) {
      return a;
   }
}
