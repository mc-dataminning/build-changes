public class gac<S extends gwb> extends fxx<S> implements fzu {
   private final gal a = this.p.b("hat_rim");

   public gac(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = fxx.a(gap.a, 0.0F);
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("head", new gaq().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gan.a);
      gav $$3 = $$2.a("hat", gaq.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gap(0.5F)), gan.a);
      $$3.a("hat_rim", gaq.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gan.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gaq.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gap(0.05F)), gan.a);
      $$1.a("right_arm", gaq.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gaq.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gaq.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gaq.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(2.0F, 12.0F, 0.0F));
      return gar.a($$0, 64, 64);
   }

   public static gar a(gap $$0) {
      gat $$1 = fxx.a($$0, 0.0F);
      gav $$2 = $$1.a();
      gav $$3 = $$2.a("head", gaq.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gan.a);
      $$2.a("body", gaq.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gan.a);
      $$2.a("right_leg", gaq.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gan.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gaq.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gan.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gaq.c(), gan.a);
      return gar.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fwf.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
