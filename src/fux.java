import javax.annotation.Nullable;

public class fux extends fqd {
   private static final xd a = xd.c("telemetry_info.screen.title");
   private static final xd b = xd.c("telemetry_info.screen.description").b(-4539718);
   private static final xd c = xd.c("telemetry_info.button.privacy_statement");
   private static final xd d = xd.c("telemetry_info.button.give_feedback");
   private static final xd s = xd.c("telemetry_info.button.show_data");
   private static final xd u = xd.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fil.Q().D();
   private final fqd x;
   private final fip y;
   private final fny z = new fny(this, 16 + 9 * 5 + 20, w ? 33 + fkm.a(fil.Q().h) : 33);
   @Nullable
   private fuw A;
   @Nullable
   private fle B;
   private double C;

   public fux(fqd $$0, fip $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      foc $$0 = this.z.a(foc.d().a(4));
      $$0.c().b();
      $$0.a(new flr(a, this.p));
      this.B = $$0.a(new fle(b, this.p).b(true));
      foc $$1 = $$0.a(foc.e().a(8));
      $$1.a(fkk.a(c, this::a).a());
      $$1.a(fkk.a(d, this::b).a());
      foc $$2 = this.z.b(foc.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      foc $$3 = $$2.a(foc.e().a(8));
      $$3.a(fkk.a(s, this::c).a());
      $$3.a(fkk.a(xc.d, $$0x -> this.d()).a());
      foc $$4 = this.z.c(foc.d().a(8));
      this.A = $$4.a(new fuw(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fki var10000 = this.c($$1x);
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

   private fki m() {
      fio<Boolean> $$0 = this.y.ak();
      return fkm.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fki $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fkk $$0) {
      fpa.a(this, axz.c);
   }

   private void b(fkk $$0) {
      fpa.a(this, axz.i);
   }

   private void c(fkk $$0) {
      ad.m().a(this.m.u().b());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }
}
