public class gox extends gqq<clk, gvh, fzb> {
   private static final alj a = alj.b("textures/entity/creeper/creeper.png");

   public gox(gpk.a $$0) {
      super($$0, new fzb($$0.a(gck.ae)), 0.5F);
      this.a(new gtb(this, $$0.f()));
   }

   protected void a(gvh $$0, fer $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azm.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azm.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gvh $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azm.a($$1, 0.5F, 1.0F);
   }

   public alj b(gvh $$0) {
      return a;
   }

   public gvh a() {
      return new gvh();
   }

   public void a(clk $$0, gvh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.q();
   }
}
