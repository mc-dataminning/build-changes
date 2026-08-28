public class gkd extends ghn<hec> {
   private static final int a = 16;
   private final gkr b;
   private final gkr c;
   private final gkr d;

   public gkd(gkr $$0) {
      super($$0, gry::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("bone", gkw.c(), gkt.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gkw.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gkv(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gkv(0.0F)),
         gkt.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gkw.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gkv(0.0F)), gkt.a(0.0F, 0.0F, 0.0F));
      return gkx.a($$0, 64, 32);
   }

   @Override
   public void a(hec $$0) {
      super.a($$0);
      this.c.f = -$$0.v * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.v * 16.0F * (float) (Math.PI / 180.0);
   }
}
