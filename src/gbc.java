public class gbc extends gdz<haf> {
   public gbc(gej $$0) {
      super($$0);
   }

   public static gep a(gen $$0) {
      ger $$1 = gbu.a($$0, 0.0F);
      get $$2 = $$1.a();
      $$2.a("left_arm", geo.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", geo.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(1.9F, 12.0F, 0.0F));
      return gep.a($$1, 64, 64);
   }

   protected gbu.a a(haf $$0, bvr $$1) {
      cxg $$2 = $$1 == bvr.b ? $$0.ar : $$0.at;
      return $$2.a(cxk.wS) && $$0.a && $$0.ap == $$1 ? gbu.a.e : gbu.a.a;
   }

   @Override
   public void a(haf $$0) {
      super.a($$0);
      if (this.a($$0, bvr.a) == gbu.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bvr.b) == gbu.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azu.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azu.a(0.1F * $$0.p);
         this.s.e = azu.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azu.a(0.1F * $$0.p);
         this.r.g = azu.j($$1, this.r.g, -0.15F);
         this.s.g = azu.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azu.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azu.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
