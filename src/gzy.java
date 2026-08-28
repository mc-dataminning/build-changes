public class gzy extends gzq<cpd, hga, gjc> {
   private static final alk a = alk.b("textures/entity/phantom.png");

   public gzy(gyk.a $$0) {
      super($$0, new gjc($$0.a(glf.cc)), 0.75F);
      this.a(new hcw(this));
   }

   public alk a(hga $$0) {
      return a;
   }

   public hga b() {
      return new hga();
   }

   public void a(cpd $$0, hga $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hga $$0, flq $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hga $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
