public class fwu<T extends ckx> extends fuo<T> implements fwl {
   private final fxb a = this.l.b("hat_rim");

   public fwu(fxb $$0) {
      super($$0);
   }

   public static fxh c() {
      fxj $$0 = fuo.a(fxf.a, 0.0F);
      fxk $$1 = $$0.a();
      $$1.a("head", new fxg().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxd.a);
      fxk $$2 = $$1.a("hat", fxg.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxf(0.5F)), fxd.a);
      $$2.a("hat_rim", fxg.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxd.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxg.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxf(0.05F)), fxd.a);
      $$1.a("right_arm", fxg.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxd.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxg.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxd.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxg.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxd.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxg.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxd.a(2.0F, 12.0F, 0.0F));
      return fxh.a($$0, 64, 64);
   }

   public static fxh a(fxf $$0) {
      fxj $$1 = fuo.a($$0, 0.0F);
      fxk $$2 = $$1.a();
      $$2.a("head", fxg.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxd.a);
      $$2.a("body", fxg.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxd.a);
      $$2.a("right_leg", fxg.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxd.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxg.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxd.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxg.c(), fxd.a);
      return fxh.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fsy.a(this.o, this.n, $$0.gi(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
