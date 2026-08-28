public class gxy extends gvj<csa, hds> {
   public static final ale a = ale.b("textures/entity/trident.png");
   private final ghk g;

   public gxy(gvk.a $$0) {
      super($$0);
      this.g = new ghk($$0.a(gif.dx));
   }

   public void a(hds $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fiu $$4 = gwi.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hhp.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hds a() {
      return new hds();
   }

   public void a(csa $$0, hds $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}
