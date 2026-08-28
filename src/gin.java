public class gin extends gkf<cjr, ftw<cjr>> {
   private static final alf a = new alf("textures/entity/creeper/creeper.png");

   public gin(giz.a $$0) {
      super($$0, new ftw<>($$0.a(fxb.H)), 0.5F);
      this.a(new gmo(this, $$0.f()));
   }

   protected void a(cjr $$0, faa $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + ayz.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayz.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjr $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$2, 0.5F, 1.0F);
   }

   public alf a(cjr $$0) {
      return a;
   }
}
