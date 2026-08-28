public class gaq extends gae {
   private final dyz u;
   private fuf<dyz.a> v;
   private fuf<Boolean> w;
   private fuf<Boolean> x;
   private dyz.a y = dyz.a.c;
   private boolean z;
   private boolean A;

   public gaq(dyz $$0) {
      this.u = $$0;
   }

   @Override
   dji m() {
      return this.u.a();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = this.c(fuf.<dyz.a>a($$0 -> {
         return switch ($$0) {
            case a -> xg.c("advMode.mode.sequence");
            case b -> xg.c("advMode.mode.auto");
            case c -> xg.c("advMode.mode.redstone");
         };
      }).a(dyz.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xg.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fuf.a(xg.c("advMode.mode.conditional"), xg.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xg.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fuf.a(xg.c("advMode.mode.autoexec.bat"), xg.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xg.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dji $$0 = this.u.a();
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
   public void a(fqq $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dji $$0) {
      this.m.L().b(new ais(iw.a((jq)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
