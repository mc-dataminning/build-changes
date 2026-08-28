public class gtf extends gth<clv, hae, gco> {
   private static final aku a = aku.b("textures/entity/slime/magmacube.png");

   public gtf(gsb.a $$0) {
      super($$0, new gco($$0.a(gez.bx)), 0.25F);
   }

   protected int a(clv $$0, ji $$1) {
      return 15;
   }

   public aku a(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(clv $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayy.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gp();
   }

   protected float b(hae $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hae $$0, ffs $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
