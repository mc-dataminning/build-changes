public class fwc<T extends bsw> extends ful<T> {
   private static final String a = "upper_body";
   private final fxc b;
   private final fxc f;
   private final fxc g;
   private final fxc h;
   private final fxc i;

   public fwc(fxc $$0) {
      this.b = $$0;
      this.g = $$0.b("head");
      this.h = $$0.b("left_arm");
      this.i = $$0.b("right_arm");
      this.f = $$0.b("upper_body");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      float $$2 = 4.0F;
      fxg $$3 = new fxg(-0.5F);
      $$1.a("head", fxh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), fxe.a(0.0F, 4.0F, 0.0F));
      fxh $$4 = fxh.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, fxe.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, fxe.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", fxh.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), fxe.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", fxh.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), fxe.a(0.0F, 24.0F, 0.0F));
      return fxi.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.f.f = $$4 * (float) (Math.PI / 180.0) * 0.25F;
      float $$6 = ayz.a(this.f.f);
      float $$7 = ayz.b(this.f.f);
      this.h.f = this.f.f;
      this.i.f = this.f.f + (float) Math.PI;
      this.h.b = $$7 * 5.0F;
      this.h.d = -$$6 * 5.0F;
      this.i.b = -$$7 * 5.0F;
      this.i.d = $$6 * 5.0F;
   }

   @Override
   public fxc a() {
      return this.b;
   }

   public fxc c() {
      return this.g;
   }
}
