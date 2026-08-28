public class geq extends gad {
   private static final xa a = xa.c("gui.abuseReport.title");
   private static final xa b = xa.c("gui.abuseReport.message");
   private static final xa c = xa.c("gui.abuseReport.type.chat");
   private static final xa d = xa.c("gui.abuseReport.type.skin");
   private static final xa s = xa.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final gad v;
   private final gnk w;
   private final geu x;
   private final fyd y = fyd.d().a(6);

   public geq(gad $$0, gnk $$1, geu $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xa i() {
      return wz.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      this.y.c().b();
      this.y.a(new fvs(this.l, this.p), this.y.b().e(6));
      this.y.a(new fvf(b, this.p).b(true), this.y.b().e(6));
      ful $$0 = this.y.a(ful.a(c, $$0x -> this.m.a(new gem(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fvw.a(xa.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fvw.a(xa.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(ful.a(d, $$0x -> this.m.a(new ges(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(ful.a(s, $$0x -> this.m.a(new gep(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fye.b(20));
      this.y.a(ful.a(wz.e, $$0x -> this.aP_()).a());
      this.y.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fxx.a(this.y, this.J());
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
