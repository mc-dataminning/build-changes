public class gur extends guj<cmu, has, gdz> {
   private static final aku a = aku.b("textures/entity/phantom.png");

   public gur(gtd.a $$0) {
      super($$0, new gdz($$0.a(ggb.bQ)), 0.75F);
      this.a(new gxq(this));
   }

   public aku a(has $$0) {
      return a;
   }

   public has b() {
      return new has();
   }

   public void a(cmu $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(has $$0, fgr $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(has $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
