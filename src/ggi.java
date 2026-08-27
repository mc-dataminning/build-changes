public class ggi extends gid<cdu, frq<cdu>> {
   private static final akh a = new akh("textures/entity/chicken.png");

   public ggi(ggx.a $$0) {
      super($$0, new frq<>($$0.a(fva.z)), 0.3F);
   }

   public akh a(cdu $$0) {
      return a;
   }

   protected float a(cdu $$0, float $$1) {
      float $$2 = axz.i($$1, $$0.cc, $$0.bY);
      float $$3 = axz.i($$1, $$0.cb, $$0.bZ);
      return (axz.a($$2) + 1.0F) * $$3;
   }
}
