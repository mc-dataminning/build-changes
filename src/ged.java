public class ged<S extends haj> extends gbx<S> implements gdv {
   private final gem a = this.p.b("hat_rim");

   public ged(gem $$0) {
      super($$0);
   }

   public static ges a() {
      geu $$0 = gbx.a(geq.a, 0.0F);
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("head", new ger().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), geo.a);
      gew $$3 = $$2.a("hat", ger.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new geq(0.5F)), geo.a);
      $$3.a("hat_rim", ger.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), geo.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", ger.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new geq(0.05F)), geo.a);
      $$1.a("right_arm", ger.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), geo.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ger.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), geo.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ger.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geo.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ger.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geo.a(2.0F, 12.0F, 0.0F));
      return ges.a($$0, 64, 64);
   }

   public static ges a(geq $$0) {
      geu $$1 = gbx.a($$0, 0.0F);
      gew $$2 = $$1.a();
      gew $$3 = $$2.a("head", ger.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), geo.a);
      $$2.a("body", ger.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), geo.a);
      $$2.a("right_leg", ger.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), geo.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", ger.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), geo.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", ger.c(), geo.a);
      return ges.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      gae.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
