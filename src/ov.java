import java.util.List;

public class ov {
   private static final ju a = new ju()
      .a(mg.aO, qk::a)
      .a(mg.aJ, qi::a)
      .a(mg.aK, ri::a)
      .a(mg.ba, rx::a)
      .a(mg.bd, qt::a)
      .a(mg.bc, qs::a)
      .a(mg.bb, qp::a)
      .a(mg.be, qo::a)
      .a(mg.aG, ra::a)
      .a(mg.aV, dkn::a)
      .a(mg.aX, ql::a)
      .a(mg.aN, egf::a)
      .a(mg.aW, egd::a)
      .a(mg.bm, eqj::a)
      .a(mg.aR, eov::a)
      .a(mg.aI, wu::a)
      .a(mg.bk, dho::a)
      .a(mg.bj, dhm::a)
      .a(mg.bh, dzc::a)
      .a(mg.bl, ckc::a)
      .a(mg.aY, cna::a)
      .a(mg.aM, buv::a)
      .a(mg.aF, dwo::a)
      .a(mg.aQ, dfq::a)
      .a(mg.aP, dgz::a)
      .a(mg.aU, czg::a)
      .a(mg.aT, cyt::a)
      .a(mg.aZ, cjn::a)
      .a(mg.aL, cjc::a)
      .a(mg.bf, sm::a)
      .a(mg.bg, ss::a)
      .a(mg.aS, cku::a)
      .a(mg.aH, cix::a);

   private static void a(jg.a $$0) {
      a($$0.e(mg.ba), $$0.e(mg.aG));
   }

   public static void a(jf<epx> $$0, jg<djy> $$1) {
      $$1.c().forEach($$1x -> {
         alg $$2 = $$1x.h().a();
         List<ji<epx>> $$3 = ((djy)$$1x.a()).d().c();
         $$3.stream().flatMap(ji::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               je.c<epx> $$3xx = $$0.b($$2xx);
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

   private static boolean a(epx $$0) {
      return $$0.c().contains(epl.a());
   }

   public static jg.a a() {
      js.b $$0 = js.a(mf.aF);
      jg.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
