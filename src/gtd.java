public class gtd extends gsv<cmy, gzc, gck> {
   private static final alz a = alz.b("textures/entity/phantom.png");

   public gtd(grp.a $$0) {
      super($$0, new gck($$0.a(gem.bL)), 0.75F);
      this.a(new gwc(this));
   }

   public alz a(gzc $$0) {
      return a;
   }

   public gzc b() {
      return new gzc();
   }

   public void a(cmy $$0, gzc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.p;
      $$1.b = $$0.m();
   }

   protected void a(gzc $$0, fgr $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzc $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
