public class gqx extends goj<cpt, gwp> {
   public static final ali a = ali.b("textures/entity/trident.png");
   private final gaq b;

   public gqx(gok.a $$0) {
      super($$0);
      this.b = new gaq($$0.a(gbl.cL));
   }

   public void a(gwp $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fef $$4 = gpi.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, gxu.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwp a() {
      return new gwp();
   }

   public void a(cpt $$0, gwp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
