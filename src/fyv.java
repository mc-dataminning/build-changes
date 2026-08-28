public class fyv<S extends gup> extends fxn<S> {
   public fyv(gab $$0) {
      super($$0);
   }

   public static gah d() {
      gaj $$0 = fxn.a(gaf.a, 0.0F);
      gal $$1 = $$0.a();
      a($$1);
      return gah.a($$0, 64, 32);
   }

   protected static void a(gal $$0) {
      $$0.a("right_arm", gag.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gad.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gag.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gad.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gag.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gad.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gag.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gad.a(2.0F, 12.0F, 0.0F));
   }

   protected fxn.a a(S $$0, btz $$1) {
      return $$0.aY_().a(cvo.ow) && $$0.b && $$0.ap == $$1 ? fxn.a.d : fxn.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cvl $$1 = $$0.aY_();
      if ($$0.b && !$$1.a(cvo.ow)) {
         float $$2 = $$0.C;
         float $$3 = azc.a($$2 * (float) Math.PI);
         float $$4 = azc.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fvv.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(btz $$0, fcu $$1) {
      this.a().a($$1);
      float $$2 = $$0 == btz.b ? 1.0F : -1.0F;
      gab $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
