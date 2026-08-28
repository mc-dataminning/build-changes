import javax.annotation.Nullable;

public class fvu extends fra {
   private static final xi a = xi.c("telemetry_info.screen.title");
   private static final xi b = xi.c("telemetry_info.screen.description").b(-4539718);
   private static final xi c = xi.c("telemetry_info.button.privacy_statement");
   private static final xi d = xi.c("telemetry_info.button.give_feedback");
   private static final xi s = xi.c("telemetry_info.button.show_data");
   private static final xi u = xi.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fji.Q().D();
   private final fra x;
   private final fjm y;
   private final fow z = new fow(this, 16 + 9 * 5 + 20, w ? 33 + flj.a(fji.Q().h) : 33);
   @Nullable
   private fvt A;
   @Nullable
   private fmb B;
   private double C;

   public fvu(fra $$0, fjm $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xi i() {
      return xh.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      fpa $$0 = this.z.a(fpa.d().a(4));
      $$0.c().b();
      $$0.a(new fmo(a, this.p));
      this.B = $$0.a(new fmb(b, this.p).b(true));
      fpa $$1 = $$0.a(fpa.e().a(8));
      $$1.a(flh.a(c, this::a).a());
      $$1.a(flh.a(d, this::b).a());
      fpa $$2 = this.z.b(fpa.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fpa $$3 = $$2.a(fpa.e().a(8));
      $$3.a(flh.a(s, this::c).a());
      $$3.a(flh.a(xh.d, $$0x -> this.d()).a());
      fpa $$4 = this.z.c(fpa.d().a(8));
      this.A = $$4.a(new fvt(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.k(this.n - 40);
         this.A.l(this.z.d());
         this.A.j();
      }

      if (this.B != null) {
         this.B.d(this.n - 16);
      }

      this.z.a();
   }

   @Override
   protected void aG_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private flf m() {
      fjl<Boolean> $$0 = this.y.ak();
      return flj.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(flf $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(flh $$0) {
      fpx.a(this, ayg.c);
   }

   private void b(flh $$0) {
      fpx.a(this, ayg.i);
   }

   private void c(flh $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }
}
