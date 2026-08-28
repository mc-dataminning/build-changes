import java.util.List;

public class ph {
   private static final jy a = new jy()
      .a(lq.aE, rf::a)
      .a(lq.aB, rd::a)
      .a(lq.aC, sh::a)
      .a(lq.aI, sw::a)
      .a(lq.aJ, ro::a)
      .a(lq.aL, rn::a)
      .a(lq.aK, rk::a)
      .a(lq.aM, rj::a)
      .a(lq.az, rz::a)
      .a(lq.aR, ddk::a)
      .a(lq.aH, rg::a)
      .a(lq.aD, dxz::a)
      .a(lq.aG, dxx::a)
      .a(lq.aQ, ehy::a)
      .a(lq.aF, egk::a)
      .a(lq.aA, xk::a)
      .a(lq.aP, cwv::a)
      .a(lq.aO, cwt::a)
      .a(lq.m, cgi::a)
      .a(lq.s, bro::a)
      .a(lq.d, dox::a);

   private static void a(jk.a $$0) {
      a($$0.b(lq.aI), $$0.b(lq.az));
   }

   public static void a(jj<ehm> $$0, jk<dcv> $$1) {
      $$1.b().forEach($$1x -> {
         ale $$2 = $$1x.h().a();
         List<jm<ehm>> $$3 = ((dcv)$$1x.a()).d().b();
         $$3.stream().flatMap(jm::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ji.c<ehm> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ehm $$0) {
      return $$0.c().contains(eha.a());
   }

   public static jk.a a() {
      jw.b $$0 = jw.a(lp.aw);
      jk.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
