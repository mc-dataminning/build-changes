public class gjf<S extends hfq> extends ggy<S> implements giw {
   private final gjo a = this.p.b("hat_rim");

   public gjf(gjo $$0) {
      super($$0);
   }

   public static gju a() {
      gjw $$0 = ggy.a(gjs.a, 0.0F);
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("head", new gjt().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gjq.a);
      gjy $$3 = $$2.a("hat", gjt.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gjs(0.5F)), gjq.a);
      $$3.a("hat_rim", gjt.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gjq.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gjt.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gjs(0.05F)), gjq.a);
      $$1.a("right_arm", gjt.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjq.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gjt.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjq.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gjt.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gjt.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gjq.a(2.0F, 12.0F, 0.0F));
      return gju.a($$0, 64, 64);
   }

   public static gju a(gjs $$0) {
      gjw $$1 = ggy.a($$0, 0.0F);
      gjy $$2 = $$1.a();
      gjy $$3 = $$2.a("head", gjt.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gjq.a);
      $$2.a("body", gjt.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjq.a);
      $$2.a("right_leg", gjt.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjq.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gjt.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gjq.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gjt.c(), gjq.a);
      return gju.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gey.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fjy $$0) {
      this.a(bxa.b, $$0);
   }
}
