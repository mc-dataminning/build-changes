public class gaz extends gbk<gyr> {
   private final gem a;

   public gaz(gem $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", ger.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), geo.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", ger.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), geo.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", ger.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), geo.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", ger.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), geo.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", ger.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), geo.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", ger.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), geo.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", ger.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), geo.a(0.0F, 20.0F, 0.0F));
      return ges.a($$0, 32, 32);
   }

   public void a(gyr $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * bae.a(0.6F * $$0.p);
   }
}
