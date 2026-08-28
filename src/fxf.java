public class fxf extends gab<gwa> {
   public fxf(gal $$0) {
      super($$0);
   }

   public static gar a(gap $$0) {
      gat $$1 = fxx.a($$0, 0.0F);
      gav $$2 = $$1.a();
      $$2.a("left_arm", gaq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gan.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gaq.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gan.a(1.9F, 12.0F, 0.0F));
      return gar.a($$1, 64, 64);
   }

   protected fxx.a a(gwa $$0, bue $$1) {
      cvp $$2 = $$1 == bue.b ? $$0.ar : $$0.at;
      return $$2.a(cvt.vU) && $$0.a && $$0.ap == $$1 ? fxx.a.e : fxx.a.a;
   }

   @Override
   public void a(gwa $$0) {
      super.a($$0);
      if (this.a($$0, bue.a) == fxx.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bue.b) == fxx.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azd.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azd.a(0.1F * $$0.p);
         this.s.e = azd.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azd.a(0.1F * $$0.p);
         this.r.g = azd.j($$1, this.r.g, -0.15F);
         this.s.g = azd.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azd.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azd.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
