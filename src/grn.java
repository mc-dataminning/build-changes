public class grn extends goz<cpx, gxf> {
   public static final all a = all.b("textures/entity/trident.png");
   private final gbg b;

   public grn(gpa.a $$0) {
      super($$0);
      this.b = new gbg($$0.a(gcb.cL));
   }

   public void a(gxf $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      feo $$4 = gpy.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, gyk.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gxf a() {
      return new gxf();
   }

   public void a(cpx $$0, gxf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
