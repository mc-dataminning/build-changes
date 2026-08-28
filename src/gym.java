public class gym extends gye<coq, heo, ghp> {
   private static final alg a = alg.b("textures/entity/phantom.png");

   public gym(gwy.a $$0) {
      super($$0, new ghp($$0.a(gjs.cc)), 0.75F);
      this.a(new hbk(this));
   }

   public alg a(heo $$0) {
      return a;
   }

   public heo b() {
      return new heo();
   }

   public void a(coq $$0, heo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(heo $$0, fkd $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(heo $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
