public class gxp extends gxc<cjn, hee, ghj> {
   public gxp(gyi.a $$0) {
      super($$0, new ghj($$0.a(gld.Q)), new ghj($$0.a(gld.R)), 0.4F);
      this.a(new hby(this, $$0.f()));
   }

   public ali a(hee $$0) {
      return $$0.a;
   }

   public hee a() {
      return new hee();
   }

   public void a(cjn $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG().a().b().b();
      $$1.d = $$0.ch();
      $$1.e = $$0.ci();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gL();
      $$1.c = $$0.q() ? $$0.gI() : null;
   }

   protected void a(hee $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azo.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
