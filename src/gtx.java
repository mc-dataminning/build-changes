public class gtx extends gri<cqy, gzq> {
   public static final alz a = alz.b("textures/entity/trident.png");
   private final gdl b;

   public gtx(grj.a $$0) {
      super($$0);
      this.b = new gdl($$0.a(geg.dg));
   }

   public void a(gzq $$0, fgl $$1, gle $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgp $$4 = gsh.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hav.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzq a() {
      return new gzq();
   }

   public void a(cqy $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.C();
   }
}
