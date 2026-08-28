public class gdt extends gbf<gxo> {
   private static final int a = 16;
   private final geh b;
   private final geh c;
   private final geh d;

   public gdt(geh $$0) {
      super($$0, glo::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("bone", gem.c(), gej.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gem.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gel(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gel(0.0F)),
         gej.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gem.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gel(0.0F)), gej.a(0.0F, 0.0F, 0.0F));
      return gen.a($$0, 64, 32);
   }

   @Override
   public void a(gxo $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
