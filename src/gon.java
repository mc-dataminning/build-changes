public class gon extends gqg<clh, guw, fys> {
   private static final all a = all.b("textures/entity/creeper/creeper.png");

   public gon(gpa.a $$0) {
      super($$0, new fys($$0.a(gcb.W)), 0.5F);
      this.a(new gsq(this, $$0.f()));
   }

   protected void a(guw $$0, fek $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azn.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azn.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(guw $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azn.a($$1, 0.5F, 1.0F);
   }

   public all b(guw $$0) {
      return a;
   }

   public guw a() {
      return new guw();
   }

   public void a(clh $$0, guw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
