public class fvp<T extends cjv> extends ftj<T> implements fvg {
   private final fvw a = this.l.b("hat_rim");

   public fvp(fvw $$0) {
      super($$0);
   }

   public static fwc c() {
      fwe $$0 = ftj.a(fwa.a, 0.0F);
      fwf $$1 = $$0.a();
      $$1.a("head", new fwb().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fvy.a);
      fwf $$2 = $$1.a("hat", fwb.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fwa(0.5F)), fvy.a);
      $$2.a("hat_rim", fwb.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fvy.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fwb.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fwa(0.05F)), fvy.a);
      $$1.a("right_arm", fwb.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fvy.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fwb.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fvy.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fwb.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fvy.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fwb.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fvy.a(2.0F, 12.0F, 0.0F));
      return fwc.a($$0, 64, 64);
   }

   public static fwc a(fwa $$0) {
      fwe $$1 = ftj.a($$0, 0.0F);
      fwf $$2 = $$1.a();
      $$2.a("head", fwb.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fvy.a);
      $$2.a("body", fwb.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fvy.a);
      $$2.a("right_leg", fwb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fvy.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fwb.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fvy.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fwb.c(), fvy.a);
      return fwc.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      frt.a(this.o, this.n, $$0.gh(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
