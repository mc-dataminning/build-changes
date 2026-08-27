public class gbj extends gde<car, fmt<car>> {
   private static final ajc a = new ajc("textures/entity/chicken.png");

   public gbj(gby.a $$0) {
      super($$0, new fmt<>($$0.a(fqe.v)), 0.3F);
   }

   public ajc a(car $$0) {
      return a;
   }

   protected float a(car $$0, float $$1) {
      float $$2 = awm.i($$1, $$0.bZ, $$0.bV);
      float $$3 = awm.i($$1, $$0.bY, $$0.bW);
      return (awm.a($$2) + 1.0F) * $$3;
   }
}
