public class fzt extends fvi {
   private static final wp a = wp.c("gui.abuseReport.title");
   private static final wp b = wp.c("gui.abuseReport.message");
   private static final wp c = wp.c("gui.abuseReport.type.chat");
   private static final wp d = wp.c("gui.abuseReport.type.skin");
   private static final wp s = wp.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fvi v;
   private final gih w;
   private final fzx x;
   private final fti y = fti.d().a(6);

   public fzt(fvi $$0, gih $$1, fzx $$2) {
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
      this.y.a(new fqx(this.l, this.p), this.y.b().e(6));
      this.y.a(new fqk(b, this.p).b(true), this.y.b().e(6));
      fpq $$0 = this.y.a(fpq.a(c, $$0x -> this.m.a(new fzp(this.v, this.w, this.x.g()))).a());
      if (!this.x.l()) {
         $$0.j = false;
         $$0.a(frb.a(wp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.k()) {
         $$0.j = false;
         $$0.a(frb.a(wp.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fpq.a(d, $$0x -> this.m.a(new fzv(this.v, this.w, this.x.g(), this.x.h()))).a());
      this.y.a(fpq.a(s, $$0x -> this.m.a(new fzs(this.v, this.w, this.x.g(), this.x.c()))).a());
      this.y.a(ftj.b(20));
      this.y.a(fpq.a(wo.e, $$0x -> this.aO_()).a());
      this.y.a($$1 -> {
         fpo var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      ftc.a(this.y, this.J());
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
