public class gtz extends grk<cqu, gzs> {
   public static final alp a = alp.b("textures/entity/trident.png");
   private final gdn b;

   public gtz(grl.a $$0) {
      super($$0);
      this.b = new gdn($$0.a(gei.dl));
   }

   public void a(gzs $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgp $$4 = gsj.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hax.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzs a() {
      return new gzs();
   }

   public void a(cqu $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
