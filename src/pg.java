import java.util.List;

public class pg {
   private static final kd a = new kd()
      .a(lv.aL, qw::a)
      .a(lv.aI, qu::a)
      .a(lv.aJ, ru::a)
      .a(lv.aR, sj::a)
      .a(lv.aS, rf::a)
      .a(lv.aU, re::a)
      .a(lv.aT, rb::a)
      .a(lv.aV, ra::a)
      .a(lv.aG, rm::a)
      .a(lv.ba, dfw::a)
      .a(lv.aQ, qx::a)
      .a(lv.aK, ear::a)
      .a(lv.aP, eap::a)
      .a(lv.aZ, eks::a)
      .a(lv.aO, eje::a)
      .a(lv.aH, wz::a)
      .a(lv.aY, cxv::a)
      .a(lv.aX, cxt::a)
      .a(lv.m, chf::a)
      .a(lv.X, ckb::a)
      .a(lv.s, bsj::a)
      .a(lv.d, drk::a)
      .a(lv.aM, dbp::a)
      .a(lv.aN, dcy::a)
      .a(lv.L, cvx::a)
      .a(lv.I, cvj::a);

   private static void a(jp.a $$0) {
      a($$0.b(lv.aR), $$0.b(lv.aG));
   }

   public static void a(jo<ekg> $$0, jp<dfh> $$1) {
      $$1.b().forEach($$1x -> {
         alc $$2 = $$1x.h().a();
         List<jr<ekg>> $$3 = ((dfh)$$1x.a()).d().c();
         $$3.stream().flatMap(jr::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jn.c<ekg> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ekg $$0) {
      return $$0.c().contains(eju.a());
   }

   public static jp.a a() {
      kb.b $$0 = kb.a(lu.aA);
      jp.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
