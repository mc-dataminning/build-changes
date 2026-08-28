import javax.annotation.Nullable;

public class fys extends ftx {
   private static final xv a = xv.c("telemetry_info.screen.title");
   private static final xv b = xv.c("telemetry_info.screen.description").b(-4539718);
   private static final xv c = xv.c("telemetry_info.button.privacy_statement");
   private static final xv d = xv.c("telemetry_info.button.give_feedback");
   private static final xv s = xv.c("telemetry_info.button.show_data");
   private static final xv u = xv.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fmf.Q().D();
   private final ftx x;
   private final fmj y;
   private final frt z = new frt(this, 16 + 9 * 5 + 20, w ? 33 + fog.a(fmf.Q().h) : 33);
   @Nullable
   private fyr A;
   @Nullable
   private foz B;
   private double C;

   public fys(ftx $$0, fmj $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xv i() {
      return xu.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      frx $$0 = this.z.a(frx.d().a(4));
      $$0.c().b();
      $$0.a(new fpm(a, this.p));
      this.B = $$0.a(new foz(b, this.p).b(true));
      frx $$1 = $$0.a(frx.e().a(8));
      $$1.a(foe.a(c, this::a).a());
      $$1.a(foe.a(d, this::b).a());
      frx $$2 = this.z.b(frx.d().a(4));
      if (w) {
         $$2.a(this.l());
      }

      frx $$3 = $$2.a(frx.e().a(8));
      $$3.a(foe.a(s, this::c).a());
      $$3.a(foe.a(xu.d, $$0x -> this.aP_()).a());
      frx $$4 = this.z.c(frx.d().a(8));
      this.A = $$4.a(new fyr(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         foc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.i(this.n - 40);
         this.A.j(this.z.d());
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

   private foc l() {
      fmi<Boolean> $$0 = this.y.al();
      return fog.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(foc $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(foe $$0) {
      fsu.a(this, aza.c);
   }

   private void b(foe $$0) {
      fsu.a(this, aza.i);
   }

   private void c(foe $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
