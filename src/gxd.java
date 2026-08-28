public class gxd extends gxf<cny, heb, ggh> {
   private static final alg a = alg.b("textures/entity/slime/magmacube.png");

   public gxd(gvz.a $$0) {
      super($$0, new ggh($$0.a(git.bH)), 0.25F);
   }

   protected int a(cny $$0, iu $$1) {
      return 15;
   }

   public alg a(heb $$0) {
      return a;
   }

   public heb b() {
      return new heb();
   }

   public void a(cny $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bF, $$0.bE);
      $$1.b = $$0.go();
   }

   protected float b(heb $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(heb $$0, fjc $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
