public class fyf extends gbc<gxc> {
   public fyf(gbm $$0) {
      super($$0);
   }

   public static gbs a(gbq $$0) {
      gbu $$1 = fyx.a($$0, 0.0F);
      gbw $$2 = $$1.a();
      $$2.a("left_arm", gbr.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbo.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gbr.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbo.a(1.9F, 12.0F, 0.0F));
      return gbs.a($$1, 64, 64);
   }

   protected fyx.a a(gxc $$0, buu $$1) {
      cwb $$2 = $$1 == buu.b ? $$0.ar : $$0.at;
      return $$2.a(cwf.vU) && $$0.a && $$0.ap == $$1 ? fyx.a.e : fyx.a.a;
   }

   @Override
   public void a(gxc $$0) {
      super.a($$0);
      if (this.a($$0, buu.a) == fyx.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, buu.b) == fyx.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azk.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azk.a(0.1F * $$0.p);
         this.s.e = azk.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azk.a(0.1F * $$0.p);
         this.r.g = azk.j($$1, this.r.g, -0.15F);
         this.s.g = azk.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azk.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azk.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
