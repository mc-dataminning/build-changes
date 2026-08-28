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
      .a(lq.aR, ddl::a)
      .a(lq.aH, rg::a)
      .a(lq.aD, dya::a)
      .a(lq.aG, dxy::a)
      .a(lq.aQ, ehz::a)
      .a(lq.aF, egl::a)
      .a(lq.aA, xk::a)
      .a(lq.aP, cww::a)
      .a(lq.aO, cwu::a)
      .a(lq.m, cgj::a)
      .a(lq.s, brp::a)
      .a(lq.d, doy::a);

   private static void a(jk.a $$0) {
      a($$0.b(lq.aI), $$0.b(lq.az));
   }

   public static void a(jj<ehn> $$0, jk<dcw> $$1) {
      $$1.b().forEach($$1x -> {
         ale $$2 = $$1x.h().a();
         List<jm<ehn>> $$3 = ((dcw)$$1x.a()).d().b();
         $$3.stream().flatMap(jm::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ji.c<ehn> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ehn $$0) {
      return $$0.c().contains(ehb.a());
   }

   public static jk.a a() {
      jw.b $$0 = jw.a(lp.aw);
      jk.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
