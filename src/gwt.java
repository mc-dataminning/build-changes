public class gwt extends gyq<bwv> {
   private static final alg a = alg.b("textures/entity/squid/glow_squid.png");

   public gwt(gwh.a $$0, gic $$1, gic $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alg a(hem $$0) {
      return a;
   }

   protected int a(bwv $$0, iu $$1) {
      int $$2 = (int)azm.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
