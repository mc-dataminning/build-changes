public class gfl extends gik<hev> {
   public gfl(giu $$0) {
      super($$0);
   }

   public static gja a(giy $$0) {
      gjc $$1 = gge.a($$0, 0.0F);
      gje $$2 = $$1.a();
      $$2.a("left_arm", giz.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), giw.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", giz.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), giw.a(1.9F, 12.0F, 0.0F));
      return gja.a($$1, 64, 64);
   }

   @Override
   public void a(hev $$0) {
      super.a($$0);
      if ($$0.h == gge.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == gge.a.e) {
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
