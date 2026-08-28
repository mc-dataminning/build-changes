public class fvm extends fva {
   private final duk u;
   private fpb<duk.a> v;
   private fpb<Boolean> w;
   private fpb<Boolean> x;
   private duk.a y = duk.a.c;
   private boolean z;
   private boolean A;

   public fvm(duk $$0) {
      this.u = $$0;
   }

   @Override
   dfj m() {
      return this.u.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = this.c(fpb.<duk.a>a($$0 -> {
         return switch ($$0) {
            case a -> wp.c("advMode.mode.sequence");
            case b -> wp.c("advMode.mode.auto");
            case c -> wp.c("advMode.mode.redstone");
         };
      }).a(duk.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, wp.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fpb.a(wp.c("advMode.mode.conditional"), wp.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, wp.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fpb.a(wp.c("advMode.mode.autoexec.bat"), wp.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, wp.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dfj $$0 = this.u.b();
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
   public void a(flk $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dfj $$0) {
      this.m.L().b(new ahy(ji.a((kb)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
