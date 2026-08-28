public class ged extends fzq {
   private static final xg a = xg.c("gui.abuseReport.title");
   private static final xg b = xg.c("gui.abuseReport.message");
   private static final xg c = xg.c("gui.abuseReport.type.chat");
   private static final xg d = xg.c("gui.abuseReport.type.skin");
   private static final xg s = xg.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fzq v;
   private final gmx w;
   private final geh x;
   private final fxq y = fxq.d().a(6);

   public ged(fzq $$0, gmx $$1, geh $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xg i() {
      return xf.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      this.y.c().b();
      this.y.a(new fvf(this.l, this.p), this.y.b().e(6));
      this.y.a(new fus(b, this.p).b(true), this.y.b().e(6));
      fty $$0 = this.y.a(fty.a(c, $$0x -> this.m.a(new gdz(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fvj.a(xg.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fvj.a(xg.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fty.a(d, $$0x -> this.m.a(new gef(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fty.a(s, $$0x -> this.m.a(new gec(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fxr.b(20));
      this.y.a(fty.a(xf.e, $$0x -> this.aL_()).a());
      this.y.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fxk.a(this.y, this.J());
   }

   @Override
   public void aL_() {
      this.m.a(this.v);
   }
}
