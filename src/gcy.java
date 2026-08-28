import javax.annotation.Nullable;

public class gcy extends fyb {
   private static final wy a = wy.c("telemetry_info.screen.title");
   private static final wy b = wy.c("telemetry_info.screen.description").b(-4539718);
   private static final wy c = wy.c("telemetry_info.button.privacy_statement");
   private static final wy d = wy.c("telemetry_info.button.give_feedback");
   private static final wy s = wy.c("telemetry_info.button.show_data");
   private static final wy u = wy.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = foz.Q().D();
   private final fyb x;
   private final fpd y;
   private final fvx z = new fvx(this, 16 + 9 * 5 + 20, w ? 33 + fsl.a(foz.Q().h) : 33);
   @Nullable
   private gcx A;
   @Nullable
   private ftd B;
   private double C;

   public gcy(fyb $$0, fpd $$1) {
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
      fwb $$0 = this.z.a(fwb.d().a(4));
      $$0.c().b();
      $$0.a(new ftq(a, this.p));
      this.B = $$0.a(new ftd(b, this.p).b(true));
      fwb $$1 = $$0.a(fwb.e().a(8));
      $$1.a(fsj.a(c, this::a).a());
      $$1.a(fsj.a(d, this::b).a());
      fwb $$2 = this.z.b(fwb.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fwb $$3 = $$2.a(fwb.e().a(8));
      $$3.a(fsj.a(s, this::c).a());
      $$3.a(fsj.a(wx.d, $$0x -> this.aL_()).a());
      fwb $$4 = this.z.c(fwb.d().a(8));
      this.A = $$4.a(new gcx(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fsh var10000 = this.c($$1x);
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

   private fsh m() {
      fpc<Boolean> $$0 = this.y.al();
      return fsl.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fsh $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fsj $$0) {
      fwy.a(this, ayh.c);
   }

   private void b(fsj $$0) {
      fwy.a(this, ayh.i);
   }

   private void c(fsj $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aL_() {
      this.m.a(this.x);
   }
}
