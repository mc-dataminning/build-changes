public class fvc extends fqs {
   private static final xh a = xh.c("gui.abuseReport.title");
   private static final xh b = xh.c("gui.abuseReport.message");
   private static final xh c = xh.c("gui.abuseReport.type.chat");
   private static final xh d = xh.c("gui.abuseReport.type.skin");
   private static final xh s = xh.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fqs v;
   private final gdf w;
   private final fvg x;
   private final fos y = fos.d().a(6);

   public fvc(fqs $$0, gdf $$1, fvg $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xh i() {
      return xg.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      this.y.c().b();
      this.y.a(new fmg(this.l, this.p), this.y.b().e(6));
      this.y.a(new flt(b, this.p).b(true), this.y.b().e(6));
      fkz $$0 = this.y.a(fkz.a(c, $$0x -> this.m.a(new fuy(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fmk.a(xh.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fmk.a(xh.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fkz.a(d, $$0x -> this.m.a(new fve(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fkz.a(s, $$0x -> this.m.a(new fvb(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fot.b(20));
      this.y.a(fkz.a(xg.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fol.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
