public class gjl extends glh<btj> {
   private static final alf a = new alf("textures/entity/squid/glow_squid.png");

   public gjl(giz.a $$0, fwe<btj> $$1) {
      super($$0, $$1);
   }

   public alf a(btj $$0) {
      return a;
   }

   protected int a(btj $$0, iz $$1) {
      int $$2 = (int)ayz.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
