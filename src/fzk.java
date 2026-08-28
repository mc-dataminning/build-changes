public class fzk extends fxk<guj> {
   private static final String a = "upper_body";
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;

   public fzk(gal $$0) {
      this.b = $$0;
      this.d = $$0.b("head");
      this.e = $$0.b("left_arm");
      this.f = $$0.b("right_arm");
      this.c = $$0.b("upper_body");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      float $$2 = 4.0F;
      gap $$3 = new gap(-0.5F);
      $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), gan.a(0.0F, 4.0F, 0.0F));
      gaq $$4 = gaq.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, gan.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, gan.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", gaq.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), gan.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", gaq.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), gan.a(0.0F, 24.0F, 0.0F));
      return gar.a($$0, 64, 64);
   }

   public void a(guj $$0) {
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      this.d.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0) * 0.25F;
      float $$1 = azd.a(this.c.f);
      float $$2 = azd.b(this.c.f);
      this.e.f = this.c.f;
      this.f.f = this.c.f + (float) Math.PI;
      this.e.b = $$2 * 5.0F;
      this.e.d = -$$1 * 5.0F;
      this.f.b = -$$2 * 5.0F;
      this.f.d = $$1 * 5.0F;
   }

   @Override
   public gal a() {
      return this.b;
   }

   public gal c() {
      return this.d;
   }
}
