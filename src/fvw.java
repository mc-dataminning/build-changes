public class fvw extends fxr<bkq> {
   private static final agg a = new agg("textures/entity/squid/glow_squid.png");

   public fvw(fvk.a $$0, fje<bkq> $$1) {
      super($$0, $$1);
   }

   public agg a(bkq $$0) {
      return a;
   }

   protected int a(bkq $$0, ht $$1) {
      int $$2 = (int)ati.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
