public class ghj extends gje<brs> {
   private static final akh a = new akh("textures/entity/squid/glow_squid.png");

   public ghj(ggx.a $$0, fud<brs> $$1) {
      super($$0, $$1);
   }

   public akh a(brs $$0) {
      return a;
   }

   protected int a(brs $$0, in $$1) {
      int $$2 = (int)axz.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
