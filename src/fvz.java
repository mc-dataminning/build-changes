public class fvz extends frp {
   private static final xl a = xl.c("gui.abuseReport.title");
   private static final xl b = xl.c("gui.abuseReport.message");
   private static final xl c = xl.c("gui.abuseReport.type.chat");
   private static final xl d = xl.c("gui.abuseReport.type.skin");
   private static final xl s = xl.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final frp v;
   private final geg w;
   private final fwd x;
   private final fpp y = fpp.d().a(6);

   public fvz(frp $$0, geg $$1, fwd $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      this.y.c().b();
      this.y.a(new fnd(this.l, this.p), this.y.b().e(6));
      this.y.a(new fmq(b, this.p).b(true), this.y.b().e(6));
      flw $$0 = this.y.a(flw.a(c, $$0x -> this.m.a(new fvv(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fnh.a(xl.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fnh.a(xl.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(flw.a(d, $$0x -> this.m.a(new fwb(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(flw.a(s, $$0x -> this.m.a(new fvy(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fpq.b(20));
      this.y.a(flw.a(xk.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fpj.a(this.y, this.H());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
