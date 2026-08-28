public class fxg extends fxk<gub> {
   public static final gau a = gau.scaling(0.5F);
   private final gal b;
   private final gal c;
   private final gal d;

   public fxg(gal $$0) {
      this.b = $$0;
      this.d = $$0.b("left_wing");
      this.c = $$0.b("right_wing");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gap $$2 = new gap(1.0F);
      $$1.a(
         "left_wing",
         gaq.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gan.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gaq.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gan.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gar.a($$0, 64, 32);
   }

   public void a(gub $$0) {
      this.d.c = $$0.I ? 3.0F : 0.0F;
      this.d.e = $$0.N;
      this.d.g = $$0.P;
      this.d.f = $$0.O;
      this.c.f = -this.d.f;
      this.c.c = this.d.c;
      this.c.e = this.d.e;
      this.c.g = -this.d.g;
   }

   @Override
   public gal a() {
      return this.b;
   }
}
