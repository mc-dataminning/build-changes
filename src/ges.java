public class ges extends gaf {
   private static final xc a = xc.c("gui.abuseReport.title");
   private static final xc b = xc.c("gui.abuseReport.message");
   private static final xc c = xc.c("gui.abuseReport.type.chat");
   private static final xc d = xc.c("gui.abuseReport.type.skin");
   private static final xc s = xc.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final gaf v;
   private final gnm w;
   private final gew x;
   private final fyf y = fyf.d().a(6);

   public ges(gaf $$0, gnm $$1, gew $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xc i() {
      return xb.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      this.y.c().b();
      this.y.a(new fvu(this.l, this.p), this.y.b().e(6));
      this.y.a(new fvh(b, this.p).b(true), this.y.b().e(6));
      fun $$0 = this.y.a(fun.a(c, $$0x -> this.m.a(new geo(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fvy.a(xc.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fvy.a(xc.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fun.a(d, $$0x -> this.m.a(new geu(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fun.a(s, $$0x -> this.m.a(new ger(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fyg.b(20));
      this.y.a(fun.a(xb.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         ful var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fxz.a(this.y, this.J());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
