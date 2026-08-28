public class gyh extends hae<bxu> {
   private static final alr a = alr.b("textures/entity/squid/glow_squid.png");

   public gyh(gxv.a $$0, gjr $$1, gjr $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alr a(hge $$0) {
      return a;
   }

   protected int a(bxu $$0, iw $$1) {
      int $$2 = (int)azz.b(0.0F, 15.0F, 1.0F - (float)$$0.u() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
