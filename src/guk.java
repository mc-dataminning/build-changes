public class guk extends gue<cmm, hap> {
   private final gpc a;

   public guk(guf.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cmm $$0, grr $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dV().a_($$0.dv());
   }

   public void a(hap $$0, fho $$1, gny $$2, int $$3) {
      dym $$4 = $$0.c;
      if ($$4.o() == drf.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gnr.b($$4)), false, azs.a(), $$4.b($$0.a), hgi.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hap a() {
      return new hap();
   }

   public void a(cmm $$0, hap $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jj $$3 = jj.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dV().t($$3);
      $$1.e = $$0.dV();
   }
}
