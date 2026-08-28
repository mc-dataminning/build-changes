public class gwb extends gvl<cno, hca, gfo> {
   private static final ald a = ald.b("textures/entity/illager/ravager.png");

   public gwb(guf.a $$0) {
      super($$0, new gfo($$0.a(ghc.cF)), 1.1F);
   }

   public ald a(hca $$0) {
      return a;
   }

   public hca b() {
      return new hca();
   }

   public void a(cno $$0, hca $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
