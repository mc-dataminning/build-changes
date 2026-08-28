public class gvo extends gvb<cix, hcc, gfh> {
   public gvo(gwh.a $$0) {
      super($$0, new gfh($$0.a(gjb.Q)), new gfh($$0.a(gjb.R)), 0.4F);
      this.a(new gzx(this, $$0.f()));
   }

   public alg a(hcc $$0) {
      return $$0.a;
   }

   public hcc a() {
      return new hcc();
   }

   public void a(cix $$0, hcc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD().a().b().b();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gI();
      $$1.c = $$0.q() ? $$0.gF() : null;
   }

   protected void a(hcc $$0, fjj $$1, float $$2, float $$3) {
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
