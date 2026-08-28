public class gqy extends gqq<cma, gww, gai> {
   private static final alj a = alj.b("textures/entity/phantom.png");

   public gqy(gpk.a $$0) {
      super($$0, new gai($$0.a(gck.bI)), 0.75F);
      this.a(new gtw(this));
   }

   public alj a(gww $$0) {
      return a;
   }

   public gww b() {
      return new gww();
   }

   public void a(cma $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() + $$1.p;
      $$1.b = $$0.n();
   }

   protected void a(gww $$0, fer $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gww $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
