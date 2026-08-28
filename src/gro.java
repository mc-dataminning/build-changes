public class gro extends gri<clv, gxt> {
   private final gmh a;

   public gro(grj.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clv $$0, gov $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dV().a_($$0.dv());
   }

   public void a(gxt $$0, fgl $$1, gle $$2, int $$3) {
      dxn $$4 = $$0.c;
      if ($$4.o() == dqn.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gkw.b($$4)), false, bam.a(), $$4.b($$0.a), hav.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxt a() {
      return new gxt();
   }

   public void a(clv $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dV().t($$3);
      $$1.e = $$0.dV();
   }
}
