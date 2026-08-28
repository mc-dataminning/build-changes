import java.util.List;

public class ox {
   private static final jw a = new jw()
      .a(mi.aP, ql::a)
      .a(mi.aK, qj::a)
      .a(mi.aL, rj::a)
      .a(mi.bb, ry::a)
      .a(mi.be, qu::a)
      .a(mi.bd, qt::a)
      .a(mi.bc, qq::a)
      .a(mi.bf, qp::a)
      .a(mi.aG, rb::a)
      .a(mi.aW, dmb::a)
      .a(mi.aY, qm::a)
      .a(mi.aO, ehw::a)
      .a(mi.aX, ehu::a)
      .a(mi.bo, esd::a)
      .a(mi.aS, eqp::a)
      .a(mi.aI, xc::a)
      .a(mi.bl, dja::a)
      .a(mi.bk, diy::a)
      .a(mi.bi, eat::a)
      .a(mi.bm, cnb::a)
      .a(mi.bn, cmz::a)
      .a(mi.aZ, cok::a)
      .a(mi.aN, bvw::a)
      .a(mi.aF, dyf::a)
      .a(mi.aR, dhc::a)
      .a(mi.aQ, dil::a)
      .a(mi.aV, das::a)
      .a(mi.aU, daf::a)
      .a(mi.ba, cks::a)
      .a(mi.aM, ckh::a)
      .a(mi.aJ, ckd::a)
      .a(mi.bg, sn::a)
      .a(mi.bh, st::a)
      .a(mi.aT, clv::a)
      .a(mi.aH, cka::a);

   private static void a(ji.a $$0) {
      a($$0.e(mi.bb), $$0.e(mi.aG));
   }

   public static void a(jh<err> $$0, ji<dlm> $$1) {
      $$1.c().forEach($$1x -> {
         alr $$2 = $$1x.h().a();
         List<jk<err>> $$3 = ((dlm)$$1x.a()).d().c();
         $$3.stream().flatMap(jk::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jg.c<err> $$3xx = $$0.b($$2xx);
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

   private static boolean a(err $$0) {
      return $$0.c().contains(erf.a());
   }

   public static ji.a a() {
      ju.b $$0 = ju.a(mh.aF);
      ji.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
