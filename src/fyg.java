public class fyg extends fvz<cnj> {
   private static final int a = 16;
   private final fys b;
   private final fys f;
   private final fys g;

   public fyg(fys $$0) {
      super(gfo::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a("bone", fyx.c(), fyu.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fyx.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fyw(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fyw(0.0F)),
         fyu.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fyx.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fyw(0.0F)), fyu.a(0.0F, 0.0F, 0.0F));
      return fyy.a($$0, 64, 32);
   }

   public void a(cnj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fys a() {
      return this.b;
   }
}
