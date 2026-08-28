public class fyt extends fui {
   private static final wo a = wo.c("gui.abuseReport.title");
   private static final wo b = wo.c("gui.abuseReport.message");
   private static final wo c = wo.c("gui.abuseReport.type.chat");
   private static final wo d = wo.c("gui.abuseReport.type.skin");
   private static final wo s = wo.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fui v;
   private final ghf w;
   private final fyx x;
   private final fsi y = fsi.d().a(6);

   public fyt(fui $$0, ghf $$1, fyx $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public wo i() {
      return wn.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      this.y.c().b();
      this.y.a(new fpx(this.l, this.p), this.y.b().e(6));
      this.y.a(new fpk(b, this.p).b(true), this.y.b().e(6));
      fop $$0 = this.y.a(fop.a(c, $$0x -> this.m.a(new fyp(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fqb.a(wo.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fqb.a(wo.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fop.a(d, $$0x -> this.m.a(new fyv(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fop.a(s, $$0x -> this.m.a(new fys(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fsj.b(20));
      this.y.a(fop.a(wn.e, $$0x -> this.aO_()).a());
      this.y.a($$1 -> {
         fon var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fsc.a(this.y, this.J());
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
