import javax.annotation.Nullable;

public class fzf extends fuk {
   private static final wp a = wp.c("telemetry_info.screen.title");
   private static final wp b = wp.c("telemetry_info.screen.description").b(-4539718);
   private static final wp c = wp.c("telemetry_info.button.privacy_statement");
   private static final wp d = wp.c("telemetry_info.button.give_feedback");
   private static final wp s = wp.c("telemetry_info.button.show_data");
   private static final wp u = wp.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fli.Q().D();
   private final fuk x;
   private final flm y;
   private final fsg z = new fsg(this, 16 + 9 * 5 + 20, w ? 33 + fou.a(fli.Q().h) : 33);
   @Nullable
   private fze A;
   @Nullable
   private fpm B;
   private double C;

   public fzf(fuk $$0, flm $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wp i() {
      return wo.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      fsk $$0 = this.z.a(fsk.d().a(4));
      $$0.c().b();
      $$0.a(new fpz(a, this.p));
      this.B = $$0.a(new fpm(b, this.p).b(true));
      fsk $$1 = $$0.a(fsk.e().a(8));
      $$1.a(fos.a(c, this::a).a());
      $$1.a(fos.a(d, this::b).a());
      fsk $$2 = this.z.b(fsk.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fsk $$3 = $$2.a(fsk.e().a(8));
      $$3.a(fos.a(s, this::c).a());
      $$3.a(fos.a(wo.d, $$0x -> this.aO_()).a());
      fsk $$4 = this.z.c(fsk.d().a(8));
      this.A = $$4.a(new fze(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fop var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.h(this.n - 40);
         this.A.i(this.z.d());
         this.A.q();
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

   private fop m() {
      fll<Boolean> $$0 = this.y.al();
      return fou.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fop $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fos $$0) {
      fth.a(this, axv.c);
   }

   private void b(fos $$0) {
      fth.a(this, axv.i);
   }

   private void c(fos $$0) {
      af.m().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
