public class fzq extends fxk<gvq> {
   private final gal a;
   private final gal b;

   public fzq(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static gar a(gap $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gaq.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gan.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gaq.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gan.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gaq.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gan.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gaq.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gan.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gaq.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gan.a(0.0F, 20.5F, -3.0F));
      return gar.a($$1, 32, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gvq $$0) {
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.b.f = -$$1 * 0.45F * azd.a(0.6F * $$0.p);
   }
}
