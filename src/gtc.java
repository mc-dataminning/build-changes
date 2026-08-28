public class gtc extends gsu<cmy, gzb, gcj> {
   private static final alz a = alz.b("textures/entity/phantom.png");

   public gtc(gro.a $$0) {
      super($$0, new gcj($$0.a(gel.bL)), 0.75F);
      this.a(new gwb(this));
   }

   public alz a(gzb $$0) {
      return a;
   }

   public gzb b() {
      return new gzb();
   }

   public void a(cmy $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.p;
      $$1.b = $$0.m();
   }

   protected void a(gzb $$0, fgq $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzb $$0, fgq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
