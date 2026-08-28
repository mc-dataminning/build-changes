public class fwo<T extends ckr> extends fui<T> implements fwf {
   private final fwv a = this.l.b("hat_rim");

   public fwo(fwv $$0) {
      super($$0);
   }

   public static fxb c() {
      fxd $$0 = fui.a(fwz.a, 0.0F);
      fxe $$1 = $$0.a();
      $$1.a("head", new fxa().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fwx.a);
      fxe $$2 = $$1.a("hat", fxa.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fwz(0.5F)), fwx.a);
      $$2.a("hat_rim", fxa.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fwx.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxa.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fwz(0.05F)), fwx.a);
      $$1.a("right_arm", fxa.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fwx.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxa.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fwx.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxa.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fwx.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxa.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fwx.a(2.0F, 12.0F, 0.0F));
      return fxb.a($$0, 64, 64);
   }

   public static fxb a(fwz $$0) {
      fxd $$1 = fui.a($$0, 0.0F);
      fxe $$2 = $$1.a();
      $$2.a("head", fxa.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fwx.a);
      $$2.a("body", fxa.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fwx.a);
      $$2.a("right_leg", fxa.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fwx.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxa.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fwx.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxa.c(), fwx.a);
      return fxb.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fss.a(this.o, this.n, $$0.gi(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
