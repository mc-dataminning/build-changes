public class gwf extends gvs<cjc, hcu, gfy> {
   public gwf(gwy.a $$0) {
      super($$0, new gfy($$0.a(gjs.Q)), new gfy($$0.a(gjs.R)), 0.4F);
      this.a(new hao(this, $$0.f()));
   }

   public alg a(hcu $$0) {
      return $$0.a;
   }

   public hcu a() {
      return new hcu();
   }

   public void a(cjc $$0, hcu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF().a().b().b();
      $$1.d = $$0.cg();
      $$1.e = $$0.ch();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gK();
      $$1.c = $$0.q() ? $$0.gH() : null;
   }

   protected void a(hcu $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azm.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
