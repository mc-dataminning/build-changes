public class gvw extends gxt<bwq> {
   private static final ale a = ale.b("textures/entity/squid/glow_squid.png");

   public gvw(gvk.a $$0, ghh $$1, ghh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public ale a(hdo $$0) {
      return a;
   }

   protected int a(bwq $$0, iu $$1) {
      int $$2 = (int)azk.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
