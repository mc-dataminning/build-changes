import javax.annotation.Nullable;

public class fym extends ftr {
   private static final xv a = xv.c("telemetry_info.screen.title");
   private static final xv b = xv.c("telemetry_info.screen.description").b(-4539718);
   private static final xv c = xv.c("telemetry_info.button.privacy_statement");
   private static final xv d = xv.c("telemetry_info.button.give_feedback");
   private static final xv s = xv.c("telemetry_info.button.show_data");
   private static final xv u = xv.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = flz.Q().D();
   private final ftr x;
   private final fmd y;
   private final frn z = new frn(this, 16 + 9 * 5 + 20, w ? 33 + foa.a(flz.Q().h) : 33);
   @Nullable
   private fyl A;
   @Nullable
   private fot B;
   private double C;

   public fym(ftr $$0, fmd $$1) {
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
      frr $$0 = this.z.a(frr.d().a(4));
      $$0.c().b();
      $$0.a(new fpg(a, this.p));
      this.B = $$0.a(new fot(b, this.p).b(true));
      frr $$1 = $$0.a(frr.e().a(8));
      $$1.a(fny.a(c, this::a).a());
      $$1.a(fny.a(d, this::b).a());
      frr $$2 = this.z.b(frr.d().a(4));
      if (w) {
         $$2.a(this.l());
      }

      frr $$3 = $$2.a(frr.e().a(8));
      $$3.a(fny.a(s, this::c).a());
      $$3.a(fny.a(xu.d, $$0x -> this.aP_()).a());
      frr $$4 = this.z.c(frr.d().a(8));
      this.A = $$4.a(new fyl(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fnw var10000 = this.c($$1x);
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

   private fnw l() {
      fmc<Boolean> $$0 = this.y.al();
      return foa.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fnw $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fny $$0) {
      fso.a(this, aza.c);
   }

   private void b(fny $$0) {
      fso.a(this, aza.i);
   }

   private void c(fny $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
