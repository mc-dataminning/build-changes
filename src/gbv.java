public class gbv extends fxi {
   private static final ww a = ww.c("gui.abuseReport.title");
   private static final ww b = ww.c("gui.abuseReport.message");
   private static final ww c = ww.c("gui.abuseReport.type.chat");
   private static final ww d = ww.c("gui.abuseReport.type.skin");
   private static final ww s = ww.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fxi v;
   private final gkm w;
   private final gbz x;
   private final fvi y = fvi.d().a(6);

   public gbv(fxi $$0, gkm $$1, gbz $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public ww i() {
      return wv.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.y.c().b();
      this.y.a(new fsx(this.l, this.p), this.y.b().e(6));
      this.y.a(new fsk(b, this.p).b(true), this.y.b().e(6));
      frq $$0 = this.y.a(frq.a(c, $$0x -> this.m.a(new gbr(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(ftb.a(ww.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(ftb.a(ww.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(frq.a(d, $$0x -> this.m.a(new gbx(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(frq.a(s, $$0x -> this.m.a(new gbu(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fvj.b(20));
      this.y.a(frq.a(wv.e, $$0x -> this.aK_()).a());
      this.y.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fvc.a(this.y, this.J());
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
