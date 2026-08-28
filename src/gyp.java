public class gyp extends gxz<coq, hep, ghy> {
   private static final alg a = alg.b("textures/entity/illager/ravager.png");

   public gyp(gwt.a $$0) {
      super($$0, new ghy($$0.a(gjn.cJ)), 1.1F);
   }

   public alg a(hep $$0) {
      return a;
   }

   public hep b() {
      return new hep();
   }

   public void a(coq $$0, hep $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gA() > 0) {
         $$1.c = ((float)(20 - $$0.gA()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
