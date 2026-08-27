public class fyl<T extends cjx> extends fwd<T> implements fyc {
   private final fys a = this.l.b("hat_rim");

   public fyl(fys $$0) {
      super($$0);
   }

   public static fyy c() {
      fza $$0 = fwd.a(fyw.a, 0.0F);
      fzb $$1 = $$0.a();
      $$1.a("head", new fyx().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fyu.a);
      fzb $$2 = $$1.a("hat", fyx.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fyw(0.5F)), fyu.a);
      $$2.a("hat_rim", fyx.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fyu.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fyx.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fyw(0.05F)), fyu.a);
      $$1.a("right_arm", fyx.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyu.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fyx.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyu.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fyx.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyu.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fyx.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyu.a(2.0F, 12.0F, 0.0F));
      return fyy.a($$0, 64, 64);
   }

   public static fyy a(fyw $$0) {
      fza $$1 = fwd.a($$0, 0.0F);
      fzb $$2 = $$1.a();
      $$2.a("head", fyx.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fyu.a);
      $$2.a("body", fyx.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyu.a);
      $$2.a("right_leg", fyx.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyu.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fyx.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyu.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fyx.c(), fyu.a);
      return fyy.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fum.a(this.o, this.n, $$0.gq(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
