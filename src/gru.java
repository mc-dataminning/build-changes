public class gru extends gro<clz, gxz> {
   private final gmn a;

   public gru(grp.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clz $$0, gpb $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dW().a_($$0.dw());
   }

   public void a(gxz $$0, fgr $$1, glk $$2, int $$3) {
      dxu $$4 = $$0.c;
      if ($$4.o() == dqu.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(glc.b($$4)), false, bam.a(), $$4.b($$0.a), hbb.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxz a() {
      return new gxz();
   }

   public void a(clz $$0, gxz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dB(), $$0.cR().e, $$0.dH());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dW().t($$3);
      $$1.e = $$0.dW();
   }
}
