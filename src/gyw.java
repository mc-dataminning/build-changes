public class gyw extends hat<bxl> {
   private static final alk a = alk.b("textures/entity/squid/glow_squid.png");

   public gyw(gyk.a $$0, gkg $$1, gkg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alk a(hgq $$0) {
      return a;
   }

   protected int a(bxl $$0, iw $$1) {
      int $$2 = (int)azq.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
