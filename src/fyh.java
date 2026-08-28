public class fyh extends ftw {
   private static final xv a = xv.c("gui.abuseReport.title");
   private static final xv b = xv.c("gui.abuseReport.message");
   private static final xv c = xv.c("gui.abuseReport.type.chat");
   private static final xv d = xv.c("gui.abuseReport.type.skin");
   private static final xv s = xv.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final ftw v;
   private final ggr w;
   private final fyl x;
   private final frw y = frw.d().a(6);

   public fyh(ftw $$0, ggr $$1, fyl $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xv i() {
      return xu.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      this.y.c().b();
      this.y.a(new fpl(this.l, this.p), this.y.b().e(6));
      this.y.a(new foy(b, this.p).b(true), this.y.b().e(6));
      fod $$0 = this.y.a(fod.a(c, $$0x -> this.m.a(new fyd(this.v, this.w, this.x.g()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fpp.a(xv.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fpp.a(xv.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fod.a(d, $$0x -> this.m.a(new fyj(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fod.a(s, $$0x -> this.m.a(new fyg(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(frx.b(20));
      this.y.a(fod.a(xu.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         fob var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      frq.a(this.y, this.H());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
