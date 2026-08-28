import javax.annotation.Nullable;

public class fzh extends fum {
   private static final wp a = wp.c("telemetry_info.screen.title");
   private static final wp b = wp.c("telemetry_info.screen.description").b(-4539718);
   private static final wp c = wp.c("telemetry_info.button.privacy_statement");
   private static final wp d = wp.c("telemetry_info.button.give_feedback");
   private static final wp s = wp.c("telemetry_info.button.show_data");
   private static final wp u = wp.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = flk.Q().D();
   private final fum x;
   private final flo y;
   private final fsi z = new fsi(this, 16 + 9 * 5 + 20, w ? 33 + fow.a(flk.Q().h) : 33);
   @Nullable
   private fzg A;
   @Nullable
   private fpo B;
   private double C;

   public fzh(fum $$0, flo $$1) {
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
      fsm $$0 = this.z.a(fsm.d().a(4));
      $$0.c().b();
      $$0.a(new fqb(a, this.p));
      this.B = $$0.a(new fpo(b, this.p).b(true));
      fsm $$1 = $$0.a(fsm.e().a(8));
      $$1.a(fou.a(c, this::a).a());
      $$1.a(fou.a(d, this::b).a());
      fsm $$2 = this.z.b(fsm.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fsm $$3 = $$2.a(fsm.e().a(8));
      $$3.a(fou.a(s, this::c).a());
      $$3.a(fou.a(wo.d, $$0x -> this.aO_()).a());
      fsm $$4 = this.z.c(fsm.d().a(8));
      this.A = $$4.a(new fzg(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fos var10000 = this.c($$1x);
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

   private fos m() {
      fln<Boolean> $$0 = this.y.al();
      return fow.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fos $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fou $$0) {
      ftj.a(this, axv.c);
   }

   private void b(fou $$0) {
      ftj.a(this, axv.i);
   }

   private void c(fou $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
