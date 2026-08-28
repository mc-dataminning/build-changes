public class fwp extends fxi {
   private static final ww a = ww.c("gui.toMenu");
   private static final ww b = ww.c("gui.toTitle");
   private static final ww c = ww.c("gui.report_to_server");
   private static final ww d = ww.c("gui.open_report_dir");
   private final fxi s;
   private final vr u;
   private final ww v;
   private final fvi w = fvi.d();

   public fwp(fxi $$0, ww $$1, ww $$2) {
      this($$0, $$1, new vr($$2));
   }

   public fwp(fxi $$0, ww $$1, ww $$2, ww $$3) {
      this($$0, $$1, new vr($$2), $$3);
   }

   public fwp(fxi $$0, ww $$1, vr $$2) {
      this($$0, $$1, $$2, a);
   }

   public fwp(fxi $$0, ww $$1, vr $$2, ww $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aN_() {
      this.w.c().b().a(10);
      this.w.a(new fsx(this.l, this.p));
      this.w.a(new fsk(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(frq.a(c, fwf.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(frq.a(d, $$1x -> af.n().a($$0.getParent())).a(200).a()));
      frq $$0;
      if (this.m.F()) {
         $$0 = frq.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = frq.a(b, $$0x -> this.m.a(new fxk())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fvc.a(this.w, this.J());
   }

   @Override
   public ww i() {
      return wv.a(this.l, this.u.a());
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
