public class glc extends gnb<bsg> {
   private static final akt a = new akt("textures/entity/squid/glow_squid.png");

   public glc(gkq.a $$0, fxu<bsg> $$1) {
      super($$0, $$1);
   }

   public akt a(bsg $$0) {
      return a;
   }

   protected int a(bsg $$0, ir $$1) {
      int $$2 = (int)aym.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
