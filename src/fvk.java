public class fvk extends fuy {
   private final duj u;
   private foz<duj.a> v;
   private foz<Boolean> w;
   private foz<Boolean> x;
   private duj.a y = duj.a.c;
   private boolean z;
   private boolean A;

   public fvk(duj $$0) {
      this.u = $$0;
   }

   @Override
   dfi m() {
      return this.u.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = this.c(foz.<duj.a>a($$0 -> {
         return switch ($$0) {
            case a -> wo.c("advMode.mode.sequence");
            case b -> wo.c("advMode.mode.auto");
            case c -> wo.c("advMode.mode.redstone");
         };
      }).a(duj.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, wo.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         foz.a(wo.c("advMode.mode.conditional"), wo.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, wo.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         foz.a(wo.c("advMode.mode.autoexec.bat"), wo.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, wo.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dfi $$0 = this.u.b();
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
   public void a(flj $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dfi $$0) {
      this.m.L().b(new ahx(ji.a((kb)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
