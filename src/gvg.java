public class gvg extends gut<civ, hbu, gfa> {
   public gvg(gvz.a $$0) {
      super($$0, new gfa($$0.a(git.Q)), new gfa($$0.a(git.R)), 0.4F);
      this.a(new gzp(this, $$0.f()));
   }

   public alg a(hbu $$0) {
      return $$0.a;
   }

   public hbu a() {
      return new hbu();
   }

   public void a(civ $$0, hbu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC().a().b().b();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gH();
      $$1.c = $$0.q() ? $$0.gE() : null;
   }

   protected void a(hbu $$0, fjc $$1, float $$2, float $$3) {
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
