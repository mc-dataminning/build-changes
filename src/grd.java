public class grd extends gmu<chp, gwq, gaq> {
   public grd(gnz.a $$0) {
      super($$0, new gaq($$0.a(gba.dg)), new gaq($$0.a(gba.di)), 0.5F);
      this.a(new gtb(this, $$0.f(), $$0.h()));
      this.a(new gtc(this));
   }

   protected int a(gwq $$0) {
      float $$1 = $$0.f;
      return $$1 == 1.0F ? -1 : axu.a(1.0F, $$1, $$1, $$1);
   }

   public alh b(gwq $$0) {
      return $$0.g;
   }

   public gwq c() {
      return new gwq();
   }

   public void a(chp $$0, gwq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ae_();
      $$1.b = $$0.y();
      $$1.c = $$0.gK();
      $$1.d = $$0.L($$2);
      $$1.e = $$0.K($$2);
      $$1.g = $$0.gH();
      $$1.f = $$0.J($$2);
      $$1.h = $$0.q() ? $$0.gL() : null;
      $$1.i = $$0.ak().v();
   }
}
