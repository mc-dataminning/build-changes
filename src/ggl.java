public class ggl extends gid<chz, frv<chz>> {
   private static final akh a = new akh("textures/entity/creeper/creeper.png");

   public ggl(ggx.a $$0) {
      super($$0, new frv<>($$0.a(fva.H)), 0.5F);
      this.a(new gkl(this, $$0.f()));
   }

   protected void a(chz $$0, exx $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + axz.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = axz.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(chz $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : axz.a($$2, 0.5F, 1.0F);
   }

   public akh a(chz $$0) {
      return a;
   }
}
