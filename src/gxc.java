public class gxc extends gwp<cjy, hdr, ggw> {
   public gxc(gxv.a $$0) {
      super($$0, new ggw($$0.a(gkq.Q)), new ggw($$0.a(gkq.R)), 0.4F);
      this.a(new hbl(this, $$0.f()));
   }

   public alr a(hdr $$0) {
      return $$0.a;
   }

   public hdr a() {
      return new hdr();
   }

   public void a(cjy $$0, hdr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG().a().b().b();
      $$1.d = $$0.ch();
      $$1.e = $$0.ci();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gL();
      $$1.c = $$0.q() ? $$0.gI() : null;
   }

   protected void a(hdr $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azz.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
