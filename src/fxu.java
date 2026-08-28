public class fxu extends fyn {
   private static final wy a = wy.c("gui.toMenu");
   private static final wy b = wy.c("gui.toTitle");
   private static final wy c = wy.c("gui.report_to_server");
   private static final wy d = wy.c("gui.open_report_dir");
   private final fyn s;
   private final vt u;
   private final wy v;
   private final fwn w = fwn.d();

   public fxu(fyn $$0, wy $$1, wy $$2) {
      this($$0, $$1, new vt($$2));
   }

   public fxu(fyn $$0, wy $$1, wy $$2, wy $$3) {
      this($$0, $$1, new vt($$2), $$3);
   }

   public fxu(fyn $$0, wy $$1, vt $$2) {
      this($$0, $$1, $$2, a);
   }

   public fxu(fyn $$0, wy $$1, vt $$2, wy $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aO_() {
      this.w.c().b().a(10);
      this.w.a(new fuc(this.l, this.p));
      this.w.a(new ftp(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fsv.a(c, fxk.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fsv.a(d, $$1x -> ag.n().a($$0.getParent())).a(200).a()));
      fsv $$0;
      if (this.m.F()) {
         $$0 = fsv.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fsv.a(b, $$0x -> this.m.a(new fyp())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fwh.a(this.w, this.J());
   }

   @Override
   public wy i() {
      return wx.a(this.l, this.u.a());
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
