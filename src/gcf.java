import javax.annotation.Nullable;

public class gcf extends fxi {
   private static final ww a = ww.c("telemetry_info.screen.title");
   private static final ww b = ww.c("telemetry_info.screen.description").b(-4539718);
   private static final ww c = ww.c("telemetry_info.button.privacy_statement");
   private static final ww d = ww.c("telemetry_info.button.give_feedback");
   private static final ww s = ww.c("telemetry_info.button.show_data");
   private static final ww u = ww.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fof.Q().D();
   private final fxi x;
   private final foj y;
   private final fve z = new fve(this, 16 + 9 * 5 + 20, w ? 33 + frs.a(fof.Q().h) : 33);
   @Nullable
   private gce A;
   @Nullable
   private fsk B;
   private double C;

   public gcf(fxi $$0, foj $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public ww i() {
      return wv.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fvi $$0 = this.z.a(fvi.d().a(4));
      $$0.c().b();
      $$0.a(new fsx(a, this.p));
      this.B = $$0.a(new fsk(b, this.p).b(true));
      fvi $$1 = $$0.a(fvi.e().a(8));
      $$1.a(frq.a(c, this::a).a());
      $$1.a(frq.a(d, this::b).a());
      fvi $$2 = this.z.b(fvi.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fvi $$3 = $$2.a(fvi.e().a(8));
      $$3.a(frq.a(s, this::c).a());
      $$3.a(frq.a(wv.d, $$0x -> this.aK_()).a());
      fvi $$4 = this.z.c(fvi.d().a(8));
      this.A = $$4.a(new gce(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fro var10000 = this.c($$1x);
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
   protected void aB_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fro m() {
      foi<Boolean> $$0 = this.y.al();
      return frs.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fro $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(frq $$0) {
      fwf.a(this, ayf.c);
   }

   private void b(frq $$0) {
      fwf.a(this, ayf.i);
   }

   private void c(frq $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aK_() {
      this.m.a(this.x);
   }
}
