public class fuk<T extends cik> extends fse<T> implements fub {
   private final fur a = this.l.b("hat_rim");

   public fuk(fur $$0) {
      super($$0);
   }

   public static fux c() {
      fuz $$0 = fse.a(fuv.a, 0.0F);
      fva $$1 = $$0.a();
      $$1.a("head", new fuw().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fut.a);
      fva $$2 = $$1.a("hat", fuw.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fuv(0.5F)), fut.a);
      $$2.a("hat_rim", fuw.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fut.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fuw.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fuv(0.05F)), fut.a);
      $$1.a("right_arm", fuw.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fut.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fuw.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fut.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fuw.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fut.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fuw.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fut.a(2.0F, 12.0F, 0.0F));
      return fux.a($$0, 64, 64);
   }

   public static fux a(fuv $$0) {
      fuz $$1 = fse.a($$0, 0.0F);
      fva $$2 = $$1.a();
      $$2.a("head", fuw.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fut.a);
      $$2.a("body", fuw.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fut.a);
      $$2.a("right_leg", fuw.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fut.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fuw.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fut.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fuw.c(), fut.a);
      return fux.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fqo.a(this.o, this.n, $$0.gh(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
