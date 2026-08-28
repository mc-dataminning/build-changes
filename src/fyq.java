import java.util.Set;

public class fyq extends fyu<gux> {
   private static final float j = 2.25F;
   public static final gau a = new fwm(true, 16.0F, 4.0F, 2.25F, 2.0F, 24.0F, Set.of("head"));

   public fyq(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a(
         "head",
         gaq.c()
            .a(0, 0)
            .a(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F)
            .a(0, 44)
            .a("mouth", -2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F)
            .a(26, 0)
            .a("right_ear", -4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F)
            .a(26, 0)
            .a()
            .a("left_ear", 2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F),
         gan.a(0.0F, 10.0F, -16.0F)
      );
      $$1.a(
         "body",
         gaq.c().a(0, 19).a(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F).a(39, 0).a(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F),
         gan.a(-2.0F, 9.0F, 12.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      int $$2 = 10;
      gaq $$3 = gaq.c().a(50, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F);
      $$1.a("right_hind_leg", $$3, gan.a(-4.5F, 14.0F, 6.0F));
      $$1.a("left_hind_leg", $$3, gan.a(4.5F, 14.0F, 6.0F));
      gaq $$4 = gaq.c().a(50, 40).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F);
      $$1.a("right_front_leg", $$4, gan.a(-3.5F, 14.0F, -8.0F));
      $$1.a("left_front_leg", $$4, gan.a(3.5F, 14.0F, -8.0F));
      return gar.a($$0, 128, 64).a(gau.scaling(1.2F));
   }

   public void a(gux $$0) {
      this.a().e().forEach(gal::c);
      super.a($$0);
      float $$1 = $$0.a * $$0.a;
      float $$2 = $$0.ab;
      float $$3 = $$0.ae ? 0.44444445F : 1.0F;
      this.d.e -= $$1 * (float) Math.PI * 0.35F;
      this.d.c += $$1 * $$2 * 2.0F;
      this.g.c -= $$1 * $$2 * 20.0F;
      this.g.d += $$1 * $$2 * 4.0F;
      this.g.e -= $$1 * (float) Math.PI * 0.45F;
      this.i.c = this.g.c;
      this.i.d = this.g.d;
      this.i.e -= $$1 * (float) Math.PI * 0.45F;
      this.c.c -= $$1 * $$3 * 24.0F;
      this.c.d += $$1 * $$3 * 13.0F;
      this.c.e += $$1 * (float) Math.PI * 0.15F;
   }
}
