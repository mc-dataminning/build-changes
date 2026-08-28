public class gik extends gkf<cfm, ftr<cfm>> {
   private static final alf a = new alf("textures/entity/chicken.png");

   public gik(giz.a $$0) {
      super($$0, new ftr<>($$0.a(fxb.z)), 0.3F);
   }

   public alf a(cfm $$0) {
      return a;
   }

   protected float a(cfm $$0, float $$1) {
      float $$2 = ayz.i($$1, $$0.cc, $$0.bY);
      float $$3 = ayz.i($$1, $$0.cb, $$0.bZ);
      return (ayz.a($$2) + 1.0F) * $$3;
   }
}
