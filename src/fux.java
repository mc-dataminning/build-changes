public class fux extends ful {
   private final dvg u;
   private fol<dvg.a> v;
   private fol<Boolean> w;
   private fol<Boolean> x;
   private dvg.a y = dvg.a.c;
   private boolean z;
   private boolean A;

   public fux(dvg $$0) {
      this.u = $$0;
   }

   @Override
   dgh l() {
      return this.u.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = this.c(fol.<dvg.a>a($$0 -> {
         return switch ($$0) {
            case a -> xv.c("advMode.mode.sequence");
            case b -> xv.c("advMode.mode.auto");
            case c -> xv.c("advMode.mode.redstone");
         };
      }).a(dvg.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xv.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fol.a(xv.c("advMode.mode.conditional"), xv.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xv.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fol.a(xv.c("advMode.mode.autoexec.bat"), xv.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xv.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      dgh $$0 = this.u.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.y = this.u.t();
      this.z = this.u.u();
      this.A = this.u.d();
      this.s.a($$1);
      this.v.a(this.y);
      this.w.a(this.z);
      this.x.a(this.A);
      this.c($$1);
      this.f(true);
   }

   @Override
   public void a(fmf $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dgh $$0) {
      this.m.L().b(new ajc(jh.a((ka)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
