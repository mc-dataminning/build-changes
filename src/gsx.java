public class gsx extends gsp<cmu, gyw, gce> {
   private static final alz a = alz.b("textures/entity/phantom.png");

   public gsx(grj.a $$0) {
      super($$0, new gce($$0.a(geg.bL)), 0.75F);
      this.a(new gvw(this));
   }

   public alz a(gyw $$0) {
      return a;
   }

   public gyw b() {
      return new gyw();
   }

   public void a(cmu $$0, gyw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.p;
      $$1.b = $$0.m();
   }

   protected void a(gyw $$0, fgl $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gyw $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
