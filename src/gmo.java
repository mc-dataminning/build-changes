public class gmo extends gny<ckl, gst, fwy<gst>> {
   private static final alb a = alb.b("textures/entity/enderman/enderman.png");
   private final azk b = azk.a();

   public gmo(gms.a $$0) {
      super($$0, new fwy<>($$0.a(gaa.at)), 0.5F);
      this.a(new gqp(this));
      this.a(new gqg(this, $$0.d()));
   }

   public eye a(gst $$0) {
      eye $$1 = super.b($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alb b(gst $$0) {
      return a;
   }

   public gst a() {
      return new gst();
   }

   public void a(ckl $$0, gst $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gnj.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.go();
   }
}
