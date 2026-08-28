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
      .a(mh.aW, dkz::a)
      .a(mh.aY, ql::a)
      .a(mh.aO, egu::a)
      .a(mh.aX, egs::a)
      .a(mh.bn, eqy::a)
      .a(mh.aS, epk::a)
      .a(mh.aI, wu::a)
      .a(mh.bl, dia::a)
      .a(mh.bk, dhy::a)
      .a(mh.bi, dzr::a)
      .a(mh.bm, ckk::a)
      .a(mh.aZ, cnl::a)
      .a(mh.aN, bva::a)
      .a(mh.aF, dxd::a)
      .a(mh.aR, dgc::a)
      .a(mh.aQ, dhl::a)
      .a(mh.aV, czs::a)
      .a(mh.aU, czf::a)
      .a(mh.ba, cjw::a)
      .a(mh.aM, cjl::a)
      .a(mh.aJ, cjh::a)
      .a(mh.bg, sm::a)
      .a(mh.bh, ss::a)
      .a(mh.aT, clc::a)
      .a(mh.aH, cje::a);

   private static void a(jh.a $$0) {
      a($$0.e(mh.bb), $$0.e(mh.aG));
   }

   public static void a(jg<eqm> $$0, jh<dkk> $$1) {
      $$1.c().forEach($$1x -> {
         alg $$2 = $$1x.h().a();
         List<jj<eqm>> $$3 = ((dkk)$$1x.a()).d().c();
         $$3.stream().flatMap(jj::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jf.c<eqm> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eqm $$0) {
      return $$0.c().contains(eqa.a());
   }

   public static jh.a a() {
      jt.b $$0 = jt.a(mg.aF);
      jh.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
