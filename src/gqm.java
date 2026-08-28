public class gqm extends gny<cpo, gwe> {
   public static final alh a = alh.b("textures/entity/trident.png");
   private final gaf b;

   public gqm(gnz.a $$0) {
      super($$0);
      this.b = new gaf($$0.a(gba.cL));
   }

   public void a(gwe $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fdx $$4 = gox.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, gxj.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwe a() {
      return new gwe();
   }

   public void a(cpo $$0, gwe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.E();
   }
}
