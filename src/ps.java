import java.util.List;

public class ps {
   private static final kg a = new kg()
      .a(mb.aM, rn::a)
      .a(mb.aJ, rl::a)
      .a(mb.aK, sm::a)
      .a(mb.aS, tb::a)
      .a(mb.aT, rw::a)
      .a(mb.aV, rv::a)
      .a(mb.aU, rs::a)
      .a(mb.aW, rr::a)
      .a(mb.aH, se::a)
      .a(mb.bb, dir::a)
      .a(mb.aR, ro::a)
      .a(mb.aL, edp::a)
      .a(mb.aQ, edn::a)
      .a(mb.ba, ens::a)
      .a(mb.aP, eme::a)
      .a(mb.aI, xr::a)
      .a(mb.aZ, dfs::a)
      .a(mb.aY, dfq::a)
      .a(mb.bc, dwr::a)
      .a(mb.m, cix::a)
      .a(mb.X, clt::a)
      .a(mb.s, bty::a)
      .a(mb.d, duh::a)
      .a(mb.aN, ddw::a)
      .a(mb.aO, dff::a)
      .a(mb.L, cxs::a)
      .a(mb.I, cxf::a);

   private static void a(js.a $$0) {
      a($$0.d(mb.aS), $$0.d(mb.aH));
   }

   public static void a(jr<eng> $$0, js<dic> $$1) {
      $$1.c().forEach($$1x -> {
         alz $$2 = $$1x.h().a();
         List<ju<eng>> $$3 = ((dic)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<eng> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eng $$0) {
      return $$0.c().contains(emu.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(ma.aB);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
