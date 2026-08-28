public class gdp extends gbk<gyr> {
   private final gem a;

   public gdp(gem $$0) {
      super($$0, glt::f);
      this.a = $$0.b("tail");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", ger.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), geo.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", ger.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), geo.a(0.0F, 22.0F, 0.0F));
      return ges.a($$0, 16, 16);
   }

   public void a(gyr $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * bae.a(0.3F * $$0.p);
   }
}
