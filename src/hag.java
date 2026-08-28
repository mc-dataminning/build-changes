public class hag extends gzq<cpg, hgh, gjq> {
   private static final alk a = alk.b("textures/entity/illager/ravager.png");

   public hag(gyk.a $$0) {
      super($$0, new gjq($$0.a(glf.cJ)), 1.1F);
   }

   public alk a(hgh $$0) {
      return a;
   }

   public hgh b() {
      return new hgh();
   }

   public void a(cpg $$0, hgh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gB() > 0) {
         $$1.c = ((float)(20 - $$0.gB()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
