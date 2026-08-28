public class gpo extends gpq<clq, gwj, fza> {
   private static final ali a = ali.b("textures/entity/slime/magmacube.png");

   public gpo(gok.a $$0) {
      super($$0, new fza($$0.a(gbl.bh)), 0.25F);
   }

   protected int a(clq $$0, jh $$1) {
      return 15;
   }

   public ali a(gwj $$0) {
      return a;
   }

   public gwj c() {
      return new gwj();
   }

   public void a(clq $$0, gwj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gv();
   }

   public void a(gwj $$0, feb $$1, gih $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gwj $$0, feb $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
