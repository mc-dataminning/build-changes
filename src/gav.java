public class gav<S extends gwy> extends fzn<S> {
   public gav(gcc $$0) {
      super($$0);
   }

   public static gci c() {
      gck $$0 = fzn.a(gcg.a, 0.0F);
      gcm $$1 = $$0.a();
      a($$1);
      return gci.a($$0, 64, 32);
   }

   protected static void a(gcm $$0) {
      $$0.a("right_arm", gch.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gce.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gch.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gce.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gch.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gce.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gch.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gce.a(2.0F, 12.0F, 0.0F));
   }

   protected fzn.a a(S $$0, buy $$1) {
      return $$0.aX_().a(cwj.ow) && $$0.b && $$0.ap == $$1 ? fzn.a.d : fzn.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cwf $$1 = $$0.aX_();
      if ($$0.b && !$$1.a(cwj.ow)) {
         float $$2 = $$0.C;
         float $$3 = azn.a($$2 * (float) Math.PI);
         float $$4 = azn.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fxv.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(buy $$0, fek $$1) {
      this.e().a($$1);
      float $$2 = $$0 == buy.b ? 1.0F : -1.0F;
      gcc $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
