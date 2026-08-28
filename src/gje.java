public class gje extends gla<btc> {
   private static final alb a = new alb("textures/entity/squid/glow_squid.png");

   public gje(gis.a $$0, fvx<btc> $$1) {
      super($$0, $$1);
   }

   public alb a(btc $$0) {
      return a;
   }

   protected int a(btc $$0, iz $$1) {
      int $$2 = (int)ayu.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
