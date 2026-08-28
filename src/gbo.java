import java.util.Set;

public class gbo extends gcr<gyc> {
   public static final ges a = new gag(true, 19.0F, 1.0F, 2.5F, 2.0F, 24.0F, Set.of("head"));

   public gbo(gej $$0) {
      super($$0);
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a(
         "head",
         geo.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         gel.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", geo.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gel.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", geo.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gel.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", geo.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), gel.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", geo.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), gel.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", geo.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gel.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", geo.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gel.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", geo.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gel.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", geo.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gel.a(-3.0F, 14.0F, -6.0F));
      return gep.a($$0, 64, 64);
   }

   public void a(gyc $$0) {
      super.a($$0);
      this.b.b("left_horn").k = $$0.a;
      this.b.b("right_horn").k = $$0.b;
      if ($$0.c != 0.0F) {
         this.b.e = $$0.c;
      }
   }
}
