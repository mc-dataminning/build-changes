import javax.annotation.Nullable;

public class fzd extends fui {
   private static final wo a = wo.c("telemetry_info.screen.title");
   private static final wo b = wo.c("telemetry_info.screen.description").b(-4539718);
   private static final wo c = wo.c("telemetry_info.button.privacy_statement");
   private static final wo d = wo.c("telemetry_info.button.give_feedback");
   private static final wo s = wo.c("telemetry_info.button.show_data");
   private static final wo u = wo.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = flh.Q().D();
   private final fui x;
   private final fll y;
   private final fse z = new fse(this, 16 + 9 * 5 + 20, w ? 33 + fos.a(flh.Q().h) : 33);
   @Nullable
   private fzc A;
   @Nullable
   private fpk B;
   private double C;

   public fzd(fui $$0, fll $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wo i() {
      return wn.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      fsi $$0 = this.z.a(fsi.d().a(4));
      $$0.c().b();
      $$0.a(new fpx(a, this.p));
      this.B = $$0.a(new fpk(b, this.p).b(true));
      fsi $$1 = $$0.a(fsi.e().a(8));
      $$1.a(fop.a(c, this::a).a());
      $$1.a(fop.a(d, this::b).a());
      fsi $$2 = this.z.b(fsi.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fsi $$3 = $$2.a(fsi.e().a(8));
      $$3.a(fop.a(s, this::c).a());
      $$3.a(fop.a(wn.d, $$0x -> this.aO_()).a());
      fsi $$4 = this.z.c(fsi.d().a(8));
      this.A = $$4.a(new fzc(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fon var10000 = this.c($$1x);
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

   private fon m() {
      flk<Boolean> $$0 = this.y.al();
      return fos.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fon $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fop $$0) {
      ftf.a(this, axu.c);
   }

   private void b(fop $$0) {
      ftf.a(this, axu.i);
   }

   private void c(fop $$0) {
      af.m().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
