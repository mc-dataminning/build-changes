import javax.annotation.Nullable;

public class fwj extends frp {
   private static final xl a = xl.c("telemetry_info.screen.title");
   private static final xl b = xl.c("telemetry_info.screen.description").b(-4539718);
   private static final xl c = xl.c("telemetry_info.button.privacy_statement");
   private static final xl d = xl.c("telemetry_info.button.give_feedback");
   private static final xl s = xl.c("telemetry_info.button.show_data");
   private static final xl u = xl.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fjx.Q().D();
   private final frp x;
   private final fkb y;
   private final fpl z = new fpl(this, 16 + 9 * 5 + 20, w ? 33 + fly.a(fjx.Q().h) : 33);
   @Nullable
   private fwi A;
   @Nullable
   private fmq B;
   private double C;

   public fwj(frp $$0, fkb $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      fpp $$0 = this.z.a(fpp.d().a(4));
      $$0.c().b();
      $$0.a(new fnd(a, this.p));
      this.B = $$0.a(new fmq(b, this.p).b(true));
      fpp $$1 = $$0.a(fpp.e().a(8));
      $$1.a(flw.a(c, this::a).a());
      $$1.a(flw.a(d, this::b).a());
      fpp $$2 = this.z.b(fpp.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fpp $$3 = $$2.a(fpp.e().a(8));
      $$3.a(flw.a(s, this::c).a());
      $$3.a(flw.a(xk.d, $$0x -> this.aP_()).a());
      fpp $$4 = this.z.c(fpp.d().a(8));
      this.A = $$4.a(new fwi(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         flu var10000 = this.c($$1x);
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

   private flu m() {
      fka<Boolean> $$0 = this.y.ak();
      return fly.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(flu $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(flw $$0) {
      fqm.a(this, ayj.c);
   }

   private void b(flw $$0) {
      fqm.a(this, ayj.i);
   }

   private void c(flw $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
