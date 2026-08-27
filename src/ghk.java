public class ghk extends ggo<chi, fsk<chi>> {
   private static final ajt a = new ajt("textures/entity/slime/slime.png");

   public ghk(gfi.a $$0) {
      super($$0, new fsk<>($$0.a(ftl.bs)), 0.25F);
      this.a(new gjy<>(this, $$0.f()));
   }

   public void a(chi $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(chi $$0, ewi $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.go();
      float $$5 = axk.i($$2, $$0.bW, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ajt a(chi $$0) {
      return a;
   }
}
