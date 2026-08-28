public class gov extends gny<cle, guq, fyy> {
   private static final alb a = alb.b("textures/entity/slime/slime.png");

   public gov(gms.a $$0) {
      super($$0, new fyy($$0.a(gaa.cr)), 0.25F);
      this.a(new grj(this, $$0.f()));
   }

   public void a(guq $$0, fcu $$1, ggv $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(guq $$0, fcu $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alb a(guq $$0) {
      return a;
   }

   public guq c() {
      return new guq();
   }

   public void a(cle $$0, guq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azc.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.gp();
   }
}
