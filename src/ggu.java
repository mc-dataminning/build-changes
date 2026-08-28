public class ggu<S extends hdb> extends geo<S> implements ggm {
   private final ghd a = this.p.b("hat_rim");

   public ggu(ghd $$0) {
      super($$0);
   }

   public static ghj a() {
      ghl $$0 = geo.a(ghh.a, 0.0F);
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("head", new ghi().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), ghf.a);
      ghn $$3 = $$2.a("hat", ghi.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ghh(0.5F)), ghf.a);
      $$3.a("hat_rim", ghi.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), ghf.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", ghi.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ghh(0.05F)), ghf.a);
      $$1.a("right_arm", ghi.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ghf.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ghi.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ghf.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ghi.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ghf.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ghi.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ghf.a(2.0F, 12.0F, 0.0F));
      return ghj.a($$0, 64, 64);
   }

   public static ghj a(ghh $$0) {
      ghl $$1 = geo.a($$0, 0.0F);
      ghn $$2 = $$1.a();
      ghn $$3 = $$2.a("head", ghi.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), ghf.a);
      $$2.a("body", ghi.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), ghf.a);
      $$2.a("right_leg", ghi.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), ghf.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", ghi.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), ghf.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", ghi.c(), ghf.a);
      return ghj.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gcq.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fho $$0) {
      this.a(bwk.b, $$0);
   }
}
