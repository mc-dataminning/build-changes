public class fyt extends fxk<gtl> {
   private final gal a;
   private final gal b;
   private final gal c;

   public fyt(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.c = $$0.b("right_fin");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gaq.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gan.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gaq.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gan.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gaq.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gan.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gaq.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gan.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gaq.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gan.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gaq.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gan.a(1.5F, 22.0F, -1.5F));
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
