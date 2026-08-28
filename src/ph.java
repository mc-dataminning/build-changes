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
      .a(lq.aR, ddh::a)
      .a(lq.aH, rg::a)
      .a(lq.aD, dxw::a)
      .a(lq.aG, dxu::a)
      .a(lq.aQ, ehv::a)
      .a(lq.aF, egh::a)
      .a(lq.aA, xh::a)
      .a(lq.aP, cws::a)
      .a(lq.aO, cwq::a)
      .a(lq.m, cgf::a)
      .a(lq.s, brl::a)
      .a(lq.d, dou::a);

   private static void a(jk.a $$0) {
      a($$0.b(lq.aI), $$0.b(lq.az));
   }

   public static void a(jj<ehj> $$0, jk<dcs> $$1) {
      $$1.b().forEach($$1x -> {
         alb $$2 = $$1x.h().a();
         List<jm<ehj>> $$3 = ((dcs)$$1x.a()).d().b();
         $$3.stream().flatMap(jm::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ji.c<ehj> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ehj $$0) {
      return $$0.c().contains(egx.a());
   }

   public static jk.a a() {
      jw.b $$0 = jw.a(lp.aw);
      jk.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
