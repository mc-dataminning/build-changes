public class gsh extends gsb<cla, gyn> {
   private final gnb a;

   public gsh(gsc.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cla $$0, gpo $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dW().a_($$0.dw());
   }

   public void a(gyn $$0, ffu $$1, glx $$2, int $$3) {
      dwx $$4 = $$0.c;
      if ($$4.o() == dpx.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(glq.b($$4)), false, azh.a(), $$4.b($$0.a), hea.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyn a() {
      return new gyn();
   }

   public void a(cla $$0, gyn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ji $$3 = ji.a($$0.dB(), $$0.cR().e, $$0.dH());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dW().t($$3);
      $$1.e = $$0.dW();
   }
}
