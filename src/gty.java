public class gty extends gti<cmc, gzy, gdn> {
   private static final aku a = aku.b("textures/entity/illager/ravager.png");

   public gty(gsc.a $$0) {
      super($$0, new gdn($$0.a(gfb.cv)), 1.1F);
   }

   public aku a(gzy $$0) {
      return a;
   }

   public gzy b() {
      return new gzy();
   }

   public void a(cmc $$0, gzy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gy() > 0) {
         $$1.c = ((float)(20 - $$0.gy()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
