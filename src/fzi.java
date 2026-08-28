import java.util.Set;

public class fzi extends fyk<gva> {
   private static final String j = "egg_belly";
   public static final gak a = new fwc(true, 120.0F, 0.0F, 9.0F, 6.0F, 120.0F, Set.of("head"));
   private final gab k;

   public fzi(gab $$0) {
      super($$0);
      this.k = $$0.b("egg_belly");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(3, 0).a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), gad.a(0.0F, 19.0F, -10.0F));
      $$1.a(
         "body",
         gag.c().a(7, 37).a("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).a(31, 1).a("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         gad.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("egg_belly", gag.c().a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), gad.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 1;
      $$1.a("right_hind_leg", gag.c().a(1, 23).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gad.a(-3.5F, 22.0F, 11.0F));
      $$1.a("left_hind_leg", gag.c().a(1, 12).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gad.a(3.5F, 22.0F, 11.0F));
      $$1.a("right_front_leg", gag.c().a(27, 30).a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gad.a(-5.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", gag.c().a(27, 24).a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gad.a(5.0F, 21.0F, -4.0F));
      return gah.a($$0, 128, 64);
   }

   public void a(gva $$0) {
      super.a($$0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      this.e.e = azc.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.f.e = azc.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.g.g = azc.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.i.g = azc.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.g.e = 0.0F;
      this.i.e = 0.0F;
      this.g.f = 0.0F;
      this.i.f = 0.0F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
      if ($$0.a) {
         float $$3 = $$0.b ? 4.0F : 1.0F;
         float $$4 = $$0.b ? 2.0F : 1.0F;
         float $$5 = 5.0F;
         this.g.f = azc.b($$3 * $$1 * 5.0F + (float) Math.PI) * 8.0F * $$2 * $$4;
         this.g.g = 0.0F;
         this.i.f = azc.b($$3 * $$1 * 5.0F) * 8.0F * $$2 * $$4;
         this.i.g = 0.0F;
         this.e.f = azc.b($$1 * 5.0F + (float) Math.PI) * 3.0F * $$2;
         this.e.e = 0.0F;
         this.f.f = azc.b($$1 * 5.0F) * 3.0F * $$2;
         this.f.e = 0.0F;
      }

      this.k.k = $$0.c;
      this.b.c();
      if (this.k.k) {
         this.b.c--;
      }
   }
}
