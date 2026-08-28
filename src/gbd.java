public class gbd extends gar {
   private final dyn u;
   private fus<dyn.a> v;
   private fus<Boolean> w;
   private fus<Boolean> x;
   private dyn.a y = dyn.a.c;
   private boolean z;
   private boolean A;

   public gbd(dyn $$0) {
      this.u = $$0;
   }

   @Override
   diw m() {
      return this.u.a();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = this.c(fus.<dyn.a>a($$0 -> {
         return switch ($$0) {
            case a -> xa.c("advMode.mode.sequence");
            case b -> xa.c("advMode.mode.auto");
            case c -> xa.c("advMode.mode.redstone");
         };
      }).a(dyn.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xa.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fus.a(xa.c("advMode.mode.conditional"), xa.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xa.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fus.a(xa.c("advMode.mode.autoexec.bat"), xa.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xa.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      diw $$0 = this.u.a();
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
   public void a(frd $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(diw $$0) {
      this.m.L().b(new aij(iv.a((jp)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
