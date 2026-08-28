public class gig extends gkb<cfi, ftn<cfi>> {
   private static final ale a = new ale("textures/entity/chicken.png");

   public gig(giv.a $$0) {
      super($$0, new ftn<>($$0.a(fwx.z)), 0.3F);
   }

   public ale a(cfi $$0) {
      return a;
   }

   protected float a(cfi $$0, float $$1) {
      float $$2 = ayx.i($$1, $$0.cc, $$0.bY);
      float $$3 = ayx.i($$1, $$0.cb, $$0.bZ);
      return (ayx.a($$2) + 1.0F) * $$3;
   }
}
