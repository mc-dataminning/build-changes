public class gux extends gwq<cnf, hbi, gev> {
   private static final ale a = ale.b("textures/entity/creeper/creeper.png");

   public gux(gvk.a $$0) {
      super($$0, new gev($$0.a(gif.am)), 0.5F);
      this.a(new gzb(this, $$0.f()));
   }

   protected void a(hbi $$0, fiq $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azk.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azk.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hbi $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azk.a($$1, 0.5F, 1.0F);
   }

   public ale b(hbi $$0) {
      return a;
   }

   public hbi a() {
      return new hbi();
   }

   public void a(cnf $$0, hbi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
