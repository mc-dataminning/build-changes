import javax.annotation.Nullable;

public class gen extends fzq {
   private static final xg a = xg.c("telemetry_info.screen.title");
   private static final xg b = xg.c("telemetry_info.screen.description").b(-4539718);
   private static final xg c = xg.c("telemetry_info.button.privacy_statement");
   private static final xg d = xg.c("telemetry_info.button.give_feedback");
   private static final xg s = xg.c("telemetry_info.button.show_data");
   private static final xg u = xg.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fqq.Q().D();
   private final fzq x;
   private final fqu y;
   private final fxm z = new fxm(this, 16 + 9 * 5 + 20, w ? 33 + fua.a(fqq.Q().h) : 33);
   @Nullable
   private gem A;
   @Nullable
   private fus B;
   private double C;

   public gen(fzq $$0, fqu $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xg i() {
      return xf.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      fxq $$0 = this.z.a(fxq.d().a(4));
      $$0.c().b();
      $$0.a(new fvf(a, this.p));
      this.B = $$0.a(new fus(b, this.p).b(true));
      fxq $$1 = $$0.a(fxq.e().a(8));
      $$1.a(fty.a(c, this::a).a());
      $$1.a(fty.a(d, this::b).a());
      fxq $$2 = this.z.b(fxq.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fxq $$3 = $$2.a(fxq.e().a(8));
      $$3.a(fty.a(s, this::c).a());
      $$3.a(fty.a(xf.d, $$0x -> this.aQ_()).a());
      fxq $$4 = this.z.c(fxq.d().a(8));
      this.A = $$4.a(new gem(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.h(this.n - 40);
         this.A.i(this.z.d());
         this.A.q();
      }

      if (this.B != null) {
         this.B.d(this.n - 16);
      }

      this.z.a();
   }

   @Override
   protected void aH_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private ftw m() {
      fqt<Boolean> $$0 = this.y.al();
      return fua.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(ftw $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fty $$0) {
      fyn.a(this, ayt.c);
   }

   private void b(fty $$0) {
      fyn.a(this, ayt.i);
   }

   private void c(fty $$0) {
      ag.n().a(this.m.u().b());
   }

   @Override
   public void aQ_() {
      this.m.a(this.x);
   }
}
