public class gic extends gex {
   public gic(gjt $$0) {
      super($$0);
   }

   private static void a(gkd $$0) {
      $$0.a(
         "bottom",
         gjy.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         gjv.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         gjy.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gjv.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gjy.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gjv.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
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
      $$1.a("chest_bottom", gjy.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gjv.a(-2.0F, -10.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gjy.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gjv.a(-2.0F, -14.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gjy.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gjv.a(-1.0F, -11.1F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gjz.a($$0, 128, 128);
   }
}
