public class gkz extends gkc<ckl, fvx<ckl>> {
   private static final ale a = new ale("textures/entity/slime/slime.png");

   public gkz(giw.a $$0) {
      super($$0, new fvx<>($$0.a(fwy.bs)), 0.25F);
      this.a(new gnn<>(this, $$0.f()));
   }

   public void a(ckl $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckl $$0, ezx $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gr();
      float $$5 = ayy.i($$2, $$0.bY, $$0.bX) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ale a(ckl $$0) {
      return a;
   }
}
