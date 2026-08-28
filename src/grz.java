public class grz extends gtj<cln, gyi, gby<gyi>> {
   private static final akv a = akv.b("textures/entity/enderman/enderman.png");
   private final azh b = azh.a();

   public grz(gsd.a $$0) {
      super($$0, new gby<>($$0.a(gfb.aH)), 0.5F);
      this.a(new gwa(this));
      this.a(new gvs(this, $$0.d()));
   }

   public faz a(gyi $$0) {
      faz $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public akv b(gyi $$0) {
      return a;
   }

   public gyi a() {
      return new gyi();
   }

   public void a(cln $$0, gyi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsu.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gs();
      $$1.b = $$0.x();
   }
}
