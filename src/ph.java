import java.util.List;

public class ph {
   private static final jy a = new jy()
      .a(lq.aE, rf::a)
      .a(lq.aB, rd::a)
      .a(lq.aC, si::a)
      .a(lq.aI, sx::a)
      .a(lq.aJ, ro::a)
      .a(lq.aL, rn::a)
      .a(lq.aK, rk::a)
      .a(lq.aM, rj::a)
      .a(lq.az, rz::a)
      .a(lq.aR, ddn::a)
      .a(lq.aH, rg::a)
      .a(lq.aD, dyc::a)
      .a(lq.aG, dya::a)
      .a(lq.aQ, eib::a)
      .a(lq.aF, egn::a)
      .a(lq.aA, xl::a)
      .a(lq.aP, cwy::a)
      .a(lq.aO, cww::a)
      .a(lq.m, cgl::a)
      .a(lq.s, brr::a)
      .a(lq.d, dpa::a);

   private static void a(jk.a $$0) {
      a($$0.b(lq.aI), $$0.b(lq.az));
   }

   public static void a(jj<ehp> $$0, jk<dcy> $$1) {
      $$1.b().forEach($$1x -> {
         alf $$2 = $$1x.h().a();
         List<jm<ehp>> $$3 = ((dcy)$$1x.a()).d().b();
         $$3.stream().flatMap(jm::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ji.c<ehp> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ehp $$0) {
      return $$0.c().contains(ehd.a());
   }

   public static jk.a a() {
      jw.b $$0 = jw.a(lp.aw);
      jk.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
