public class fyw extends ful {
   private static final wp a = wp.c("gui.abuseReport.title");
   private static final wp b = wp.c("gui.abuseReport.message");
   private static final wp c = wp.c("gui.abuseReport.type.chat");
   private static final wp d = wp.c("gui.abuseReport.type.skin");
   private static final wp s = wp.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final ful v;
   private final ghi w;
   private final fza x;
   private final fsl y = fsl.d().a(6);

   public fyw(ful $$0, ghi $$1, fza $$2) {
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
      this.y.a(new fqa(this.l, this.p), this.y.b().e(6));
      this.y.a(new fpn(b, this.p).b(true), this.y.b().e(6));
      fot $$0 = this.y.a(fot.a(c, $$0x -> this.m.a(new fys(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(fqe.a(wp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fqe.a(wp.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fot.a(d, $$0x -> this.m.a(new fyy(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fot.a(s, $$0x -> this.m.a(new fyv(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(fsm.b(20));
      this.y.a(fot.a(wo.e, $$0x -> this.aO_()).a());
      this.y.a($$1 -> {
         foq var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fsf.a(this.y, this.J());
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
