import java.util.List;

public class ow {
   private static final jv a = new jv()
      .a(mh.aP, qk::a)
      .a(mh.aK, qi::a)
      .a(mh.aL, ri::a)
      .a(mh.bb, rx::a)
      .a(mh.be, qt::a)
      .a(mh.bd, qs::a)
      .a(mh.bc, qp::a)
      .a(mh.bf, qo::a)
      .a(mh.aG, ra::a)
      .a(mh.aW, dlp::a)
      .a(mh.aY, ql::a)
      .a(mh.aO, ehk::a)
      .a(mh.aX, ehi::a)
      .a(mh.bo, err::a)
      .a(mh.aS, eqd::a)
      .a(mh.aI, ww::a)
      .a(mh.bl, dio::a)
      .a(mh.bk, dim::a)
      .a(mh.bi, eah::a)
      .a(mh.bm, cmq::a)
      .a(mh.bn, cmo::a)
      .a(mh.aZ, cnz::a)
      .a(mh.aN, bvl::a)
      .a(mh.aF, dxt::a)
      .a(mh.aR, dgq::a)
      .a(mh.aQ, dhz::a)
      .a(mh.aV, dag::a)
      .a(mh.aU, czt::a)
      .a(mh.ba, ckh::a)
      .a(mh.aM, cjw::a)
      .a(mh.aJ, cjs::a)
      .a(mh.bg, sm::a)
      .a(mh.bh, ss::a)
      .a(mh.aT, clk::a)
      .a(mh.aH, cjp::a);

   private static void a(jh.a $$0) {
      a($$0.e(mh.bb), $$0.e(mh.aG));
   }

   public static void a(jg<erf> $$0, jh<dla> $$1) {
      $$1.c().forEach($$1x -> {
         ali $$2 = $$1x.h().a();
         List<jj<erf>> $$3 = ((dla)$$1x.a()).d().c();
         $$3.stream().flatMap(jj::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jf.c<erf> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ag.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ag.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(erf $$0) {
      return $$0.c().contains(eqt.a());
   }

   public static jh.a a() {
      jt.b $$0 = jt.a(mg.aF);
      jh.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
