import javax.annotation.Nullable;

public class gad extends fvi {
   private static final wp a = wp.c("telemetry_info.screen.title");
   private static final wp b = wp.c("telemetry_info.screen.description").b(-4539718);
   private static final wp c = wp.c("telemetry_info.button.privacy_statement");
   private static final wp d = wp.c("telemetry_info.button.give_feedback");
   private static final wp s = wp.c("telemetry_info.button.show_data");
   private static final wp u = wp.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fmg.Q().D();
   private final fvi x;
   private final fmk y;
   private final fte z = new fte(this, 16 + 9 * 5 + 20, w ? 33 + fps.a(fmg.Q().h) : 33);
   @Nullable
   private gac A;
   @Nullable
   private fqk B;
   private double C;

   public gad(fvi $$0, fmk $$1) {
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
      fti $$0 = this.z.a(fti.d().a(4));
      $$0.c().b();
      $$0.a(new fqx(a, this.p));
      this.B = $$0.a(new fqk(b, this.p).b(true));
      fti $$1 = $$0.a(fti.e().a(8));
      $$1.a(fpq.a(c, this::a).a());
      $$1.a(fpq.a(d, this::b).a());
      fti $$2 = this.z.b(fti.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fti $$3 = $$2.a(fti.e().a(8));
      $$3.a(fpq.a(s, this::c).a());
      $$3.a(fpq.a(wo.d, $$0x -> this.aO_()).a());
      fti $$4 = this.z.c(fti.d().a(8));
      this.A = $$4.a(new gac(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fpo var10000 = this.c($$1x);
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

   private fpo m() {
      fmj<Boolean> $$0 = this.y.al();
      return fps.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fpo $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fpq $$0) {
      fuf.a(this, axv.c);
   }

   private void b(fpq $$0) {
      fuf.a(this, axv.i);
   }

   private void c(fpq $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aO_() {
      this.m.a(this.x);
   }
}
