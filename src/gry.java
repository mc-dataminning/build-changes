public class gry extends gti<cln, gyh, gby<gyh>> {
   private static final aku a = aku.b("textures/entity/enderman/enderman.png");
   private final azh b = azh.a();

   public gry(gsc.a $$0) {
      super($$0, new gby<>($$0.a(gfb.aH)), 0.5F);
      this.a(new gvz(this));
      this.a(new gvr(this, $$0.d()));
   }

   public fba a(gyh $$0) {
      fba $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public aku b(gyh $$0) {
      return a;
   }

   public gyh a() {
      return new gyh();
   }

   public void a(cln $$0, gyh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gst.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gp();
      $$1.b = $$0.x();
   }
}
