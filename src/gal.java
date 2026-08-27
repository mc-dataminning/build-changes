public class gal extends gcg<cac, flx<cac>> {
   private static final aiy a = new aiy("textures/entity/chicken.png");

   public gal(gba.a $$0) {
      super($$0, new flx<>($$0.a(fpi.v)), 0.3F);
   }

   public aiy a(cac $$0) {
      return a;
   }

   protected float a(cac $$0, float $$1) {
      float $$2 = awi.i($$1, $$0.bX, $$0.bT);
      float $$3 = awi.i($$1, $$0.bW, $$0.bU);
      return (awi.a($$2) + 1.0F) * $$3;
   }
}
