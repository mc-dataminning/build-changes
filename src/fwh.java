public class fwh extends frw {
   private static final xj a = xj.c("gui.abuseReport.title");
   private static final xj b = xj.c("gui.abuseReport.message");
   private static final xj c = xj.c("gui.abuseReport.type.chat");
   private static final xj d = xj.c("gui.abuseReport.type.skin");
   private static final xj s = xj.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final frw v;
   private final gep w;
   private final fwl x;
   private final fpw y = fpw.d().a(6);

   public fwh(frw $$0, gep $$1, fwl $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xj i() {
      return xi.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      this.y.c().b();
      this.y.a(new fnk(this.l, this.p), this.y.b().e(6));
      this.y.a(new fmx(b, this.p).b(true), this.y.b().e(6));
      fmd $$0 = this.y.a(fmd.a(c, $$0x -> this.m.a(new fwd(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fno.a(xj.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fno.a(xj.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fmd.a(d, $$0x -> this.m.a(new fwj(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fmd.a(s, $$0x -> this.m.a(new fwg(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fpx.b(20));
      this.y.a(fmd.a(xi.e, $$0x -> this.aO_()).a());
      this.y.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fpq.a(this.y, this.H());
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
