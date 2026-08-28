public class gur extends gue<cir, hbf, geo> {
   public gur(gvk.a $$0) {
      super($$0, new geo($$0.a(gif.Q)), new geo($$0.a(gif.R)), 0.4F);
      this.a(new gza(this, $$0.f()));
   }

   public ale a(hbf $$0) {
      return $$0.a;
   }

   public hbf a() {
      return new hbf();
   }

   public void a(cir $$0, hbf $$1, float $$2) {
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

   protected void a(hbf $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azk.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
