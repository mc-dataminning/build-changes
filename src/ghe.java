public class ghe extends giz<cel, fsl<cel>> {
   private static final akn a = new akn("textures/entity/chicken.png");

   public ghe(ght.a $$0) {
      super($$0, new fsl<>($$0.a(fvv.z)), 0.3F);
   }

   public akn a(cel $$0) {
      return a;
   }

   protected float a(cel $$0, float $$1) {
      float $$2 = ayf.i($$1, $$0.cc, $$0.bY);
      float $$3 = ayf.i($$1, $$0.cb, $$0.bZ);
      return (ayf.a($$2) + 1.0F) * $$3;
   }
}
