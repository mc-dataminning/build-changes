public class haj extends gxu<ctr, hgi> {
   public static final alr a = alr.b("textures/entity/trident.png");
   private final gju g;

   public haj(gxv.a $$0) {
      super($$0);
      this.g = new gju($$0.a(gkq.dD));
   }

   public void a(hgi $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      flg $$4 = gyt.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hkg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hgi a() {
      return new hgi();
   }

   public void a(ctr $$0, hgi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.x();
   }
}
