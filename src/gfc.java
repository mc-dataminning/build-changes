public class gfc extends ggx<ccn, fqk<ccn>> {
   private static final ajv a = new ajv("textures/entity/chicken.png");

   public gfc(gfr.a $$0) {
      super($$0, new fqk<>($$0.a(ftu.z)), 0.3F);
   }

   public ajv a(ccn $$0) {
      return a;
   }

   protected float a(ccn $$0, float $$1) {
      float $$2 = axm.i($$1, $$0.cb, $$0.bX);
      float $$3 = axm.i($$1, $$0.ca, $$0.bY);
      return (axm.a($$2) + 1.0F) * $$3;
   }
}
