public class ful extends ftp<bzi, fgi<bzi>> {
   private static final aep a = new aep("textures/entity/slime/slime.png");

   public ful(fsj.a $$0) {
      super($$0, new fgi<>($$0.a(fhi.bm)), 0.25F);
      this.a(new fwv<>(this, $$0.f()));
   }

   public void a(bzi $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzi $$0, elh $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.ga();
      float $$5 = aro.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public aep a(bzi $$0) {
      return a;
   }
}
