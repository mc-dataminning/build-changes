public class gxr extends gxe<cjp, heg, ghl> {
   public gxr(gyk.a $$0) {
      super($$0, new ghl($$0.a(glf.Q)), new ghl($$0.a(glf.R)), 0.4F);
      this.a(new hca(this, $$0.f()));
   }

   public alk a(heg $$0) {
      return $$0.a;
   }

   public heg a() {
      return new heg();
   }

   public void a(cjp $$0, heg $$1, float $$2) {
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

   protected void a(heg $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azq.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
