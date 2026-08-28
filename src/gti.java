public class gti extends gtk<clx, hah, gcr> {
   private static final akv a = akv.b("textures/entity/slime/magmacube.png");

   public gti(gse.a $$0) {
      super($$0, new gcr($$0.a(gfc.bx)), 0.25F);
   }

   protected int a(clx $$0, ji $$1) {
      return 15;
   }

   public akv a(hah $$0) {
      return a;
   }

   public hah b() {
      return new hah();
   }

   public void a(clx $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gs();
   }

   protected float b(hah $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hah $$0, ffu $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
