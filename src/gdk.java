import javax.annotation.Nullable;

public class gdk extends fyn {
   private static final wy a = wy.c("telemetry_info.screen.title");
   private static final wy b = wy.c("telemetry_info.screen.description").b(-4539718);
   private static final wy c = wy.c("telemetry_info.button.privacy_statement");
   private static final wy d = wy.c("telemetry_info.button.give_feedback");
   private static final wy s = wy.c("telemetry_info.button.show_data");
   private static final wy u = wy.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fpo.Q().D();
   private final fyn x;
   private final fps y;
   private final fwj z = new fwj(this, 16 + 9 * 5 + 20, w ? 33 + fsx.a(fpo.Q().h) : 33);
   @Nullable
   private gdj A;
   @Nullable
   private ftp B;
   private double C;

   public gdk(fyn $$0, fps $$1) {
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
      fwn $$0 = this.z.a(fwn.d().a(4));
      $$0.c().b();
      $$0.a(new fuc(a, this.p));
      this.B = $$0.a(new ftp(b, this.p).b(true));
      fwn $$1 = $$0.a(fwn.e().a(8));
      $$1.a(fsv.a(c, this::a).a());
      $$1.a(fsv.a(d, this::b).a());
      fwn $$2 = this.z.b(fwn.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fwn $$3 = $$2.a(fwn.e().a(8));
      $$3.a(fsv.a(s, this::c).a());
      $$3.a(fsv.a(wx.d, $$0x -> this.aL_()).a());
      fwn $$4 = this.z.c(fwn.d().a(8));
      this.A = $$4.a(new gdj(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fst var10000 = this.c($$1x);
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

   private fst m() {
      fpr<Boolean> $$0 = this.y.al();
      return fsx.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fst $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fsv $$0) {
      fxk.a(this, ayh.c);
   }

   private void b(fsv $$0) {
      fxk.a(this, ayh.i);
   }

   private void c(fsv $$0) {
      ag.n().a(this.m.u().b());
   }

   @Override
   public void aL_() {
      this.m.a(this.x);
   }
}
