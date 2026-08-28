public class gos extends gou<clc, gvm, fye> {
   private static final ale a = ale.b("textures/entity/slime/magmacube.png");

   public gos(gno.a $$0) {
      super($$0, new fye($$0.a(gap.bh)), 0.25F);
   }

   protected int a(clc $$0, jf $$1) {
      return 15;
   }

   public ale a(gvm $$0) {
      return a;
   }

   public gvm c() {
      return new gvm();
   }

   public void a(clc $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azf.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gp();
   }

   public void a(gvm $$0, fdi $$1, ghl $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvm $$0, fdi $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
