public class geq extends gcc<gyl> {
   private static final int a = 16;
   private final gfe b;
   private final gfe c;
   private final gfe d;

   public geq(gfe $$0) {
      super($$0, gmj::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("bone", gfj.c(), gfg.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gfj.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gfi(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gfi(0.0F)),
         gfg.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gfj.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gfi(0.0F)), gfg.a(0.0F, 0.0F, 0.0F));
      return gfk.a($$0, 64, 32);
   }

   @Override
   public void a(gyl $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
