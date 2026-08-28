public class gog extends gpq<clh, gum, fyi<gum>> {
   private static final ali a = ali.b("textures/entity/enderman/enderman.png");
   private final azs b = azs.a();

   public gog(gok.a $$0) {
      super($$0, new fyi<>($$0.a(gbl.at)), 0.5F);
      this.a(new gsg(this));
      this.a(new gry(this, $$0.d()));
   }

   public ezn a(gum $$0) {
      ezn $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ali b(gum $$0) {
      return a;
   }

   public gum a() {
      return new gum();
   }

   public void a(clh $$0, gum $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpb.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
      $$1.b = $$0.gu();
   }
}
