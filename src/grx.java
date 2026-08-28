public class grx extends gtu<bvp> {
   private static final alp a = alp.b("textures/entity/squid/glow_squid.png");

   public grx(grl.a $$0, gdk $$1, gdk $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alp a(gzo $$0) {
      return a;
   }

   protected int a(bvp $$0, jh $$1) {
      int $$2 = (int)azu.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
