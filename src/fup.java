public class fup extends fvi {
   private static final wp a = wp.c("gui.toMenu");
   private static final wp b = wp.c("gui.toTitle");
   private static final wp c = wp.c("gui.report_to_server");
   private static final wp d = wp.c("gui.open_report_dir");
   private final fvi s;
   private final vk u;
   private final wp v;
   private final fti w = fti.d();

   public fup(fvi $$0, wp $$1, wp $$2) {
      this($$0, $$1, new vk($$2));
   }

   public fup(fvi $$0, wp $$1, wp $$2, wp $$3) {
      this($$0, $$1, new vk($$2), $$3);
   }

   public fup(fvi $$0, wp $$1, vk $$2) {
      this($$0, $$1, $$2, a);
   }

   public fup(fvi $$0, wp $$1, vk $$2, wp $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aR_() {
      this.w.c().b().a(10);
      this.w.a(new fqx(this.l, this.p));
      this.w.a(new fqk(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fpq.a(c, fuf.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fpq.a(d, $$1x -> af.n().a($$0.getParent())).a(200).a()));
      fpq $$0;
      if (this.m.F()) {
         $$0 = fpq.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fpq.a(b, $$0x -> this.m.a(new fvk())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      ftc.a(this.w, this.J());
   }

   @Override
   public wp i() {
      return wo.a(this.l, this.u.a());
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
