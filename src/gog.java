public class gog extends gny<ckx, guc, fxz> {
   private static final alb a = alb.b("textures/entity/phantom.png");

   public gog(gms.a $$0) {
      super($$0, new fxz($$0.a(gaa.br)), 0.75F);
      this.a(new grd(this));
   }

   public alb a(guc $$0) {
      return a;
   }

   public guc c() {
      return new guc();
   }

   public void a(ckx $$0, guc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(guc $$0, fcu $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(guc $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
