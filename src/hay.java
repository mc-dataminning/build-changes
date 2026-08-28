public class hay extends gyj<cti, hgu> {
   public static final alk a = alk.b("textures/entity/trident.png");
   private final gkj g;

   public hay(gyk.a $$0) {
      super($$0);
      this.g = new gkj($$0.a(glf.dD));
   }

   public void a(hgu $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      flt $$4 = gzi.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hks.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hgu a() {
      return new hgu();
   }

   public void a(cti $$0, hgu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}
