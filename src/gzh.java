public class gzh extends gws<css, hfc> {
   public static final alg a = alg.b("textures/entity/trident.png");
   private final gir g;

   public gzh(gwt.a $$0) {
      super($$0);
      this.g = new gir($$0.a(gjn.dB));
   }

   public void a(hfc $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fkc $$4 = gxr.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfc a() {
      return new hfc();
   }

   public void a(css $$0, hfc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}
