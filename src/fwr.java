public class fwr<T extends cku> extends ful<T> implements fwi {
   private final fwy a = this.l.b("hat_rim");

   public fwr(fwy $$0) {
      super($$0);
   }

   public static fxe c() {
      fxg $$0 = ful.a(fxc.a, 0.0F);
      fxh $$1 = $$0.a();
      $$1.a("head", new fxd().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxa.a);
      fxh $$2 = $$1.a("hat", fxd.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxc(0.5F)), fxa.a);
      $$2.a("hat_rim", fxd.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxa.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxd.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxc(0.05F)), fxa.a);
      $$1.a("right_arm", fxd.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxa.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxd.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxa.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxd.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxa.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxd.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxa.a(2.0F, 12.0F, 0.0F));
      return fxe.a($$0, 64, 64);
   }

   public static fxe a(fxc $$0) {
      fxg $$1 = ful.a($$0, 0.0F);
      fxh $$2 = $$1.a();
      $$2.a("head", fxd.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxa.a);
      $$2.a("body", fxd.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxa.a);
      $$2.a("right_leg", fxd.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxa.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxd.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxa.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxd.c(), fxa.a);
      return fxe.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fsv.a(this.o, this.n, $$0.gi(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
