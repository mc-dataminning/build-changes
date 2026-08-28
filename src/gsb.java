public class gsb extends gty<bvx> {
   private static final alz a = alz.b("textures/entity/squid/glow_squid.png");

   public gsb(grp.a $$0, gdo $$1, gdo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alz a(gzs $$0) {
      return a;
   }

   protected int a(bvx $$0, jh $$1) {
      int $$2 = (int)bae.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
