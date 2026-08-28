public class gub extends gvl<cmz, haj, gdy<haj>> {
   private static final ald a = ald.b("textures/entity/enderman/enderman.png");
   private final azs j = azs.a();

   public gub(guf.a $$0) {
      super($$0, new gdy<>($$0.a(ghc.aN)), 0.5F);
      this.a(new gyc(this));
      this.a(new gxu(this, $$0.d()));
   }

   public fcu a(haj $$0) {
      fcu $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ald b(haj $$0) {
      return a;
   }

   public haj a() {
      return new haj();
   }

   public void a(cmz $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      guw.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
