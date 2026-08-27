public class gck extends gef<bop> {
   private static final ajc a = new ajc("textures/entity/squid/glow_squid.png");

   public gck(gby.a $$0, fph<bop> $$1) {
      super($$0, $$1);
   }

   public ajc a(bop $$0) {
      return a;
   }

   protected int a(bop $$0, ib $$1) {
      int $$2 = (int)awm.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
