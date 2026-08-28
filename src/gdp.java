public class gdp extends gbh<gzv> {
   private final gej a;

   public gdp(gej $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gep a(gen $$0) {
      ger $$1 = new ger();
      get $$2 = $$1.a();
      int $$3 = 19;
      $$2.a("body", geo.c().a(0, 20).a(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, $$0), gel.a(0.0F, 19.0F, 0.0F));
      $$2.a("tail", geo.c().a(21, 16).a(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, $$0), gel.a(0.0F, 19.0F, 3.0F));
      $$2.a("right_fin", geo.c().a(2, 16).a(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gel.a(-1.0F, 20.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", geo.c().a(2, 12).a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gel.a(1.0F, 20.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", geo.c().a(20, 11).a(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), gel.a(0.0F, 16.0F, -3.0F));
      $$2.a("bottom_fin", geo.c().a(20, 21).a(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), gel.a(0.0F, 22.0F, -3.0F));
      return gep.a($$1, 32, 32);
   }

   public void a(gzv $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azu.a(0.6F * $$0.p);
   }
}
