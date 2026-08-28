public class gba extends gdx<had> {
   public gba(geh $$0) {
      super($$0);
   }

   public static gen a(gel $$0) {
      gep $$1 = gbs.a($$0, 0.0F);
      ger $$2 = $$1.a();
      $$2.a("left_arm", gem.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gej.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gem.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gej.a(1.9F, 12.0F, 0.0F));
      return gen.a($$1, 64, 64);
   }

   protected gbs.a a(had $$0, bvv $$1) {
      cxk $$2 = $$1 == bvv.b ? $$0.ar : $$0.at;
      return $$2.a(cxo.wI) && $$0.a && $$0.ap == $$1 ? gbs.a.e : gbs.a.a;
   }

   @Override
   public void a(had $$0) {
      super.a($$0);
      if (this.a($$0, bvv.a) == gbs.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bvv.b) == gbs.a.e) {
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
