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
      .a(mi.aW, dlr::a)
      .a(mi.aY, qm::a)
      .a(mi.aO, ehm::a)
      .a(mi.aX, ehk::a)
      .a(mi.bo, ert::a)
      .a(mi.aS, eqf::a)
      .a(mi.aI, wy::a)
      .a(mi.bl, diq::a)
      .a(mi.bk, dio::a)
      .a(mi.bi, eaj::a)
      .a(mi.bm, cms::a)
      .a(mi.bn, cmq::a)
      .a(mi.aZ, cob::a)
      .a(mi.aN, bvn::a)
      .a(mi.aF, dxv::a)
      .a(mi.aR, dgs::a)
      .a(mi.aQ, dib::a)
      .a(mi.aV, dai::a)
      .a(mi.aU, czv::a)
      .a(mi.ba, ckj::a)
      .a(mi.aM, cjy::a)
      .a(mi.aJ, cju::a)
      .a(mi.bg, sn::a)
      .a(mi.bh, st::a)
      .a(mi.aT, clm::a)
      .a(mi.aH, cjr::a);

   private static void a(ji.a $$0) {
      a($$0.e(mi.bb), $$0.e(mi.aG));
   }

   public static void a(jh<erh> $$0, ji<dlc> $$1) {
      $$1.c().forEach($$1x -> {
         alk $$2 = $$1x.h().a();
         List<jk<erh>> $$3 = ((dlc)$$1x.a()).d().c();
         $$3.stream().flatMap(jk::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jg.c<erh> $$3xx = $$0.b($$2xx);
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

   private static boolean a(erh $$0) {
      return $$0.c().contains(eqv.a());
   }

   public static ji.a a() {
      ju.b $$0 = ju.a(mh.aF);
      ji.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
