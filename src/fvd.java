public class fvd<T extends ckh> extends ful<T> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final fxc f;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;

   public fvd(fxc $$0) {
      this.f = $$0;
      fxc $$1 = $$0.b("body");
      this.k = $$1.b("tail_base");
      this.l = this.k.b("tail_tip");
      this.g = $$1.b("left_wing_base");
      this.h = this.g.b("left_wing_tip");
      this.i = $$1.b("right_wing_base");
      this.j = this.i.b("right_wing_tip");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("body", fxh.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), fxe.b(-0.1F, 0.0F, 0.0F));
      fxl $$3 = $$2.a("tail_base", fxh.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), fxe.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", fxh.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), fxe.a(0.0F, 0.5F, 6.0F));
      fxl $$4 = $$2.a("left_wing_base", fxh.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fxe.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", fxh.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fxe.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      fxl $$5 = $$2.a("right_wing_base", fxh.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fxe.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", fxh.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fxe.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", fxh.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), fxe.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return fxi.a($$0, 64, 64);
   }

   @Override
   public fxc a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ((float)$$0.u() + $$3) * 7.448451F * (float) (Math.PI / 180.0);
      float $$7 = 16.0F;
      this.g.g = ayz.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.h.g = ayz.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.i.g = -this.g.g;
      this.j.g = -this.h.g;
      this.k.e = -(5.0F + ayz.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.l.e = -(5.0F + ayz.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
