public class gqx extends gqk<cia, gxl, gay> {
   public gqx(grq.a $$0) {
      super($$0, new gay($$0.a(gen.L)), new gay($$0.a(gen.M)), 0.4F);
      this.a(new gvg(this, $$0.f()));
   }

   public alz a(gxl $$0) {
      return $$0.a;
   }

   public gxl a() {
      return new gxl();
   }

   public void a(cia $$0, gxl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gF();
      $$1.c = $$0.p() ? $$0.gC() : null;
   }

   protected void a(gxl $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(bae.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
