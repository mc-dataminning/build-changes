import java.util.List;

public class pk {
   private static final kf a = new kf()
      .a(ly.aL, ra::a)
      .a(ly.aI, qy::a)
      .a(ly.aJ, ry::a)
      .a(ly.aR, sn::a)
      .a(ly.aS, rj::a)
      .a(ly.aU, ri::a)
      .a(ly.aT, rf::a)
      .a(ly.aV, re::a)
      .a(ly.aG, rq::a)
      .a(ly.ba, dgl::a)
      .a(ly.aQ, rb::a)
      .a(ly.aK, ebg::a)
      .a(ly.aP, ebe::a)
      .a(ly.aZ, elh::a)
      .a(ly.aO, ejt::a)
      .a(ly.aH, xd::a)
      .a(ly.aY, ddn::a)
      .a(ly.aX, ddl::a)
      .a(ly.aF, duh::a)
      .a(ly.m, chr::a)
      .a(ly.X, ckn::a)
      .a(ly.s, bss::a)
      .a(ly.d, dry::a)
      .a(ly.aM, dbr::a)
      .a(ly.aN, dda::a)
      .a(ly.L, cwf::a)
      .a(ly.I, cvs::a);

   private static void a(jr.a $$0) {
      a($$0.d(ly.aR), $$0.d(ly.aG));
   }

   public static void a(jq<ekv> $$0, jr<dfw> $$1) {
      $$1.c().forEach($$1x -> {
         alh $$2 = $$1x.h().a();
         List<jt<ekv>> $$3 = ((dfw)$$1x.a()).d().c();
         $$3.stream().flatMap(jt::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jp.c<ekv> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ad.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ad.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(ekv $$0) {
      return $$0.c().contains(ekj.a());
   }

   public static jr.a a() {
      kd.b $$0 = kd.a(lx.az);
      jr.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
