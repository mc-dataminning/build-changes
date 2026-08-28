public class fxu extends gar<gwr> {
   public fxu(gbb $$0) {
      super($$0);
   }

   public static gbh a(gbf $$0) {
      gbj $$1 = fym.a($$0, 0.0F);
      gbl $$2 = $$1.a();
      $$2.a("left_arm", gbg.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbd.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gbg.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbd.a(1.9F, 12.0F, 0.0F));
      return gbh.a($$1, 64, 64);
   }

   protected fym.a a(gwr $$0, bup $$1) {
      cvx $$2 = $$1 == bup.b ? $$0.ar : $$0.at;
      return $$2.a(cwb.vU) && $$0.a && $$0.ap == $$1 ? fym.a.e : fym.a.a;
   }

   @Override
   public void a(gwr $$0) {
      super.a($$0);
      if (this.a($$0, bup.a) == fym.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bup.b) == fym.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azj.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azj.a(0.1F * $$0.p);
         this.s.e = azj.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azj.a(0.1F * $$0.p);
         this.r.g = azj.j($$1, this.r.g, -0.15F);
         this.s.g = azj.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azj.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azj.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
