public class gtp extends gth<cly, gzq, gcx> {
   private static final aku a = aku.b("textures/entity/phantom.png");

   public gtp(gsb.a $$0) {
      super($$0, new gcx($$0.a(gez.bO)), 0.75F);
      this.a(new gwo(this));
   }

   public aku a(gzq $$0) {
      return a;
   }

   public gzq b() {
      return new gzq();
   }

   public void a(cly $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.u;
      $$1.b = $$0.m();
   }

   protected void a(gzq $$0, ffs $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzq $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
