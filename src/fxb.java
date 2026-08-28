public class fxb extends fxu {
   private static final wy a = wy.c("gui.toMenu");
   private static final wy b = wy.c("gui.toTitle");
   private static final wy c = wy.c("gui.report_to_server");
   private static final wy d = wy.c("gui.open_report_dir");
   private final fxu s;
   private final vt u;
   private final wy v;
   private final fvu w = fvu.d();

   public fxb(fxu $$0, wy $$1, wy $$2) {
      this($$0, $$1, new vt($$2));
   }

   public fxb(fxu $$0, wy $$1, wy $$2, wy $$3) {
      this($$0, $$1, new vt($$2), $$3);
   }

   public fxb(fxu $$0, wy $$1, vt $$2) {
      this($$0, $$1, $$2, a);
   }

   public fxb(fxu $$0, wy $$1, vt $$2, wy $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aN_() {
      this.w.c().b().a(10);
      this.w.a(new ftj(this.l, this.p));
      this.w.a(new fsw(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fsc.a(c, fwr.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fsc.a(d, $$1x -> af.n().a($$0.getParent())).a(200).a()));
      fsc $$0;
      if (this.m.F()) {
         $$0 = fsc.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fsc.a(b, $$0x -> this.m.a(new fxw())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fvo.a(this.w, this.J());
   }

   @Override
   public wy i() {
      return wx.a(this.l, this.u.a());
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
