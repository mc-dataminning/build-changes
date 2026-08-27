public class gcm extends geh<cbj, fnt<cbj>> {
   private static final ajh a = new ajh("textures/entity/chicken.png");

   public gcm(gdb.a $$0) {
      super($$0, new fnt<>($$0.a(fre.z)), 0.3F);
   }

   public ajh a(cbj $$0) {
      return a;
   }

   protected float a(cbj $$0, float $$1) {
      float $$2 = aww.i($$1, $$0.cb, $$0.bX);
      float $$3 = aww.i($$1, $$0.ca, $$0.bY);
      return (aww.a($$2) + 1.0F) * $$3;
   }
}
