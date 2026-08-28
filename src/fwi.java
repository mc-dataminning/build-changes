public class fwi extends fxa<gsh> {
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
   private final gab l;
   private final gab m;
   private final gab n;

   public fwi(gab $$0) {
      this.l = $$0;
      this.m = $$0.b("left_paddle");
      this.n = $$0.b("right_paddle");
   }

   private static void a(gal $$0) {
      int $$1 = 16;
      int $$2 = 14;
      int $$3 = 10;
      $$0.a("bottom", gag.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gad.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", gag.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), gad.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", gag.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), gad.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", gag.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gad.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", gag.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gad.a(0.0F, 4.0F, 9.0F));
      int $$4 = 20;
      int $$5 = 7;
      int $$6 = 6;
      float $$7 = -5.0F;
      $$0.a(
         "left_paddle",
         gag.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gad.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gag.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gad.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      a($$1);
      return gah.a($$0, 128, 64);
   }

   public static gah c() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      a($$1);
      $$1.a("chest_bottom", gag.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gad.a(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gag.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gad.a(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gag.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gad.a(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gah.a($$0, 128, 128);
   }

   public static gah d() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("water_patch", gag.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gad.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gah.a($$0, 0, 0);
   }

   public void a(gsh $$0) {
      a($$0.h, 0, this.m);
      a($$0.i, 1, this.n);
   }

   @Override
   public gab a() {
      return this.l;
   }

   private static void a(float $$0, int $$1, gab $$2) {
      $$2.e = azc.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (azc.a(-$$0) + 1.0F) / 2.0F);
      $$2.f = azc.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (azc.a(-$$0 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
