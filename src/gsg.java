public class gsg extends gsa<ckz, gym> {
   private final gmz a;

   public gsg(gsb.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(ckz $$0, gpn $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dW().a_($$0.dw());
   }

   public void a(gym $$0, ffs $$1, glv $$2, int $$3) {
      dwv $$4 = $$0.c;
      if ($$4.o() == dpv.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(glo.b($$4)), false, azg.a(), $$4.b($$0.a), hec.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gym a() {
      return new gym();
   }

   public void a(ckz $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ji $$3 = ji.a($$0.dB(), $$0.cR().e, $$0.dH());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dW().t($$3);
      $$1.e = $$0.dW();
   }
}
