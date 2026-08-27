public class gcj extends gee<cbi, fnr<cbi>> {
   private static final ajh a = new ajh("textures/entity/chicken.png");

   public gcj(gcy.a $$0) {
      super($$0, new fnr<>($$0.a(frc.v)), 0.3F);
   }

   public ajh a(cbi $$0) {
      return a;
   }

   protected float a(cbi $$0, float $$1) {
      float $$2 = aww.i($$1, $$0.cb, $$0.bX);
      float $$3 = aww.i($$1, $$0.ca, $$0.bY);
      return (aww.a($$2) + 1.0F) * $$3;
   }
}
