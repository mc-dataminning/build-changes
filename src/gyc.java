public class gyc extends gye<com, hfb, ghg> {
   private static final alg a = alg.b("textures/entity/slime/magmacube.png");

   public gyc(gwy.a $$0) {
      super($$0, new ghg($$0.a(gjs.bJ)), 0.25F);
   }

   protected int a(com $$0, iv $$1) {
      return 15;
   }

   public alg a(hfb $$0) {
      return a;
   }

   public hfb b() {
      return new hfb();
   }

   public void a(com $$0, hfb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bG, $$0.bF);
      $$1.b = $$0.gr();
   }

   protected float b(hfb $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hfb $$0, fkd $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
