public class gos extends gof<chb, gvf, fyw> {
   public gos(gpk.a $$0) {
      super($$0, new fyw($$0.a(gck.L)), new fyw($$0.a(gck.M)), 0.4F);
      this.a(new gta(this, $$0.f()));
   }

   public alj a(gvf $$0) {
      return $$0.a;
   }

   public gvf a() {
      return new gvf();
   }

   public void a(chb $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.v();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gD();
      $$1.c = $$0.n() ? $$0.gA() : null;
   }

   protected void a(gvf $$0, fer $$1, float $$2, float $$3) {
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
