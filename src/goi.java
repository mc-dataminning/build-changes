public class goi extends gnv<cgy, guu, fyn> {
   public goi(gpa.a $$0) {
      super($$0, new fyn($$0.a(gcb.D)), new fyn($$0.a(gcb.E)), 0.4F);
      this.a(new gsp(this, $$0.f()));
   }

   public all a(guu $$0) {
      return $$0.a;
   }

   public guu a() {
      return new guu();
   }

   public void a(cgy $$0, guu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH().a().a();
      $$1.d = $$0.ck();
      $$1.e = $$0.cl();
      $$1.f = $$0.y();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gM();
      $$1.c = $$0.q() ? $$0.gJ() : null;
   }

   protected void a(guu $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azn.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
