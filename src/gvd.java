public class gvd extends gsc<cqf, gyj> {
   private static final akv a = akv.b("textures/entity/projectiles/wind_charge.png");
   private final geo b;

   public gvd(gsd.a $$0) {
      super($$0);
      this.b = new geo($$0.a(gfb.dy));
   }

   @Override
   public void a(gyj $$0, fft $$1, glx $$2, int $$3) {
      ffx $$4 = $$2.getBuffer(gmh.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, heh.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gyj d() {
      return new gyj();
   }
}
