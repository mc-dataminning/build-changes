public class gvt extends gvl<cnl, hbt, gfa> {
   private static final ald a = ald.b("textures/entity/phantom.png");

   public gvt(guf.a $$0) {
      super($$0, new gfa($$0.a(ghc.bY)), 0.75F);
      this.a(new gyr(this));
   }

   public ald a(hbt $$0) {
      return a;
   }

   public hbt b() {
      return new hbt();
   }

   public void a(cnl $$0, hbt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hbt $$0, fho $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hbt $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
