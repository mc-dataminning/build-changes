public class gbf extends gat {
   private final dyp u;
   private fuu<dyp.a> v;
   private fuu<Boolean> w;
   private fuu<Boolean> x;
   private dyp.a y = dyp.a.c;
   private boolean z;
   private boolean A;

   public gbf(dyp $$0) {
      this.u = $$0;
   }

   @Override
   diy m() {
      return this.u.a();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = this.c(fuu.<dyp.a>a($$0 -> {
         return switch ($$0) {
            case a -> xc.c("advMode.mode.sequence");
            case b -> xc.c("advMode.mode.auto");
            case c -> xc.c("advMode.mode.redstone");
         };
      }).a(dyp.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xc.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fuu.a(xc.c("advMode.mode.conditional"), xc.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xc.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fuu.a(xc.c("advMode.mode.autoexec.bat"), xc.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xc.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      diy $$0 = this.u.a();
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
   public void a(frf $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(diy $$0) {
      this.m.L().b(new ail(iw.a((jq)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
