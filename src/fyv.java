public class fyv extends fuk {
   private static final wp a = wp.c("gui.abuseReport.title");
   private static final wp b = wp.c("gui.abuseReport.message");
   private static final wp c = wp.c("gui.abuseReport.type.chat");
   private static final wp d = wp.c("gui.abuseReport.type.skin");
   private static final wp s = wp.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fuk v;
   private final ghh w;
   private final fyz x;
   private final fsk y = fsk.d().a(6);

   public fyv(fuk $$0, ghh $$1, fyz $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public wp i() {
      return wo.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      this.y.c().b();
      this.y.a(new fpz(this.l, this.p), this.y.b().e(6));
      this.y.a(new fpm(b, this.p).b(true), this.y.b().e(6));
      fos $$0 = this.y.a(fos.a(c, $$0x -> this.m.a(new fyr(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fqd.a(wp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fqd.a(wp.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fos.a(d, $$0x -> this.m.a(new fyx(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fos.a(s, $$0x -> this.m.a(new fyu(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fsl.b(20));
      this.y.a(fos.a(wo.e, $$0x -> this.aO_()).a());
      this.y.a($$1 -> {
         fop var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fse.a(this.y, this.J());
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
