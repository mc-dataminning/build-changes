public class gdf extends fys {
   private static final wy a = wy.c("gui.abuseReport.title");
   private static final wy b = wy.c("gui.abuseReport.message");
   private static final wy c = wy.c("gui.abuseReport.type.chat");
   private static final wy d = wy.c("gui.abuseReport.type.skin");
   private static final wy s = wy.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fys v;
   private final glz w;
   private final gdj x;
   private final fws y = fws.d().a(6);

   public gdf(fys $$0, glz $$1, gdj $$2) {
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
      this.y.a(new fuh(this.l, this.p), this.y.b().e(6));
      this.y.a(new ftu(b, this.p).b(true), this.y.b().e(6));
      fta $$0 = this.y.a(fta.a(c, $$0x -> this.m.a(new gdb(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(ful.a(wy.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(ful.a(wy.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fta.a(d, $$0x -> this.m.a(new gdh(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fta.a(s, $$0x -> this.m.a(new gde(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fwt.b(20));
      this.y.a(fta.a(wx.e, $$0x -> this.aL_()).a());
      this.y.a($$1 -> {
         fsy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fwm.a(this.y, this.J());
   }

   @Override
   public void aL_() {
      this.m.a(this.v);
   }
}
