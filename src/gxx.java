public class gxx extends gzq<com, hek, ghu> {
   private static final alk a = alk.b("textures/entity/creeper/creeper.png");

   public gxx(gyk.a $$0) {
      super($$0, new ghu($$0.a(glf.aq)), 0.5F);
      this.a(new hcb(this, $$0.f()));
   }

   protected void a(hek $$0, flq $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azq.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azq.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hek $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azq.a($$1, 0.5F, 1.0F);
   }

   public alk b(hek $$0) {
      return a;
   }

   public hek a() {
      return new hek();
   }

   public void a(com $$0, hek $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
