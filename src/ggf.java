public class ggf extends gje<hfp> {
   public ggf(gjo $$0) {
      super($$0);
   }

   public static gju a(gjs $$0) {
      gjw $$1 = ggy.a($$0, 0.0F);
      gjy $$2 = $$1.a();
      $$2.a("left_arm", gjt.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gjq.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gjt.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gjq.a(1.9F, 12.0F, 0.0F));
      return gju.a($$1, 64, 64);
   }

   @Override
   public void a(hfp $$0) {
      super.a($$0);
      if ($$0.h == ggy.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == ggy.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.G;
      if ($$1 > 0.0F) {
         this.r.e = azm.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azm.a(0.1F * $$0.u);
         this.s.e = azm.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azm.a(0.1F * $$0.u);
         this.r.g = azm.j($$1, this.r.g, -0.15F);
         this.s.g = azm.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azm.a(0.1F * $$0.u);
         this.t.e = this.t.e + $$1 * 0.55F * azm.a(0.1F * $$0.u);
         this.o.e = 0.0F;
      }
   }
}
