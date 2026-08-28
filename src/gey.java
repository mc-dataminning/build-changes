public class gey extends ghw<hef> {
   public gey(gig $$0) {
      super($$0);
   }

   public static gim a(gik $$0) {
      gio $$1 = gfr.a($$0, 0.0F);
      giq $$2 = $$1.a();
      $$2.a("left_arm", gil.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gii.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gil.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gii.a(1.9F, 12.0F, 0.0F));
      return gim.a($$1, 64, 64);
   }

   @Override
   public void a(hef $$0) {
      super.a($$0);
      if ($$0.h == gfr.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == gfr.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.G;
      if ($$1 > 0.0F) {
         this.r.e = azk.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azk.a(0.1F * $$0.u);
         this.s.e = azk.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azk.a(0.1F * $$0.u);
         this.r.g = azk.j($$1, this.r.g, -0.15F);
         this.s.g = azk.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azk.a(0.1F * $$0.u);
         this.t.e = this.t.e + $$1 * 0.55F * azk.a(0.1F * $$0.u);
         this.o.e = 0.0F;
      }
   }
}
