public class gqj extends gpj<ckw, gvo> {
   private static final alj a = alj.b("textures/entity/lead_knot.png");
   private final gaa b;

   public gqj(gpk.a $$0) {
      super($$0);
      this.b = new gaa($$0.a(gck.bn));
   }

   @Override
   public void a(gvo $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fev $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gyv.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gvo d() {
      return new gvo();
   }
}
