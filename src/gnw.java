public class gnw extends gny<cku, guq, fxq> {
   private static final alb a = alb.b("textures/entity/slime/magmacube.png");

   public gnw(gms.a $$0) {
      super($$0, new fxq($$0.a(gaa.bh)), 0.25F);
   }

   protected int a(cku $$0, je $$1) {
      return 15;
   }

   public alb a(guq $$0) {
      return a;
   }

   public guq c() {
      return new guq();
   }

   public void a(cku $$0, guq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azc.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.gp();
   }

   public void a(guq $$0, fcu $$1, ggv $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(guq $$0, fcu $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
