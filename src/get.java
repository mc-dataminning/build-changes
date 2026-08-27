public class get extends ggo<cci, fqb<cci>> {
   private static final ajt a = new ajt("textures/entity/chicken.png");

   public get(gfi.a $$0) {
      super($$0, new fqb<>($$0.a(ftl.z)), 0.3F);
   }

   public ajt a(cci $$0) {
      return a;
   }

   protected float a(cci $$0, float $$1) {
      float $$2 = axk.i($$1, $$0.cb, $$0.bX);
      float $$3 = axk.i($$1, $$0.ca, $$0.bY);
      return (axk.a($$2) + 1.0F) * $$3;
   }
}
