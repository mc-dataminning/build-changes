public class goa extends gpw<buf> {
   private static final ale a = ale.b("textures/entity/squid/glow_squid.png");

   public goa(gno.a $$0, fzr $$1, fzr $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public ale a(gvo $$0) {
      return a;
   }

   protected int a(buf $$0, jf $$1) {
      int $$2 = (int)azf.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
