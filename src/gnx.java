public class gnx extends gpq<cld, gug, fyc> {
   private static final ali a = ali.b("textures/entity/creeper/creeper.png");

   public gnx(gok.a $$0) {
      super($$0, new fyc($$0.a(gbl.W)), 0.5F);
      this.a(new gsa(this, $$0.f()));
   }

   protected void a(gug $$0, feb $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azk.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azk.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gug $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azk.a($$1, 0.5F, 1.0F);
   }

   public ali b(gug $$0) {
      return a;
   }

   public gug a() {
      return new gug();
   }

   public void a(cld $$0, gug $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
