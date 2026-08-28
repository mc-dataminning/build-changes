import java.util.List;

public class pd {
   private static final kc a = new kc()
      .a(lu.aK, qt::a)
      .a(lu.aH, qr::a)
      .a(lu.aI, rr::a)
      .a(lu.aQ, sg::a)
      .a(lu.aR, rc::a)
      .a(lu.aT, rb::a)
      .a(lu.aS, qy::a)
      .a(lu.aU, qx::a)
      .a(lu.aF, rj::a)
      .a(lu.aZ, del::a)
      .a(lu.aP, qu::a)
      .a(lu.aJ, dzf::a)
      .a(lu.aO, dzd::a)
      .a(lu.aY, ejh::a)
      .a(lu.aN, ehs::a)
      .a(lu.aG, wv::a)
      .a(lu.aX, cxb::a)
      .a(lu.aW, cwz::a)
      .a(lu.m, cgj::a)
      .a(lu.X, cje::a)
      .a(lu.s, brn::a)
      .a(lu.d, dpz::a)
      .a(lu.aL, dah::a)
      .a(lu.aM, dbp::a)
      .a(lu.L, cux::a);

   private static void a(jo.a $$0) {
      a($$0.b(lu.aQ), $$0.b(lu.aF));
   }

   public static void a(jn<eiv> $$0, jo<ddw> $$1) {
      $$1.b().forEach($$1x -> {
         akr $$2 = $$1x.h().a();
         List<jq<eiv>> $$3 = ((ddw)$$1x.a()).d().b();
         $$3.stream().flatMap(jq::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jm.c<eiv> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eiv $$0) {
      return $$0.c().contains(eii.a());
   }

   public static jo.a a() {
      ka.b $$0 = ka.a(lt.aA);
      jo.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
