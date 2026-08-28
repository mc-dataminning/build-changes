import java.util.Set;

public class fxh extends fyk<gtg> {
   public static final gak a = new fwc(true, 19.0F, 1.0F, 2.5F, 2.0F, 24.0F, Set.of("head"));

   public fxh(gab $$0) {
      super($$0);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a(
         "head",
         gag.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         gad.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", gag.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gad.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", gag.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gad.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", gag.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), gad.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", gag.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), gad.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", gag.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gad.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", gag.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gad.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", gag.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gad.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", gag.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gad.a(-3.0F, 14.0F, -6.0F));
      return gah.a($$0, 64, 64);
   }

   public void a(gtg $$0) {
      this.c.b("left_horn").k = $$0.a;
      this.c.b("right_horn").k = $$0.b;
      super.a($$0);
      if ($$0.c != 0.0F) {
         this.c.e = $$0.c;
      }
   }
}
