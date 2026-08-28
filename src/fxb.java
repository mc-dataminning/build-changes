public class fxb<T extends ckg> extends fuv<T> implements fws {
   private final fxi a = this.l.b("hat_rim");

   public fxb(fxi $$0) {
      super($$0);
   }

   public static fxo c() {
      fxq $$0 = fuv.a(fxm.a, 0.0F);
      fxr $$1 = $$0.a();
      $$1.a("head", new fxn().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxk.a);
      fxr $$2 = $$1.a("hat", fxn.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxm(0.5F)), fxk.a);
      $$2.a("hat_rim", fxn.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxk.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxn.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxm(0.05F)), fxk.a);
      $$1.a("right_arm", fxn.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxk.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxn.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxk.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxn.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxk.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxn.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxk.a(2.0F, 12.0F, 0.0F));
      return fxo.a($$0, 64, 64);
   }

   public static fxo a(fxm $$0) {
      fxq $$1 = fuv.a($$0, 0.0F);
      fxr $$2 = $$1.a();
      $$2.a("head", fxn.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxk.a);
      $$2.a("body", fxn.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxk.a);
      $$2.a("right_leg", fxn.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxk.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxn.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxk.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxn.c(), fxk.a);
      return fxo.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ftf.a(this.o, this.n, $$0.ge(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
