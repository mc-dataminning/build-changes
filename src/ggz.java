public class ggz extends giu<bqw> {
   private static final akf a = new akf("textures/entity/squid/glow_squid.png");

   public ggz(ggn.a $$0, ftt<bqw> $$1) {
      super($$0, $$1);
   }

   public akf a(bqw $$0) {
      return a;
   }

   protected int a(bqw $$0, im $$1) {
      int $$2 = (int)axw.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
