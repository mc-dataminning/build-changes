public class fwj extends fye<bky> {
   private static final agi a = new agi("textures/entity/squid/glow_squid.png");

   public fwj(fvx.a $$0, fjr<bky> $$1) {
      super($$0, $$1);
   }

   public agi a(bky $$0) {
      return a;
   }

   protected int a(bky $$0, ht $$1) {
      int $$2 = (int)atm.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
