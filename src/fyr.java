import javax.annotation.Nullable;

public class fyr extends ftw {
   private static final xv a = xv.c("telemetry_info.screen.title");
   private static final xv b = xv.c("telemetry_info.screen.description").b(-4539718);
   private static final xv c = xv.c("telemetry_info.button.privacy_statement");
   private static final xv d = xv.c("telemetry_info.button.give_feedback");
   private static final xv s = xv.c("telemetry_info.button.show_data");
   private static final xv u = xv.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fme.Q().D();
   private final ftw x;
   private final fmi y;
   private final frs z = new frs(this, 16 + 9 * 5 + 20, w ? 33 + fof.a(fme.Q().h) : 33);
   @Nullable
   private fyq A;
   @Nullable
   private foy B;
   private double C;

   public fyr(ftw $$0, fmi $$1) {
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
      frw $$0 = this.z.a(frw.d().a(4));
      $$0.c().b();
      $$0.a(new fpl(a, this.p));
      this.B = $$0.a(new foy(b, this.p).b(true));
      frw $$1 = $$0.a(frw.e().a(8));
      $$1.a(fod.a(c, this::a).a());
      $$1.a(fod.a(d, this::b).a());
      frw $$2 = this.z.b(frw.d().a(4));
      if (w) {
         $$2.a(this.l());
      }

      frw $$3 = $$2.a(frw.e().a(8));
      $$3.a(fod.a(s, this::c).a());
      $$3.a(fod.a(xu.d, $$0x -> this.aP_()).a());
      frw $$4 = this.z.c(frw.d().a(8));
      this.A = $$4.a(new fyq(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fob var10000 = this.c($$1x);
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

   private fob l() {
      fmh<Boolean> $$0 = this.y.al();
      return fof.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fob $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fod $$0) {
      fst.a(this, aza.c);
   }

   private void b(fod $$0) {
      fst.a(this, aza.i);
   }

   private void c(fod $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
