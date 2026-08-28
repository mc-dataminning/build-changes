import java.util.List;

public class ov {
   private static final ju a = new ju()
      .a(mg.aP, qk::a)
      .a(mg.aK, qi::a)
      .a(mg.aL, ri::a)
      .a(mg.bb, rx::a)
      .a(mg.be, qt::a)
      .a(mg.bd, qs::a)
      .a(mg.bc, qp::a)
      .a(mg.bf, qo::a)
      .a(mg.aG, ra::a)
      .a(mg.aW, dks::a)
      .a(mg.aY, ql::a)
      .a(mg.aO, egn::a)
      .a(mg.aX, egl::a)
      .a(mg.bn, eqr::a)
      .a(mg.aS, epd::a)
      .a(mg.aI, wu::a)
      .a(mg.bl, dht::a)
      .a(mg.bk, dhr::a)
      .a(mg.bi, dzk::a)
      .a(mg.bm, ckg::a)
      .a(mg.aZ, cne::a)
      .a(mg.aN, bux::a)
      .a(mg.aF, dww::a)
      .a(mg.aR, dfv::a)
      .a(mg.aQ, dhe::a)
      .a(mg.aV, czl::a)
      .a(mg.aU, cyy::a)
      .a(mg.ba, cjr::a)
      .a(mg.aM, cjg::a)
      .a(mg.aJ, cjc::a)
      .a(mg.bg, sm::a)
      .a(mg.bh, ss::a)
      .a(mg.aT, cky::a)
      .a(mg.aH, ciz::a);

   private static void a(jg.a $$0) {
      a($$0.e(mg.bb), $$0.e(mg.aG));
   }

   public static void a(jf<eqf> $$0, jg<dkd> $$1) {
      $$1.c().forEach($$1x -> {
         alg $$2 = $$1x.h().a();
         List<ji<eqf>> $$3 = ((dkd)$$1x.a()).d().c();
         $$3.stream().flatMap(ji::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               je.c<eqf> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  af.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  af.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(eqf $$0) {
      return $$0.c().contains(ept.a());
   }

   public static jg.a a() {
      js.b $$0 = js.a(mf.aF);
      jg.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
