public class gqb extends gnn<cpe, gvs> {
   public static final ale a = ale.b("textures/entity/trident.png");
   private final fzu b;

   public gqb(gno.a $$0) {
      super($$0);
      this.b = new fzu($$0.a(gap.cL));
   }

   public void a(gvs $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fdm $$4 = gom.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, gwx.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvs a() {
      return new gvs();
   }

   public void a(cpe $$0, gvs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.E();
   }
}
