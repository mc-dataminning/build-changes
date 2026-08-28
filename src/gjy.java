public class gjy extends glu<bst> {
   private static final akk a = new akk("textures/entity/squid/glow_squid.png");

   public gjy(gjm.a $$0, fwq<bst> $$1) {
      super($$0, $$1);
   }

   public akk a(bst $$0) {
      return a;
   }

   protected int a(bst $$0, ja $$1) {
      int $$2 = (int)ayg.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
