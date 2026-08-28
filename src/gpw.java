public class gpw extends grt<buz> {
   private static final alj a = alj.b("textures/entity/squid/glow_squid.png");

   public gpw(gpk.a $$0, gbm $$1, gbm $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alj a(gxm $$0) {
      return a;
   }

   protected int a(buz $$0, jh $$1) {
      int $$2 = (int)azm.b(0.0F, 15.0F, 1.0F - (float)$$0.v() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
