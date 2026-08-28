import java.util.Set;

public class fyg extends fyk<gug> {
   public static final gak a = new fwc(true, 16.0F, 4.0F, 2.25F, 2.0F, 24.0F, Set.of("head"));

   public fyg(gab $$0) {
      super($$0);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a(
         "head",
         gag.c()
            .a(0, 0)
            .a(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F)
            .a(0, 44)
            .a("mouth", -2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F)
            .a(26, 0)
            .a("right_ear", -4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F)
            .a(26, 0)
            .a()
            .a("left_ear", 2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F),
         gad.a(0.0F, 10.0F, -16.0F)
      );
      $$1.a(
         "body",
         gag.c().a(0, 19).a(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F).a(39, 0).a(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F),
         gad.a(-2.0F, 9.0F, 12.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      int $$2 = 10;
      gag $$3 = gag.c().a(50, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F);
      $$1.a("right_hind_leg", $$3, gad.a(-4.5F, 14.0F, 6.0F));
      $$1.a("left_hind_leg", $$3, gad.a(4.5F, 14.0F, 6.0F));
      gag $$4 = gag.c().a(50, 40).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F);
      $$1.a("right_front_leg", $$4, gad.a(-3.5F, 14.0F, -8.0F));
      $$1.a("left_front_leg", $$4, gad.a(3.5F, 14.0F, -8.0F));
      return gah.a($$0, 128, 64).a(gak.scaling(1.2F));
   }

   public void a(gug $$0) {
      super.a($$0);
      float $$1 = $$0.a * $$0.a;
      float $$2 = 1.0F - $$1;
      this.d.e = (float) (Math.PI / 2) - $$1 * (float) Math.PI * 0.35F;
      this.d.c = 9.0F * $$2 + 11.0F * $$1;
      this.g.c = 14.0F * $$2 - 6.0F * $$1;
      this.g.d = -8.0F * $$2 - 4.0F * $$1;
      this.g.e -= $$1 * (float) Math.PI * 0.45F;
      this.i.c = this.g.c;
      this.i.d = this.g.d;
      this.i.e -= $$1 * (float) Math.PI * 0.45F;
      if ($$0.ae) {
         this.c.c = 10.0F * $$2 - 9.0F * $$1;
         this.c.d = -16.0F * $$2 - 7.0F * $$1;
      } else {
         this.c.c = 10.0F * $$2 - 14.0F * $$1;
         this.c.d = -16.0F * $$2 - 3.0F * $$1;
      }

      this.c.e += $$1 * (float) Math.PI * 0.15F;
   }
}
