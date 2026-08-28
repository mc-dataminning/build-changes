public class gzo extends gzq<cpa, hgn, git> {
   private static final alk a = alk.b("textures/entity/slime/magmacube.png");

   public gzo(gyk.a $$0) {
      super($$0, new git($$0.a(glf.bJ)), 0.25F);
   }

   protected int a(cpa $$0, iw $$1) {
      return 15;
   }

   public alk a(hgn $$0) {
      return a;
   }

   public hgn b() {
      return new hgn();
   }

   public void a(cpa $$0, hgn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azq.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gs();
   }

   protected float b(hgn $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgn $$0, flq $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
