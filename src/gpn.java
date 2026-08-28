public class gpn extends gpf<clo, gvk, fyy> {
   private static final alh a = alh.b("textures/entity/phantom.png");

   public gpn(gnz.a $$0) {
      super($$0, new fyy($$0.a(gba.bs)), 0.75F);
      this.a(new gsk(this));
   }

   public alh a(gvk $$0) {
      return a;
   }

   public gvk c() {
      return new gvk();
   }

   public void a(clo $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(gvk $$0, fdt $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gvk $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
