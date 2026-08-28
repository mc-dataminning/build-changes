import java.util.List;

public class pc {
   private static final kc a = new kc()
      .a(lu.aK, qs::a)
      .a(lu.aH, qq::a)
      .a(lu.aI, rq::a)
      .a(lu.aQ, sf::a)
      .a(lu.aR, rb::a)
      .a(lu.aT, ra::a)
      .a(lu.aS, qx::a)
      .a(lu.aU, qw::a)
      .a(lu.aF, ri::a)
      .a(lu.aZ, dej::a)
      .a(lu.aP, qt::a)
      .a(lu.aJ, dzc::a)
      .a(lu.aO, dza::a)
      .a(lu.aY, ejc::a)
      .a(lu.aN, eho::a)
      .a(lu.aG, wu::a)
      .a(lu.aX, cwz::a)
      .a(lu.aW, cwx::a)
      .a(lu.m, cgh::a)
      .a(lu.X, cjc::a)
      .a(lu.s, brm::a)
      .a(lu.d, dpx::a)
      .a(lu.aL, daf::a)
      .a(lu.aM, dbn::a)
      .a(lu.L, cuv::a);

   private static void a(jo.a $$0) {
      a($$0.b(lu.aQ), $$0.b(lu.aF));
   }

   public static void a(jn<eiq> $$0, jo<ddu> $$1) {
      $$1.b().forEach($$1x -> {
         akq $$2 = $$1x.h().a();
         List<jq<eiq>> $$3 = ((ddu)$$1x.a()).d().b();
         $$3.stream().flatMap(jq::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jm.c<eiq> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ad.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ad.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(eiq $$0) {
      return $$0.c().contains(eie.a());
   }

   public static jo.a a() {
      ka.b $$0 = ka.a(lt.aA);
      jo.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
