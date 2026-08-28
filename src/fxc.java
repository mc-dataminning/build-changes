public class fxc extends fxk<gte> {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private static final int g = 6;

   public fxc(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.d = $$0.b("right_hind_leg");
      this.c = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.e = $$0.b("left_front_leg");
   }

   public static gar a(gap $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      $$2.a("head", gaq.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gan.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gaq.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gan.a(0.0F, 6.0F, 0.0F));
      gaq $$3 = gaq.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gan.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gan.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gan.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gan.a(2.0F, 18.0F, -4.0F));
      return gar.a($$1, 64, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gte $$0) {
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.c.e = azd.b($$2 * 0.6662F) * 1.4F * $$1;
      this.d.e = azd.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azd.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = azd.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
