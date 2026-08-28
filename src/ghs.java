import java.util.Set;

public class ghs extends gjn<hfr> {
   public static final glp a = new ggx(false, 8.0F, 6.0F, Set.of("head"));
   private static final int i = 12;

   public ghs(glg $$0) {
      super($$0);
   }

   public static glm b() {
      glo $$0 = c();
      return glm.a($$0, 64, 64);
   }

   static glo c() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a(
         "head",
         gll.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(1, 33)
            .a(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F),
         gli.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         gll.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         gli.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      gll $$2 = gll.c().a().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      gll $$3 = gll.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, gli.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gli.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, gli.a(-4.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gli.a(4.0F, 12.0F, -5.0F));
      return $$0;
   }

   public glg d() {
      return this.b;
   }
}
