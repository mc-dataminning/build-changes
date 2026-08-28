public class ghd extends ggi {
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

   public ghd(gle $$0) {
      super($$0);
   }

   private static void a(glo $$0) {
      int $$1 = 16;
      int $$2 = 14;
      int $$3 = 10;
      $$0.a("bottom", glj.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), glg.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", glj.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), glg.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", glj.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), glg.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", glj.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), glg.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", glj.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), glg.a(0.0F, 4.0F, 9.0F));
      int $$4 = 20;
      int $$5 = 7;
      int $$6 = 6;
      float $$7 = -5.0F;
      $$0.a(
         "left_paddle",
         glj.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         glg.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         glj.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         glg.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      a($$1);
      return glk.a($$0, 128, 64);
   }

   public static glk b() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      a($$1);
      $$1.a("chest_bottom", glj.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), glg.a(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", glj.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), glg.a(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", glj.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), glg.a(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return glk.a($$0, 128, 128);
   }

   public static glk c() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("water_patch", glj.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), glg.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return glk.a($$0, 0, 0);
   }
}
