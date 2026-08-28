import javax.annotation.Nullable;

public class gcr extends fxu {
   private static final wy a = wy.c("telemetry_info.screen.title");
   private static final wy b = wy.c("telemetry_info.screen.description").b(-4539718);
   private static final wy c = wy.c("telemetry_info.button.privacy_statement");
   private static final wy d = wy.c("telemetry_info.button.give_feedback");
   private static final wy s = wy.c("telemetry_info.button.show_data");
   private static final wy u = wy.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fos.Q().D();
   private final fxu x;
   private final fow y;
   private final fvq z = new fvq(this, 16 + 9 * 5 + 20, w ? 33 + fse.a(fos.Q().h) : 33);
   @Nullable
   private gcq A;
   @Nullable
   private fsw B;
   private double C;

   public gcr(fxu $$0, fow $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fvu $$0 = this.z.a(fvu.d().a(4));
      $$0.c().b();
      $$0.a(new ftj(a, this.p));
      this.B = $$0.a(new fsw(b, this.p).b(true));
      fvu $$1 = $$0.a(fvu.e().a(8));
      $$1.a(fsc.a(c, this::a).a());
      $$1.a(fsc.a(d, this::b).a());
      fvu $$2 = this.z.b(fvu.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fvu $$3 = $$2.a(fvu.e().a(8));
      $$3.a(fsc.a(s, this::c).a());
      $$3.a(fsc.a(wx.d, $$0x -> this.aK_()).a());
      fvu $$4 = this.z.c(fvu.d().a(8));
      this.A = $$4.a(new gcq(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fsa var10000 = this.c($$1x);
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

   private fsa m() {
      fov<Boolean> $$0 = this.y.al();
      return fse.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fsa $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fsc $$0) {
      fwr.a(this, ayh.c);
   }

   private void b(fsc $$0) {
      fwr.a(this, ayh.i);
   }

   private void c(fsc $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aK_() {
      this.m.a(this.x);
   }
}
