public class gnh extends gmu<cgp, gtt, fxm> {
   public gnh(gnz.a $$0) {
      super($$0, new fxm($$0.a(gba.D)), new fxm($$0.a(gba.E)), 0.4F);
      this.a(new gro(this, $$0.f()));
   }

   public alh a(gtt $$0) {
      return $$0.a;
   }

   public gtt a() {
      return new gtt();
   }

   public void a(cgp $$0, gtt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH().a().a();
      $$1.d = $$0.cj();
      $$1.e = $$0.ck();
      $$1.f = $$0.y();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gM();
      $$1.c = $$0.q() ? $$0.gJ() : null;
   }

   protected void a(gtt $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azj.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
