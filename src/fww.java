public class fww extends fxa<gtk> {
   public static final gak a = gak.scaling(0.5F);
   private final gab b;
   private final gab c;
   private final gab d;

   public fww(gab $$0) {
      this.b = $$0;
      this.d = $$0.b("left_wing");
      this.c = $$0.b("right_wing");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gaf $$2 = new gaf(1.0F);
      $$1.a(
         "left_wing",
         gag.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gad.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gag.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gad.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gah.a($$0, 64, 32);
   }

   public void a(gtk $$0) {
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
   public gab a() {
      return this.b;
   }
}
