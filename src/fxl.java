public class fxl extends fxk<gtn> {
   private static final String a = "base";
   private static final String b = "upper_jaw";
   private static final String c = "lower_jaw";
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;

   public fxl(gal $$0) {
      this.d = $$0;
      this.e = $$0.b("base");
      this.f = this.e.b("upper_jaw");
      this.g = this.e.b("lower_jaw");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("base", gaq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F), gan.a(-5.0F, 24.0F, -5.0F));
      gaq $$3 = gaq.c().a(40, 0).a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      $$2.a("upper_jaw", $$3, gan.a(6.5F, 0.0F, 1.0F, 0.0F, 0.0F, 2.042035F));
      $$2.a("lower_jaw", $$3, gan.a(3.5F, 0.0F, 9.0F, 0.0F, (float) Math.PI, 4.2411504F));
      return gar.a($$0, 64, 32);
   }

   public void a(gtn $$0) {
      this.d.e().forEach(gal::c);
      float $$1 = $$0.b;
      float $$2 = Math.min($$1 * 2.0F, 1.0F);
      $$2 = 1.0F - $$2 * $$2 * $$2;
      this.f.g = (float) Math.PI - $$2 * 0.35F * (float) Math.PI;
      this.g.g = (float) Math.PI + $$2 * 0.35F * (float) Math.PI;
      this.e.c = this.e.c - ($$1 + azd.a($$1 * 2.7F)) * 7.2F;
      float $$3 = 1.0F;
      if ($$1 > 0.9F) {
         $$3 *= (1.0F - $$1) / 0.1F;
      }

      this.d.c = 24.0F - 20.0F * $$3;
      this.d.h = $$3;
      this.d.i = $$3;
      this.d.j = $$3;
   }

   @Override
   public gal a() {
      return this.d;
   }
}
