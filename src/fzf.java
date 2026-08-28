public class fzf<S extends gvg> extends fxx<S> {
   public fzf(gal $$0) {
      super($$0);
   }

   public static gar d() {
      gat $$0 = fxx.a(gap.a, 0.0F);
      gav $$1 = $$0.a();
      a($$1);
      return gar.a($$0, 64, 32);
   }

   protected static void a(gav $$0) {
      $$0.a("right_arm", gaq.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gaq.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gaq.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gaq.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(2.0F, 12.0F, 0.0F));
   }

   protected fxx.a a(S $$0, bue $$1) {
      return $$0.aW_().a(cvt.ow) && $$0.b && $$0.ap == $$1 ? fxx.a.d : fxx.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cvp $$1 = $$0.aW_();
      if ($$0.b && !$$1.a(cvt.ow)) {
         float $$2 = $$0.C;
         float $$3 = azd.a($$2 * (float) Math.PI);
         float $$4 = azd.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fwf.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bue $$0, fde $$1) {
      this.a().a($$1);
      float $$2 = $$0 == bue.b ? 1.0F : -1.0F;
      gal $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
