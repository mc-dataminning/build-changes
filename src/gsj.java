public class gsj extends gsd<clb, gyp> {
   private final gnc a;

   public gsj(gse.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clb $$0, gpq $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dV().a_($$0.dv());
   }

   public void a(gyp $$0, ffu $$1, gly $$2, int $$3) {
      dwx $$4 = $$0.c;
      if ($$4.o() == dpx.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(glr.b($$4)), false, azh.a(), $$4.b($$0.a), hei.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyp a() {
      return new gyp();
   }

   public void a(clb $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ji $$3 = ji.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dV().t($$3);
      $$1.e = $$0.dV();
   }
}
