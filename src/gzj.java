public class gzj extends gzb<cpm, hfn, gin> {
   private static final alr a = alr.b("textures/entity/phantom.png");

   public gzj(gxv.a $$0) {
      super($$0, new gin($$0.a(gkq.cc)), 0.75F);
      this.a(new hch(this));
   }

   public alr a(hfn $$0) {
      return a;
   }

   public hfn b() {
      return new hfn();
   }

   public void a(cpm $$0, hfn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.v;
      $$1.b = $$0.m();
   }

   protected void a(hfn $$0, fld $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hfn $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ae));
   }
}
