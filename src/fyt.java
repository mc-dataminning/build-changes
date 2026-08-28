import javax.annotation.Nullable;

public class fyt extends fty {
   private static final xv a = xv.c("telemetry_info.screen.title");
   private static final xv b = xv.c("telemetry_info.screen.description").b(-4539718);
   private static final xv c = xv.c("telemetry_info.button.privacy_statement");
   private static final xv d = xv.c("telemetry_info.button.give_feedback");
   private static final xv s = xv.c("telemetry_info.button.show_data");
   private static final xv u = xv.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fmg.Q().D();
   private final fty x;
   private final fmk y;
   private final fru z = new fru(this, 16 + 9 * 5 + 20, w ? 33 + foh.a(fmg.Q().h) : 33);
   @Nullable
   private fys A;
   @Nullable
   private fpa B;
   private double C;

   public fyt(fty $$0, fmk $$1) {
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
      fry $$0 = this.z.a(fry.d().a(4));
      $$0.c().b();
      $$0.a(new fpn(a, this.p));
      this.B = $$0.a(new fpa(b, this.p).b(true));
      fry $$1 = $$0.a(fry.e().a(8));
      $$1.a(fof.a(c, this::a).a());
      $$1.a(fof.a(d, this::b).a());
      fry $$2 = this.z.b(fry.d().a(4));
      if (w) {
         $$2.a(this.l());
      }

      fry $$3 = $$2.a(fry.e().a(8));
      $$3.a(fof.a(s, this::c).a());
      $$3.a(fof.a(xu.d, $$0x -> this.aP_()).a());
      fry $$4 = this.z.c(fry.d().a(8));
      this.A = $$4.a(new fys(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fod var10000 = this.c($$1x);
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

   private fod l() {
      fmj<Boolean> $$0 = this.y.al();
      return foh.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fod $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fof $$0) {
      fsv.a(this, aza.c);
   }

   private void b(fof $$0) {
      fsv.a(this, aza.i);
   }

   private void c(fof $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
