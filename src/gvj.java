public class gvj extends gvl<cni, hcg, ger> {
   private static final ald a = ald.b("textures/entity/slime/magmacube.png");

   public gvj(guf.a $$0) {
      super($$0, new ger($$0.a(ghc.bF)), 0.25F);
   }

   protected int a(cni $$0, jj $$1) {
      return 15;
   }

   public ald a(hcg $$0) {
      return a;
   }

   public hcg b() {
      return new hcg();
   }

   public void a(cni $$0, hcg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bE, $$0.bD);
      $$1.b = $$0.go();
   }

   protected float b(hcg $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hcg $$0, fho $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
