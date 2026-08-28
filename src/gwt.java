public class gwt extends gue<cro, hcn> {
   public static final ald a = ald.b("textures/entity/trident.png");
   private final ggh g;

   public gwt(guf.a $$0) {
      super($$0);
      this.g = new ggh($$0.a(ghc.dx));
   }

   public void a(hcn $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fhs $$4 = gvd.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hgi.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hcn a() {
      return new hcn();
   }

   public void a(cro $$0, hcn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}
