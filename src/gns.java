public class gns extends gnf<cgu, gue, fxx> {
   public gns(gok.a $$0) {
      super($$0, new fxx($$0.a(gbl.D)), new fxx($$0.a(gbl.E)), 0.4F);
      this.a(new grz(this, $$0.f()));
   }

   public ali a(gue $$0) {
      return $$0.a;
   }

   public gue a() {
      return new gue();
   }

   public void a(cgu $$0, gue $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG().a().a();
      $$1.d = $$0.cj();
      $$1.e = $$0.ck();
      $$1.f = $$0.y();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gL();
      $$1.c = $$0.q() ? $$0.gI() : null;
   }

   protected void a(gue $$0, feb $$1, float $$2, float $$3) {
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
