import javax.annotation.Nullable;

public class gdp extends fys {
   private static final wy a = wy.c("telemetry_info.screen.title");
   private static final wy b = wy.c("telemetry_info.screen.description").b(-4539718);
   private static final wy c = wy.c("telemetry_info.button.privacy_statement");
   private static final wy d = wy.c("telemetry_info.button.give_feedback");
   private static final wy s = wy.c("telemetry_info.button.show_data");
   private static final wy u = wy.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fpt.Q().D();
   private final fys x;
   private final fpx y;
   private final fwo z = new fwo(this, 16 + 9 * 5 + 20, w ? 33 + ftc.a(fpt.Q().h) : 33);
   @Nullable
   private gdo A;
   @Nullable
   private ftu B;
   private double C;

   public gdp(fys $$0, fpx $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      fws $$0 = this.z.a(fws.d().a(4));
      $$0.c().b();
      $$0.a(new fuh(a, this.p));
      this.B = $$0.a(new ftu(b, this.p).b(true));
      fws $$1 = $$0.a(fws.e().a(8));
      $$1.a(fta.a(c, this::a).a());
      $$1.a(fta.a(d, this::b).a());
      fws $$2 = this.z.b(fws.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fws $$3 = $$2.a(fws.e().a(8));
      $$3.a(fta.a(s, this::c).a());
      $$3.a(fta.a(wx.d, $$0x -> this.aL_()).a());
      fws $$4 = this.z.c(fws.d().a(8));
      this.A = $$4.a(new gdo(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fsy var10000 = this.c($$1x);
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
   protected void aC_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fsy m() {
      fpw<Boolean> $$0 = this.y.al();
      return ftc.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fsy $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fta $$0) {
      fxp.a(this, ayh.c);
   }

   private void b(fta $$0) {
      fxp.a(this, ayh.i);
   }

   private void c(fta $$0) {
      ag.n().a(this.m.u().b());
   }

   @Override
   public void aL_() {
      this.m.a(this.x);
   }
}
