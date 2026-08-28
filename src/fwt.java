public class fwt<T extends ckw> extends fun<T> implements fwk {
   private final fxa a = this.l.b("hat_rim");

   public fwt(fxa $$0) {
      super($$0);
   }

   public static fxg c() {
      fxi $$0 = fun.a(fxe.a, 0.0F);
      fxj $$1 = $$0.a();
      $$1.a("head", new fxf().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxc.a);
      fxj $$2 = $$1.a("hat", fxf.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxe(0.5F)), fxc.a);
      $$2.a("hat_rim", fxf.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxc.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxf.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxe(0.05F)), fxc.a);
      $$1.a("right_arm", fxf.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxc.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxf.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxc.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxf.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxc.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxf.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxc.a(2.0F, 12.0F, 0.0F));
      return fxg.a($$0, 64, 64);
   }

   public static fxg a(fxe $$0) {
      fxi $$1 = fun.a($$0, 0.0F);
      fxj $$2 = $$1.a();
      $$2.a("head", fxf.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxc.a);
      $$2.a("body", fxf.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxc.a);
      $$2.a("right_leg", fxf.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxc.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxf.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxc.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxf.c(), fxc.a);
      return fxg.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fsx.a(this.o, this.n, $$0.gi(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
