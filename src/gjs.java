public class gjs extends glo<bsq> {
   private static final akk a = new akk("textures/entity/squid/glow_squid.png");

   public gjs(gjg.a $$0, fwk<bsq> $$1) {
      super($$0, $$1);
   }

   public akk a(bsq $$0) {
      return a;
   }

   protected int a(bsq $$0, ja $$1) {
      int $$2 = (int)aye.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
