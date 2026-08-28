public class gkt extends gmp<bte> {
   private static final akr a = akr.b("textures/entity/squid/glow_squid.png");

   public gkt(gkh.a $$0, fxk<bte> $$1) {
      super($$0, $$1);
   }

   public akr a(bte $$0) {
      return a;
   }

   protected int a(bte $$0, jd $$1) {
      int $$2 = (int)ayo.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
