import java.util.Set;

public class gba extends gcu<gyr> {
   public static final gev a = new gal(false, 10.0F, 4.0F, Set.of("head"));

   public gba(gem $$0) {
      super($$0);
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      int $$2 = 12;
      $$1.a(
         "head",
         ger.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         geo.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         ger.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         geo.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      ger $$3 = ger.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, geo.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$3, geo.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, geo.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$3, geo.a(4.0F, 12.0F, -6.0F));
      return ges.a($$0, 64, 32);
   }

   public gem b() {
      return this.b;
   }
}
