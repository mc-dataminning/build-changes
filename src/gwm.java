public class gwm extends gwg<cng, hcs> {
   private final gre a;

   public gwm(gwh.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cng $$0, gtt $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dV().a_($$0.dv());
   }

   public void a(hcs $$0, fjj $$1, gqa $$2, int $$3) {
      eah $$4 = $$0.c;
      if ($$4.o() == dss.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gps.b($$4)), false, azv.a(), $$4.b($$0.a), hin.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hcs a() {
      return new hcs();
   }

   public void a(cng $$0, hcs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      iu $$3 = iu.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dV().u($$3);
      $$1.e = $$0.dV();
   }
}
