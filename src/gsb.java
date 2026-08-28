public class gsb extends gtl<clp, gyk, gca<gyk>> {
   private static final akv a = akv.b("textures/entity/enderman/enderman.png");
   private final azh b = azh.a();

   public gsb(gsf.a $$0) {
      super($$0, new gca<>($$0.a(gfd.aH)), 0.5F);
      this.a(new gwc(this));
      this.a(new gvu(this, $$0.d()));
   }

   public fbb a(gyk $$0) {
      fbb $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public akv b(gyk $$0) {
      return a;
   }

   public gyk a() {
      return new gyk();
   }

   public void a(clp $$0, gyk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsw.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gs();
      $$1.b = $$0.x();
   }
}
