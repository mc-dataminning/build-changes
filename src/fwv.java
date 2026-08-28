public class fwv extends fzr<gvj> {
   public fwv(gab $$0) {
      super($$0);
   }

   public static gah a(gaf $$0) {
      gaj $$1 = fxn.a($$0, 0.0F);
      gal $$2 = $$1.a();
      $$2.a("left_arm", gag.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gad.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gag.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gad.a(1.9F, 12.0F, 0.0F));
      return gah.a($$1, 64, 64);
   }

   protected fxn.a a(gvj $$0, btz $$1) {
      cvl $$2 = $$1 == btz.b ? $$0.ar : $$0.at;
      return $$2.a(cvo.vU) && $$0.a && $$0.ap == $$1 ? fxn.a.e : fxn.a.a;
   }

   @Override
   public void a(gvj $$0) {
      super.a($$0);
      if (this.a($$0, btz.a) == fxn.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, btz.b) == fxn.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azc.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azc.a(0.1F * $$0.p);
         this.s.e = azc.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azc.a(0.1F * $$0.p);
         this.r.g = azc.j($$1, this.r.g, -0.15F);
         this.s.g = azc.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azc.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azc.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
