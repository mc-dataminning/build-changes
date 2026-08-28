import java.util.List;

public class gya extends gxu<com, heh> {
   private final gsq a;

   public gya(gxv.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(com $$0, gvh $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.i() != $$0.dV().a_($$0.dv());
   }

   public void a(heh $$0, fld $$1, grn $$2, int $$3) {
      ebq $$4 = $$0.c;
      if ($$4.o() == dub.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         List<gsz> $$5 = this.a.a($$4).a(bai.a($$4.b($$0.a)));
         this.a.b().a($$0, $$5, $$4, $$0.b, $$1, $$2.getBuffer(grf.b($$4)), false, hkg.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public heh a() {
      return new heh();
   }

   public void a(com $$0, heh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      iw $$3 = iw.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.e();
      $$1.b = $$3;
      $$1.c = $$0.i();
      $$1.d = $$0.dV().u($$3);
      $$1.e = $$0.dV();
   }
}
