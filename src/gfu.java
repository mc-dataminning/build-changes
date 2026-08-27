public class gfu extends ghp<bqg> {
   private static final ajt a = new ajt("textures/entity/squid/glow_squid.png");

   public gfu(gfi.a $$0, fso<bqg> $$1) {
      super($$0, $$1);
   }

   public ajt a(bqg $$0) {
      return a;
   }

   protected int a(bqg $$0, ib $$1) {
      int $$2 = (int)axk.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
