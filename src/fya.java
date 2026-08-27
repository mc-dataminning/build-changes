public class fya extends fzv<bln> {
   private static final agt a = new agt("textures/entity/squid/glow_squid.png");

   public fya(fxo.a $$0, fla<bln> $$1) {
      super($$0, $$1);
   }

   public agt a(bln $$0) {
      return a;
   }

   protected int a(bln $$0, hv $$1) {
      int $$2 = (int)aty.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
