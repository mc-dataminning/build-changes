public class gkp extends gml<btd> {
   private static final akq a = akq.b("textures/entity/squid/glow_squid.png");

   public gkp(gkd.a $$0, fxg<btd> $$1) {
      super($$0, $$1);
   }

   public akq a(btd $$0) {
      return a;
   }

   protected int a(btd $$0, jd $$1) {
      int $$2 = (int)ayn.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
