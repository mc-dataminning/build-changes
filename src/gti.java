public class gti extends gtc<clv, gzo> {
   private final gob a;

   public gti(gtd.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clv $$0, gqp $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dU().a_($$0.du());
   }

   public void a(gzo $$0, fgr $$1, gmx $$2, int $$3) {
      dxq $$4 = $$0.c;
      if ($$4.o() == dqp.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gmq.b($$4)), false, azh.a(), $$4.b($$0.a), hfh.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gzo a() {
      return new gzo();
   }

   public void a(clv $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ji $$3 = ji.a($$0.dz(), $$0.cQ().e, $$0.dF());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dU().t($$3);
      $$1.e = $$0.dU();
   }
}
