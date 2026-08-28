import java.util.List;

public class ph {
   private static final ke a = new ke()
      .a(lw.aM, qx::a)
      .a(lw.aJ, qv::a)
      .a(lw.aK, rv::a)
      .a(lw.aS, sk::a)
      .a(lw.aT, rg::a)
      .a(lw.aV, rf::a)
      .a(lw.aU, rc::a)
      .a(lw.aW, rb::a)
      .a(lw.aH, rn::a)
      .a(lw.bb, dfz::a)
      .a(lw.aR, qy::a)
      .a(lw.aL, eav::a)
      .a(lw.aQ, eat::a)
      .a(lw.ba, ekw::a)
      .a(lw.aP, eji::a)
      .a(lw.aI, xa::a)
      .a(lw.aZ, cxy::a)
      .a(lw.aY, cxw::a)
      .a(lw.aG, dtw::a)
      .a(lw.m, chi::a)
      .a(lw.X, cke::a)
      .a(lw.s, bsm::a)
      .a(lw.d, drn::a)
      .a(lw.aN, dbs::a)
      .a(lw.aO, ddb::a)
      .a(lw.L, cwa::a)
      .a(lw.I, cvm::a);

   private static void a(jq.a $$0) {
      a($$0.d(lw.aS), $$0.d(lw.aH));
   }

   public static void a(jp<ekk> $$0, jq<dfk> $$1) {
      $$1.c().forEach($$1x -> {
         ale $$2 = $$1x.h().a();
         List<js<ekk>> $$3 = ((dfk)$$1x.a()).d().c();
         $$3.stream().flatMap(js::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jo.c<ekk> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ekk $$0) {
      return $$0.c().contains(ejy.a());
   }

   public static jq.a a() {
      kc.b $$0 = kc.a(lv.aA);
      jq.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
