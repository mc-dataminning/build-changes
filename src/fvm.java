import javax.annotation.Nullable;

public class fvm extends fqs {
   private static final xh a = xh.c("telemetry_info.screen.title");
   private static final xh b = xh.c("telemetry_info.screen.description").b(-4539718);
   private static final xh c = xh.c("telemetry_info.button.privacy_statement");
   private static final xh d = xh.c("telemetry_info.button.give_feedback");
   private static final xh s = xh.c("telemetry_info.button.show_data");
   private static final xh u = xh.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fja.Q().D();
   private final fqs x;
   private final fje y;
   private final fon z = new fon(this, 16 + 9 * 5 + 20, w ? 33 + flb.a(fja.Q().h) : 33);
   @Nullable
   private fvl A;
   @Nullable
   private flt B;
   private double C;

   public fvm(fqs $$0, fje $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xh i() {
      return xg.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      fos $$0 = this.z.a(fos.d().a(4));
      $$0.c().b();
      $$0.a(new fmg(a, this.p));
      this.B = $$0.a(new flt(b, this.p).b(true));
      fos $$1 = $$0.a(fos.e().a(8));
      $$1.a(fkz.a(c, this::a).a());
      $$1.a(fkz.a(d, this::b).a());
      fos $$2 = this.z.b(fos.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fos $$3 = $$2.a(fos.e().a(8));
      $$3.a(fkz.a(s, this::c).a());
      $$3.a(fkz.a(xg.d, $$0x -> this.d()).a());
      fos $$4 = this.z.c(fos.d().a(8));
      this.A = $$4.a(new fvl(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fkx var10000 = this.c($$1x);
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

   private fkx m() {
      fjd<Boolean> $$0 = this.y.ak();
      return flb.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fkx $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fkz $$0) {
      fpp.a(this, ayf.c);
   }

   private void b(fkz $$0) {
      fpp.a(this, ayf.i);
   }

   private void c(fkz $$0) {
      ad.m().a(this.m.u().b());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }
}
