public class fzm extends gaf {
   private static final xc a = xc.c("gui.toMenu");
   private static final xc b = xc.c("gui.toTitle");
   private static final xc c = xc.c("gui.report_to_server");
   private static final xc d = xc.c("gui.open_report_dir");
   private final gaf s;
   private final vx u;
   private final xc v;
   private final fyf w = fyf.d();

   public fzm(gaf $$0, xc $$1, xc $$2) {
      this($$0, $$1, new vx($$2));
   }

   public fzm(gaf $$0, xc $$1, xc $$2, xc $$3) {
      this($$0, $$1, new vx($$2), $$3);
   }

   public fzm(gaf $$0, xc $$1, vx $$2) {
      this($$0, $$1, $$2, a);
   }

   public fzm(gaf $$0, xc $$1, vx $$2, xc $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aS_() {
      this.w.c().b().a(10);
      this.w.a(new fvu(this.l, this.p));
      this.w.a(new fvh(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fun.a(c, fzc.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fun.a(d, $$1x -> ag.n().a($$0.getParent())).a(200).a()));
      fun $$0;
      if (this.m.F()) {
         $$0 = fun.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fun.a(b, $$0x -> this.m.a(new gah())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fxz.a(this.w, this.J());
   }

   @Override
   public xc i() {
      return xb.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
