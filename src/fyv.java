public class fyv extends gbs<gxs> {
   public fyv(gcc $$0) {
      super($$0);
   }

   public static gci a(gcg $$0) {
      gck $$1 = fzn.a($$0, 0.0F);
      gcm $$2 = $$1.a();
      $$2.a("left_arm", gch.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gce.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gch.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gce.a(1.9F, 12.0F, 0.0F));
      return gci.a($$1, 64, 64);
   }

   protected fzn.a a(gxs $$0, buy $$1) {
      cwf $$2 = $$1 == buy.b ? $$0.ar : $$0.at;
      return $$2.a(cwj.wk) && $$0.a && $$0.ap == $$1 ? fzn.a.e : fzn.a.a;
   }

   @Override
   public void a(gxs $$0) {
      super.a($$0);
      if (this.a($$0, buy.a) == fzn.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, buy.b) == fzn.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azn.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azn.a(0.1F * $$0.p);
         this.s.e = azn.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azn.a(0.1F * $$0.p);
         this.r.g = azn.j($$1, this.r.g, -0.15F);
         this.s.g = azn.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azn.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azn.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
