public class gma extends gln<cfy, gsl, fwn> {
   public gma(gms.a $$0) {
      super($$0, new fwn($$0.a(gaa.D)), new fwn($$0.a(gaa.E)), 0.4F);
      this.a(new gqh(this, $$0.f()));
   }

   public alb a(gsl $$0) {
      return $$0.a;
   }

   public gsl a() {
      return new gsl();
   }

   public void a(cfy $$0, gsl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA().a().a();
      $$1.d = $$0.cf();
      $$1.e = $$0.cg();
      $$1.f = $$0.y();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gF();
      $$1.c = $$0.q() ? $$0.gC() : null;
   }

   protected void a(gsl $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azc.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
