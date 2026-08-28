import java.util.List;

public class or {
   private static final kh a = new kh()
      .a(mc.aN, qh::a)
      .a(mc.aK, qf::a)
      .a(mc.aL, rf::a)
      .a(mc.aT, ru::a)
      .a(mc.aU, qq::a)
      .a(mc.aW, qp::a)
      .a(mc.aV, qm::a)
      .a(mc.aX, ql::a)
      .a(mc.aI, qx::a)
      .a(mc.bc, dhx::a)
      .a(mc.aS, qi::a)
      .a(mc.aM, ecx::a)
      .a(mc.aR, ecv::a)
      .a(mc.bb, ena::a)
      .a(mc.aQ, elm::a)
      .a(mc.aJ, wk::a)
      .a(mc.ba, dey::a)
      .a(mc.aZ, dew::a)
      .a(mc.bd, dvz::a)
      .a(mc.m, cib::a)
      .a(mc.X, ckx::a)
      .a(mc.s, btc::a)
      .a(mc.d, dtp::a)
      .a(mc.aO, ddc::a)
      .a(mc.aP, del::a)
      .a(mc.L, cwv::a)
      .a(mc.I, cwi::a);

   private static void a(jt.a $$0) {
      a($$0.d(mc.aT), $$0.d(mc.aI));
   }

   public static void a(js<emo> $$0, jt<dhi> $$1) {
      $$1.c().forEach($$1x -> {
         aku $$2 = $$1x.h().a();
         List<jv<emo>> $$3 = ((dhi)$$1x.a()).d().c();
         $$3.stream().flatMap(jv::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jr.c<emo> $$3xx = $$0.b($$2xx);
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

   private static boolean a(emo $$0) {
      return $$0.c().contains(emc.a());
   }

   public static jt.a a() {
      kf.b $$0 = kf.a(mb.aC);
      jt.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
