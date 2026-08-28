public class gwy extends gws<cnn, hde> {
   private final grp a;

   public gwy(gwt.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cnn $$0, guf $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dU().a_($$0.du());
   }

   public void a(hde $$0, fjy $$1, gqm $$2, int $$3) {
      eao $$4 = $$0.c;
      if ($$4.o() == dsz.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gqe.b($$4)), false, azv.a(), $$4.b($$0.a), hja.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hde a() {
      return new hde();
   }

   public void a(cnn $$0, hde $$1, float $$2) {
      super.a($$0, $$1, $$2);
      iv $$3 = iv.a($$0.dz(), $$0.cQ().e, $$0.dF());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dU().u($$3);
      $$1.e = $$0.dU();
   }
}
