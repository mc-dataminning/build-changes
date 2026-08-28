public class gfs extends gex {
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

   public gfs(gjt $$0) {
      super($$0);
   }

   private static void a(gkd $$0) {
      int $$1 = 16;
      int $$2 = 14;
      int $$3 = 10;
      $$0.a("bottom", gjy.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gjv.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", gjy.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), gjv.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", gjy.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), gjv.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", gjy.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gjv.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", gjy.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), gjv.a(0.0F, 4.0F, 9.0F));
      int $$4 = 20;
      int $$5 = 7;
      int $$6 = 6;
      float $$7 = -5.0F;
      $$0.a(
         "left_paddle",
         gjy.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gjv.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gjy.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gjv.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      a($$1);
      return gjz.a($$0, 128, 64);
   }

   public static gjz b() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      a($$1);
      $$1.a("chest_bottom", gjy.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gjv.a(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gjy.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gjv.a(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gjy.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gjv.a(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gjz.a($$0, 128, 128);
   }

   public static gjz c() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("water_patch", gjy.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), gjv.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gjz.a($$0, 0, 0);
   }
}
