public class gda extends fyn {
   private static final wy a = wy.c("gui.abuseReport.title");
   private static final wy b = wy.c("gui.abuseReport.message");
   private static final wy c = wy.c("gui.abuseReport.type.chat");
   private static final wy d = wy.c("gui.abuseReport.type.skin");
   private static final wy s = wy.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fyn v;
   private final glu w;
   private final gde x;
   private final fwn y = fwn.d().a(6);

   public gda(fyn $$0, glu $$1, gde $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      this.y.c().b();
      this.y.a(new fuc(this.l, this.p), this.y.b().e(6));
      this.y.a(new ftp(b, this.p).b(true), this.y.b().e(6));
      fsv $$0 = this.y.a(fsv.a(c, $$0x -> this.m.a(new gcw(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fug.a(wy.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fug.a(wy.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fsv.a(d, $$0x -> this.m.a(new gdc(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fsv.a(s, $$0x -> this.m.a(new gcz(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fwo.b(20));
      this.y.a(fsv.a(wx.e, $$0x -> this.aL_()).a());
      this.y.a($$1 -> {
         fst var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fwh.a(this.y, this.J());
   }

   @Override
   public void aL_() {
      this.m.a(this.v);
   }
}
