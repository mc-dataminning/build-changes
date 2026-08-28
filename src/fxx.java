public class fxx<T extends cku> extends fvr<T> implements fxo {
   private final fye a = this.l.b("hat_rim");

   public fxx(fye $$0) {
      super($$0);
   }

   public static fyk c() {
      fym $$0 = fvr.a(fyi.a, 0.0F);
      fyn $$1 = $$0.a();
      $$1.a("head", new fyj().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fyg.a);
      fyn $$2 = $$1.a("hat", fyj.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fyi(0.5F)), fyg.a);
      $$2.a("hat_rim", fyj.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fyg.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fyj.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fyi(0.05F)), fyg.a);
      $$1.a("right_arm", fyj.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyg.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fyj.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyg.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fyj.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyg.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fyj.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyg.a(2.0F, 12.0F, 0.0F));
      return fyk.a($$0, 64, 64);
   }

   public static fyk a(fyi $$0) {
      fym $$1 = fvr.a($$0, 0.0F);
      fyn $$2 = $$1.a();
      $$2.a("head", fyj.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fyg.a);
      $$2.a("body", fyj.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyg.a);
      $$2.a("right_leg", fyj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyg.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fyj.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyg.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fyj.c(), fyg.a);
      return fyk.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fub.a(this.o, this.n, $$0.gd(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
