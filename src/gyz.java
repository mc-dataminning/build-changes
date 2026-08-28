public class gyz extends gzb<cpj, hgb, gie> {
   private static final alr a = alr.b("textures/entity/slime/magmacube.png");

   public gyz(gxv.a $$0) {
      super($$0, new gie($$0.a(gkq.bJ)), 0.25F);
   }

   protected int a(cpj $$0, iw $$1) {
      return 15;
   }

   public alr a(hgb $$0) {
      return a;
   }

   public hgb b() {
      return new hgb();
   }

   public void a(cpj $$0, hgb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azz.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gv();
   }

   protected float b(hgb $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgb $$0, fld $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
