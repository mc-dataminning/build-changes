public class gxk extends gsz<cjm, hcz, ggs> {
   public gxk(guf.a $$0) {
      super($$0, new ggs($$0.a(ghc.dT)), new ggs($$0.a(ghc.dV)), 0.5F);
      this.a(new gzh(this, $$0.f(), $$0.h()));
      this.a(new gzi(this));
   }

   protected int a(hcz $$0) {
      float $$1 = $$0.f;
      return $$1 == 1.0F ? -1 : axu.a(1.0F, $$1, $$1, $$1);
   }

   public ald b(hcz $$0) {
      return $$0.g;
   }

   public hcz b() {
      return new hcz();
   }

   public void a(cjm $$0, hcz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.W_();
      $$1.b = $$0.x();
      $$1.c = $$0.gE();
      $$1.d = $$0.M($$2);
      $$1.e = $$0.L($$2);
      $$1.g = $$0.gC();
      $$1.f = $$0.K($$2);
      $$1.h = $$0.q() ? $$0.gF() : null;
      $$1.i = $$0.aj().v();
   }
}
