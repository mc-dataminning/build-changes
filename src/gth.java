public class gth extends gtj<clw, hag, gcq> {
   private static final akv a = akv.b("textures/entity/slime/magmacube.png");

   public gth(gsd.a $$0) {
      super($$0, new gcq($$0.a(gfb.bx)), 0.25F);
   }

   protected int a(clw $$0, ji $$1) {
      return 15;
   }

   public akv a(hag $$0) {
      return a;
   }

   public hag b() {
      return new hag();
   }

   public void a(clw $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gs();
   }

   protected float b(hag $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hag $$0, fft $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
