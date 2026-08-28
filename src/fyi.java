public class fyi extends ftx {
   private static final xv a = xv.c("gui.abuseReport.title");
   private static final xv b = xv.c("gui.abuseReport.message");
   private static final xv c = xv.c("gui.abuseReport.type.chat");
   private static final xv d = xv.c("gui.abuseReport.type.skin");
   private static final xv s = xv.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final ftx v;
   private final ggs w;
   private final fym x;
   private final frx y = frx.d().a(6);

   public fyi(ftx $$0, ggs $$1, fym $$2) {
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
      this.y.a(new fpm(this.l, this.p), this.y.b().e(6));
      this.y.a(new foz(b, this.p).b(true), this.y.b().e(6));
      foe $$0 = this.y.a(foe.a(c, $$0x -> this.m.a(new fye(this.v, this.w, this.x.g()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fpq.a(xv.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fpq.a(xv.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(foe.a(d, $$0x -> this.m.a(new fyk(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(foe.a(s, $$0x -> this.m.a(new fyh(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fry.b(20));
      this.y.a(foe.a(xu.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         foc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      frr.a(this.y, this.H());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
