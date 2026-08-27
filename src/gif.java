public class gif extends gkb<bsg> {
   private static final akm a = new akm("textures/entity/squid/glow_squid.png");

   public gif(ght.a $$0, fuy<bsg> $$1) {
      super($$0, $$1);
   }

   public akm a(bsg $$0) {
      return a;
   }

   protected int a(bsg $$0, io $$1) {
      int $$2 = (int)ayd.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
