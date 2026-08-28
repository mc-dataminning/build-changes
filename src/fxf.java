public class fxf extends fwt {
   private final dvw u;
   private fqu<dvw.a> v;
   private fqu<Boolean> w;
   private fqu<Boolean> x;
   private dvw.a y = dvw.a.c;
   private boolean z;
   private boolean A;

   public fxf(dvw $$0) {
      this.u = $$0;
   }

   @Override
   dgq m() {
      return this.u.a();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = this.c(fqu.<dvw.a>a($$0 -> {
         return switch ($$0) {
            case a -> wv.c("advMode.mode.sequence");
            case b -> wv.c("advMode.mode.auto");
            case c -> wv.c("advMode.mode.redstone");
         };
      }).a(dvw.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, wv.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fqu.a(wv.c("advMode.mode.conditional"), wv.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, wv.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fqu.a(wv.c("advMode.mode.autoexec.bat"), wv.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, wv.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
      );
      this.f(false);
   }

   private void f(boolean $$0) {
      this.c.j = $$0;
      this.s.j = $$0;
      this.v.j = $$0;
      this.w.j = $$0;
      this.x.j = $$0;
   }

   public void G() {
      dgq $$0 = this.u.a();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.y = this.u.s();
      this.z = this.u.t();
      this.A = this.u.d();
      this.s.a($$1);
      this.v.a(this.y);
      this.w.a(this.z);
      this.x.a(this.A);
      this.c($$1);
      this.f(true);
   }

   @Override
   public void a(fnd $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dgq $$0) {
      this.m.L().b(new aie(jj.a((kc)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
