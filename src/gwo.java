public class gwo extends gwq<cns, hdl, gfu> {
   private static final ale a = ale.b("textures/entity/slime/magmacube.png");

   public gwo(gvk.a $$0) {
      super($$0, new gfu($$0.a(gif.bF)), 0.25F);
   }

   protected int a(cns $$0, iu $$1) {
      return 15;
   }

   public ale a(hdl $$0) {
      return a;
   }

   public hdl b() {
      return new hdl();
   }

   public void a(cns $$0, hdl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bF, $$0.bE);
      $$1.b = $$0.go();
   }

   protected float b(hdl $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hdl $$0, fiq $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
