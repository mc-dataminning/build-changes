public class fup extends fwk<bkb> {
   private static final afw a = new afw("textures/entity/squid/glow_squid.png");

   public fup(fud.a $$0, fhz<bkb> $$1) {
      super($$0, $$1);
   }

   public afw a(bkb $$0) {
      return a;
   }

   protected int a(bkb $$0, ht $$1) {
      int $$2 = (int)asy.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
