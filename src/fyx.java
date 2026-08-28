public class fyx extends fzq {
   private static final xg a = xg.c("gui.toMenu");
   private static final xg b = xg.c("gui.toTitle");
   private static final xg c = xg.c("gui.report_to_server");
   private static final xg d = xg.c("gui.open_report_dir");
   private final fzq s;
   private final vx u;
   private final xg v;
   private final fxq w = fxq.d();

   public fyx(fzq $$0, xg $$1, xg $$2) {
      this($$0, $$1, new vx($$2));
   }

   public fyx(fzq $$0, xg $$1, xg $$2, xg $$3) {
      this($$0, $$1, new vx($$2), $$3);
   }

   public fyx(fzq $$0, xg $$1, vx $$2) {
      this($$0, $$1, $$2, a);
   }

   public fyx(fzq $$0, xg $$1, vx $$2, xg $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new fvf(this.l, this.p));
      this.w.a(new fus(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fty.a(c, fyn.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fty.a(d, $$1x -> ag.n().a($$0.getParent())).a(200).a()));
      fty $$0;
      if (this.m.F()) {
         $$0 = fty.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fty.a(b, $$0x -> this.m.a(new fzs())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fxk.a(this.w, this.J());
   }

   @Override
   public xg i() {
      return xf.a(this.l, this.u.a());
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
