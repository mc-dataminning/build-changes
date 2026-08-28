public class fun extends fqd {
   private static final xd a = xd.c("gui.abuseReport.title");
   private static final xd b = xd.c("gui.abuseReport.message");
   private static final xd c = xd.c("gui.abuseReport.type.chat");
   private static final xd d = xd.c("gui.abuseReport.type.skin");
   private static final xd s = xd.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fqd v;
   private final gcp w;
   private final fur x;
   private final foc y = foc.d().a(6);

   public fun(fqd $$0, gcp $$1, fur $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      this.y.c().b();
      this.y.a(new flr(this.l, this.p), this.y.b().e(6));
      this.y.a(new fle(b, this.p).b(true), this.y.b().e(6));
      fkk $$0 = this.y.a(fkk.a(c, $$0x -> this.m.a(new fuj(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(flv.a(xd.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(flv.a(xd.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fkk.a(d, $$0x -> this.m.a(new fup(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fkk.a(s, $$0x -> this.m.a(new fum(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fod.b(20));
      this.y.a(fkk.a(xc.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fki var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fnw.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
