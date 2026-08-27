public class fyx extends gas<bmc> {
   private static final ahg a = new ahg("textures/entity/squid/glow_squid.png");

   public fyx(fyl.a $$0, flx<bmc> $$1) {
      super($$0, $$1);
   }

   public ahg a(bmc $$0) {
      return a;
   }

   protected int a(bmc $$0, hx $$1) {
      int $$2 = (int)aun.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
