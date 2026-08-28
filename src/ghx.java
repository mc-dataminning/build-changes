public class ghx extends gkw<hhh> {
   public ghx(glg $$0) {
      super($$0);
   }

   public static glm a(glk $$0) {
      glo $$1 = giq.a($$0, 0.0F);
      glq $$2 = $$1.a();
      $$2.a("left_arm", gll.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gli.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gll.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gli.a(1.9F, 12.0F, 0.0F));
      return glm.a($$1, 64, 64);
   }

   @Override
   public void a(hhh $$0) {
      super.a($$0);
      if ($$0.h == giq.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == giq.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.G;
      if ($$1 > 0.0F) {
         this.r.e = azq.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azq.a(0.1F * $$0.u);
         this.s.e = azq.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azq.a(0.1F * $$0.u);
         this.r.g = azq.j($$1, this.r.g, -0.15F);
         this.s.g = azq.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azq.a(0.1F * $$0.u);
         this.t.e = this.t.e + $$1 * 0.55F * azq.a(0.1F * $$0.u);
         this.o.e = 0.0F;
      }
   }
}
