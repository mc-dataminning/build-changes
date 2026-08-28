public class fza extends fxo<gtd> {
   private final gaq a;
   private final gaq b;

   public fza(gaq $$0) {
      super($$0);
      this.a = $$0.b("left_paddle");
      this.b = $$0.b("right_paddle");
   }

   public static void a(gba $$0) {
      $$0.a(
         "bottom",
         gav.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         gas.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         gav.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gas.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gav.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gas.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      a($$1);
      return gaw.a($$0, 128, 64);
   }

   public static gaw b() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      a($$1);
      $$1.a("chest_bottom", gav.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gas.a(-2.0F, -10.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gav.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gas.a(-2.0F, -14.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gav.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gas.a(-1.0F, -11.1F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gaw.a($$0, 128, 128);
   }

   public void a(gtd $$0) {
      super.a($$0);
      a($$0.h, 0, this.a);
      a($$0.i, 1, this.b);
   }

   private static void a(float $$0, int $$1, gaq $$2) {
      $$2.e = azf.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (azf.a(-$$0) + 1.0F) / 2.0F);
      $$2.f = azf.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (azf.a(-$$0 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
