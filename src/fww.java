public class fww extends fxo<gtd> {
   private static final int a = 28;
   private static final int b = 32;
   private static final int c = 6;
   private static final int d = 20;
   private static final int e = 4;
   private static final String f = "water_patch";
   private static final String g = "back";
   private static final String i = "front";
   private static final String j = "right";
   private static final String k = "left";
   private final gaq l;
   private final gaq m;

   public fww(gaq $$0) {
      super($$0);
      this.l = $$0.b("left_paddle");
      this.m = $$0.b("right_paddle");
   }

   private static void a(gba $$0) {
      int $$1 = 16;
      int $$2 = 14;
      int $$3 = 10;
      $$0.a("bottom", gav.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gas.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", gav.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), gas.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", gav.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), gas.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", gav.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gas.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", gav.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gas.a(0.0F, 4.0F, 9.0F));
      int $$4 = 20;
      int $$5 = 7;
      int $$6 = 6;
      float $$7 = -5.0F;
      $$0.a(
         "left_paddle",
         gav.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gas.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gav.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gas.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
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
      $$1.a("chest_bottom", gav.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gas.a(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gav.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gas.a(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gav.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gas.a(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gaw.a($$0, 128, 128);
   }

   public static gaw c() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("water_patch", gav.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gas.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gaw.a($$0, 0, 0);
   }

   public void a(gtd $$0) {
      super.a($$0);
      a($$0.h, 0, this.l);
      a($$0.i, 1, this.m);
   }

   private static void a(float $$0, int $$1, gaq $$2) {
      $$2.e = azf.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (azf.a(-$$0) + 1.0F) / 2.0F);
      $$2.f = azf.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (azf.a(-$$0 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
