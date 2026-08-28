public class gtt extends gtl<cmb, gzu, gdb> {
   private static final akv a = akv.b("textures/entity/phantom.png");

   public gtt(gsf.a $$0) {
      super($$0, new gdb($$0.a(gfd.bO)), 0.75F);
      this.a(new gws(this));
   }

   public akv a(gzu $$0) {
      return a;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(cmb $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.u;
      $$1.b = $$0.m();
   }

   protected void a(gzu $$0, ffv $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzu $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
