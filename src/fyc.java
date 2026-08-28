public class fyc extends ftr {
   private static final xk a = xk.c("gui.abuseReport.title");
   private static final xk b = xk.c("gui.abuseReport.message");
   private static final xk c = xk.c("gui.abuseReport.type.chat");
   private static final xk d = xk.c("gui.abuseReport.type.skin");
   private static final xk s = xk.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final ftr v;
   private final ggo w;
   private final fyg x;
   private final frr y = frr.d().a(6);

   public fyc(ftr $$0, ggo $$1, fyg $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xk i() {
      return xj.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      this.y.c().b();
      this.y.a(new fpg(this.l, this.p), this.y.b().e(6));
      this.y.a(new fot(b, this.p).b(true), this.y.b().e(6));
      fny $$0 = this.y.a(fny.a(c, $$0x -> this.m.a(new fxy(this.v, this.w, this.x.g()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fpk.a(xk.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fpk.a(xk.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fny.a(d, $$0x -> this.m.a(new fye(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fny.a(s, $$0x -> this.m.a(new fyb(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(frs.b(20));
      this.y.a(fny.a(xj.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      frl.a(this.y, this.H());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
