public class fwk extends fxk<gst> {
   private final gal a;

   public fwk(gal $$0) {
      super(ghq::e);
      this.a = $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("back", gaq.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gan.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gaq $$2 = gaq.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gap.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gan.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gan.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gar.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(gst $$0) {
      this.a.c();
      if ($$0.c > 0.0F) {
         float $$1 = -azd.a($$0.c * 3.0F) * $$0.c;
         this.a.g += $$1 * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public gal a() {
      return this.a;
   }
}
