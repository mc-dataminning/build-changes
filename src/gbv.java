public class gbv extends ges<haz> {
   public gbv(gfc $$0) {
      super($$0);
   }

   public static gfi a(gfg $$0) {
      gfk $$1 = gcn.a($$0, 0.0F);
      gfm $$2 = $$1.a();
      $$2.a("left_arm", gfh.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gfe.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gfh.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gfe.a(1.9F, 12.0F, 0.0F));
      return gfi.a($$1, 64, 64);
   }

   @Override
   public void a(haz $$0) {
      super.a($$0);
      if ($$0.h == gcn.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == gcn.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.G;
      if ($$1 > 0.0F) {
         this.r.e = ayz.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * ayz.a(0.1F * $$0.u);
         this.s.e = ayz.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * ayz.a(0.1F * $$0.u);
         this.r.g = ayz.j($$1, this.r.g, -0.15F);
         this.s.g = ayz.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * ayz.a(0.1F * $$0.u);
         this.t.e = this.t.e + $$1 * 0.55F * ayz.a(0.1F * $$0.u);
         this.o.e = 0.0F;
      }
   }
}
