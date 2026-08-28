public class gtp extends gvm<bvp> {
   private static final aku a = aku.b("textures/entity/squid/glow_squid.png");

   public gtp(gtd.a $$0, gfd $$1, gfd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public aku a(hbj $$0) {
      return a;
   }

   protected int a(bvp $$0, ji $$1) {
      int $$2 = (int)ayz.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
