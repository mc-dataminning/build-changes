public class gxl extends gxn<coc, hej, ggp> {
   private static final alg a = alg.b("textures/entity/slime/magmacube.png");

   public gxl(gwh.a $$0) {
      super($$0, new ggp($$0.a(gjb.bJ)), 0.25F);
   }

   protected int a(coc $$0, iu $$1) {
      return 15;
   }

   public alg a(hej $$0) {
      return a;
   }

   public hej b() {
      return new hej();
   }

   public void a(coc $$0, hej $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bG, $$0.bF);
      $$1.b = $$0.gp();
   }

   protected float b(hej $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hej $$0, fjj $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
