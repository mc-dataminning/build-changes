public class guh extends gtj<cmg, hag, gdy> {
   public static final akv a = akv.b("textures/entity/slime/slime.png");

   public guh(gsd.a $$0) {
      super($$0, new gdy($$0.a(gfb.cO)), 0.25F);
      this.a(new gww(this, $$0.f()));
   }

   protected float a(hag $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hag $$0, fft $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public akv b(hag $$0) {
      return a;
   }

   public hag b() {
      return new hag();
   }

   public void a(cmg $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gs();
   }
}
