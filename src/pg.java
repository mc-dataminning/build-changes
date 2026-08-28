import java.util.List;

public class pg {
   private static final kd a = new kd()
      .a(lv.aK, qw::a)
      .a(lv.aH, qu::a)
      .a(lv.aI, ru::a)
      .a(lv.aQ, sj::a)
      .a(lv.aR, rf::a)
      .a(lv.aT, re::a)
      .a(lv.aS, rb::a)
      .a(lv.aU, ra::a)
      .a(lv.aF, rm::a)
      .a(lv.aZ, dfi::a)
      .a(lv.aP, qx::a)
      .a(lv.aJ, ead::a)
      .a(lv.aO, eab::a)
      .a(lv.aY, eke::a)
      .a(lv.aN, eiq::a)
      .a(lv.aG, wz::a)
      .a(lv.aX, cxu::a)
      .a(lv.aW, cxs::a)
      .a(lv.m, cha::a)
      .a(lv.X, cjw::a)
      .a(lv.s, bse::a)
      .a(lv.d, dqw::a)
      .a(lv.aL, dbb::a)
      .a(lv.aM, dck::a)
      .a(lv.L, cvs::a)
      .a(lv.I, cvf::a);

   private static void a(jp.a $$0) {
      a($$0.b(lv.aQ), $$0.b(lv.aF));
   }

   public static void a(jo<ejs> $$0, jp<det> $$1) {
      $$1.b().forEach($$1x -> {
         alb $$2 = $$1x.h().a();
         List<jr<ejs>> $$3 = ((det)$$1x.a()).d().c();
         $$3.stream().flatMap(jr::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jn.c<ejs> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ejs $$0) {
      return $$0.c().contains(ejg.a());
   }

   public static jp.a a() {
      kb.b $$0 = kb.a(lu.az);
      jp.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
