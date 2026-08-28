public class fzk extends gad {
   private static final xa a = xa.c("gui.toMenu");
   private static final xa b = xa.c("gui.toTitle");
   private static final xa c = xa.c("gui.report_to_server");
   private static final xa d = xa.c("gui.open_report_dir");
   private final gad s;
   private final vv u;
   private final xa v;
   private final fyd w = fyd.d();

   public fzk(gad $$0, xa $$1, xa $$2) {
      this($$0, $$1, new vv($$2));
   }

   public fzk(gad $$0, xa $$1, xa $$2, xa $$3) {
      this($$0, $$1, new vv($$2), $$3);
   }

   public fzk(gad $$0, xa $$1, vv $$2) {
      this($$0, $$1, $$2, a);
   }

   public fzk(gad $$0, xa $$1, vv $$2, xa $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aS_() {
      this.w.c().b().a(10);
      this.w.a(new fvs(this.l, this.p));
      this.w.a(new fvf(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(ful.a(c, fza.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(ful.a(d, $$1x -> ag.n().a($$0.getParent())).a(200).a()));
      ful $$0;
      if (this.m.F()) {
         $$0 = ful.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = ful.a(b, $$0x -> this.m.a(new gaf())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fxx.a(this.w, this.J());
   }

   @Override
   public xa i() {
      return wz.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
