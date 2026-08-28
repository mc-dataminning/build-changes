public class fyy extends fxk<gvc> {
   public static final gau a = gau.scaling(0.5F);
   public static final gau b = gau.scaling(1.5F);
   private static final String c = "body_front";
   private static final String d = "body_back";
   private final gal e;
   private final gal f;

   public fyy(gal $$0) {
      this.e = $$0;
      this.f = $$0.b("body_back");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 20;
      gav $$3 = $$1.a("body_front", gaq.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gan.a(0.0F, 20.0F, 0.0F));
      gav $$4 = $$1.a("body_back", gaq.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gan.a(0.0F, 20.0F, 8.0F));
      $$1.a("head", gaq.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gan.a(0.0F, 20.0F, 0.0F));
      $$4.a("back_fin", gaq.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), gan.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", gaq.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), gan.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", gaq.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), gan.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", gaq.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gan.a(-1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gaq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gan.a(1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return gar.a($$0, 32, 32);
   }

   @Override
   public gal a() {
      return this.e;
   }

   public void a(gvc $$0) {
      float $$1 = 1.0F;
      float $$2 = 1.0F;
      if (!$$0.af) {
         $$1 = 1.3F;
         $$2 = 1.7F;
      }

      this.f.f = -$$1 * 0.25F * azd.a($$2 * 0.6F * $$0.p);
   }
}
