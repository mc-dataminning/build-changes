public class fzj<S extends gvl> extends fyb<S> {
   public fzj(gaq $$0) {
      super($$0);
   }

   public static gaw c() {
      gay $$0 = fyb.a(gau.a, 0.0F);
      gba $$1 = $$0.a();
      a($$1);
      return gaw.a($$0, 64, 32);
   }

   protected static void a(gba $$0) {
      $$0.a("right_arm", gav.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gas.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gav.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gas.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gav.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gas.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gav.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gas.a(2.0F, 12.0F, 0.0F));
   }

   protected fyb.a a(S $$0, buh $$1) {
      return $$0.aX_().a(cvw.ow) && $$0.b && $$0.ap == $$1 ? fyb.a.d : fyb.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cvs $$1 = $$0.aX_();
      if ($$0.b && !$$1.a(cvw.ow)) {
         float $$2 = $$0.C;
         float $$3 = azf.a($$2 * (float) Math.PI);
         float $$4 = azf.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fwj.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(buh $$0, fdi $$1) {
      this.e().a($$1);
      float $$2 = $$0 == buh.b ? 1.0F : -1.0F;
      gaq $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
