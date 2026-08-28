public class fza extends fxa<gts> {
   private static final String a = "upper_body";
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;

   public fza(gab $$0) {
      this.b = $$0;
      this.d = $$0.b("head");
      this.e = $$0.b("left_arm");
      this.f = $$0.b("right_arm");
      this.c = $$0.b("upper_body");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = 4.0F;
      gaf $$3 = new gaf(-0.5F);
      $$1.a("head", gag.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), gad.a(0.0F, 4.0F, 0.0F));
      gag $$4 = gag.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, gad.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, gad.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", gag.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), gad.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", gag.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), gad.a(0.0F, 24.0F, 0.0F));
      return gah.a($$0, 64, 64);
   }

   public void a(gts $$0) {
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      this.d.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0) * 0.25F;
      float $$1 = azc.a(this.c.f);
      float $$2 = azc.b(this.c.f);
      this.e.f = this.c.f;
      this.f.f = this.c.f + (float) Math.PI;
      this.e.b = $$2 * 5.0F;
      this.e.d = -$$1 * 5.0F;
      this.f.b = -$$2 * 5.0F;
      this.f.d = $$1 * 5.0F;
   }

   @Override
   public gab a() {
      return this.b;
   }

   public gab c() {
      return this.d;
   }
}
