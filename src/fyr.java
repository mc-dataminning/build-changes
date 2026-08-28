public class fyr extends fxk<gtl> {
   private final gal a;
   private final gal b;
   private final gal c;

   public fyr(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("left_blue_fin");
      this.c = $$0.b("right_blue_fin");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gaq.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gan.a(0.0F, 22.0F, 0.0F));
      $$1.a("right_blue_fin", gaq.c().a(24, 0).a(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), gan.a(-4.0F, 15.0F, -2.0F));
      $$1.a("left_blue_fin", gaq.c().a(24, 3).a(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), gan.a(4.0F, 15.0F, -2.0F));
      $$1.a("top_front_fin", gaq.c().a(15, 17).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), gan.a(0.0F, 14.0F, -4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("top_middle_fin", gaq.c().a(14, 16).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F), gan.a(0.0F, 14.0F, 0.0F));
      $$1.a("top_back_fin", gaq.c().a(23, 18).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), gan.a(0.0F, 14.0F, 4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_front_fin", gaq.c().a(5, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), gan.a(-4.0F, 22.0F, -4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("left_front_fin", gaq.c().a(1, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), gan.a(4.0F, 22.0F, -4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("bottom_front_fin", gaq.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), gan.a(0.0F, 22.0F, -4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("bottom_middle_fin", gaq.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), gan.a(0.0F, 22.0F, 0.0F));
      $$1.a("bottom_back_fin", gaq.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), gan.a(0.0F, 22.0F, 4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_back_fin", gaq.c().a(9, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), gan.a(-4.0F, 22.0F, 4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("left_back_fin", gaq.c().a(9, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), gan.a(4.0F, 22.0F, 4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      return gar.a($$0, 32, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   @Override
   public void a(gtl $$0) {
      this.c.g = -0.2F + 0.4F * azd.a($$0.p * 0.2F);
      this.b.g = 0.2F - 0.4F * azd.a($$0.p * 0.2F);
   }
}
