public class gpf extends goz<cky, gvi> {
   private final gka a;

   public gpf(gpa.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cky $$0, gmo $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.q() != $$0.dY().a_($$0.dy());
   }

   public void a(gvi $$0, fek $$1, gix $$2, int $$3) {
      dvo $$4 = $$0.c;
      if ($$4.o() == dop.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gip.b($$4)), false, azv.a(), $$4.b($$0.a), gyk.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gvi a() {
      return new gvi();
   }

   public void a(cky $$0, gvi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dD(), $$0.cT().e, $$0.dJ());
      $$1.a = $$0.m();
      $$1.b = $$3;
      $$1.c = $$0.q();
      $$1.d = $$0.dY().t($$3);
      $$1.e = $$0.dY();
   }
}
