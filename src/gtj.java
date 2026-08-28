public class gtj extends gtl<cly, hai, gcs> {
   private static final akv a = akv.b("textures/entity/slime/magmacube.png");

   public gtj(gsf.a $$0) {
      super($$0, new gcs($$0.a(gfd.bx)), 0.25F);
   }

   protected int a(cly $$0, ji $$1) {
      return 15;
   }

   public akv a(hai $$0) {
      return a;
   }

   public hai b() {
      return new hai();
   }

   public void a(cly $$0, hai $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gs();
   }

   protected float b(hai $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hai $$0, ffv $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
