public class gpq extends gpj<cpi, gvv> {
   private final gqi a;

   public gpq(gpk.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gvv $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cwk.h, false, $$1, $$2, $$3, gyv.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvv a() {
      return new gvv();
   }

   public void a(cpi $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.l();
      cwm $$3 = $$0.j();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dV(), null, $$0.ar()) : null;
   }
}
