public class gwl extends gyi<bwt> {
   private static final alg a = alg.b("textures/entity/squid/glow_squid.png");

   public gwl(gvz.a $$0, ghu $$1, ghu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alg a(hee $$0) {
      return a;
   }

   protected int a(bwt $$0, iu $$1) {
      int $$2 = (int)azm.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
