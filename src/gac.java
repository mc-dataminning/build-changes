public class gac extends fxo<gtq> {
   private static final int a = 16;
   private final gaq b;
   private final gaq c;
   private final gaq d;

   public gac(gaq $$0) {
      super($$0, ghv::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("bone", gav.c(), gas.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gav.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gau(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gau(0.0F)),
         gas.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gav.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gau(0.0F)), gas.a(0.0F, 0.0F, 0.0F));
      return gaw.a($$0, 64, 32);
   }

   @Override
   public void a(gtq $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
