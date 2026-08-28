public class fvm extends fwf {
   private static final wv a = wv.c("gui.toMenu");
   private static final wv b = wv.c("gui.toTitle");
   private static final wv c = wv.c("gui.report_to_server");
   private static final wv d = wv.c("gui.open_report_dir");
   private final fwf s;
   private final vq u;
   private final wv v;
   private final fuf w = fuf.d();

   public fvm(fwf $$0, wv $$1, wv $$2) {
      this($$0, $$1, new vq($$2));
   }

   public fvm(fwf $$0, wv $$1, wv $$2, wv $$3) {
      this($$0, $$1, new vq($$2), $$3);
   }

   public fvm(fwf $$0, wv $$1, vq $$2) {
      this($$0, $$1, $$2, a);
   }

   public fvm(fwf $$0, wv $$1, vq $$2, wv $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aN_() {
      this.w.c().b().a(10);
      this.w.a(new fru(this.l, this.p));
      this.w.a(new frh(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fqn.a(c, fvc.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fqn.a(d, $$1x -> af.n().a($$0.getParent())).a(200).a()));
      fqn $$0;
      if (this.m.F()) {
         $$0 = fqn.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fqn.a(b, $$0x -> this.m.a(new fwh())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      ftz.a(this.w, this.J());
   }

   @Override
   public wv i() {
      return wu.a(this.l, this.u.a());
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
