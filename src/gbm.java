public class gbm extends gde<ces, fmy<ces>> {
   private static final ajc a = new ajc("textures/entity/creeper/creeper.png");

   public gbm(gby.a $$0) {
      super($$0, new fmy<>($$0.a(fqe.D)), 0.5F);
      this.a(new gfm(this, $$0.f()));
   }

   protected void a(ces $$0, etd $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + awm.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = awm.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(ces $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : awm.a($$2, 0.5F, 1.0F);
   }

   public ajc a(ces $$0) {
      return a;
   }
}
