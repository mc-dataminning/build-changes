public class fxa extends fxk<guj> {
   private final gal a;
   private final gal b;

   public fxa(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gaq.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gan.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gaq.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gan.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gaq.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gan.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gaq.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gan.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gaq.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gan.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gaq.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gan.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gaq.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gan.a(0.0F, 20.0F, 0.0F));
      return gar.a($$0, 32, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(guj $$0) {
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.b.f = -$$1 * 0.45F * azd.a(0.6F * $$0.p);
   }
}
