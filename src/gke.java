public class gke extends glz<cio, fvk<cio>> {
   private static final akt a = new akt("textures/entity/creeper/creeper.png");

   public gke(gkq.a $$0) {
      super($$0, new fvk<>($$0.a(fyr.I)), 0.5F);
      this.a(new goi(this, $$0.f()));
   }

   protected void a(cio $$0, fbc $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + aym.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aym.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cio $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aym.a($$2, 0.5F, 1.0F);
   }

   public akt a(cio $$0) {
      return a;
   }
}
