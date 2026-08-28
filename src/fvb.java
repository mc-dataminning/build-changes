import javax.annotation.Nullable;

public class fvb extends fqh {
   private static final xe a = xe.c("telemetry_info.screen.title");
   private static final xe b = xe.c("telemetry_info.screen.description").b(-4539718);
   private static final xe c = xe.c("telemetry_info.button.privacy_statement");
   private static final xe d = xe.c("telemetry_info.button.give_feedback");
   private static final xe s = xe.c("telemetry_info.button.show_data");
   private static final xe u = xe.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fip.Q().D();
   private final fqh x;
   private final fit y;
   private final foc z = new foc(this, 16 + 9 * 5 + 20, w ? 33 + fkq.a(fip.Q().h) : 33);
   @Nullable
   private fva A;
   @Nullable
   private fli B;
   private double C;

   public fvb(fqh $$0, fit $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      fog $$0 = this.z.a(fog.d().a(4));
      $$0.c().b();
      $$0.a(new flv(a, this.p));
      this.B = $$0.a(new fli(b, this.p).b(true));
      fog $$1 = $$0.a(fog.e().a(8));
      $$1.a(fko.a(c, this::a).a());
      $$1.a(fko.a(d, this::b).a());
      fog $$2 = this.z.b(fog.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fog $$3 = $$2.a(fog.e().a(8));
      $$3.a(fko.a(s, this::c).a());
      $$3.a(fko.a(xd.d, $$0x -> this.d()).a());
      fog $$4 = this.z.c(fog.d().a(8));
      this.A = $$4.a(new fva(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fkm var10000 = this.c($$1x);
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
   protected void aH_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fkm m() {
      fis<Boolean> $$0 = this.y.ak();
      return fkq.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fkm $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fko $$0) {
      fpe.a(this, ayb.c);
   }

   private void b(fko $$0) {
      fpe.a(this, ayb.i);
   }

   private void c(fko $$0) {
      ad.m().a(this.m.u().b());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }
}
