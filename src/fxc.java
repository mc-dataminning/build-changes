public class fxc extends fyu<cbl, fis<cbl>> {
   private static final agt a = new agt("textures/entity/creeper/creeper.png");

   public fxc(fxo.a $$0) {
      super($$0, new fis<>($$0.a(flx.E)), 0.5F);
      this.a(new gbc(this, $$0.f()));
   }

   protected void a(cbl $$0, epd $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + aty.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aty.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cbl $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aty.a($$2, 0.5F, 1.0F);
   }

   public agt a(cbl $$0) {
      return a;
   }
}
