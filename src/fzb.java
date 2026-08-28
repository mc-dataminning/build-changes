public class fzb extends fyp {
   private final dxq u;
   private fsq<dxq.a> v;
   private fsq<Boolean> w;
   private fsq<Boolean> x;
   private dxq.a y = dxq.a.c;
   private boolean z;
   private boolean A;

   public fzb(dxq $$0) {
      this.u = $$0;
   }

   @Override
   dib m() {
      return this.u.a();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.v = this.c(fsq.<dxq.a>a($$0 -> {
         return switch ($$0) {
            case a -> wy.c("advMode.mode.sequence");
            case b -> wy.c("advMode.mode.auto");
            case c -> wy.c("advMode.mode.redstone");
         };
      }).a(dxq.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, wy.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fsq.a(wy.c("advMode.mode.conditional"), wy.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, wy.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fsq.a(wy.c("advMode.mode.autoexec.bat"), wy.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, wy.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dib $$0 = this.u.a();
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
   public void a(foz $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dib $$0) {
      this.m.L().b(new aih(iu.a((jo)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
