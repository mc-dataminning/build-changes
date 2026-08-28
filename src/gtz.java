public class gtz extends gtj<cmc, gzz, gdn> {
   private static final akv a = akv.b("textures/entity/illager/ravager.png");

   public gtz(gsd.a $$0) {
      super($$0, new gdn($$0.a(gfb.cv)), 1.1F);
   }

   public akv a(gzz $$0) {
      return a;
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cmc $$0, gzz $$1, float $$2) {
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
