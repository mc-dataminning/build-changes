public class gmw extends gmj<cgg, gth, fxb> {
   public gmw(gno.a $$0) {
      super($$0, new fxb($$0.a(gap.D)), new fxb($$0.a(gap.E)), 0.4F);
      this.a(new grd(this, $$0.f()));
   }

   public ale a(gth $$0) {
      return $$0.a;
   }

   public gth a() {
      return new gth();
   }

   public void a(cgg $$0, gth $$1, float $$2) {
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

   protected void a(gth $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azf.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
