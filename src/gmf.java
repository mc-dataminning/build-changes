public class gmf extends gny<ckh, gsn, fws> {
   private static final alb a = alb.b("textures/entity/creeper/creeper.png");

   public gmf(gms.a $$0) {
      super($$0, new fws($$0.a(gaa.W)), 0.5F);
      this.a(new gqi(this, $$0.f()));
   }

   protected void a(gsn $$0, fcu $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azc.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azc.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gsn $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azc.a($$1, 0.5F, 1.0F);
   }

   public alb b(gsn $$0) {
      return a;
   }

   public gsn a() {
      return new gsn();
   }

   public void a(ckh $$0, gsn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
