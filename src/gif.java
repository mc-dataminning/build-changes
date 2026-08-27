public class gif extends gkb<bsi> {
   private static final akn a = new akn("textures/entity/squid/glow_squid.png");

   public gif(ght.a $$0, fuy<bsi> $$1) {
      super($$0, $$1);
   }

   public akn a(bsi $$0) {
      return a;
   }

   protected int a(bsi $$0, io $$1) {
      int $$2 = (int)ayf.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
