public class gpy extends gpq<clt, gvv, fzj> {
   private static final ali a = ali.b("textures/entity/phantom.png");

   public gpy(gok.a $$0) {
      super($$0, new fzj($$0.a(gbl.bs)), 0.75F);
      this.a(new gsv(this));
   }

   public ali a(gvv $$0) {
      return a;
   }

   public gvv c() {
      return new gvv();
   }

   public void a(clt $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(gvv $$0, feb $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gvv $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
