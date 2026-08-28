public class gtm extends gsw<cnc, gzk, gcz> {
   private static final alz a = alz.b("textures/entity/illager/ravager.png");

   public gtm(grq.a $$0) {
      super($$0, new gcz($$0.a(gen.cs)), 1.1F);
   }

   public alz a(gzk $$0) {
      return a;
   }

   public gzk b() {
      return new gzk();
   }

   public void a(cnc $$0, gzk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
