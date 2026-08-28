public class fur extends fuf {
   private final dva u;
   private fof<dva.a> v;
   private fof<Boolean> w;
   private fof<Boolean> x;
   private dva.a y = dva.a.c;
   private boolean z;
   private boolean A;

   public fur(dva $$0) {
      this.u = $$0;
   }

   @Override
   dfz l() {
      return this.u.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = this.c(fof.<dva.a>a($$0 -> {
         return switch ($$0) {
            case a -> xk.c("advMode.mode.sequence");
            case b -> xk.c("advMode.mode.auto");
            case c -> xk.c("advMode.mode.redstone");
         };
      }).a(dva.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xk.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fof.a(xk.c("advMode.mode.conditional"), xk.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xk.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fof.a(xk.c("advMode.mode.autoexec.bat"), xk.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xk.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dfz $$0 = this.u.b();
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
   public void a(flz $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dfz $$0) {
      this.m.L().b(new ais(jh.a((ka)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
