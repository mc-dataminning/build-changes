public class gnf extends gop<ckq, gtk, fxi<gtk>> {
   private static final alc a = alc.b("textures/entity/enderman/enderman.png");
   private final azl b = azl.a();

   public gnf(gnj.a $$0) {
      super($$0, new fxi<>($$0.a(gak.at)), 0.5F);
      this.a(new grg(this));
      this.a(new gqx(this, $$0.d()));
   }

   public eys a(gtk $$0) {
      eys $$1 = super.b($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alc b(gtk $$0) {
      return a;
   }

   public gtk a() {
      return new gtk();
   }

   public void a(ckq $$0, gtk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      goa.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
      $$1.b = $$0.gp();
   }
}
