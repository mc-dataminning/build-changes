public class fyo extends fxa<gul> {
   public static final gak a = gak.scaling(0.5F);
   public static final gak b = gak.scaling(1.5F);
   private static final String c = "body_front";
   private static final String d = "body_back";
   private final gab e;
   private final gab f;

   public fyo(gab $$0) {
      this.e = $$0;
      this.f = $$0.b("body_back");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      int $$2 = 20;
      gal $$3 = $$1.a("body_front", gag.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gad.a(0.0F, 20.0F, 0.0F));
      gal $$4 = $$1.a("body_back", gag.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gad.a(0.0F, 20.0F, 8.0F));
      $$1.a("head", gag.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gad.a(0.0F, 20.0F, 0.0F));
      $$4.a("back_fin", gag.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), gad.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", gag.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), gad.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", gag.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), gad.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", gag.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gad.a(-1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gag.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gad.a(1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.e;
   }

   public void a(gul $$0) {
      float $$1 = 1.0F;
      float $$2 = 1.0F;
      if (!$$0.af) {
         $$1 = 1.3F;
         $$2 = 1.7F;
      }

      this.f.f = -$$1 * 0.25F * azc.a($$2 * 0.6F * $$0.p);
   }
}
