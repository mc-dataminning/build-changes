public class gsc extends gtz<bvy> {
   private static final alz a = alz.b("textures/entity/squid/glow_squid.png");

   public gsc(grq.a $$0, gdp $$1, gdp $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alz a(gzt $$0) {
      return a;
   }

   protected int a(bvy $$0, jh $$1) {
      int $$2 = (int)bae.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
