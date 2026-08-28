import javax.annotation.Nullable;

public class gfc extends gaf {
   private static final xc a = xc.c("telemetry_info.screen.title");
   private static final xc b = xc.c("telemetry_info.screen.description").b(-4539718);
   private static final xc c = xc.c("telemetry_info.button.privacy_statement");
   private static final xc d = xc.c("telemetry_info.button.give_feedback");
   private static final xc s = xc.c("telemetry_info.button.show_data");
   private static final xc u = xc.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = frf.Q().D();
   private final gaf x;
   private final frj y;
   private final fyb z = new fyb(this, 16 + 9 * 5 + 20, w ? 33 + fup.a(frf.Q().h) : 33);
   @Nullable
   private gfb A;
   @Nullable
   private fvh B;
   private double C;

   public gfc(gaf $$0, frj $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xc i() {
      return xb.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      fyf $$0 = this.z.a(fyf.d().a(4));
      $$0.c().b();
      $$0.a(new fvu(a, this.p));
      this.B = $$0.a(new fvh(b, this.p).b(true));
      fyf $$1 = $$0.a(fyf.e().a(8));
      $$1.a(fun.a(c, this::a).a());
      $$1.a(fun.a(d, this::b).a());
      fyf $$2 = this.z.b(fyf.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fyf $$3 = $$2.a(fyf.e().a(8));
      $$3.a(fun.a(s, this::c).a());
      $$3.a(fun.a(xb.d, $$0x -> this.aP_()).a());
      fyf $$4 = this.z.c(fyf.d().a(8));
      this.A = $$4.a(new gfb(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         ful var10000 = this.c($$1x);
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
   protected void aG_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private ful m() {
      fri<Boolean> $$0 = this.y.al();
      return fup.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(ful $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fun $$0) {
      fzc.a(this, ayl.c);
   }

   private void b(fun $$0) {
      fzc.a(this, ayl.i);
   }

   private void c(fun $$0) {
      ag.n().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
