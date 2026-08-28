public class fxj extends gag<gwf> {
   public fxj(gaq $$0) {
      super($$0);
   }

   public static gaw a(gau $$0) {
      gay $$1 = fyb.a($$0, 0.0F);
      gba $$2 = $$1.a();
      $$2.a("left_arm", gav.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gas.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gav.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gas.a(1.9F, 12.0F, 0.0F));
      return gaw.a($$1, 64, 64);
   }

   protected fyb.a a(gwf $$0, buh $$1) {
      cvs $$2 = $$1 == buh.b ? $$0.ar : $$0.at;
      return $$2.a(cvw.vU) && $$0.a && $$0.ap == $$1 ? fyb.a.e : fyb.a.a;
   }

   @Override
   public void a(gwf $$0) {
      super.a($$0);
      if (this.a($$0, buh.a) == fyb.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, buh.b) == fyb.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azf.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azf.a(0.1F * $$0.p);
         this.s.e = azf.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azf.a(0.1F * $$0.p);
         this.r.g = azf.j($$1, this.r.g, -0.15F);
         this.s.g = azf.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azf.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azf.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
