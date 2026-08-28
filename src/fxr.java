import java.util.Set;

public class fxr extends fyu<gtx> {
   public static final gau a = new fwm(true, 19.0F, 1.0F, 2.5F, 2.0F, 24.0F, Set.of("head"));

   public fxr(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a(
         "head",
         gaq.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         gan.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", gaq.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gan.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", gaq.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gan.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", gaq.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), gan.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", gaq.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), gan.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", gaq.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gan.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", gaq.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gan.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", gaq.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gan.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", gaq.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gan.a(-3.0F, 14.0F, -6.0F));
      return gar.a($$0, 64, 64);
   }

   public void a(gtx $$0) {
      this.c.b("left_horn").k = $$0.a;
      this.c.b("right_horn").k = $$0.b;
      super.a($$0);
      if ($$0.c != 0.0F) {
         this.c.e = $$0.c;
      }
   }
}
