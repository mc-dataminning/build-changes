public class gao extends gcg<ced, fmc<ced>> {
   private static final aiy a = new aiy("textures/entity/creeper/creeper.png");

   public gao(gba.a $$0) {
      super($$0, new fmc<>($$0.a(fpi.D)), 0.5F);
      this.a(new geo(this, $$0.f()));
   }

   protected void a(ced $$0, esh $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + awi.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = awi.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(ced $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : awi.a($$2, 0.5F, 1.0F);
   }

   public aiy a(ced $$0) {
      return a;
   }
}
