public class gch extends fxu {
   private static final wy a = wy.c("gui.abuseReport.title");
   private static final wy b = wy.c("gui.abuseReport.message");
   private static final wy c = wy.c("gui.abuseReport.type.chat");
   private static final wy d = wy.c("gui.abuseReport.type.skin");
   private static final wy s = wy.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fxu v;
   private final gla w;
   private final gcl x;
   private final fvu y = fvu.d().a(6);

   public gch(fxu $$0, gla $$1, gcl $$2) {
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
   protected void aN_() {
      this.y.c().b();
      this.y.a(new ftj(this.l, this.p), this.y.b().e(6));
      this.y.a(new fsw(b, this.p).b(true), this.y.b().e(6));
      fsc $$0 = this.y.a(fsc.a(c, $$0x -> this.m.a(new gcd(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(ftn.a(wy.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(ftn.a(wy.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fsc.a(d, $$0x -> this.m.a(new gcj(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fsc.a(s, $$0x -> this.m.a(new gcg(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fvv.b(20));
      this.y.a(fsc.a(wx.e, $$0x -> this.aK_()).a());
      this.y.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fvo.a(this.y, this.J());
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
