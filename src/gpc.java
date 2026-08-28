public class gpc extends gou<clf, guy, fyn> {
   private static final ale a = ale.b("textures/entity/phantom.png");

   public gpc(gno.a $$0) {
      super($$0, new fyn($$0.a(gap.bs)), 0.75F);
      this.a(new grz(this));
   }

   public ale a(guy $$0) {
      return a;
   }

   public guy c() {
      return new guy();
   }

   public void a(clf $$0, guy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(guy $$0, fdi $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(guy $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
