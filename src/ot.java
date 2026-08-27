import java.util.List;

public class ot {
   private static final jm a = new jm()
      .a(le.aE, qo::a)
      .a(le.aB, qm::a)
      .a(le.aC, rq::a)
      .a(le.aI, sf::a)
      .a(le.aJ, qx::a)
      .a(le.aL, qw::a)
      .a(le.aK, qt::a)
      .a(le.aM, qs::a)
      .a(le.az, ri::a)
      .a(le.aR, dbr::a)
      .a(le.aH, qp::a)
      .a(le.aD, dwg::a)
      .a(le.aG, dwe::a)
      .a(le.aQ, egf::a)
      .a(le.aF, eer::a)
      .a(le.aA, wq::a)
      .a(le.aP, cvf::a)
      .a(le.aO, cvd::a)
      .a(le.m, ceu::a)
      .a(le.s, bqi::a)
      .a(le.d, dne::a);

   private static void a(iy.a $$0) {
      a($$0.b(le.aI), $$0.b(le.az));
   }

   public static void a(ix<eft> $$0, iy<dbc> $$1) {
      $$1.b().forEach($$1x -> {
         akh $$2 = $$1x.h().a();
         List<ja<eft>> $$3 = ((dbc)$$1x.a()).d().b();
         $$3.stream().flatMap(ja::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               iw.c<eft> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ac.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ac.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(eft $$0) {
      return $$0.c().contains(efh.a());
   }

   public static iy.a a() {
      jk.b $$0 = jk.a(ld.aw);
      iy.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
