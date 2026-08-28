public class gmr extends gme<cgd, gtc, fwx> {
   public gmr(gnj.a $$0) {
      super($$0, new fwx($$0.a(gak.D)), new fwx($$0.a(gak.E)), 0.4F);
      this.a(new gqy(this, $$0.f()));
   }

   public alc a(gtc $$0) {
      return $$0.a;
   }

   public gtc a() {
      return new gtc();
   }

   public void a(cgd $$0, gtc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB().a().a();
      $$1.d = $$0.cf();
      $$1.e = $$0.cg();
      $$1.f = $$0.y();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gG();
      $$1.c = $$0.q() ? $$0.gD() : null;
   }

   protected void a(gtc $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azd.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
