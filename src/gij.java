public class gij extends gkb<cjn, fts<cjn>> {
   private static final ale a = new ale("textures/entity/creeper/creeper.png");

   public gij(giv.a $$0) {
      super($$0, new fts<>($$0.a(fwx.H)), 0.5F);
      this.a(new gmk(this, $$0.f()));
   }

   protected void a(cjn $$0, ezw $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + ayx.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayx.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjn $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayx.a($$2, 0.5F, 1.0F);
   }

   public ale a(cjn $$0) {
      return a;
   }
}
