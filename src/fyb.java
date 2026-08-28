public class fyb<T extends ckw> extends fvv<T> implements fxs {
   private final fyi a = this.l.b("hat_rim");

   public fyb(fyi $$0) {
      super($$0);
   }

   public static fyo c() {
      fyq $$0 = fvv.a(fym.a, 0.0F);
      fyr $$1 = $$0.a();
      $$1.a("head", new fyn().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fyk.a);
      fyr $$2 = $$1.a("hat", fyn.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fym(0.5F)), fyk.a);
      $$2.a("hat_rim", fyn.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fyk.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fyn.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fym(0.05F)), fyk.a);
      $$1.a("right_arm", fyn.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyk.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fyn.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyk.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fyn.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyk.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fyn.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fyk.a(2.0F, 12.0F, 0.0F));
      return fyo.a($$0, 64, 64);
   }

   public static fyo a(fym $$0) {
      fyq $$1 = fvv.a($$0, 0.0F);
      fyr $$2 = $$1.a();
      $$2.a("head", fyn.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fyk.a);
      $$2.a("body", fyn.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyk.a);
      $$2.a("right_leg", fyn.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyk.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fyn.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fyk.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fyn.c(), fyk.a);
      return fyo.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fuf.a(this.o, this.n, $$0.gc(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
