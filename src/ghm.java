public class ghm<S extends hea> extends gge<S> {
   public ghm(giu $$0) {
      super($$0);
   }

   public static gja c() {
      gjc $$0 = gge.a(giy.a, 0.0F);
      gje $$1 = $$0.a();
      a($$1);
      return gja.a($$0, 64, 32);
   }

   protected static void a(gje $$0) {
      $$0.a("right_arm", giz.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), giw.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", giz.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), giw.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", giz.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), giw.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", giz.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), giw.a(2.0F, 12.0F, 0.0F));
   }

   public void a(S $$0) {
      super.a($$0);
      if ($$0.b && !$$0.d) {
         float $$1 = $$0.H;
         float $$2 = azm.a($$1 * (float) Math.PI);
         float $$3 = azm.a((1.0F - (1.0F - $$1) * (1.0F - $$1)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$2 * 0.6F);
         this.s.f = 0.1F - $$2 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$2 * 1.2F - $$3 * 0.4F;
         this.s.e -= $$2 * 1.2F - $$3 * 0.4F;
         gef.a(this.r, this.s, $$0.u);
      }
   }

   @Override
   public void a(bwv $$0, fjc $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bwv.b ? 1.0F : -1.0F;
      giu $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
