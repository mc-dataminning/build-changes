import javax.annotation.Nullable;

public class fun extends fpt {
   private static final xd a = xd.c("telemetry_info.screen.title");
   private static final xd b = xd.c("telemetry_info.screen.description").b(-4539718);
   private static final xd c = xd.c("telemetry_info.button.privacy_statement");
   private static final xd d = xd.c("telemetry_info.button.give_feedback");
   private static final xd s = xd.c("telemetry_info.button.show_data");
   private static final xd u = xd.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fib.Q().D();
   private final fpt x;
   private final fif y;
   private final fno z = new fno(this, 16 + 9 * 5 + 20, w ? 33 + fkc.a(fib.Q().h) : 33);
   @Nullable
   private fum A;
   @Nullable
   private fku B;
   private double C;

   public fun(fpt $$0, fif $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      fns $$0 = this.z.a(fns.d().a(4));
      $$0.c().b();
      $$0.a(new flh(a, this.p));
      this.B = $$0.a(new fku(b, this.p).b(true));
      fns $$1 = $$0.a(fns.e().a(8));
      $$1.a(fka.a(c, this::a).a());
      $$1.a(fka.a(d, this::b).a());
      fns $$2 = this.z.b(fns.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fns $$3 = $$2.a(fns.e().a(8));
      $$3.a(fka.a(s, this::c).a());
      $$3.a(fka.a(xc.d, $$0x -> this.d()).a());
      fns $$4 = this.z.c(fns.d().a(8));
      this.A = $$4.a(new fum(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fjy var10000 = this.c($$1x);
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
   protected void aI_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fjy m() {
      fie<Boolean> $$0 = this.y.ak();
      return fkc.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fjy $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fka $$0) {
      fop.a(this, axy.c);
   }

   private void b(fka $$0) {
      fop.a(this, axy.i);
   }

   private void c(fka $$0) {
      ad.m().a(this.m.u().b());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }
}
