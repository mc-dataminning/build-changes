public class fwv<T extends cky> extends fup<T> implements fwm {
   private final fxc a = this.l.b("hat_rim");

   public fwv(fxc $$0) {
      super($$0);
   }

   public static fxi c() {
      fxk $$0 = fup.a(fxg.a, 0.0F);
      fxl $$1 = $$0.a();
      $$1.a("head", new fxh().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxe.a);
      fxl $$2 = $$1.a("hat", fxh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxg(0.5F)), fxe.a);
      $$2.a("hat_rim", fxh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxe.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxg(0.05F)), fxe.a);
      $$1.a("right_arm", fxh.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxe.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxh.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxe.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxe.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxe.a(2.0F, 12.0F, 0.0F));
      return fxi.a($$0, 64, 64);
   }

   public static fxi a(fxg $$0) {
      fxk $$1 = fup.a($$0, 0.0F);
      fxl $$2 = $$1.a();
      $$2.a("head", fxh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxe.a);
      $$2.a("body", fxh.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxe.a);
      $$2.a("right_leg", fxh.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxe.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxh.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxe.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxh.c(), fxe.a);
      return fxi.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fsz.a(this.o, this.n, $$0.gi(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
