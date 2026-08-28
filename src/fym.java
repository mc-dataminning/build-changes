public class fym extends fxa<gsh> {
   private final gab a;
   private final gab b;
   private final gab c;

   public fym(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("left_paddle");
      this.c = $$0.b("right_paddle");
   }

   public static void a(gal $$0) {
      $$0.a(
         "bottom",
         gag.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         gad.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         gag.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gad.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         gag.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         gad.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
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
      $$1.a("chest_bottom", gag.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), gad.a(-2.0F, -10.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", gag.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), gad.a(-2.0F, -14.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", gag.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), gad.a(-1.0F, -11.1F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return gah.a($$0, 128, 128);
   }

   public void a(gsh $$0) {
      a($$0.h, 0, this.b);
      a($$0.i, 1, this.c);
   }

   @Override
   public gab a() {
      return this.a;
   }

   private static void a(float $$0, int $$1, gab $$2) {
      $$2.e = azc.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (azc.a(-$$0) + 1.0F) / 2.0F);
      $$2.f = azc.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (azc.a(-$$0 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
