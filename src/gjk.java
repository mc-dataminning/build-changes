public class gjk<S extends hfw> extends ghd<S> implements gjb {
   private final gjt a = this.p.b("hat_rim");

   public gjk(gjt $$0) {
      super($$0);
   }

   public static gjz a() {
      gkb $$0 = ghd.a(gjx.a, 0.0F);
      gkd $$1 = $$0.a();
      gkd $$2 = $$1.a("head", new gjy().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gjv.a);
      gkd $$3 = $$2.a("hat", gjy.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gjx(0.5F)), gjv.a);
      $$3.a("hat_rim", gjy.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gjv.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gjy.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gjx(0.05F)), gjv.a);
      $$1.a("right_arm", gjy.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjv.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gjy.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjv.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gjy.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjv.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gjy.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjv.a(2.0F, 12.0F, 0.0F));
      return gjz.a($$0, 64, 64);
   }

   public static gjz a(gjx $$0) {
      gkb $$1 = ghd.a($$0, 0.0F);
      gkd $$2 = $$1.a();
      gkd $$3 = $$2.a("head", gjy.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gjv.a);
      $$2.a("body", gjy.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjv.a);
      $$2.a("right_leg", gjy.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjv.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gjy.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjv.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gjy.c(), gjv.a);
      return gjz.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gfd.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fkd $$0) {
      this.a(bxa.b, $$0);
   }
}
