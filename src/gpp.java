public class gpp extends gpj<clb, gvt> {
   private final gkj a;

   public gpp(gpk.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clb $$0, gmx $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.n() != $$0.dV().a_($$0.dv());
   }

   public void a(gvt $$0, fer $$1, gjg $$2, int $$3) {
      dvv $$4 = $$0.c;
      if ($$4.o() == dow.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(giy.b($$4)), false, azu.a(), $$4.b($$0.a), gyv.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gvt a() {
      return new gvt();
   }

   public void a(clb $$0, gvt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.j();
      $$1.b = $$3;
      $$1.c = $$0.n();
      $$1.d = $$0.dV().t($$3);
      $$1.e = $$0.dV();
   }
}
