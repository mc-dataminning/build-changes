public class fvk extends fra {
   private static final xi a = xi.c("gui.abuseReport.title");
   private static final xi b = xi.c("gui.abuseReport.message");
   private static final xi c = xi.c("gui.abuseReport.type.chat");
   private static final xi d = xi.c("gui.abuseReport.type.skin");
   private static final xi s = xi.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fra v;
   private final gdq w;
   private final fvo x;
   private final fpa y = fpa.d().a(6);

   public fvk(fra $$0, gdq $$1, fvo $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xi i() {
      return xh.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      this.y.c().b();
      this.y.a(new fmo(this.l, this.p), this.y.b().e(6));
      this.y.a(new fmb(b, this.p).b(true), this.y.b().e(6));
      flh $$0 = this.y.a(flh.a(c, $$0x -> this.m.a(new fvg(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fms.a(xi.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fms.a(xi.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(flh.a(d, $$0x -> this.m.a(new fvm(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(flh.a(s, $$0x -> this.m.a(new fvj(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fpb.b(20));
      this.y.a(flh.a(xh.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fou.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
