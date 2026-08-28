public class gtc extends gsc<ckv, gyj> {
   private static final akv a = akv.b("textures/entity/lead_knot.png");
   private final gcr b;

   public gtc(gsd.a $$0) {
      super($$0);
      this.b = new gcr($$0.a(gfb.br));
   }

   @Override
   public void a(gyj $$0, fft $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      ffx $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, heh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gyj d() {
      return new gyj();
   }
}
