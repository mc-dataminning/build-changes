public class gxn extends gxf<cob, hdo, ggq> {
   private static final alg a = alg.b("textures/entity/phantom.png");

   public gxn(gvz.a $$0) {
      super($$0, new ggq($$0.a(git.ca)), 0.75F);
      this.a(new hal(this));
   }

   public alg a(hdo $$0) {
      return a;
   }

   public hdo b() {
      return new hdo();
   }

   public void a(cob $$0, hdo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hdo $$0, fjc $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hdo $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
