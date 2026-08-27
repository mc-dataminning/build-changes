public class fyr extends gam<blx> {
   private static final ahd a = new ahd("textures/entity/squid/glow_squid.png");

   public fyr(fyf.a $$0, flr<blx> $$1) {
      super($$0, $$1);
   }

   public ahd a(blx $$0) {
      return a;
   }

   protected int a(blx $$0, hx $$1) {
      int $$2 = (int)aui.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
