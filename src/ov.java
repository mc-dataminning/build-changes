import java.util.List;

public class ov {
   private static final ju a = new ju()
      .a(mg.aN, qk::a)
      .a(mg.aJ, qi::a)
      .a(mg.aK, ri::a)
      .a(mg.aZ, rx::a)
      .a(mg.bc, qt::a)
      .a(mg.bb, qs::a)
      .a(mg.ba, qp::a)
      .a(mg.bd, qo::a)
      .a(mg.aG, ra::a)
      .a(mg.aU, dkh::a)
      .a(mg.aW, ql::a)
      .a(mg.aM, efu::a)
      .a(mg.aV, efs::a)
      .a(mg.bl, epy::a)
      .a(mg.aQ, eok::a)
      .a(mg.aI, ws::a)
      .a(mg.bj, dhi::a)
      .a(mg.bi, dhg::a)
      .a(mg.bg, dys::a)
      .a(mg.bk, cjw::a)
      .a(mg.aX, cmu::a)
      .a(mg.aL, bus::a)
      .a(mg.aF, dwe::a)
      .a(mg.aP, dfk::a)
      .a(mg.aO, dgt::a)
      .a(mg.aT, cza::a)
      .a(mg.aS, cyn::a)
      .a(mg.aY, cjh::a)
      .a(mg.be, sm::a)
      .a(mg.bf, sr::a)
      .a(mg.aR, cko::a)
      .a(mg.aH, cit::a);

   private static void a(jg.a $$0) {
      a($$0.e(mg.aZ), $$0.e(mg.aG));
   }

   public static void a(jf<epm> $$0, jg<djs> $$1) {
      $$1.c().forEach($$1x -> {
         ale $$2 = $$1x.h().a();
         List<ji<epm>> $$3 = ((djs)$$1x.a()).d().c();
         $$3.stream().flatMap(ji::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               je.c<epm> $$3xx = $$0.b($$2xx);
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

   private static boolean a(epm $$0) {
      return $$0.c().contains(epa.a());
   }

   public static jg.a a() {
      js.b $$0 = js.a(mf.aF);
      jg.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
