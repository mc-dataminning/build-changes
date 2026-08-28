public class gub extends gtl<cme, hab, gdp> {
   private static final akv a = akv.b("textures/entity/illager/ravager.png");

   public gub(gsf.a $$0) {
      super($$0, new gdp($$0.a(gfd.cv)), 1.1F);
   }

   public akv a(hab $$0) {
      return a;
   }

   public hab b() {
      return new hab();
   }

   public void a(cme $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gB() > 0) {
         $$1.c = ((float)(20 - $$0.gB()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
