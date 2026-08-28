public class gbf extends gec<hai> {
   public gbf(gem $$0) {
      super($$0);
   }

   public static ges a(geq $$0) {
      geu $$1 = gbx.a($$0, 0.0F);
      gew $$2 = $$1.a();
      $$2.a("left_arm", ger.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geo.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", ger.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geo.a(1.9F, 12.0F, 0.0F));
      return ges.a($$1, 64, 64);
   }

   protected gbx.a a(hai $$0, bvz $$1) {
      cxo $$2 = $$1 == bvz.b ? $$0.ar : $$0.at;
      return $$2.a(cxs.wI) && $$0.a && $$0.ap == $$1 ? gbx.a.e : gbx.a.a;
   }

   @Override
   public void a(hai $$0) {
      super.a($$0);
      if (this.a($$0, bvz.a) == gbx.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bvz.b) == gbx.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = bae.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * bae.a(0.1F * $$0.p);
         this.s.e = bae.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * bae.a(0.1F * $$0.p);
         this.r.g = bae.j($$1, this.r.g, -0.15F);
         this.s.g = bae.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * bae.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * bae.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
