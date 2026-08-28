public class gpd extends gpf<cll, gvy, fyp> {
   private static final alh a = alh.b("textures/entity/slime/magmacube.png");

   public gpd(gnz.a $$0) {
      super($$0, new fyp($$0.a(gba.bh)), 0.25F);
   }

   protected int a(cll $$0, jg $$1) {
      return 15;
   }

   public alh a(gvy $$0) {
      return a;
   }

   public gvy c() {
      return new gvy();
   }

   public void a(cll $$0, gvy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azj.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gw();
   }

   public void a(gvy $$0, fdt $$1, ghw $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvy $$0, fdt $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
