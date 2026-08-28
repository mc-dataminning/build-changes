public class fyd<T extends ckw> extends fvx<T> implements fxu {
   private final fyk a = this.l.b("hat_rim");

   public fyd(fyk $$0) {
      super($$0);
   }

   public static fyq c() {
      fys $$0 = fvx.a(fyo.a, 0.0F);
      fyt $$1 = $$0.a();
      $$1.a("head", new fyp().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fym.a);
      fyt $$2 = $$1.a("hat", fyp.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fyo(0.5F)), fym.a);
      $$2.a("hat_rim", fyp.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fym.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fyp.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fyo(0.05F)), fym.a);
      $$1.a("right_arm", fyp.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fym.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fyp.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fym.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fyp.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fym.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fyp.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fym.a(2.0F, 12.0F, 0.0F));
      return fyq.a($$0, 64, 64);
   }

   public static fyq a(fyo $$0) {
      fys $$1 = fvx.a($$0, 0.0F);
      fyt $$2 = $$1.a();
      $$2.a("head", fyp.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fym.a);
      $$2.a("body", fyp.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fym.a);
      $$2.a("right_leg", fyp.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fym.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fyp.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fym.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fyp.c(), fym.a);
      return fyq.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fuh.a(this.o, this.n, $$0.gb(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
