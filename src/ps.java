import java.util.List;

public class ps {
   private static final kg a = new kg()
      .a(mb.aN, rn::a)
      .a(mb.aK, rl::a)
      .a(mb.aL, sm::a)
      .a(mb.aT, tb::a)
      .a(mb.aU, rw::a)
      .a(mb.aW, rv::a)
      .a(mb.aV, rs::a)
      .a(mb.aX, rr::a)
      .a(mb.aI, se::a)
      .a(mb.bc, diy::a)
      .a(mb.aS, ro::a)
      .a(mb.aM, edw::a)
      .a(mb.aR, edu::a)
      .a(mb.bb, enz::a)
      .a(mb.aQ, eml::a)
      .a(mb.aJ, xr::a)
      .a(mb.ba, dfz::a)
      .a(mb.aZ, dfx::a)
      .a(mb.bd, dwy::a)
      .a(mb.m, cjb::a)
      .a(mb.X, clx::a)
      .a(mb.s, buc::a)
      .a(mb.d, duo::a)
      .a(mb.aO, ded::a)
      .a(mb.aP, dfm::a)
      .a(mb.L, cxw::a)
      .a(mb.I, cxj::a);

   private static void a(js.a $$0) {
      a($$0.d(mb.aT), $$0.d(mb.aI));
   }

   public static void a(jr<enn> $$0, js<dij> $$1) {
      $$1.c().forEach($$1x -> {
         alz $$2 = $$1x.h().a();
         List<ju<enn>> $$3 = ((dij)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<enn> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ae.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ae.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(enn $$0) {
      return $$0.c().contains(enb.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(ma.aC);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
