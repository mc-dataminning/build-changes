public class fur extends fqh {
   private static final xe a = xe.c("gui.abuseReport.title");
   private static final xe b = xe.c("gui.abuseReport.message");
   private static final xe c = xe.c("gui.abuseReport.type.chat");
   private static final xe d = xe.c("gui.abuseReport.type.skin");
   private static final xe s = xe.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fqh v;
   private final gcu w;
   private final fuv x;
   private final fog y = fog.d().a(6);

   public fur(fqh $$0, gcu $$1, fuv $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      this.y.c().b();
      this.y.a(new flv(this.l, this.p), this.y.b().e(6));
      this.y.a(new fli(b, this.p).b(true), this.y.b().e(6));
      fko $$0 = this.y.a(fko.a(c, $$0x -> this.m.a(new fun(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(flz.a(xe.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(flz.a(xe.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fko.a(d, $$0x -> this.m.a(new fut(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fko.a(s, $$0x -> this.m.a(new fuq(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(foh.b(20));
      this.y.a(fko.a(xd.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fkm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      foa.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
