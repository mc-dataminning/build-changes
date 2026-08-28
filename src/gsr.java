public class gsr extends guo<bva> {
   private static final akv a = akv.b("textures/entity/squid/glow_squid.png");

   public gsr(gsf.a $$0, gef $$1, gef $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public akv a(hal $$0) {
      return a;
   }

   protected int a(bva $$0, ji $$1) {
      int $$2 = (int)ayz.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
