public class gnk extends gou<ckt, gtp, fxm<gtp>> {
   private static final ale a = ale.b("textures/entity/enderman/enderman.png");
   private final azn b = azn.a();

   public gnk(gno.a $$0) {
      super($$0, new fxm<>($$0.a(gap.at)), 0.5F);
      this.a(new grl(this));
      this.a(new grc(this, $$0.d()));
   }

   public eyw a(gtp $$0) {
      eyw $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ale b(gtp $$0) {
      return a;
   }

   public gtp a() {
      return new gtp();
   }

   public void a(ckt $$0, gtp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gof.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.go();
   }
}
