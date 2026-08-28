public class gas extends fwf {
   private static final wv a = wv.c("gui.abuseReport.title");
   private static final wv b = wv.c("gui.abuseReport.message");
   private static final wv c = wv.c("gui.abuseReport.type.chat");
   private static final wv d = wv.c("gui.abuseReport.type.skin");
   private static final wv s = wv.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fwf v;
   private final gji w;
   private final gaw x;
   private final fuf y = fuf.d().a(6);

   public gas(fwf $$0, gji $$1, gaw $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public wv i() {
      return wu.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.y.c().b();
      this.y.a(new fru(this.l, this.p), this.y.b().e(6));
      this.y.a(new frh(b, this.p).b(true), this.y.b().e(6));
      fqn $$0 = this.y.a(fqn.a(c, $$0x -> this.m.a(new gao(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fry.a(wv.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fry.a(wv.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fqn.a(d, $$0x -> this.m.a(new gau(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fqn.a(s, $$0x -> this.m.a(new gar(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fug.b(20));
      this.y.a(fqn.a(wu.e, $$0x -> this.aK_()).a());
      this.y.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      ftz.a(this.y, this.J());
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
