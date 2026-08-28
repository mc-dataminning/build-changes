public class grq extends gtj<clj, gyc, gbs> {
   private static final akv a = akv.b("textures/entity/creeper/creeper.png");

   public grq(gsd.a $$0) {
      super($$0, new gbs($$0.a(gfb.ai)), 0.5F);
      this.a(new gvu(this, $$0.f()));
   }

   protected void a(gyc $$0, fft $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + ayz.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gyc $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$1, 0.5F, 1.0F);
   }

   public akv b(gyc $$0) {
      return a;
   }

   public gyc a() {
      return new gyc();
   }

   public void a(clj $$0, gyc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
