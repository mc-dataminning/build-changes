public class fxj<T extends ckk> extends fvd<T> implements fxa {
   private final fxq a = this.l.b("hat_rim");

   public fxj(fxq $$0) {
      super($$0);
   }

   public static fxw c() {
      fxy $$0 = fvd.a(fxu.a, 0.0F);
      fxz $$1 = $$0.a();
      $$1.a("head", new fxv().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxs.a);
      fxz $$2 = $$1.a("hat", fxv.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxu(0.5F)), fxs.a);
      $$2.a("hat_rim", fxv.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxs.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxv.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxu(0.05F)), fxs.a);
      $$1.a("right_arm", fxv.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxs.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxv.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxs.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxv.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxs.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxv.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxs.a(2.0F, 12.0F, 0.0F));
      return fxw.a($$0, 64, 64);
   }

   public static fxw a(fxu $$0) {
      fxy $$1 = fvd.a($$0, 0.0F);
      fxz $$2 = $$1.a();
      $$2.a("head", fxv.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxs.a);
      $$2.a("body", fxv.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxs.a);
      $$2.a("right_leg", fxv.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxs.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxv.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxs.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxv.c(), fxs.a);
      return fxw.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ftn.a(this.o, this.n, $$0.ge(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
