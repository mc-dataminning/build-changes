public class gtq extends gti<clz, gzr, gcz> {
   private static final aku a = aku.b("textures/entity/phantom.png");

   public gtq(gsc.a $$0) {
      super($$0, new gcz($$0.a(gfb.bO)), 0.75F);
      this.a(new gwp(this));
   }

   public aku a(gzr $$0) {
      return a;
   }

   public gzr b() {
      return new gzr();
   }

   public void a(clz $$0, gzr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.u;
      $$1.b = $$0.m();
   }

   protected void a(gzr $$0, ffu $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzr $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
