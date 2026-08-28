import javax.annotation.Nullable;

public class fwr extends frw {
   private static final xj a = xj.c("telemetry_info.screen.title");
   private static final xj b = xj.c("telemetry_info.screen.description").b(-4539718);
   private static final xj c = xj.c("telemetry_info.button.privacy_statement");
   private static final xj d = xj.c("telemetry_info.button.give_feedback");
   private static final xj s = xj.c("telemetry_info.button.show_data");
   private static final xj u = xj.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fke.Q().D();
   private final frw x;
   private final fki y;
   private final fps z = new fps(this, 16 + 9 * 5 + 20, w ? 33 + fmf.a(fke.Q().h) : 33);
   @Nullable
   private fwq A;
   @Nullable
   private fmx B;
   private double C;

   public fwr(frw $$0, fki $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xj i() {
      return xi.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      fpw $$0 = this.z.a(fpw.d().a(4));
      $$0.c().b();
      $$0.a(new fnk(a, this.p));
      this.B = $$0.a(new fmx(b, this.p).b(true));
      fpw $$1 = $$0.a(fpw.e().a(8));
      $$1.a(fmd.a(c, this::a).a());
      $$1.a(fmd.a(d, this::b).a());
      fpw $$2 = this.z.b(fpw.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fpw $$3 = $$2.a(fpw.e().a(8));
      $$3.a(fmd.a(s, this::c).a());
      $$3.a(fmd.a(xi.d, $$0x -> this.aO_()).a());
      fpw $$4 = this.z.c(fpw.d().a(8));
      this.A = $$4.a(new fwq(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fmb var10000 = this.c($$1x);
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
   protected void aF_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fmb m() {
      fkh<Boolean> $$0 = this.y.ak();
      return fmf.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fmb $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fmd $$0) {
      fqt.a(this, ayi.c);
   }

   private void b(fmd $$0) {
      fqt.a(this, ayi.i);
   }

   private void c(fmd $$0) {
      ae.m().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
