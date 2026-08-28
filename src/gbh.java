public class gbh extends gee<hak> {
   public gbh(geo $$0) {
      super($$0);
   }

   public static geu a(ges $$0) {
      gew $$1 = gbz.a($$0, 0.0F);
      gey $$2 = $$1.a();
      $$2.a("left_arm", get.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geq.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", get.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geq.a(1.9F, 12.0F, 0.0F));
      return geu.a($$1, 64, 64);
   }

   protected gbz.a a(hak $$0, bwa $$1) {
      cxp $$2 = $$1 == bwa.b ? $$0.ar : $$0.at;
      return $$2.a(cxt.wI) && $$0.a && $$0.ap == $$1 ? gbz.a.e : gbz.a.a;
   }

   @Override
   public void a(hak $$0) {
      super.a($$0);
      if (this.a($$0, bwa.a) == gbz.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bwa.b) == gbz.a.e) {
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
