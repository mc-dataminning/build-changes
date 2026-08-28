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
      .a(lq.aR, ddm::a)
      .a(lq.aH, rg::a)
      .a(lq.aD, dyb::a)
      .a(lq.aG, dxz::a)
      .a(lq.aQ, eia::a)
      .a(lq.aF, egm::a)
      .a(lq.aA, xl::a)
      .a(lq.aP, cwx::a)
      .a(lq.aO, cwv::a)
      .a(lq.m, cgk::a)
      .a(lq.s, brq::a)
      .a(lq.d, doz::a);

   private static void a(jk.a $$0) {
      a($$0.b(lq.aI), $$0.b(lq.az));
   }

   public static void a(jj<eho> $$0, jk<dcx> $$1) {
      $$1.b().forEach($$1x -> {
         alf $$2 = $$1x.h().a();
         List<jm<eho>> $$3 = ((dcx)$$1x.a()).d().b();
         $$3.stream().flatMap(jm::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ji.c<eho> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eho $$0) {
      return $$0.c().contains(ehc.a());
   }

   public static jk.a a() {
      jw.b $$0 = jw.a(lp.aw);
      jk.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
