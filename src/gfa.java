import javax.annotation.Nullable;

public class gfa extends gad {
   private static final xa a = xa.c("telemetry_info.screen.title");
   private static final xa b = xa.c("telemetry_info.screen.description").b(-4539718);
   private static final xa c = xa.c("telemetry_info.button.privacy_statement");
   private static final xa d = xa.c("telemetry_info.button.give_feedback");
   private static final xa s = xa.c("telemetry_info.button.show_data");
   private static final xa u = xa.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = frd.Q().D();
   private final gad x;
   private final frh y;
   private final fxz z = new fxz(this, 16 + 9 * 5 + 20, w ? 33 + fun.a(frd.Q().h) : 33);
   @Nullable
   private gez A;
   @Nullable
   private fvf B;
   private double C;

   public gfa(gad $$0, frh $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public xa i() {
      return wz.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      fyd $$0 = this.z.a(fyd.d().a(4));
      $$0.c().b();
      $$0.a(new fvs(a, this.p));
      this.B = $$0.a(new fvf(b, this.p).b(true));
      fyd $$1 = $$0.a(fyd.e().a(8));
      $$1.a(ful.a(c, this::a).a());
      $$1.a(ful.a(d, this::b).a());
      fyd $$2 = this.z.b(fyd.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fyd $$3 = $$2.a(fyd.e().a(8));
      $$3.a(ful.a(s, this::c).a());
      $$3.a(ful.a(wz.d, $$0x -> this.aP_()).a());
      fyd $$4 = this.z.c(fyd.d().a(8));
      this.A = $$4.a(new gez(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fuj var10000 = this.c($$1x);
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

   private fuj m() {
      frg<Boolean> $$0 = this.y.al();
      return fun.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fuj $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(ful $$0) {
      fza.a(this, ayj.c);
   }

   private void b(ful $$0) {
      fza.a(this, ayj.i);
   }

   private void c(ful $$0) {
      ag.n().a(this.m.u().b());
   }

   @Override
   public void aP_() {
      this.m.a(this.x);
   }
}
