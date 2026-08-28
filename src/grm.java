public class grm extends gqz<chc, gyb, gbo> {
   public grm(gsf.a $$0) {
      super($$0, new gbo($$0.a(gfd.O)), new gbo($$0.a(gfd.P)), 0.4F);
      this.a(new gvv(this, $$0.f()));
   }

   public akv a(gyb $$0) {
      return $$0.a;
   }

   public gyb a() {
      return new gyb();
   }

   public void a(chc $$0, gyb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gJ();
      $$1.c = $$0.p() ? $$0.gG() : null;
   }

   protected void a(gyb $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(ayz.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
