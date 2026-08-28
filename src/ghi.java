public class ghi extends gkh<hgv> {
   public ghi(gkr $$0) {
      super($$0);
   }

   public static gkx a(gkv $$0) {
      gkz $$1 = gib.a($$0, 0.0F);
      glb $$2 = $$1.a();
      $$2.a("left_arm", gkw.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gkw.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(1.9F, 12.0F, 0.0F));
      return gkx.a($$1, 64, 64);
   }

   @Override
   public void a(hgv $$0) {
      super.a($$0);
      if ($$0.h == gib.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == gib.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.J;
      if ($$1 > 0.0F) {
         this.r.e = azz.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azz.a(0.1F * $$0.v);
         this.s.e = azz.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azz.a(0.1F * $$0.v);
         this.r.g = azz.j($$1, this.r.g, -0.15F);
         this.s.g = azz.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azz.a(0.1F * $$0.v);
         this.t.e = this.t.e + $$1 * 0.55F * azz.a(0.1F * $$0.v);
         this.o.e = 0.0F;
      }
   }
}
