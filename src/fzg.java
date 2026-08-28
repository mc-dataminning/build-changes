import javax.annotation.Nullable;

public class fzg extends ful {
   private static final wp a = wp.c("telemetry_info.screen.title");
   private static final wp b = wp.c("telemetry_info.screen.description").b(-4539718);
   private static final wp c = wp.c("telemetry_info.button.privacy_statement");
   private static final wp d = wp.c("telemetry_info.button.give_feedback");
   private static final wp s = wp.c("telemetry_info.button.show_data");
   private static final wp u = wp.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = flj.Q().D();
   private final ful x;
   private final fln y;
   private final fsh z = new fsh(this, 16 + 9 * 5 + 20, w ? 33 + fov.a(flj.Q().h) : 33);
   @Nullable
   private fzf A;
   @Nullable
   private fpn B;
   private double C;

   public fzg(ful $$0, fln $$1) {
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
      fsl $$0 = this.z.a(fsl.d().a(4));
      $$0.c().b();
      $$0.a(new fqa(a, this.p));
      this.B = $$0.a(new fpn(b, this.p).b(true));
      fsl $$1 = $$0.a(fsl.e().a(8));
      $$1.a(fot.a(c, this::a).a());
      $$1.a(fot.a(d, this::b).a());
      fsl $$2 = this.z.b(fsl.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fsl $$3 = $$2.a(fsl.e().a(8));
      $$3.a(fot.a(s, this::c).a());
      $$3.a(fot.a(wo.d, $$0x -> this.aO_()).a());
      fsl $$4 = this.z.c(fsl.d().a(8));
      this.A = $$4.a(new fzf(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         foq var10000 = this.c($$1x);
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

   private foq m() {
      flm<Boolean> $$0 = this.y.al();
      return fov.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(foq $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fot $$0) {
      fti.a(this, axv.c);
   }

   private void b(fot $$0) {
      fti.a(this, axv.i);
   }

   private void c(fot $$0) {
      af.m().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
