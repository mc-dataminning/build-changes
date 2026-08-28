public class gyh extends gxz<com, hei, ghk> {
   private static final alg a = alg.b("textures/entity/phantom.png");

   public gyh(gwt.a $$0) {
      super($$0, new ghk($$0.a(gjn.cc)), 0.75F);
      this.a(new hbf(this));
   }

   public alg a(hei $$0) {
      return a;
   }

   public hei b() {
      return new hei();
   }

   public void a(com $$0, hei $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hei $$0, fjy $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hei $$0, fjy $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
