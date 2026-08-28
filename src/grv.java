public class grv extends grp<cma, gya> {
   private final gmo a;

   public grv(grq.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cma $$0, gpc $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dW().a_($$0.dw());
   }

   public void a(gya $$0, fgs $$1, gll $$2, int $$3) {
      dxv $$4 = $$0.c;
      if ($$4.o() == dqv.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gld.b($$4)), false, bam.a(), $$4.b($$0.a), hbc.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gya a() {
      return new gya();
   }

   public void a(cma $$0, gya $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dB(), $$0.cR().e, $$0.dH());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dW().t($$3);
      $$1.e = $$0.dW();
   }
}
