public class gxk extends gzh<bwy> {
   private static final alg a = alg.b("textures/entity/squid/glow_squid.png");

   public gxk(gwy.a $$0, git $$1, git $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alg a(hfe $$0) {
      return a;
   }

   protected int a(bwy $$0, iv $$1) {
      int $$2 = (int)azm.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
